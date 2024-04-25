import javax.swing.JOptionPane;
public class EjemploFacturaJoption {
    public static void main(String[] args) {

                // Solicitar el nombre de la factura
                String nombreFactura = JOptionPane.showInputDialog("Ingrese el nombre de la factura:");

                // Solicitar el precio del primer producto
                String precio1Str = JOptionPane.showInputDialog("Ingrese el precio del primer producto:");
                double precio1 = Double.parseDouble(precio1Str);

                // Solicitar el precio del segundo producto
                String precio2Str = JOptionPane.showInputDialog("Ingrese el precio del segundo producto:");
                double precio2 = Double.parseDouble(precio2Str);

                // Calcular el total bruto
                double totalBruto = precio1 + precio2;

                // Calcular el impuesto
                double impuesto = totalBruto * 0.19;

                // Calcular el total neto incluyendo impuesto
                double totalNeto = totalBruto + impuesto;

                // Construir el mensaje a mostrar
                String mensaje = "Nombre de la factura: " + nombreFactura + "\n"
                        + "Total bruto: $" + totalBruto + "\n"
                        + "Impuesto (19%): $" + impuesto + "\n"
                        + "Total neto incluyendo impuesto: $" + totalNeto;

                // Mostrar el mensaje
                JOptionPane.showMessageDialog(null, mensaje);



    }
}
