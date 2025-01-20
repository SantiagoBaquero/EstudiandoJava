public class EjemploStringRendimiento {

    public static void main(String[] args) {


    String  a = "a";
    String  b = "b";
    String  c = a;

    StringBuilder sb = new StringBuilder(a);  // El stringbuilder es mutable

    long inicio = System.currentTimeMillis(); // Medida en Milisegundos


    for (int i = 0; i < 10000; i++){
       // c = c.concat(a).concat(b).concat("\n"); // concat 500=> 2 Milisegundos , concat 1000=> 3-4 Milisegundos ,  10000=> 154 Milisegundos
       // c += a + b + "\n";   //  500=> 13-14 Milisegundos ,  1000=> 14-15 Milisegundos ,  10000=> 59 Milisegundos

        sb.append(a).append(b).append("\n"); //  500=> 0-1 Milisegundos ,  1000=> 0-1 Milisegundos , 10000=> 2 Milisegundos
    }

    long fin = System.currentTimeMillis();
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.out.println(fin - inicio);






    }
}
