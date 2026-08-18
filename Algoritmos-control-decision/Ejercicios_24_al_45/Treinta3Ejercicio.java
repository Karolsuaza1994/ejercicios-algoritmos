/*en una tienda efectúan un descuento a los clientes dependiendo del monto de la compra. 
 El descuento se efectúa con base en el siguiente criterio: a. Si el monto es inferior a $500, 
 no hay descuento. b. Si está comprendido entre $500 y $1000 inclusive, se hace un descuento del
 5% c. Si está comprendido entre $1000 y $7000 inclusive, se hace un descuento del 11%.
 d. Si está comprendido entre $7000 y $15000 inclusive, el descuento es del 18%   
 5 e. Si el monto es mayor a $15000, hay un 25% de descuento. Calcule y muestre el nombre del cliente,
  el monto de la compra, monto a pagar y descuento recibido.  */
public class Treinta3Ejercicio {

    public static void main(String[] args) {

        String nombreCliente;
        double montoCompra;
        double descuento;
        double montoPagar;

        System.out.println("Ingrese el nombre del cliente:");
        nombreCliente = System.console().readLine();

        System.out.println("Ingrese el monto de la compra:");
        montoCompra = Double.parseDouble(System.console().readLine());

        if (montoCompra < 500) {

            descuento = 0;

        } else if (montoCompra < 1000) {

            descuento = montoCompra * 0.05;

        } else if (montoCompra < 7000) {

            descuento = montoCompra * 0.11;

        } else if (montoCompra <= 15000) {

            descuento = montoCompra * 0.18;

        } else {

            descuento = montoCompra * 0.25;
        }

        montoPagar = montoCompra - descuento;

        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Monto de la compra: " + montoCompra);
        System.out.println("Descuento recibido: " + descuento);
        System.out.println("Monto a pagar: " + montoPagar);
    }
}