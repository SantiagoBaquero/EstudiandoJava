public class ConversionDeTipos {

    public static void main(String[] args) {

        // Conversion String a Int
        String numeroStr="50";
        int numeroInt =Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        // Conversion  String a Double
        String realStr ="98765.43e-3";
        double realSouble = Double.parseDouble(realStr);
        System.out.println("realSouble = " + realSouble);
        //  Conversion String a Boolean
        String logicoStr ="true"; // true o false
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        // Conversion de Int a String
        int otronumeroInt = 100;
        System.out.println("otronumeroInt = " + otronumeroInt);

        String otroNumeroStr =  Integer.toString(otronumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        // Otra Conversion de Int a String
        otroNumeroStr = String.valueOf(otronumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        // Con otronumeroStr como es cadena le concatena el 10
        otroNumeroStr = String.valueOf(otroNumeroStr+10);
        System.out.println("otroNumeroStr manejado por cadena str = " + otroNumeroStr);

        // Double convertido a string
        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        // Ahora con un valor flotante
        otroRealStr = String.valueOf(1.23456f);
        System.out.println("otroRealStr = " + otroRealStr);

    

    }


}
