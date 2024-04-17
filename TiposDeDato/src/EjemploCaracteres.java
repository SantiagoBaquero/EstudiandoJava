public class EjemploCaracteres {
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



    }
}
