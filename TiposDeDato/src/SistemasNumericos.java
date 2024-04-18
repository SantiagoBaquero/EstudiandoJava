public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

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



    }
}
