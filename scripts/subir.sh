#!/usr/bin/env bash
# Uso:
#   Subir un archivo:         ./scripts/subir.sh personal/Ahorcado.java "feat: agregar ahorcado"
#   Subir una carpeta:        ./scripts/subir.sh personal/Triki "feat: agregar triki"
#   Subir varias rutas:       ./scripts/subir.sh personal/Ahorcado.java personal/Triki "chore: subir lote"
#   Sin mensaje (autogenera): ./scripts/subir.sh personal/Triki
#
# Tipos sugeridos: feat, fix, refactor, docs, chore, test
# Autor: tú (modificado para aceptar carpetas y múltiples rutas)

set -e  # Detener ejecución si ocurre un error

if [ $# -lt 1 ]; then
  echo "Uso: $0 <archivo|carpeta> [más rutas ...] \"mensaje opcional\""
  exit 1
fi

# Detectar si el último argumento es un mensaje de commit.
LAST="${@: -1}"
MSG=""
if [[ "$LAST" == feat:* || "$LAST" == fix:* || "$LAST" == refactor:* || \
      "$LAST" == docs:* || "$LAST" == chore:* || "$LAST" == test:* || "$LAST" == *" "* ]]; then
  MSG="$LAST"
  # Quitamos el último argumento (mensaje) de la lista de rutas
  set -- "${@:1:$(($#-1))}"
fi

# Mensaje automático si no se envió uno
if [ -z "$MSG" ]; then
  FECHA=$(date "+%Y-%m-%d %H:%M")
  MSG="chore: subir cambios ($FECHA)"
fi

# Recorrer cada ruta
for RUTA in "$@"; do
  RUTA_LIMPIA="${RUTA%/}"  # Elimina barra final si existe

  if [ -f "$RUTA_LIMPIA" ]; then
    echo "[+] Archivo: $RUTA_LIMPIA"
    git add "$RUTA_LIMPIA"

  elif [ -d "$RUTA_LIMPIA" ]; then
    echo "[+] Carpeta: $RUTA_LIMPIA"
    git add "$RUTA_LIMPIA"

    # Avisar si está vacía (sin archivos normales)
    if [ -z "$(find "$RUTA_LIMPIA" -type f -not -path '*/\.*' 2>/dev/null)" ]; then
      echo "  [!] ADVERTENCIA: La carpeta '$RUTA_LIMPIA' parece vacía o sin archivos rastreables."
      echo "      Git no guarda carpetas vacías. Añade README.md o .gitkeep si quieres que aparezca."
    fi
  else
    echo "[X] ERROR: No existe archivo ni carpeta: $RUTA_LIMPIA"
    exit 1
  fi
done

# Evitar commit vacío
if git diff --cached --quiet; then
  echo "No hay cambios preparados (staged). Nada que commitear."
  exit 0
fi

git commit -m "$MSG"
git push
echo "Listo. Commit enviado: $MSG"
