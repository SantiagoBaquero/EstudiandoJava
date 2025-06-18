# EstudiandoJava



## Instalación de JDK 📂

<p>En este texto para un readme de GitHub haces que las imágenes queden debajo del texto correspondiente puedes usar HTML.</p>

<p>Ingresamos a disco local C</p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/57c2a268-ca0d-4937-904f-eeef66f97059" alt="imagen">

<p>Nos dirigimos a archivos de programa ingresamos a ella</p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/9e544f1a-75fa-4d8f-9446-7d7f8cda0fa9" alt="imagen">

<p>Dentro de archivos de programa creamos una carpeta con el nombre "Java"</p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/18f845e5-f13a-4669-a15e-8e34688c4b23" alt="imagen">

<p>Posterior a ello descargamos el JDK que seamos instalar ya sea por medio de instalador o comprimido en la página original de Oracle:</p>

<p><a href="https://www.oracle.com/co/java/technologies/downloads/">https://www.oracle.com/co/java/technologies/downloads/</a></p>

<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/3d559a41-7ba9-45f4-bc24-19f53da4a949" alt="imagen">

<p>En el caso de hacer uso de instalador como se muestra en la imagen este selecciona la ruta de forma automática (si tiene otras versiones de java usando el instalador puede que borre la carpeta)</p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/f0e7a084-7211-4cbc-8f5d-2fc94deacd85" alt="imagen">

<p>Si lo realizamos con archivo comprimido este se extrae en la ruta que creamos ()</p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/ade31f67-98c1-49a2-9f4c-60901e1f86f1" alt="imagen">

<p>De las dos maneras quedando de esta forma los archivos</p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/7a127d4f-09a5-4107-b9ed-2cf047b5a819" alt="imagen">

<p>Posterior a ello nos dirigimos a las variables de entorno del sistema para ubicarlo hacemos uso de la búsqueda de Windows </p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/4a571be9-3ddd-4abd-a8a7-83be2f88ac69" alt="imagen">

<p>Una vez abierta esta opción le damos click a variables de entorno como se muestra en la imagen:</p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/6b4428b9-5b45-479b-9686-a177d827c9ff" alt="imagen">

<p>Una vez dentro damos click al path y editar o podemos realizar un doble click sobre el path</p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/aea9b5a7-453c-4da6-9971-6dc6a4b98912" alt="imagen">

<p>Dentro de este creamos una línea que contenga la ruta de nuestro JDK y le incluimos el \bin quedando de esta manera (C:\Program Files\Java\jdk-21\bin) si encuentran otra versión de java lo borran pueden salir como java Oracle jdk jrae javapath lo eliminan quedando únicamente la que creamos como se muestra en la imagen y pulsamos aceptar </p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/65d6053d-2cf8-4f7d-95d8-55473d5ccd2d" alt="imagen">

<p>Posteriormente en variables de sistema creamos una nueva con el nombre JAVA_HOME y la ubicación de nuestra carpeta (C:\Program Files\Java\jdk-21)</p>
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/5dc39823-274f-41ea-97f1-c9f927c3fbf8" alt="imagen">

<p>Para comprobar que este realizado de forma correcta abrimos CMD o PowerShell y escribimos "Java -version" la cual nos mostrará la versión que instalamos</p>
<img  src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/76c69e4a-f4b6-4fef-ae47-202bbfce1a50" alt="imagen">

<p>Para comprobar la versión del compilador se utiliza el comando "javac -version" </p>
 <img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/4c0c97df-cc70-45e1-a3c1-daf70a99094e" alt="imagen">

<p>Con esto finalizamos la instalación del JDK para la programación del resto del contenido</p>

## Hola Mundo 📂
> Carpeta de nombre HolaMundo/src/HolaMundo

<p> Contiene el siguiente codigo: </p>

 ```
System.out.println(" "); /* Espacio al inicio del contenido del codigo */
 System.out.println("Hola Mundo"); /* Imprime hola mundo en consola */
 String saludar = "Hola mundo (En Variable)"; /* Asiganamos Hola mundo en una valiable */
 System.out.println("saludar = "+saludar.toUpperCase()); /* ToUppercase convierte el valor de la variable en mayuscula */
```
<p> en el que visualizamos como se redacta un hola mundo directamente por el "System.out.pintln" o  escribiendo "soutv"  y pulsar tab para que escriba el comando de impresion directamente,  tambien visualizamos el hola mundo apartir de asignarlo una varible tipo string de nombre "saludar" "saludar = "Hola mundo (En Variable)"  y posterior usar el metodo .toUpperCase() en la misma variable para imprimirlo todo en mayusucula como se visualiza en la image a continuacion. </p>

<p align="center"> <img src="https://github.com/user-attachments/assets/7e55af76-25ff-4d3a-80ba-4f8d0c277b5b" alt="imagen" > </p>



## Tipos de dato 📂

Primeros archivos a utilizar:
- TiposDeDato
- PrimitivosEnteros
- PrimitivosFloat
- PrimitivosCaracteres
- Sistemas Numericos
- FacturaEjemploConsola
- FacturaEjemploConsolaJoption
 

  ### Tipos de dato 📑
  
>Archivo de nombre TiposDeDato ubicado en la carpea TiposDeDato/src/TiposDeDato.java


 <p>En este archivo econtraremos un ejemplo de tipos de uso de diferente comandos como:
            <ul>
            <li> \b  Retroceso </li>
            <li> \n  Nueva linea</li>
            <li> \r  Retorno del Carro</li>
            <li> \t  Tabulador</li>
            <li> \\  Diganoal Invertida</li>
            <li> \"  Comillas dobles</li>
            </ul>  </p>

   <p>Se muestra un ejemplo del funcionamiento de cada uno de los comandos mostrados anteriormente:<p>

   ```
        System.out.println("\n---");
        //     \b Retroceso
        System.out.println("Hola\bMundo"); // el 'a' es "borrado" por el retroceso
        System.out.print("12345\b");    // el '5' es "borrado"
        System.out.println("\n---");
        //     \n  Nueva linea
        System.out.print("Primera línea\nSegunda línea");
        System.out.println("\n---");
        //     \r  Retorno del Carro
        System.out.println("Texto inicial\rNuevo"); // Nuevo sobrescribe el "Texto inicial"
        System.out.print("Uno Dos Tres\rHola"); // Hola sobrescibre "Uno Dos Tres"
        System.out.println("\n---");
        //     \t  Tabulador
        System.out.println("Nombre:\tJuan"); // Inserta una tabulacion
        System.out.print("Edad:\t30");    // Inserta una tabulacion
        System.out.println("\n---");
        //     \\  Diagonal Invertida
        System.out.print("La ruta es C:\\Archivos\\Documentos"); // Salida: "La ruta es C:\Archivos\Documentos" asi se imprime "\"
        System.out.println("\n---");
        //     \"  Comillas dobles
        System.out.println("El dijo: \"Hola mundo\""); // Salida: El dijo: "Hola mundo"
   ```
            
   <p> y ejemplo de los datos tipo byte short int long float double de forma rapida  </p>

   ```
      // Entre -128 a 127  - 8 bits
        byte enterByte=127;
      // Entre -32768 a 32767 - 16 bits
        short entertoShort = 32767;
      // Entre -2147483647 a 2147483647 - 32 bits
        int enteroInt= 2147483647;
      // Entre -9223372036854775808 a 9223372036854775807 - 64 bits
        long enteroLong = 9223372036854775807L;
      // Entre  -1.4E a 3.4028235E38 - 32 bits
      float realFloat= 3.1416f;
      // Entre -4.9E a 1.7976931348623157E308 - 64 bits
      double realDouble=4.702935E3;
   ```

     


## PrimitvosEnteros 📑 
> Archivo de nombre PrimitivosEnteros ubicado en la carpea TiposDeDato/src/PrimitivosEnteros.java
<p>Encontraremos la declaracion de los datos <strong>byte-short-int-long-var</strong> </p>

```
        System.out.println("_______________________________________________");
        byte numeroByte =127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor maximo de un byte:" + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte:" + Byte.MIN_VALUE);

        System.out.println("_______________________________________________");
        short numeroShort =32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo Short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo Short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor maximo de un short:" + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short:" + Short.MIN_VALUE);

        System.out.println("_______________________________________________");
        int numeroInt =2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor maximo de un int:" + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int:" + Integer.MIN_VALUE);

        System.out.println("_______________________________________________");
        long numeroLong =9223372036854775807L;  /*Se indica con  la literal "L" para tipo long al final del valor */
        System.out.println("numeroLong = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Long.SIZE);
        System.out.println("Valor maximo de un Long:" + Long.MAX_VALUE);
        System.out.println("Valor minimo de un Long:" + Long.MIN_VALUE);
```

<p>Tambien visualizamos var en el cual al superar el predetirmado de int que el maximo es 2147483647 se tiene que declar en tipo "L" long "D" double "F" Float los cuales se abordan en (PrimitivosFloat) </p>

```
     System.out.println("_______________________________________________");
        var numeroVar= 2147483647; /* Para una variable dinamica  esta se soporta desde JDK 10 en adelante */

        /* Esto explicacion se encuentra en PrimitivosFloat */
        /* Ejemplo var numeroVarL= 2147483648L;  Siempre viene predefinido de tipo integer si lo superamos toca declararlo como en el caso long "L" */
        /* Ejemplo var numeroVarF= 9223372036854775808F;  Si superamos el long "l"  toca declararlo como en el caso float "F" o double "D" como se ve a continuacion */
        /* Ejemplo  var numeroVarD= 9223372036854775808D;  */

        System.out.println("numeroVar = " + numeroVar);
```

## PrimitivosFloat 📑 (FLOAT DOUBLE VAR)
>Archivo de nombre PrimitivosFloat ubicado en la carpea TiposDeDato/src/PrimitivosFloat.java

<p> Inicialmente vamos a encontrar el ejemplo de prueb en el cual si no se asigna la 'f' el tipo va a ser tomado como double tambien encontraremos un ejemplo de diferentes notaciones para valores en float ya sea 'e' elevado a la 3 o -10 siendo la cantidad de movimientos dle punto correspondientes a la derecha o izquieda lo mismo con el tipo de dato double. </p>

```
 float prueb= 1.0f; // Cuando se asigan un valor 1.0 el valor pasa a double toca añadirle 'f' de float para mantener el tipo de dato
        System.out.println(prueb);

        System.out.println("_______________________________________________");
        float realFloat= 2120f; // valor normal con 'f'
        float realFloatn= 2.12e3f; // Valor en notacion cientifica es decir multiplicado por 10 elevado a la 3
        System.out.println("realFloatn = " + realFloatn);
        System.out.println("realFloat = " + realFloat);
        System.out.println("Tipo float corresponde en bytes a " + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("Valor maximo de un float:" + Float.MAX_VALUE);
        System.out.println("Valor minimo de un float:" + Float.MIN_VALUE);
        System.out.println("_______________________________________________");
        float negativFloat= 1.5e-10f;//0.00000000015f
        float comparaFloat =0.00000000015f; // diferente forma de escribir 1.5e-10f
        System.out.println("comparaFloat = " + comparaFloat);
        System.out.println("negativFloat = " + negativFloat);
        System.out.println("_______________________________________________");
       double autoDouble= 3.4028235E38;// Cuando se indica un '.' lo toma automaticamente como double
        double realDouble= 1.7976931348623157E308;
        System.out.println("Lo toma como doble automaticamente, autoDouble = " + autoDouble);
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde en bytes a " + Double.BYTES);
        System.out.println("Tipo double corresponde en bites  a " + Double.SIZE);
        System.out.println("Valor maximo de un double:" + Double.MAX_VALUE);
        System.out.println("Valor minimo de un double:" + Double.MIN_VALUE);
        System.out.println("_______________________________________________");

```

<p>Tambien encontraremos un ejemplo con la variable var la cual utilizamos para generar el valor por defecto del tipo de dato float en la variable varflotante convirtiendo esta en un atributo de la clase siendo ubicada fuera del metodo main y  un ejemplo de vardinamica en el cual el valor deacuerdo a asiganrle la letra 'D F L' cambia el tipo de dato ejemplo "varvariable=1-0F  varvariable=1-0D varvariable=1-0L" </p>

```
     static float varflotante; // atributo de la clase para valor por defecto esta debe tener el mismo contexto del metodo por eso comparte el static
```

```
    // float varconstante; // si dejamamos solo float varflotante sin inicializar marcara error pero si lo declaramos como atributo de la clase si podemos dejarlo con valor por defecto
    System.out.println("valor defecto de varflotante = " + varflotante); // varflotante esta inicializada

```

```
    // Var variable dinamica
    var varvariable = 10f; // Si cambiamos la terminacion 'D F L' cambia el tipo pon el cursos sobre varvariable en la impresion y verificas el tipo de dato ya sea F o D o L
    System.out.println("varvariable = " + varvariable);
```

## PrimitvosCaracteres 📑
>Archivo de nombre PrimitivosCaracteres ubicado en la carpea TiposDeDato/src/PrimitivosCaracteres.java

<p>Para obtener los valores uncode podemos hacer uso de Mapa de Caracteres buscandolo en nuestro widnows o en nuestro navegador buscando valores unicode </p>

<p align="center"> <img src="https://github.com/user-attachments/assets/6cef405a-16f5-45ce-a656-0ce4da17af86" alt="imagen" > </p>

<p>Ingresando a la misma en la parte inferior podemos ubicar el valor del mismo en unciode</p>
<p align="center"> <img src="https://github.com/user-attachments/assets/a84e4508-56ef-4e52-8c8c-ccc108f6d52e" alt="imagen" > </p>





<p>Iniciamos mostrando un ejemplo de char el cual se declara en comilla sencilla '' y soporta solo 1 caracter.</p>

```
// Char  utiliza comilla simple para declarar
       // Char solo soporta 1 caracter
        char caracter ='S'; //0-9
        System.out.println("caracter = " + caracter)
```

<p>Posterior a ello mostraremos un ejemplo de arroba escrita en formato unicode en decimal y de forma directa el caracter @ y en cada uno se realiza la comparacion booleana si correponden entre ellos al mismo valor dando true o false correspondientemente.</p>

```
// Escribimos el valor de arroba en formato unicode el cual podemos encontrar en mapa de caracteres en equipos windows
        char arroba='\u0040'; // Valor de arroba uncide
        System.out.println("Caracter en unicode arroba = " + arroba);
        System.out.println("_______________________________________________");

        char decimal=64; //Se imprime la Arroba igualmente ya que corresponde en el ASCII
        System.out.println("Arroba en decimal (ASCII) arroba = " + decimal);

        System.out.println("_______________________________________________");

        // Comparamos que el arroba por ASCII y Unicode sean iguales lo hacemos por medio de una expresion booleana ya que nos devuelve true o false
        System.out.println("Comparacion Decimal = Arroba: "+ (arroba == decimal));// Comparamos si es el mismo valor
        System.out.println("_______________________________________________");

        //Comparamos si el caracter directo @ es igual al ASCII lo hacemos por medio de una expresion booleana ya que nos devuelve true o false
        char simbolo= '@';
        System.out.println("simbolo == Decimal " + (simbolo == decimal));
        System.out.println("_______________________________________________");
```

<p>Un ejemplo de formas de realizar saltos de linea \n o haciendo uso de la clase System o de forma individual el lineSeparator </p>

```
   // ejemplo lineSeparato individual o por la clase System haciendo un salto de linea
        System.out.println("Tipo char corresponde en bytes: "  + System.lineSeparator()+ Character.BYTES); // El system.line.Separator() tambien saltar una linea nueva
        System.out.println("Tipo char corresponde en bytes: "  + System.getProperty("line.separator")+ Character.BYTES); // De la clase System podemos utilizar getProperty("line.separator") tambien saltar una linea nueva
        System.out.println("_______________________________________________");
        
```

<p>Un ejemeplo de caracter siendo este un espacio ' ' o en formato unicode como se muesta </p>

```
   char espacio='\u0020';  // Corresponde al valor de un espacio de la forma unicode
   System.out.println("Utilizando espacio en unicode" + espacio +"ejemplo"); // Salida " Utilizando espacio en unicode ejemplo" mostrando el espacio correspondiente

```





 ### Corrigiendo indicaciones del contenido


 
La impresión del mismo se realiza gracias a JOptionPane como se muestra a continuación:


<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/b34eae53-d2fa-47e7-8a93-0e146db347bf" alt="imagen">
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/74701a39-5f3d-4ab4-9dfe-2459e039817a" alt="imagen">

- Sistemas Numéricos Enteros

En este encontramos la misma funcionalidad que Sistemas numéricos solo que este es realizado por medio de consola.

- Se añade sistema de conversión de datos

Se muestran diferentes ejemplos de conversión de datos 

<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/c73abbe3-aa5d-497d-8347-d29b1a11db03" alt="imagen">

- Factura por Scanner y por Jopt

Se muestra un ejercicio de factura por Scanner y Jopt

Se va a solicitar el nombre para la factura
2 valores de producto el impuesto es del 19%

<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/d07d7351-7b2d-47f9-91b9-c56f657885f9" alt="imagen">

Con el Jopt

<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/1177d82a-e90f-4a60-87d3-6b9c49173036" alt="imagen">
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/015d1006-bb28-4d44-9908-e37108fe12cf" alt="imagen">
<img src="https://github.com/SantiagoBaquero/EstudiandoJava/assets/102531445/3d16113d-9ee2-4155-acb3-14a66062dffc" alt="imagen">

# Tipos de String 


Primeros archivos a utilizar:
- EjemploString.java
- EjemploStringConcatenacion.java
- EjemploStringInmutable.java



<img src="https://github.com/user-attachments/assets/af0c31ab-7523-4da3-a9ad-205ac0233a9e" alt="imagen">

Aca lo que hacemos al comparar con == compara la referencia por eso al comparlo con un string generado con new saldra falso , al realizar la comparacion por medio de equals lo realiza al valor.

Tambien podemos ver el uso de .equalsIgnoreCase(###);  el cual ignora mayusculas y minusculas al realizar la comparacion del contenido.

Por ultimo vemos la comparacion de curso y curso4 pero por la referencia lo cual nos devuelve verdadero 


<img src="https://github.com/user-attachments/assets/fed622ba-8193-460b-a7f8-0098b039f1b6" alt="imagen">

Precedencia de los operadores por eso los junta en vez de sumarlo aca sucede primero string luego numero cadena con el uso de parentesis cambia la precedencia , al ser "detalle" una cadena el resto de concatenacion sera una cadena  al asignar los parentesis correspondiente si realiza la suma y igual si se cambia el orden de la concatenacion. 

El metodo concat no modifica el la variable inicial sino retornal el valor siendo estos string inmutables

<img src="https://github.com/user-attachments/assets/f37af86e-c72f-4a88-9690-c8b081dc7b13" alt="imagen">

Expresion lambda o flecha .tranform , recibe el string por argumento retorna "c + profesor" entonces retorna una nueva instancia sin modificar el valor original entonces "curso" se mantiene inmutable


resultado3.remplace vamos a remplazar la letra "a" por una "A"  entonces cualquier metodo que modifica el string lo que hace es retornar, no realiza modificacion en el valor inicial establecido. 


Diferencia de concatenar haciendo uso de "+" "concat" o String Builder


<img src="https://github.com/user-attachments/assets/8679343d-4280-49d7-8ecd-7c5a01bbc194" alt="imagen">



El string builder es el mas rapido en este ejemplo en minisegudnso , concat responde bien cuando no tiene un gran volumen de repeticiones ya cuando el volumen es mayor empieza a aumentar el tiempo mientras que con  "+" empieza a reducir tiempo a mayor volumen de datos.


Ya que concat cuando concatena crea mas objetos tenemos el objeto "c" "a" y el "c+a" lo mismo con la letra "b" y salto de linea 


<img src="https://github.com/user-attachments/assets/a34e6784-156d-4518-a411-e5e44d282557" alt="imagen">

Usaremos el is.empty y is.blank para validar el string tambien haciendo uso de booleanos en el caso de empty si le ingresas un valor " " con espacio en blanco igualmente pasa la verificacion pero en el caso de is.blank si esta vacio o con un espacio en blanco no pasara la verificacion.














