import java.sql.SQLOutput;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {

    String curso = "Programacion Java";
    String profesor ="Santiago";

    String detalle = curso + " con el señor " + profesor;
    System.out.println(detalle);

    int numeroA = 10;
    int numeroB = 5;

        /**
         * Precedencia de los operadores por eso los junta en vez de sumarlo
         * aca sucede primero string luego numero cadena
         * con el uso de parentesis cambia la precedencia */
        System.out.println(detalle + numeroA + numeroB);
        System.out.println(detalle + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle);

        /** El metodo concat no modifica el la variable inicial sino retornal el valor
         * siendo estos string inmutables */
        String detalle2 = curso.concat(profesor);
        System.out.println("detalle2 = " + detalle2);

        // Podemos ir anidando
        String detalle3 = curso.concat(" con ".concat(profesor));
        System.out.println("detalle3 = " + detalle3);







    }
}
