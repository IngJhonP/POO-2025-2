import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

/**
 * Juego del Ahorcado en consola.
 * 
 * Este programa selecciona una palabra aleatoria de una lista predefinida,
 * permite al usuario adivinar letras, muestra el progreso con guiones bajos,
 * controla el número máximo de errores (6), muestra un dibujo ASCII del ahorcado,
 * y mantiene una lista de letras usadas para evitar repeticiones.
 * 
 * Fecha: 2025
 */
public class Ahorcado {

    // Lista de palabras predefinidas para el juego
    private final String[] palabras = {
        "herencia", "instancia", "interfaz", "compilar", "mensaje", "privadas", "paquetes", "ejecutar", "propiedad", "abstracto"
    };

    // Palabra secreta que el usuario debe adivinar
    private String palabraSecreta;

    // Arreglo que guarda el progreso del usuario (letras adivinadas y guiones bajos)
    private char[] progreso;

    // Conjunto para almacenar las letras que el usuario ya ha usado
    private Set<Character> letrasUsadas;

    // Contador de errores cometidos por el usuario
    private int errores;

    // Número máximo de errores permitidos antes de perder
    private final int maxErrores = 6;

    /**
     * Constructor que inicializa el juego:
     * - Elige una palabra aleatoria.
     * - Inicializa el progreso con guiones bajos.
     * - Inicializa el conjunto de letras usadas y el contador de errores.
     */
    public Ahorcado() {
        this.palabraSecreta = elegirPalabraAleatoria();
        this.progreso = new char[palabraSecreta.length()];
        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_'; // Guion bajo representa letra no adivinada
        }
        this.letrasUsadas = new HashSet<>();
        this.errores = 0;
    }

    /**
     * Metodo privado que selecciona una palabra aleatoria de la lista.
     * @return palabra secreta seleccionada
     */
    private String elegirPalabraAleatoria() {
        Random rand = new Random();
        int index = rand.nextInt(palabras.length);
        return palabras[index];
    }

    /**
     * Muestra en consola el progreso actual del usuario,
     * mostrando letras adivinadas y guiones bajos para las no adivinadas.
     */
    private void mostrarProgreso() {
        for (char c : progreso) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    /**
     * Muestra en consola las letras que el usuario ya ha usado.
     */
    private void mostrarLetrasUsadas() {
        System.out.print("Letras usadas: ");
        for (char c : letrasUsadas) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    /**
     * Muestra un dibujo ASCII del ahorcado según el número de errores cometidos.
     */
    private void mostrarAhorcado() {
        System.out.println("Estado del ahorcado:");
        switch (errores) {
            case 0:
                System.out.println("  q(._.)p");
                break;
            case 1:
                System.out.println("  q(._.)p");
                System.out.println("    |");
                break;
            case 2:
                System.out.println("  q(._.)p");
                System.out.println("   /|");
                break;
            case 3:
                System.out.println("  q(._.)p");
                System.out.println("   /|\\");
                break;
            case 4:
                System.out.println("  q(._.)p");
                System.out.println("   /|\\");
                System.out.println("   /");
                break;
            case 5:
                System.out.println("  q(._.)p");
                System.out.println("   /|\\");
                System.out.println("   / \\");
                break;
            case 6:
                System.out.println("  q(x_x)p");
                System.out.println("   /|\\");
                System.out.println("   / \\");
                break;
        }
    }

    /**
     * Verifica si la letra ingresada por el usuario esta en la palabra secreta.
     * Si esta, actualiza el progreso con la letra en las posiciones correspondientes.
     * @letra letra ingresada por el usuario
     * @return true si la letra está en la palabra, false si no
     */
    private boolean adivinarLetra(char letra) {
        boolean acierto = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                progreso[i] = letra;
                acierto = true;
            }
        }
        return acierto;
    }

    /**
     * Verifica si el usuario ha ganado, es decir,
     * si ya no quedan guiones bajos en el progreso.
     * @return true si gano, false si no
     */
    private boolean gano() {
        for (char c : progreso) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo principal que ejecuta el juego en consola.
     * Controla el flujo del juego, lee entradas del usuario,
     * muestra mensajes y actualiza el estado del juego.
     */
    public void jugar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego del Ahorcado!");
        System.out.println("Tienes " + maxErrores + " intentos para adivinar la palabra.");
        System.out.println();

        while (errores < maxErrores && !gano()) {
            mostrarAhorcado();
            mostrarProgreso();
            mostrarLetrasUsadas();

            System.out.print("Ingresa una letra: ");
            String entrada = sc.nextLine().toLowerCase();

            // Validar que el usuario ingrese solo una letra valida
            if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
                System.out.println("Por favor, ingresa solo una letra válida.");
                continue;
            }

            char letra = entrada.charAt(0);

            // Verificar si la letra ya fue usada
            if (letrasUsadas.contains(letra)) {
                System.out.println("Ya usaste esa letra, intenta con otra.");
                continue;
            }

            letrasUsadas.add(letra);

            // Verificar si la letra esta en la palabra secreta
            if (adivinarLetra(letra)) {
                System.out.println("¡Correcto! La letra '" + letra + "' está en la palabra.");
            } else {
                errores++;
                System.out.println("Incorrecto. La letra '" + letra + "' no está en la palabra.");
                System.out.println("Te quedan " + (maxErrores - errores) + " intentos.");
            }

            System.out.println();
        }

        // Mostrar resultado final
        mostrarAhorcado();
        mostrarProgreso();

        if (gano()) {
            System.out.println("¡Felicidades! ¡Ganaste! La palabra era: " + palabraSecreta);
        } else {
            System.out.println("¡Perdiste! La palabra correcta era: " + palabraSecreta);
        }

        sc.close();
    }

    /**
     * Metodo main para iniciar el programa.
     * Crea una instancia del juego y lo ejecuta.
     */
    public static void main(String[] args) {
        Ahorcado juego = new Ahorcado();
        juego.jugar();
    }
}