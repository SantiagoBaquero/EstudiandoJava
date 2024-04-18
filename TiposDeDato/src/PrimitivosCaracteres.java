public class PrimitivosCaracteres {
    public static void main(String[] args) {
        
        // Solo soporta 1 caracter
        char caracter ='S'; //0-9
        System.out.println("caracter = " + caracter);
        char arroba='\u0040'; // Valor de arroba
        System.out.println("arroba = " + arroba);
    
        char decimal=64; //Se imprime la Arroba igualmente
        System.out.println("decimal = " + decimal);

        System.out.println("Decimal = Arroba: "+ (arroba == decimal));// Comparamos si es el mismo valor

        char simbolo= '@';
        System.out.println("simbolo == Decimal " + (simbolo == decimal));

    char espacio='\u0020';
    char retroceso='\b';
    char tabulador ='\t';
    char nuevaLinea ='\n';
    char retorno ='\r';


        System.out.println("Tipo char corresponde en bytes: "  + System.lineSeparator()+ Character.BYTES);
        System.out.println("Tipo char corresponde en bytes: "  + System.getProperty("line.separator")+ Character.BYTES);
        System.out.println("Tipo char corresponde en bites: " + Character.SIZE);
        System.out.println("Valor maximo de un character:" + Character.MAX_VALUE);
        System.out.println("Valor minimo de un character:" + Character.MIN_VALUE);


    }
}
