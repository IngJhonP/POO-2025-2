Diferencias entre lenguajes: Bajo y alto nivel

- C: es de bajo nivel, orientado al bajo nivel y el rendimiento en entorno crítico, se usa en controladores, SOs, sistemas embebidos. Es compilado, por lo que pasa a binario antes de su uso.
- C++: introduce programación orientada a objetos a C, se utiliza en desarrollo de videojuegos, sistemas operativos, aplicaciones, simulaciones, etc. También es compilado como C.
- Java: menos abstracto y más portable y automático que C y C++, introduce el paradigma híbrido para la ejecución usado la Java Virtual Machine y el enfoque completo hacia la POO. Usado en aplicaciones empresariales, software, backend y desarrollo antiguo en Android.
- Python: es un lenguaje de muy alto nivel, multiparadigma (lo que significa que admite diferentes métodos de programación, como POO o programación imperativa). Es muy legible y rápido de desarrollar, aunque es más lento. Se usa en ciencia de datos, IA, scripting, automatizaciones y desarrollo de prototipos.

Dentro de estos lenguajes, C y C++ son lenguajes de bajo nivel, lo cual quiere decir que son más cercanos al hardware y por ende más rápidos y manuales. Mientras que Java y Python son de alto nivel, es decir, más cerca del programador.

Comparativa



|Lenguaje|C|C++|Java|Python|
| - | - | - | - | - |
|Enfoque|Basado en hardware, control manual|Introducir POO a la programación de alto rendimiento de C|Seguridad, portabilidady control menos manual|Facilidad, legibilidad y velocidad de desarrollo|
|Paradigma principal|Procedural|POO|POO|Multiparadigma|
|Ofrece POO|No|Si|Si|Si|
|Fortaleza|Rendimiento, control  y eficiencia|Rendimiento, flexibilidad, mayor nivel|Seguridad, eficiencia, portabilidad|Automatizacion, simplicidad y ecosistema|
|Debilidad|Gran curva de aprendizaje, poca portabilidad, lentitud de desarrollo|Curva de aprendizaje, menor rendimiento que C, baja portabilidad|Verbosidad, peso y curva de aprendizaje|Lentitud, menos eficiencia|
|Lenguaje|C|C++|Java|Python|
|Dificultad|Alta|Alta|Media|Baja|

Semejanzas entre todos: Son multiplataforma en mayor o menor medida al ser menos dependientes de manejo exacto de componentes en hardware. Se usan en aplicaciones de gran peso en diferentes áreas tecnológicas. Están orientados a la programación por humanos.

Diferencia entre todas: Su rendimiento, enfoque, paradigmas y aplicaciones varían entre lenguajes, desde la velocidad y eficiencia de C++ hacia la practicidad algo lenta de Python. Se usan en casos muy diferentes.

Algoritmos

Un algoritmo es un conjunto de pasos finito, determinista y preciso para completar un objetivo o realizar una acción. Se puede definir de formas diferentes, como por ejemplo:

Pseudocódigo

Es una descripción al estilo del código, que usa lenguaje natural y lógica básica para explicar un algoritmo, usando las estructuras y sintaxis de lenguajes reales sin especificación.

Ejemplo de pseudocódigo para sumar una lista de números![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.001.png)

ALGORI TMO  cal cul ar \_s uma

ENTRADA:  una  l i s t a  de  númer os  ` l i s t a\_numer os ` SALI DA:  l a  s uma  de  l os  númer os  en  l a  l i s t a

1. I NI CI ALI ZAR  una  var i abl e  ` s uma\_t ot al `  a  0.
1. PARA  CADA  ` numer o`  EN  ` l i s t a\_numer os ` :
1. AÑADI R  ` numer o`  a  ` s uma\_t ot al ` .
1. DEVOLVER  ` s uma\_t ot al ` .

FI N  ALGORI TMO

Puede y debe ser el primer paso a la hora de hacer la programación de un proceso a fin de hacerlo entendible y ordenado.

Diagramas de flujo

Son diagramas que esquematizan el flujo de un programa usando un diagrama ordenado donde cada paso es un componente. Los diagramas de flujo son estandarizados y se usan de forma alternativa o complementaria al pseudocódigo.

UML - Lenguaje unificado de modelado

Es un lenguaje unificado que fue creado en los 90 para estandarizar la representación de sistemas y componentes, en la documentación y desarrollo de sistemas informáticos. Se usan diferentes tipos, incluyendo diagramas de clases, máquinas de estados y procesos, por ejemplo.

Componentes de programación y su uso en Java

Estructuras de control

Los programas siguen generalmente un proceso secuencial, donde cada paso puede también ser una estructura de control, como los condicionales  i f o los bucles  whi l e .![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.002.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.003.png)

Algunas especificaciones de Java![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.004.png)

1. Es sensible a la sintaxis, mas no a la identación
1. Todas las instrucciones terminan en punto y coma
1. Java es sensible a las mayúsculas
1. Los bloques van dentro de llaves  {}
1. Puedes comentar con doble barra  / / . Los comentarios no se ejecutan

Ejemplo\
![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.005.png)Condicional simple

i f  ( gr ade  >=  60)  {

`     `Sys t em. out . pr i nt l n( "Pas s ed") ;

}  el s e  {

`     `Sys t em. out . pr i nl n( "Not  pas s ed") ; }

Equivalente en operador ternario

Sys t em. out . pr i nt l n( gr ade  >=  60?  "Pas s ed":  "Not  pas s ed") ;

Operadores

Operadores Aritméticos

Suma:  +![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.006.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.007.png)

Resta:  - Multiplicación:  \*![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.008.png)

División:  /![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.009.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.010.png)

Módulo (residuo):  %![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.011.png)

Operadores Relacionales

Igual a:  ==![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.012.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.013.png)

Diferente de:  ! = Mayor que:  >

Menor que:  <

Mayor o igual que:  >= ![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.014.png)Menor o igual que:  <=

Operadores Lógicos y Condicionales

Condicional AND:  &&![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.015.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.016.png)

Condicional OR:  | |

Negación lógica:  !

OR a nivel de bits (booleano inclusivo):  | ![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.017.png)XOR a nivel de bits (booleano exclusivo):  ^

Asignaciones

Asignación simple:  c  =  3![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.018.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.019.png)

Asignación con operación:  c  +=  3 (también aplica para  - = ,  \*= ,  / = ,  %= ) Incrementador posfijo: ![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.020.png) i ++

Decremento prefijo:  - - b

Sobre los incrementadores de prefijo y posfijo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.021.png)

La diferencia principal entre los operadores de pre-incremento/decremento ( ++i ,  - - i ) y post- incremento/decremento ( i ++ ,  i - - ) es el momento en que se realiza la actualización de la variable y el valor que devuelve la expresión.

Prefijo ( ++i ,  - - i ): La variable se incrementa o decrementa antes de que se evalúe la expresión. El valor que se utiliza en la expresión es el valor después de la modificación. Posfijo ( i ++ ,  i - - ): La variable se incrementa o decrementa después de que se evalúa la expresión. El valor que se utiliza es el original de la variable, antes de la modificación.

Tipos primitivos:

Enteros:  i nt![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.022.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.023.png)

Flotantes:  f l oat y  doubl e![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.024.png)

Enteros de tamaños:  s hor t ,  l ong y  byt e![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.025.png)

Texto:  char![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.026.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.027.png)

Valores booleanos:  bool ean![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.028.png)![ref1]

Sobre la programación orientada a objetos

Mientras la programación estructurada usa estructuras de control y funciones para el desarrollo de algoritmos y programas, la programación orientada a objetos aprovecha conceptos como clases, objetos, y demás en los mismos procesos, al modelar componentes como elementos virtuales, u objetos, que pueden abstraerse en componentes base que son las clases.

Objetos

Los objetos con instancias de una clase, que tienen atributos, que son sus características, y métodos que son sus acciones.

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.030.png)

Un carro tiene atributos como su marca y color, y métodos como arrancar o frenar. En código:

/ /  El  car r o  t i ene  el  col or  r oj o,  s i n  vel oci dad  y  acel er aci ón  de  8  uni dades / /  Tambi én  t i ene  un  mét odo  que  aument a  l a  vel oci dad

/ /  At r i but os

f l oat  Car r o. vel  =  0; f l oat  Car r o. acel  =  8;

/ /  Mét odo  par a  acel er ar

f l oat  Acel er ar ( f l oat  vel ,  f l oat  acel )  {      vel  +=  acel ;

`     `r et ur n  vel ;

}

/ /  Ll ama  al  mét odo

f l oat  newVel  =  Acel er ar ( Car r o. vel ,  Car r o. acel ) ;

Clases

Una clase es un molde de la cual se pueden derivar más objetos al instanciarlos. Por ejemplo, una base de marcador de la cual se fabrican los demás puede considerarse una clase, mientras que los marcadores fabricados son sus instancias.

Diagramas de clases en UML![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.031.png)

Un diagrama de clases en UML usa texto llano para representar clases, sus características y componentes, en texto llano o de forma gráfica.

Ejemplo

Para una persona, tenemos el siguiente diagrama:

![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.032.png)

En caso de instanciar un objeto, usamos un diagrama de objetos, que es parecido:

![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.033.png)

En Java, las clases se escriben con la siguiente notación:

/ /  Las  cl as es  s e  i ndi can  con  cl as s ,  s egui do  del  nombr e  de  l a  cl as e  en ![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.034.png)Pas cal Cas e

cl as s  Car  {

`     `/ /  At r i but os ,  en  camel Cas e

`     `f l oat  s peed  =  0;

`     `/ /  Mét odo  par a  acel er aci ón.  f l oat  es  el  t i po  de  dat o  que  r et or na      f l oat  Acel er at e( f l oat  s peed,  f l oat  acc)  {

`         `s peed  +=  acc;

`         `r et ur n  s peed;

`     `}

}

/ /  . . .  en  el  códi go  pr i nci pal

/ /  Par a  acceder  a  un  at r i but o,  s e  us a  l a  not aci ón  Cl as e. at r i but o f l oat  cur r ent Speed  =  Car . s peed;

f l oat  cur r ent Acc  =  10. 0f ;

f l oat  newSpeed  =  Acel er at e( cur r ent Speed,  cur r ent Acc) ;![ref2]

Tipos en Java

Entero:  i nt![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.036.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.037.png)

Decimales:  f l oat o  doubl e (más precisión) Valores lógicos:  bool ean

Caracteres:  char

Clases

Las clases se definen con la palabra clave  cl as s seguido por el nombre de la clase, unas llaves  {} y el contenido de la clase en ellas:![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.038.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.039.png)

cl as s  Hol aMundo  {![ref3]

`     `publ i c  s t at i c  voi d  mai n( St r i ng[ ]  ar gs )  {

`         `Sys t em. out . pr i nt l n( "Hol a,  POO  en  J ava") ;      }

}

publ i c  s t at i c  voi d  mai n y  Sys t em. out . pr i nt l n![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.041.png)

El  publ i c  s t at i c  voi d  mai n es la parte principal de la clase y es la que se ejecuta primero, puede compararse con el  i nt  mai n( ) de C++ o el  i f  \_\_name\_\_  ==  \_\_mai n\_\_ de Python. Por otro lado,  Sys t em. out . pr i nt l n escribe en pantalla, como el  pr i nt de Python o el  cout de C++.

Objetos

Los objetos usan la sintaxis  new  [ cl as e] para instanciarse. Se usa la misma clase como tipo de dato:![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.042.png)

/ /  Todo  va  en  una  cl as e  más  gr ande ![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.043.png)cl as s  Bus  {

`     `St r i ng  mar ca  =  "Vol vo";

`     `i nt  maxCapaci dad  =  200;

`     `f l oat  s peed  =  10f ;

`     `i nt  acel er ar ( s peed)  {          r et ur n  s peed  +  1;      }

}

/ /  Se  i ns t anci a  un  bus  de  l a  cl as e  Bus Bus  t r ans mi  =  new  Bus ( ) ;

Ejemplos de objetos![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.044.png)

UML:![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.045.png)

![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.046.png)

Código básico (con  Es t udi ant e ):

cl as s  Es t udi ant e  {

`     `St r i ng  nombr e  =  "J uan";

`     `St r i ng  car r er a  =  "I ngeni er í a";      i nt  s emes t r e  =  2;

`     `i nt  i d  =  1072072838;

`     `voi d  I ns cr i bi r ( )  {          s emes t r e  +=  1;      }

`     `voi d  Cancel ar ( )  {          s emes t r e  =  0;      }

`     `voi d  As i s t i r ( )  {

`         `Sys t em. out . pr i nt l n( "¡ Ll egué  a  cl as es ! ") ;      }

}

/ /  Ej empl o  de  i ns t anci a![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.047.png)

Es t udi ant e  es t udi ant e1  =  new  Es t udi ant e( ) ;![ref4]

Método  mai n![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.049.png)

El método  mai n en Java se escribe de la siguiente manera:![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.050.png)

publ i c  s t at i c  voi d  mai n( St r i ng[ ]  ar gs )  { ![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.051.png)     / /  Códi go  de  l a  cl as e

}

publ i c significa que es accesible en otros lugares![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.052.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.053.png)

s t at i c significa que no depende de un objeto, sino que pertenece a la clase

voi d quiere decir que no retorna nada

mai n( St r i ng[ ]  ar gs ) quiere decir que es la clase principal  mai n y que recibe texto como![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.054.png)

argumento (por ejemplo, en la consola)

Métodos propios

Una clase contiene métodos que son funciones que están dentro. Se escriben como funciones de Java de la siguiente manera:

/ /  . . .  Dent r o  de  una  cl as e ![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.055.png)i nt  Sumar ( i nt  a,  i nt  b)  {      r et ur n  a  +  b;

}

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.056.png)

Crea un programa que maneje una alcancía.

Este programa tiene los métodos  Depos i t ar ,  Romper y  Cal cul ar Es paci o para manejar el espacio y saldo de la alcancía.

/ /  Cl as e  pr i nci pal

publ i c  cl as s  Al canci a  {

`    `/ /  mai n  exi ge  que  l os  mét odos  s ean  s t at i c  t ambi én

`    `/ /  Depos i t ar  s uma  di ner o  s ol o  s i  no  es t á  r ot a  l a  al cancí a![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.057.png)

`    `s t at i c  i nt  Depos i t ar ( i nt  di ner o,  i nt  s al do,  bool ean  es t aRot o)  {

`        `i f  ( es t aRot o) {

`            `Sys t em. out . pr i nt l n( "Er r or :  No  puedes  depos i t ar  en  una  al cancí a r ot a") ;

`            `r et ur n  0;

`        `}

`        `r et ur n  s al do  +  di ner o;     }

`    `/ /  Romper  s uel t a  el  s al do  s ol o  s i  no  es t á  r ot a  l a  al cancí a

`    `s t at i c  i nt  Romper ( i nt  s al do,  bool ean  es t aRot o)  {

`        `i f  ( es t aRot o)  {

`            `Sys t em. out . pr i nt l n( "Er r or :  No  puedes  r omper  una  al cancí a  ya r ot a") ;

`            `r et ur n  0;

`        `}

`        `r et ur n  s al do;     }

`    `/ /  Cal cul a  cuant o  es paci o  queda  en  l a  al cancí a

`    `s t at i c  i nt  Cal cul ar Es paci o( i nt  s al do,  i nt  capaci dad,  bool ean  es t aRot o) {

`        `i f  ( es t aRot o)  {

`            `Sys t em. out . pr i nt l n( "Er r or :  No  hay  es paci o") ;

`            `r et ur n  0;

`        `}

`        `r et ur n  capaci dad  -  s al do;     }

`    `publ i c  s t at i c  voi d  mai n( St r i ng[ ]  ar gs )  {         Al canci a  a  =  new  Al canci a( ) ;

/ /  At r i but os

i nt  s al do  =  0;

i nt  capaci dad  =  1000; bool ean  es t aRot o  =  f al s e;

`        `/ /  Dat os  i ni ci al es

`        `Sys t em. out . pr i nt l n( "Sal do  i ni ci al :  "  +  s al do) ;

`        `Sys t em. out . pr i nt l n( "Es paci o  r es t ant e:  "  +  Cal cul ar Es paci o( s al do, capaci dad,  es t aRot o) ) ;

`        `Sys t em. out . pr i nt l n( "- - - - - - - - - - ") ;

`        `/ /  Depos i t ar  10  dól ar es![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.058.png)

`        `Sys t em. out . pr i nt l n( "Depos i t ar  10  dól ar es ") ;

`        `s al do  =  Depos i t ar ( 10,  s al do,  es t aRot o) ;

`        `Sys t em. out . pr i nt l n( "Nuevo  s al do:  "  +  s al do) ;

`        `Sys t em. out . pr i nt l n( "Es paci o  r es t ant e:  "  +  Cal cul ar Es paci o( s al do, capaci dad,  es t aRot o) ) ;

`        `Sys t em. out . pr i nt l n( "- - - - - - - - - - ") ;

`        `/ /  Romper  l a  al cancí a

`        `Sys t em. out . pr i nt l n( "Rompi mos  l a  al cancí a") ;

`        `s al do  =  Romper ( s al do,  es t aRot o) ;

`        `Sys t em. out . pr i nt l n( "Di ner o  ext r ai do:  "  +  s al do) ;

`        `Sys t em. out . pr i nt l n( "Es paci o  r es t ant e:  "  +  Cal cul ar Es paci o( s al do, capaci dad,  es t aRot o) ) ;

`        `Sys t em. out . pr i nt l n( "- - - - - - - - - - ") ;

`        `es t aRot o  =  t r ue;

`        `/ /  Depos i t ar  10  dól ar es  ot r a  vez

`        `/ /  No  f unci onar á  por que  l a  al cancí a  es t á  r ot a

`        `Sys t em. out . pr i nt l n( "Depos i t ar  ot r os  10  dól ar es ") ;

`        `s al do  =  Depos i t ar ( 10,  s al do,  es t aRot o) ;

`        `Sys t em. out . pr i nt l n( "Nuevo  s al do:  "  +  s al do) ;

`        `Sys t em. out . pr i nt l n( "Es paci o  r es t ant e:  "  +  Cal cul ar Es paci o( s al do, capaci dad,  es t aRot o) ) ;

`        `Sys t em. out . pr i nt l n( "- - - - - - - - - - ") ;

`        `/ /  Romper  l a  al cancí a  ot r a  vez

`        `/ /  No  f unci onar á  por que  l a  al cancí a  es t á  r ot a

`        `Sys t em. out . pr i nt l n( "Rompi mos  l a  al cancí a") ;

`        `s al do  =  Romper ( s al do,  es t aRot o) ;

`        `Sys t em. out . pr i nt l n( "Di ner o  ext r ai do:  "  +  s al do) ;

`        `Sys t em. out . pr i nt l n( "Es paci o  r es t ant e:  "  +  Cal cul ar Es paci o( s al do, capaci dad,  es t aRot o) ) ;

`        `Sys t em. out . pr i nt l n( "- - - - - - - - - - ") ;

`    `}

}![ref1]

Estructuras de control

Permiten modificar el flujo de ejecución de un programa.

Condicionales

i f  el s e![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.059.png)

Se utiliza para ejecutar un bloque de código si una condición es verdadera y, opcionalmente, otro bloque si es falsa.

i nt  edad  =  18;![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.060.png)

i f  ( edad  >=  18)  {

`     `Sys t em. out . pr i nt l n( "Es  mayor  de  edad. ") ; }  el s e  {

`     `Sys t em. out . pr i nt l n( "Es  menor  de  edad. ") ; }

Los  i f  el s e también se pueden anidar, aunque no es lo más lógico:![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.061.png)

i f  ( edad  >=  18)  {![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.062.png)

`     `Sys t em. out . pr i nt l n( "Es  mayor  de  edad. ") ;

}  el s e  {

`     `i f  ( edad  >=  13)  {

`         `Sys t em. out . pr i nt l n( "Es  adol es cent e. ") ;      }  el s e  {

`         `Sys t em. out . pr i nt l n( "Es  un  ni ño. ") ;

`     `}

}

i f  el s e  i f  el s e![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.063.png)

Permite evaluar múltiples condiciones en secuencia.

i nt  not a  =  85;![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.064.png)

i f  ( not a  >=  90)  {

`     `Sys t em. out . pr i nt l n( "Cal i f i caci ón:  A") ;

}  el s e  i f  ( not a  >=  80)  {

`     `Sys t em. out . pr i nt l n( "Cal i f i caci ón:  B") ;  / /  Es t a  s e  ej ecut ar á }  el s e  {

- . .

}

s wi t ch![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.065.png)

Es útil para seleccionar uno de varios bloques de código a ejecutar según el valor de una variable. Funciona con tipos de datos como  byt e ,  s hor t ,  char ,  i nt ,  enum,  St r i ng y algunas clases envolventes.![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.066.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.067.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.068.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.069.png)

i nt  di a  =  4;![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.070.png)

St r i ng  nombr eDel Di a;

s wi t ch  ( di a)  {

`     `cas e  1:

`         `nombr eDel Di a  =  "Lunes ";

`         `br eak;

`     `cas e  2:

`         `nombr eDel Di a  =  "Mar t es ";

`         `br eak;

- . .

`     `def aul t :

`         `nombr eDel Di a  =  "Dí a  i nvál i do";

`         `br eak;

}

Sys t em. out . pr i nt l n( "Hoy  es  "  +  nombr eDel Di a) ;  / /  I mpr i mi r á  "Hoy  es  J ueves "

Bucles (Loops)

f or![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.071.png)

Ejecuta un bloque de código un número específico de veces. Es ideal cuando sabes de antemano cuántas iteraciones necesitas.

f or  ( i nt  i  =  0;  i  <  5;  i ++)  {![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.072.png)

`     `Sys t em. out . pr i nt l n( "El  val or  de  i  es :  "  +  i ) ; }

whi l e![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.073.png)

Repite un bloque de código mientras una condición sea verdadera. La condición se evalúa antes de cada iteración.

i nt  cont ador  =  0;![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.074.png)

whi l e  ( cont ador  <  5)  {

`     `Sys t em. out . pr i nt l n( "Cont ador :  "  +  cont ador ) ;

`     `cont ador ++;  / /  I mpor t ant e  par a  no  cr ear  un  bucl e  i nf i ni t o }

do- whi l e![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.075.png)

Similar al  whi l e , pero el bloque de código se ejecuta al menos una vez, ya que la condición se evalúa después de la iteración.![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.076.png)

i nt  i  =  0;![ref3]

do  {

`     `Sys t em. out . pr i nt l n( "El  val or  de  i  es :  "  +  i ) ;      i ++;

}  whi l e  ( i  <  5) ;

Arreglos

Los arreglos son listas de valores asociados a una variable. Para definirlos usamos la sintaxis:

/ /  Ar r egl o  de  12  ent er os ![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.077.png)i nt  c[ ]  =  new  i nt [ 12] ;

/ /  Ar r egl o  de  10  f l ot ant es ,  decl ar ado  en  dos  l í neas f l oat  d[ ] ;

d  =  new  f l oat [ 10] ;

/ /  Cant i dad  de  el ement os  de  l a  l i s t a,  cal cul ado  con  el  at r i but o  ". l engt h" dl  =  d. l engt h;

Los elementos de los arreglos de indexan desde 0, por lo que  c[ 0] es el primer elemento de  c . También es posible inicializar los arreglos con valores directamente en la declaración:![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.078.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.079.png)

/ /  Ar r egl o  de  ent er os  i ni ci al i zado  con  val or es ![ref3]i nt  numer os [ ]  =  {10,  20,  30,  40,  50};

/ /  Ar r egl o  de  St r i ngs

St r i ng  nombr es [ ]  =  {"J uan",  "Ana",  "Pedr o"};

Arreglos multidimensionales

Los arreglos multidimensionales son arreglos anidados, los cuales permiten múltiples dimensiones por ende. Su notación es la siguiente:

/ /  Ar r egl o  de  10  \*  10  el ement os  ent er os ![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.080.png)i nt  m[ ] [ ]  =  new  i nt [ 10] [ 10] ;

/ /  Pr i mer  el ement o  del  ar r egl o ![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.081.png)i nt  p  =  m[ 0] [ 0] ;![ref2]

Estructura y utilidades del código en Java

Características de Java![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.082.png)

Java es un lenguaje orientado a objetos, multiplataforma y de estándar abierto para todo el mundo. Además contamos con diferentes acrónimos para los componentes de Java:

1. JVM (Java Virtual Machine): Es un motor que proporciona un entorno de ejecución para ejecutar el código Java o las aplicaciones. Convierte el bytecode de Java en lenguaje de máquina. La JVM es parte del JRE.
1. JRE (Java Runtime Environment): Es un conjunto de herramientas de software para el desarrollo de aplicaciones Java. Contiene la JVM, las clases principales y las bibliotecas de soporte.
1. JDK (Java Development Kit): Es un kit de desarrollo de software que se utiliza para desarrollar aplicaciones Java. Contiene el JRE y herramientas de desarrollo como el compilador ( j avac ) y el depurador.

La estructura de un programa en Java incluye las siguientes normas y utilidades:

4. Solo debe haber una clase por archivo. Se define como:

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.083.png)

publ i c  cl as s  Mi Cl as e  {      / /  Códi go

}

publ i c quiere decir que es público y es accesible. También podemos hacerlo privado.![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.084.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.085.png)

cl as s hace la clase con el nombre  Mi Cl as e . Los nombres deben ser cortos, con primera letra mayúscula y un nombre descriptivo.![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.086.png)

4\. Las clases tienen métodos, incluyendo el  mai n si es el programa principal. Los métodos tienen las![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.087.png)

mismas convenciones de nombres, solo que la primer letra debe ser en minúscula.

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.088.png)

publ i c  s t at i c  voi d  mai n( St r i ng[ ]  ar gs )  {      / /  Códi go

}

4\. Los comentarios ayudan a mejorar la legibilidad y la lógica del código. Comentar ayuda a mejorar

el trabajo para todos. Empiezan con  / /![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.089.png)

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.090.png)

/ /  Coment ar i o  út i l

4\. Los operadores tienen la siguiente precedencia:



|Signos|Orden de asociación|Tipo|
| - | - | - |
|\* / %![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.091.png)|Izquierda a derecha|Multiplicativo|
|+ -![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.092.png)|Izquierda a derecha|Aditivo|
|< >= > >=![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.093.png)|Izquierda a derecha|Relacional|
|== ! =![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.094.png)|Izquierda a derecha|Igualdad|
|=![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.095.png)|Derecha a izquierda|Asignación|

Los operadores con la misma precedencia se aplican en el orden de asociación.

4. Puedes hacer salidas en consola con  Sys t em. out , que es el estándar para ello:![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.096.png)

pr i nt l n imprime una línea de forma literal![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.097.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.098.png)

pr i nt f imprime con formato, pasándole valores

5. Existen secuencias de escape para escribir caracteres especiales:

\ n : salto de línea![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.099.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.100.png)

\ t : tabulación

\ r : retorno de carro. Devuelve el cursor al inicio de la línea y la sobrescribe con lo que siga

\ \ : backslash

\ " y  \ ' : comillas![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.101.png)

- Entre otros

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.102.png)

/ /  \ r  hace  que  l a  pr óxi ma  vez  s e  s obr ees cr i ba  l a  mi s ma  l í nea.  %d  adqui er e ![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.103.png)el  val or  de  val

Sys t em. out . pr i nt f ( "Pr ogr es o:  %d\ r ",  val ) ;

4\. Puedes usar  Sys t em. i n para hacer entradas, por ejemplo con  s canner para pedir en consola.![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.104.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.105.png)

Importa  j ava. ut i l . Scanner para que funcione

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.106.png)

i mpor t  j ava. ut i l . Scanner ;  / /  I mpor t ar  l a  cl as e  Scanner

/ /  . . .  En  el  códi go  pr i nci pal

/ /  Cr ear  un  Scanner  par a  l eer  l a  ent r ada  de  l a  cons ol a Scanner  s canner  =  new  Scanner ( Sys t em. i n) ;

/ /  Pedi r  un  nombr e  al  us uar i o

Sys t em. out . pr i nt ( "I nt r oduce  t u  nombr e:  ") ;

St r i ng  nombr e  =  s canner . next Li ne( ) ;  / /  Leer  una  l í nea  de  t ext o

/ /  Pedi r  l a  edad  al  us uar i o

Sys t em. out . pr i nt ( "I nt r oduce  t u  edad:  ") ;

i nt  edad  =  s canner . next I nt ( ) ;  / /  Leer  un  númer o  ent er o

/ /  Mos t r ar  l a  i nf or maci ón  r eci bi da

Sys t em. out . pr i nt f ( "Hol a,  %s .  Ti enes  %d  años . \ n",  nombr e,  edad) ;

/ /  Cer r ar  el  s canner  par a  l i ber ar  r ecur s os s canner . cl os e( ) ;

Métodos de salida

Comando  pr i nt f![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.107.png)

Sys t em. out . pr i nt f es un método de Java que permite escribir con formato en lugar de escribir![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.108.png)

texto directamente.

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.109.png)

Sys t em. out . pr i nt f ( "%s %8s \ n",  "i ndex",  "val ue") ;


Este comando en específico:

1. Sustituye  %s con el primer valor  "i ndex" .  %d es para enteros,  %s es para textos (strings)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.110.png)
1. Sustituye  %8s con el segundo valor  "val ue" , con 8 espacios extra
1. \ n es un salto de línea, ya que  pr i nt f no hace uno automáticamente como lo hace  pr i nt l n![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.111.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.112.png)

Secuencias de formato de valores![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.113.png)

Las secuencias de formato se usan en  pr i nt f para colocar valores y modificar su tipo a la hora de imprimir. Algunas secuencias disponibles incluyen:

%d para enteros

%x o  %X para hexadecimal, con letras en minúscula o mayúscula

%o para octal

%nd establece un margen de  n espacios. Funciona con cualquier valor %s y  %S para textos (strings) en minúscula o mayúscula

%. nf pone  n cifras decimales en números flotantes

%. ne pone  n cifras decimales en notación científica

Para fechas y horas, se utiliza el prefijo  %t o  %T . Este se combina con otros caracteres para formatear diferentes partes de una fecha.

%t Y o  %TY: Año en 4 dígitos (ej: 2025)

%t m: Mes en 2 dígitos (01-12)

%t d o  %Te : Día del mes en 2 dígitos (01-31) %t H: Hora en 24h (00-23)

%t M: Minuto (00-59)

%t S : Segundo (00-60)

%t L : Milisegundo (000-999)

%t F : Fecha completa en formato AAAA- MM- DD

%t T : Hora completa en formato HH: MM: SS

Ejemplo

i mpor t  j ava. ut i l . Dat e;

publ i c  cl as s  FechaFor mat o  {

`     `publ i c  s t at i c  voi d  mai n( St r i ng[ ]  ar gs )  {

`         `Dat e  hoy  =  new  Dat e( ) ;

`         `Sys t em. out . pr i nt f ( "La  f echa  es :  %t F\ n",  hoy) ;  / /  Sal i da:  La f echa  es :  2025- 09- 11

`         `Sys t em. out . pr i nt f ( "La  hor a  es :  %t T\ n",  hoy) ;    / /  Sal i da:  La hor a  es :  HH: MM: SS

`     `} }![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.114.png)![ref2]

¿Qué es UML?

Es un lenguaje de modelado diseñado para ser una estructura sencilla y uniforme para el desarrollo de sistemas en desarrollo de software y programación. Fue creado por los "tres amigos" Grady Booch, James Rumbaugh e Ivar Jacobson entre 1996 y 1999.

Está diseñado para ser abstracto, semántico y legible por humanos. Para el caso de la programación orientada a objetos, se usan principalmente los diagramas de clases, junto con los de objetos, componentes, paquetes e implementación.

Glosario básico

1. UML: Lenguaje Unificado de Modelado.
1. Diagrama de clases: El diagrama más común en la POO, que describe la estructura de un sistema mostrando las clases, sus atributos y operaciones, y las relaciones entre ellas.
1. Clase: Una plantilla para crear objetos que comparten una estructura y comportamiento comunes.
1. Objeto: Una instancia concreta de una clase.
1. Paquete: Un mecanismo para agrupar clases y otros elementos relacionados en el diagrama, ayudando a organizar la información.
1. Niveles de visibilidad: Símbolos que indican el nivel de acceso a los atributos y métodos de una clase. Los más comunes son:

\+ : Público: Accesible desde cualquier clase.![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.115.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.116.png)

\- : Privado: Solo accesible dentro de la propia clase.

\# : Protegido: Accesible desde la propia clase y sus subclases (herederos).

Para el proceso de modelado es evidente también el tener en cuenta los conceptos básicos de la programación orientada a objetos, como los objetos, clases, abstracción, encapsulamiento, herencia y polimorfismo.

Diagramas de clases

Las clases se representan con una forma rectangular con tres divisiones horizontales: el nombre de la clase, sus atributos y sus métodos. También se pueden especificar sus valores y tipos de datos de forma análoga a la forma del código.

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.117.png)

Una persona es un objeto que tiene nombre, apellido, edad, entre otras cosas, como sigue.

![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.118.png)

Herencia

Cuando una clase hereda de otra, se hace una flecha desde la clase hija hacia la clase padre.

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.119.png)

La flecha  Es t udi ant e  - - | >  Per s ona muestra que la clase  Es t udi ant e hereda de la clase

Per s ona . Esto significa que  Es t udi ant e obtendrá los atributos y métodos de  Per s ona , como Nombr e ,  Edad y  cami nar ( ) , además de los suyos propios.

![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.120.png)

Asociaciones

Muestran una relación estructural entre clases.

- Asociación simple: línea continua entre clases.
- Multiplicidad: especifica cuántas instancias participan ( 1 ,  0. . \* ,  1. . \* ).![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.121.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.122.png)
- Navegabilidad: una flecha indica que solo una de las clases conoce a la otra.

  Dado un  Pr of es or este puede dictar cero o muchos  Cur s o . Cada  Cur s o es dictado por un solo  Pr of es or .

  ![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.123.png)

Paquetes

Sirven para agrupar clases relacionadas y mantener el modelo ordenado. Se representan como carpetas con una pestaña superior.

Dentro de un diagrama de clases, un paquete puede contener otros paquetes.

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.124.png)

El cliente, el pedido y el producto con parte del paquete  Model o  de  negoci o .

![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.125.png)

Niveles de visibilidad

Además de  + público,  - privado y  # protegido, en algunos casos se añaden:![ref5]![ref5]


~ Paquete (default): accesible solo dentro del mismo paquete. ![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.127.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.128.png)/ Derivado: atributo calculado a partir de otros.

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.129.png)

La clase  Cuent a tiene varios atributos y métodos. Solo uno es privado.

![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.130.png)

Instancias (Diagramas de objetos)

Un diagrama de objetos muestra ejemplos concretos de clases en un momento dado.

- Cada objeto se escribe como  nombr eObj et o  :  Nombr eCl as e .![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.131.png)
- Permite visualizar valores de atributos en un instante de ejecución.

El aspecto de estos diagramas es idéntico al de los diagramas de clases

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.132.png)

Dani l o es una instancia de la clase  Es t udi ant e que contiene valores establecidos y cambios respecto a la clase original.

![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.133.png)

Interfaces

Una interfaz define operaciones que las clases que la implementan deben cumplir.

- Se dibuja como un círculo con estereotipo  <<i nt er f ace>> o un rectángulo con esa etiqueta.![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.134.png)
- La relación de implementación se representa con una línea discontinua y triángulo vacío.

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.135.png)

Envi abl e es una interfaz que define el método  envi ar ( ) . Las clases  Cor r eo y ![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.136.png)Mens aj eText o implementan la interfaz (línea discontinua con triángulo).![ref4]

![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.137.png)

Casting de tipos

El casting consiste en el cambio entre tipos de datos en Java. Algunas veces este proceso es automático, aunque también puede ser manual dependiendo de la conversión.

Las conversiones entre tipos siguen el esquema de esta tabla:



|Valor a asignar **↓** / Variable destino **→**|i nt![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.138.png)|l ong![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.139.png)|f l oat![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.140.png)|doubl e![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.141.png)|char![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.142.png)|byt e![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.143.png)|s hor t![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.144.png)|bool ean![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.145.png)|
| :- | - | - | - | - | - | - | - | - |
|i nt![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.146.png)|–|A|A|A|C|C|C|N|
|l ong![ref6]|C|–|A|A|C|C|C|N|
|f l oat![ref7]|C|C|–|A|C|C|C|N|
|doubl e![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.149.png)|C|C|C|–|C|C|C|N|
|char![ref6]|A|A|A|A|–|C|C|N|
|byt e![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.150.png)|A|C|A|A|C|–|A|N|
|s hor t![ref7]|A|A|A|A|C|C|–|N|
|bool ean![ref8]|N|N|N|N|N|N|N|–|

- A: Automático. Java se encarga de hacer la conversión al valor más pertinente.

i nt  i  =  10;![ref9]

doubl e  d  =  i ;  / /  i nt  →  doubl e  aut omát i co


- C: Conversión. El usuario debe hacer la conversión de forma manual.

doubl e  d  =  9. 8;![ref9]

i nt  i  =  ( i nt )  d;  / /  doubl e  →  i nt ,  s e  t r unca  l a  par t e  deci mal

- N: No compatible. No permite hacer la conversión porque no hay una equivalencia relevante entre valores.

bool ean  b  =  t r ue;![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.153.png)

i nt  n  =  ( i nt )  b;  / /  No  es  compat i bl e

Números aleatorios

Para usar números aleatorios en Java usamos el paquete Random. Se importa como:

i mpor t  j ava. ut i l . Random;![ref10]

Luego, se invoca un generador con:

Random  r  =  new  Random( ) ;![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.155.png)

A partir de aquí, llamamos a los métodos que necesitemos. Algunos de ellos son:

1. next I nt ( i nt  max) : entero entre 0 y  max (excluyendo este último)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.156.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.157.png)

/ /  Va  de  0  a  9![ref9]

i nt  n  =  r . next I nt ( 10) ;

2. next Doubl e( ) : número flotante doble entre 0.0 y 1.0 ![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.158.png)doubl e  d  =  r . next Doubl e( ) ;![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.159.png)

Esto también lo puedes hacer con  Mat h. r andom( ) sin importar nada:![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.160.png)

doubl e  d  =  Mat h. r andom( ) ;![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.161.png)

3. next Bool ean( ) :  t r ue o  f al s e aleatorio![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.162.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.163.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.164.png)

bool ean  b  =  r . next Bool ean( ) ;![ref10]

4. next I nt ( ) : entero dentro de todo el rango de  i nt ![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.165.png)![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.166.png)i nt  i  =  r . next I nt ( ) ;![ref10]

Abstracción

La abstracción es el proceso que involucra el reconocimiento y el enfoque en las características relevantes de un objeto, ignorando sus detalles irrelevantes.

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.167.png)

Si pensamos en un vehículo, pensamos en un carro, luego en un deportivo y luego en un modelo. En cada paso solo nos fijamos en las características esenciales.

Los deportivos tienen características como modelo, caballos de fuerza y tamaño. Esto nos hace diferenciarlo de, por ejemplo, un triciclo.

![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.168.png)

En la programación orientada a objetos se toman estas abstracciones y las convierten en sistemas de objetos y clases para su aprovechamiento y manejo.

Objetos

Loa objetos reales y los conceptuales difieren un poco. Mientras los objetos reales están llenos de detalles, los conceptuales son simplificaciones manejables de forma virtual.

Los objetos tienen un estado, unos atributos y y datos almacenados en ellos.

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.169.png)

Un estudiante tiene atributos como su edad, carrera e identificación, entre otros. Cada uno de ellos estará asociado a un dato.

![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.170.png)

Clases

Las clases poseen una lista de atributos y comportamientos comunes a un conjunto de objetos que son sus instancias.

Instanciación y variables por referencia![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.171.png)

Al instanciar un objeto con la notación  Cl as s  obj ect  =  new  Cl as s ( ) obtenemos una referencia a una instancia de objeto, una por cada vez que se hace un  new  Cl as s ( ) , ya que esto consiste en reservar memoria para ese proceso.

En cambio, cuando asignamos el valor de un objeto a otro creado:

/ /  Pr i mer  obj et o

Cl as s  obj ect 1  =  new  Cl as s ( ) ;

/ /  Segundo  obj et o  des de  el  pr i mer o Cl as s  obj ect 2  =  obj ect 1;

El segundo objeto es una referencia a la instancia del primero.

Recolección de basura en Java![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.172.png)

La recolección de basura en Java funciona cuando la JVM detecta que una clase no tiene instancias activas y libera memoria en consecuencia.

Encapsulación

La encapsulación es la forma en la que las clases mantienen privadas o accesibles sus atributos o métodos a fin de mantener la privacidad y hacer más robustos los programas. En UML se logra con íconos por tipo de protección:

![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.173.png)

Y en Java con las palabras clava  publ i c ,  pr i vat e y  pr ot ect ed respectivamente.![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.174.png)![ref8]![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.175.png)

Es común asociar la encapsulación con el uso de getters y setters que son métodos personalizados para acceder y establecer el valor de una variable, respectivamente

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.176.png)

Una clase almacena un número y usa un getter y un setter para obtener su valor, ya que está protegido.

Código Java

publ i c  cl as s  Numer o  {

`     `/ /  Como  el  númer o  es  pr i vado,  no  es  acces i bl e  di r ect ament e      pr i vat e  i nt  num;

`     `/ /  El  get t er  obt i ene  s u  val or  de  f or ma  cont r ol ada  y  públ i ca      publ i c  i nt  get Num( )  {

`         `r et ur n  t hi s . num;

`     `}

`     `/ /  El  s et t er  es t abl ece  s u  val or  des de  af uer a      publ i c  voi d  s et Num( i nt  newNum)  {

`         `t hi s . num  =  newNum;

`     `}

}

Diagrama UML![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.177.png)

![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.178.png)

Redundancia e integridad de datos

Si los datos de un programa se almacenan en diferentes instancias, se considera que es información redundante, la cual puede afectar el consumo y usabilidad de la misma en un programa, especialmente en términos de la integridad de la información.

#Pendiente ejemplo y posible conexión con los demás temas de la materia

Listas

#Pendiente consultar y desarrollar cada una

- Instanciar
- Añadir
- Obtener objetos
- Iterar listas con un bucle for

Como organizar proyectos en Java

#Pendiente consultar sobre la organización de proyectos en Java![ref4]

Organización de paquetes

Un proyecto esta organizado por capas:

1. Capa de datos: donde se almacena la información que usa el proyecto
1. Capa de lógica: contiene la parte principal y funcional del proyecto
1. Interfaz de usuario: es la parte usable para el usuario final, protegiendo el interior del sistema y su integridad

Definición de métodos

Un método corresponde a una función, aunque también a un servicio. En el proceso de abstracción definimos cuales usar y como funcionan. Por supuesto, los métodos pueden recibir datos para actuar de la forma deseada. Así mismo, los métodos pueden retornar datos que pueden usarse después.

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.179.png)

Un método para crear cursos puede recibir datos como el nombre y número, y retornar otros como el curso ya creado.

publ i c  s t at i c  Cour s e  cr eat eCour s e( St r i ng  name,  i nt  number )  {      Cour s e  cour s e  =  new  Cour s e( ) ;

cour s e. s et Name( name) ; cour s e. s et Number ( number ) ;

`     `r et ur n  cour s e; }

Luego, podemos usar ese objeto creado y retornado por el método.![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.180.png)

Los métodos reciben datos llamados parámetros, que son variables que van en los paréntesis  ( ) de la función y se usan solo dentro de ella. Para usarlos, el llamado a la función los pasa en el mismo orden con su valor deseado.![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.181.png)

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.182.png)

Dado el método definido antes, podemos invocarlo con los parámetros que requiere. Los parámetros deben coincidir en orden y tipo, y evidentemente, tener un valor adecuado.

/ /  Def i ni ci ón  de  var i abl es  que  us ar emos  par a  el  nuevo  cur s o St r i ng  nombr eDel Cur s o  =  "Pr ogr amaci ón  Or i ent ada  a  Obj et os "; i nt  numer oDel Cur s o  =  2025;

/ /  Ll amada  a  l a  f unci ón,  pas ando  l as  var i abl es  como  ar gument os .

/ /  Ahor a  l a  var i abl e  ' mi Cur s o'  cont i ene  el  obj et o  Cour s e  que  f ue  cr eado Cour s e  mi Cur s o  =  cr eat eCour s e( nombr eDel Cur s o,  numer oDel Cur s o) ;

/ /  I mpr i mi mos  l os  dat os  del  obj et o

Sys t em. out . pr i nt l n( "Cur s o  cr eado:  "  +  mi Cur s o. get Name( )  +  ",  Númer o:  "  + mi Cur s o. get Number ( ) ) ;

Por el lado del retorno, el valor de retorno es necesario para cualquier función que no sea de tipo

voi d . Este valor tiene el tipo que se indica en la declaración de la función y actúa como valor del mismo cuando se le llama. Solo se ejecuta el primer ![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.183.png) r et ur n que el código encuentre en su camino, el cual detiene la ejecución del método.![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.184.png)

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.185.png)

Un método puede tener varios lugares de retorno, funcionar de manera condicional y juntarse con más instrucciones. Pero solo se ejecutará el primer  r et ur n que el código alcance, impidiendo que funcione cualquier cosa después de él en el método.

publ i c  s t at i c  St r i ng  ver i f i car Edad( i nt  edad)  {

`     `/ /  Si  s e  cumpl e  l a  condi ci ón,  r et or na  el  St r i ng  y  l a  ej ecuci ón  del mét odo  t er mi na

`     `i f  ( edad  >=  18)  r et ur n  "Mayor  de  edad"; 

`     `/ /  Si  l a  condi ci ón  de  ar r i ba  NO  s e  cumpl e,  l a  ej ecuci ón  cont i núa  y r et or na  es t e  ot r o  St r i ng.

`     `r et ur n  "Menor  de  edad"; i nt 

`     `/ /  Cual qui er  códi go  que  s e  ponga  des pués  del  pr i mer  ' r et ur n'  que  s e ![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.186.png)ej ecut a  es  i nal canzabl e.

`     `Sys t em. out . pr i nt l n( "Es t o  nunca  s e  i mpr i me") ;

}

/ /  Ej empl o  de  us o

St r i ng  r es ul t ado1  =  ver i f i car Edad( 20) ;  / /  - >  "Mayor  de  edad" St r i ng  r es ul t ado2  =  ver i f i car Edad( 15) ;  / /  - >  "Menor  de  edad"

Firma de un método

La firma de un método es la combinación del nombre del método y la lista de tipos de datos de sus parámetros, en el orden en que aparecen. Es como el "identificador único" del método dentro de una clase. El tipo de retorno no es parte de la firma.

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.187.png)

Si un método tiene por definición:

publ i c  s t at i c  Cour s e  cr eat eCour s e( St r i ng  name,  i nt  number )  {      / /  Cont eni do

}

Su firma solo contiene el nombre del método y los tipos de sus parámetros, en orden:

cr eat eCour s e( St r i ng,  i nt )

Overloading o sobrecarga de métodos

El overloading (o sobrecarga) de métodos y constructores es esencial. Es la capacidad de tener varios métodos (o constructores) con el mismo nombre en la misma clase, pero que realizan su función de forma diferente dependiendo de los datos que reciben.

Para diferenciarlos entra la firma de los métodos. Dos métodos pueden sobrecargarse cuando tienen el mismo nombre pero diferentes firmas.

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.188.png)

Podemos sobrecargar el método  s umar dentro de una misma clase al hacer tres firmas diferentes, aunque de hecho hacen esencialmente lo mismo.

publ i c  cl as s  Cal cul ador a  {![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.189.png)

`     `/ /  Sobr ecar ga  par a  s umar  dos  ent er os

`     `publ i c  i nt  s umar ( i nt  a,  i nt  b)  {

`         `Sys t em. out . pr i nt l n( "Suma  de  2  ent er os ") ;          i nt  s  =  a  +  b;

`         `/ /  I mpr i me  el  r es ul t ado  y  l o  r et or na

`         `Sys t em. out . pr i nt l n( "El  r es ul t ado  es :  "  +  s ) ;          r et ur n  s ;

`     `}

`     `/ /  Sobr ecar ga  par a  s umar  t r es  ent er os  ( di f i er e  en  l a  cant i dad  de par ámet r os )

`     `publ i c  i nt  s umar ( i nt  a,  i nt  b,  i nt  c)  {

`         `Sys t em. out . pr i nt l n( "Suma  de  3  ent er os ") ;

`         `i nt  s  =  a  +  b  +  c;

`         `/ /  I mpr i me  el  r es ul t ado  y  l o  r et or na

`         `Sys t em. out . pr i nt l n( "El  r es ul t ado  es :  "  +  s ) ;          r et ur n  s ;

`     `}

`     `/ /  Sobr ecar ga  par a  s umar  dos  númer os  deci mal es  ( di f i er e  en  el  t i po  de par ámet r os )

`     `publ i c  doubl e  s umar ( doubl e  a,  doubl e  b)  {

`         `Sys t em. out . pr i nt l n( "Suma  de  2  dobl es  ( doubl e) ") ;

`         `doubl e  s  =  a  +  b;

`         `/ /  I mpr i me  el  r es ul t ado  y  l o  r et or na

`         `Sys t em. out . pr i nt l n( "El  r es ul t ado  es :  "  +  s ) ;          r et ur n  s ;

`     `}

}

El método exacto al que se llama depende automáticamente del tipo de datos al que alude su llamado en el código.

/ /  Dos  ent er os :  l l ama  al  pr i mer  mét odo i nt  s 1  =  s umar ( 561,  762)

/ /  - >  Suma  de  2  ent er os

/ /  El  r es ul t ado  es :  1323

/ /  Tr es  ent er os :  l l ama  al  s egundo  mét odo i nt  s 2  =  s umar ( 4561,  2565,  43)

/ /  - >  Suma  de  3  ent er os

/ /  El  r es ul t ado  es :  7169![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.190.png)

/ /  Dos  doubl es :  l l ama  al  t er cer  mét odo doubl e  s 3  =  s umar ( 1. 566,  2. 87)

/ /  - >  Suma  de  2  dobl es  ( doubl es )

/ /  El  r es ul t ado  es :  4. 436

Constructores

El constructor de una clase es la forma en la que se construyen sus instancias. Para crearlo tenemos dos métodos:

1. Por defecto: si no lo ponemos, el constructor existe de forma implícita como un constructor por defecto.

publ i c  cl as s  St udent  {![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.191.png)

`     `/ /  El  cons t r uct or  no  es t a  decl ar ado }

/ /  Ll amada  al  cons t r uct or  por  def ect o St udent  s  =  new  St udent ( )

El constructor por defecto instancia el objeto completo, pero lo deja todo vacío.

2. Constructor explícito: invocamos el constructor con la sintaxis:

publ i c  cl as s  Per s ona  {![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.192.png)

`     `/ /  At r i but os

`     `pr i vat e  St r i ng  name;      pr i vat e  i nt  age;

`     `/ /  Cons t r uct or .  No  pos ee  t i po  y  t i ene  el  mi s mo  nombr e  que  l a  cl as e

`     `/ /  El  cons t r uct or  t oma  s us  par ámet r os  e  i ni ci al i za  val or es  con  el l os

`     `publ i c  Per s ona( St r i ng  name,  i nt  age)  {

`         `/ /  El  us o  de  t hi s  es  una  f or ma  de  di s t i ngui r  l os  at r i but os  de  ot r as var i abl es  con  el  mi s mo  nombr e

`         `t hi s . name  =  name;

`         `t hi s . age  =  age;

`     `}

}

/ /  I ns t anci a  con  el  cons t r uct or  y  s us  par ámet r os Per s ona  e  =  new  Per s ona( "Andr és ",  16) ;

Sobrecarga de constructores

Los constructores pueden recibir overloading como cualquier método normal. Esto nos ayudará a que instanciar objetos sea más dinámico al adaptarse a los tipos de datos disponibles. El constructor que se termina llamando depende de los parámetros que se le pasen, como en la sobrecarga normal.

Ejemplo![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.193.png)

publ i c  cl as s  Per s ona  {

`     `/ /  At r i but os

`     `pr i vat e  St r i ng  name;      pr i vat e  i nt  age;

`     `/ /  1.  Cons t r uct or  con  dos  par ámet r os

`     `publ i c  Per s ona( St r i ng  name,  i nt  age)  {          t hi s . name  =  name;

`         `t hi s . age  =  age;

`     `}

`     `/ /  2.  Over l oadi ng:  Cons t r uct or  con  un  par ámet r o

`     `publ i c  Per s ona( St r i ng  name)  {

`         `t hi s . name  =  name;

`         `/ /  La  edad  s e  i ni ci al i za  con  un  val or  por  def ect o          t hi s . age  =  0; 

`     `}

`     `/ /  3.  Over l oadi ng:  El  cons t r uct or  por  def ect o,  que  s ol o  i ni ci al i za  l os at r i but os  con  s us  val or es  pr edet er mi nados

`     `publ i c  Per s ona( )  {

`         `/ /  No  hace  f al t a  poner  códi go,  o  puedes  poner  val or es  por  def ect o s i  l o  des eas .

`     `}

}

/ /  I ns t anci as  us ando  l os  di f er ent es  cons t r uct or es . / /  Us a  el  cons t r uct or  1

Per s ona  e1  =  new  Per s ona( "Andr és ",  16) ;

/ /  Us a  el  cons t r uct or  2

Per s ona  e2  =  new  Per s ona( "Car l a") ;

/ /  Us a  el  cons t r uct or  3

Per s ona  e3  =  new  Per s ona( ) ;

Forzar el constructor por defecto![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.194.png)

El constructor por defecto (que instancia a un objeto vacío) desaparece cuando se escribe de forma explicita. En el ejemplo anterior se muestra como recuperarlo para su uso:![](Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.195.png)

publ i c  Per s ona( )  {

`     `/ /  No  hace  f al t a  poner  códi go,  o  puedes  poner  val or es  por  def ect o  s i l o  des eas .

}

También puedes poner valores por defecto por tu propia cuenta en el constructor vacío, pero es opcional.![ref4]

Atributos estáticos

#Pendiente explicación #Pendiente ejemplo

Relaciones entre objetos

#Pendiente explicaciones más adecuadas y notación UML y Java asociadas a cada una

Asociaciones

Son simples relaciones entre dos clases, como acceso a métodos, acciones o similares #Pendiente ordenes de asociaciones, asociaciones de orden superior

Agregación Composición

[ref1]: Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.029.png
[ref2]: Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.035.png
[ref3]: Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.040.png
[ref4]: Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.048.png
[ref5]: Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.126.png
[ref6]: Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.147.png
[ref7]: Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.148.png
[ref8]: Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.151.png
[ref9]: Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.152.png
[ref10]: Aspose.Words.827f3f9a-72e7-45ad-9163-d497f18341ca.154.png
