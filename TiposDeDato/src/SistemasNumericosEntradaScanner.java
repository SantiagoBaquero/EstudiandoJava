
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
       // String numeroStr = scanner.nextLine();
        int numeroDecimalDos =0;
        try { // Si no ingresa un numero entro
            // numeroDecimalDos = Integer.parseInt(numeroStr); // Convertirlo a numero entero
            numeroDecimalDos = scanner.nextInt(); // Lo recibimos en entero
        }catch (InputMismatchException e){ // Ingresamos el nuevo error debido al cambio de forma de recoleccion de dato
            System.out.println("Error debe ingresar un numero entero");
            main(args);
            System.exit(0); // Para salirnos
        }

        // Impresion y conversiones de numeroDecimalDos
        String resultadoBinario = "\nNumero binario de " + numeroDecimalDos + " = " + Integer.toBinaryString(numeroDecimalDos);
        String resultadoOctal = "\nNumero Octal de " + numeroDecimalDos + " = " + Integer.toOctalString(numeroDecimalDos);
        String resultadoHexa = "\nNumero Hexadecimal de " + numeroDecimalDos + " = " + Integer.toHexString(numeroDecimalDos);
        String mensaje = resultadoBinario ;
                mensaje += resultadoOctal + resultadoHexa;
        System.out.println(mensaje);


    }
}
