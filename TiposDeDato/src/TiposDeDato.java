public class TiposDeDato {

    public static void main(String[] args){

       // Primitivo Boolean
        boolean a=false;
        boolean b=true;

       //Primitivo Char
        char c ='a';
        char d ='1';
        char f ='\u0021';

        // Numeros Enteros - 4 tipos
      // Entre -128 a 127  - 8 bits
        byte enterByte=127;
      // Entre -32768 a 32767 - 16 bits
        short entertoShort = 32767;
      // Entre -2147483647 a 2147483647 - 32 bits
        int enteroInt= 2147483647;
      // Entre -9223372036854775808 a 9223372036854775807 - 64 bits
        long enteroLong = 9223372036854775807L;

      // Primitivos Numeros reales

      // Entre  -1.4E a 3.4028235E38 - 32 bits
      float realFloat= 3.1416f;
      // Entre -4.9E a 1.7976931348623157E308 - 64 bits
      double realDouble=4.702935E3;

    /* Ejemplos algunos usos
            \b  Retroceso
            \n  Nueva linea
            \r  Retorno del Carro
            \t  Tabulador
            \\  Diganoal Invertida
            \"  Comillas dobles
        */
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




    }
}
