public class PrimitivosFloat {

    static float varflotante;

    public static void main(String[] args) {

        float realFloat= 2120f;
        float realFloatn= 2.12e3f;
        System.out.println("realFloatn = " + realFloatn);
        System.out.println("realFloat = " + realFloat);
        System.out.println("Tipo float corresponde en bytes a " + Float.BYTES);
        System.out.println("Tipo float corresponde en bytes a " + Float.SIZE);
        System.out.println("Valor maximo de un float:" + Float.MAX_VALUE);
        System.out.println("Valor minimo de un float:" + Float.MIN_VALUE);

        float negaFloat= 1.5e-10f;//0.00000000015f
        float comparaFloat =0.00000000015f;
        System.out.println("comparaFloat = " + comparaFloat);
        System.out.println("negaFloat = " + negaFloat);


        double realDouble= 1.7976931348623157E308;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde en bytes a " + Double.BYTES);
        System.out.println("Tipo double corresponde en bytes  a " + Double.SIZE);
        System.out.println("Valor maximo de un double:" + Double.MAX_VALUE);
        System.out.println("Valor minimo de un double:" + Double.MIN_VALUE);

        //float varflotante;
        System.out.println("varflotante = " + varflotante);




    }
}
