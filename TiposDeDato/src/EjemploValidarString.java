public class EjemploValidarString {

    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            curso = " Progeamacion";

        }

        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);// valida si el string tiene contenido o es 0 el contenido retornando true o falso
        System.out.println("------------");


        boolean esVacio2 = curso.isEmpty(); // si curso esta vacio false si esta ocupado true
        System.out.println("esVacio2 = " + esVacio2);
        System.out.println("------------");


        boolean esVacio3 = curso.isBlank(); // si se deja " " se va a ejecutar por ende es necesario usar is blank este es mas seguro.
        System.out.println("esVacio3 = " + esVacio3);
        System.out.println("------------");

        if (!esVacio) {
            System.out.println(curso.toUpperCase()); //Pone el texto en mayuscula
            System.out.println("Bienvenido a estudiar ".concat(curso)); // no se puede concatenar con concat un tripo string con un valor null
            System.out.println("Bienvenido a estudiar " + curso); // con "+" si deja concatenar el null
            System.out.println("------------");
        }

        if (!esVacio2) {
            System.out.println(curso.toUpperCase()); //Pone el texto en mayuscula
            System.out.println("Bienvenido a estudiar ".concat(curso)); // no se puede concatenar con concat un tripo string con un valor null
            System.out.println("Bienvenido a estudiar " + curso); // con "+" si deja concatenar el null
            System.out.println("------------");
        }

        if (!esVacio3) {
            System.out.println(curso.toUpperCase()); //Pone el texto en mayuscula
            System.out.println("Bienvenido a estudiar ".concat(curso)); // no se puede concatenar con concat un tripo string con un valor null
            System.out.println("Bienvenido a estudiar " + curso); // con "+" si deja concatenar el null
        }
        System.out.println("Texto en blanco");

    }
}
