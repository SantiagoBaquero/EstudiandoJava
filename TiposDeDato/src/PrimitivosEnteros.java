public class PrimitivosEnteros {
    public static void main(String[] args) {


        System.out.println("_______________________________________________");
        byte numeroByte =127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor maximo de un byte:" + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte:" + Byte.MIN_VALUE);

        System.out.println("_______________________________________________");
        short numeroShort =32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo Short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo Short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor maximo de un short:" + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short:" + Short.MIN_VALUE);

        System.out.println("_______________________________________________");
        int numeroInt =2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor maximo de un int:" + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int:" + Integer.MIN_VALUE);

        System.out.println("_______________________________________________");
        long numeroLong =9223372036854775807L;  /*Se indica con  la literal "L" para tipo long al final del valor */
        System.out.println("numeroLong = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Long.SIZE);
        System.out.println("Valor maximo de un Long:" + Long.MAX_VALUE);
        System.out.println("Valor minimo de un Long:" + Long.MIN_VALUE);

        System.out.println("_______________________________________________");
        var numeroVar= 2147483647; /* Para una variable dinamica  esta se soporta desde JDK 10 en adelante */

        /* Esto explicacion se encuentra en PrimitivosFloat */
        /* Ejemplo var numeroVarL= 2147483648L;  Siempre viene predefinido de tipo integer si lo superamos toca declararlo como en el caso long "L" */
        /* Ejemplo var numeroVarF= 9223372036854775808F;  Si superamos el long "l"  toca declararlo como en el caso float "F" o double "D" como se ve a continuacion */
        /* Ejemplo  var numeroVarD= 9223372036854775808D;  */

        System.out.println("numeroVar = " + numeroVar);



    }
}
