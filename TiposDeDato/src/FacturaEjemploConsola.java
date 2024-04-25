import java.util.Scanner;

public class FacturaEjemploConsola {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // Solicitar el nombre de la factura o descripción
        System.out.println("Ingrese el nombre de la factura:");

        String nombreFactura = scanner.nextLine();

        // Solicitar el precio del primer producto
        System.out.println("Ingrese el precio del primer producto:");
        double precio1 = scanner.nextDouble();

        // Solicitar el precio del segundo producto
        System.out.println("Ingrese el precio del segundo producto:");
        double precio2 = scanner.nextDouble();

        // Calcular el total bruto
        double totalBruto = precio1 + precio2;

        // Calcular el impuesto
        double impuesto = totalBruto * 0.19;

        // Calcular el total neto incluyendo impuesto
        double totalNeto = totalBruto + impuesto;

        // Mostrar los resultados
        System.out.println("Nombre de la factura: " + nombreFactura);
        System.out.println("Total bruto: $" + totalBruto);
        System.out.println("Impuesto (19%): $" + impuesto);
        System.out.println("Total neto incluyendo impuesto: $" + totalNeto);

        // Cerrar el scanner
        scanner.close();

    }
}
