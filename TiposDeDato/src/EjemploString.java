public class EjemploString {
    public static void main(String[] args) {

    String curso = "Programacion Java";
    String curso2 = new  String("Programacion Java");
    String curso3 = new  String("programacion java");

    boolean esIgual = curso == curso2; // Compara la referencia objeto
        System.out.println("Son iguales = " +esIgual); // Flaso porque son dos instancias distintas una crea el objeto implicita y la otra explicita con el new


        esIgual = curso.equals(curso2); //Compara el valor
        System.out.println("esIgual = " + esIgual);

        //Ignora mayuscula y miniscula
        esIgual = curso.equalsIgnoreCase(curso3);
        System.out.println("esIgual = " + esIgual);

        String curso4 ="Programacion Java"; // La misma referencia objeto
        esIgual = curso == curso4;
        System.out.println("es igual = " + esIgual);




    }
}
