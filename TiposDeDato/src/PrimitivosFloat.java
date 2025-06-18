public class PrimitivosFloat {
     static float varflotante; // atributo de la clase para valor por defecto esta debe tener el mismo contexto del metodo por eso comparte el static
    public static void main(String[] args) {

        float prueb= 1.0f; // Cuando se asigan un valor 1.0 el valor pasa a double toca añadirle 'f' de float para mantener el tipo de dato
        System.out.println(prueb);

        System.out.println("_______________________________________________");
        float realFloat= 2120f; // valor normal con 'f'
        float realFloatn= 2.12e3f; // Valor en notacion cientifica es decir multiplicado por 10 elevado a la 3
        System.out.println("realFloatn = " + realFloatn);
        System.out.println("realFloat = " + realFloat);
        System.out.println("Tipo float corresponde en bytes a " + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("Valor maximo de un float:" + Float.MAX_VALUE);
        System.out.println("Valor minimo de un float:" + Float.MIN_VALUE);
        System.out.println("_______________________________________________");

        float negativFloat= 1.5e-10f;//0.00000000015f
        float comparaFloat =0.00000000015f; // diferente forma de escribir 1.5e-10f
        System.out.println("comparaFloat = " + comparaFloat);
        System.out.println("negativFloat = " + negativFloat);
        System.out.println("_______________________________________________");

        double autoDouble= 3.4028235E38;// Cuando se indica un '.' lo toma automaticamente como double
        double realDouble= 1.7976931348623157E308;
        System.out.println("Lo toma como doble automaticamente, autoDouble = " + autoDouble);
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde en bytes a " + Double.BYTES);
        System.out.println("Tipo double corresponde en bites  a " + Double.SIZE);
        System.out.println("Valor maximo de un double:" + Double.MAX_VALUE);
        System.out.println("Valor minimo de un double:" + Double.MIN_VALUE);
        System.out.println("_______________________________________________");


        // Var variable dinamica
        var varvariable = 10f; // Si cambiamos la terminacion 'D F L' cambia el tipo pon el cursos sobre varvariable en la impresion y verificas el tipo de dato ya sea F o D o L
        System.out.println("varvariable = " + varvariable);

       // float varconstante; // si dejamamos solo float varflotante sin inicializar marcara error pero si lo declaramos como atributo de la clase si podemos dejarlo con valor por defecto
        System.out.println("valor defecto de varflotante = " + varflotante); // varflotante esta inicializada



    }
}
