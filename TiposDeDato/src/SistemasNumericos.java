import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        // Panel de peticion del valor numerico
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroDecimalDos =0;
        try { // Si no ingresa un numero entro
            numeroDecimalDos = Integer.parseInt(numeroStr); // Convertirlo a numero entero
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error debe ingresar un numero entero");
            main(args);
            System.exit(0); // Para salirnos
        }

        // Conversiones de numeroDecimal 500 en consola
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        // Binario
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        int numeroBinario =0b111110100 ; //0b para asignar un numero binario
        System.out.println("numeroBinario = " + numeroBinario);

        //Octal
        System.out.println("numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764; // 0 al inicio para asignar octal
        System.out.println("numeroOctal = " + numeroOctal);

        // Hexadecimal
        System.out.println("numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHexadecimal = 0X1f4; // 0X  para asignar que es hexadecimal
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        // Impresion y conversiones de numeroDecimalDos
        String resultadoBinario = "\nNumero binario de " + numeroDecimalDos + " = " + Integer.toBinaryString(numeroDecimalDos);
        String resultadoOctal = "\nNumero Octal de " + numeroDecimalDos + " = " + Integer.toOctalString(numeroDecimalDos);
        String resultadoHexa = "\nNumero Hexadecimal de " + numeroDecimalDos + " = " + Integer.toHexString(numeroDecimalDos);
        String mensaje = resultadoBinario + resultadoOctal + resultadoHexa;
       JOptionPane.showMessageDialog(null,mensaje);






    }
}
