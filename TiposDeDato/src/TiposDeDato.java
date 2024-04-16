public class TiposDeDato {

    public static void main(String[] args){

       // Boolean -  1 bit
        boolean a=false;
        boolean b=true;

        //Char -  16 bits
        char c ='a';
        char d ='1';
        char f ='\u0021';
        /* Secuencia de escape
            \b  Retroceso
            \n  Nueva linea
            \r  Retorno del Carro
            \t  Tabulador
            \\  Diganoal Invertida
            \"  Comillas dobles
        */

      // Numeros Enteros - 4 tipos
      // Entre -128 a 127  - 8 bits
        byte enterByte=127;
      // Entre -32768 a 32767 - 16 bits
        short entertoShort = 32767;
      // Entre -2147483647 a 2147483647 - 32 bits
        int enteroInt= 2147483647;
      // Entre -9223372036854775808 a 9223372036854775807 - 64 bits
        long enteroLong = 9223372036854775807L;

      // Numeros reales
      // Entre  -1.4E a 3.4028235E38 - 32 bits
      float realFloat= 3.1416f;
      // Entre -4.9E a 1.7976931348623157E308 - 64 bits
      double realDouble=4.702935E3;

    }
}
