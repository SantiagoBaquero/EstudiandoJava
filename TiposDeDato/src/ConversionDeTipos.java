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


    }


}
