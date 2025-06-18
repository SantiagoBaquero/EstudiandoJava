public class PrimitivosCaracteres {
    public static void main(String[] args) {

       System.out.println("_______________________________________________");
       // Char  utiliza comilla simple para declarar
       // Char solo soporta 1 caracter
        char caracter ='S'; //0-9
        System.out.println("caracter = " + caracter);
        System.out.println("_______________________________________________");

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

        // ejemplo lineSeparato individual o por la clase System haciendo un salto de linea
        System.out.println("Tipo char corresponde en bytes: "  + System.lineSeparator()+ Character.BYTES); // El system.line.Separator() tambien saltar una linea nueva
        System.out.println("Tipo char corresponde en bytes: "  + System.getProperty("line.separator")+ Character.BYTES); // De la clase System podemos utilizar getProperty("line.separator") tambien saltar una linea nueva
        System.out.println("_______________________________________________");

        // Impresion normal
        System.out.println("Tipo char corresponde en bytes a " + Character.BYTES);
        System.out.println("Tipo char corresponde en bites: " + Character.SIZE);
        System.out.println("Valor maximo de un character:" + Character.MAX_VALUE);
        System.out.println("Valor minimo de un character:" + Character.MIN_VALUE);
        System.out.println("_______________________________________________");

        // Ejemplo asignar un espacio a un char en unicode los otros caracteres especiales fueron explicados tambien en TipoDeDato
        char espacio='\u0020';  // Corresponde al valor de un espacio de la forma unicode
        char retroceso='\b';  // Este ejemplo se encuentra en TiposDeDato
        char tabulador ='\t'; // Este ejemplo se encuentra en TiposDeDato
        char nuevaLinea ='\n'; // Este ejemplo se encuentra en TiposDeDato
        char retornoCarro ='\r'; // Este ejemplo se encuentra en TiposDeDato

        System.out.println("Utilizando espacio en unicode" + espacio +"ejemplo"); // Salida " Utilizando espacio en unicode ejemplo" mostrando el espacio correspondiente


    }
}
