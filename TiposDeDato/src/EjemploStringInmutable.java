public class EjemploStringInmutable {
    public static void main(String[] args) {

    String curso = "Programacion Java";
    String profesor ="Santiago";


    String resultado = curso.concat(profesor);
    System.out.println("curso = " + curso);
       System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado); // es falso ya que curso y resultado son diferentes

        // expresiones lambda o flecha
       String resultado2 =  curso.transform(c -> {
            return c + " con " + profesor ;
        });
        System.out.println("curso = " + curso);  // como no esta asignado no cambia el valor
        System.out.println("resultado2 = " + resultado2);

         resultado.replace("a" ,"A");   // no se vera el cambio solo se refleja en resultado 3
        System.out.println("resultado = " + resultado);

        String resultado3 = resultado.replace("a" ,"A");   // se tiene que asignar a una variable si no resultado no vera el cambio solo se refleja en resultado 3
        System.out.println("resultado3 = " + resultado3);





    }
}
