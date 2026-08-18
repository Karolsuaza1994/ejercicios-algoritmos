public class DiecisieteEjercicio {
 public static void main(String[] args) {

        double precioPublico;
        double precioPagado;
        double descuento;
        double porcentajeDescuento;

        System.out.println("Ingrese el precio de venta al público:");
        precioPublico = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el precio pagado:");
        precioPagado = Double.parseDouble(System.console().readLine());

        descuento = precioPublico - precioPagado;

        porcentajeDescuento = (descuento * 100) / precioPublico;

        System.out.println("El porcentaje de descuento es: " + porcentajeDescuento + "%");

    }    
    
}
