public class VeintiunEjercicio {
public static void main(String[] args) {

        double cantidadNaranjas;
        double precioDocena;
        double dineroObtenido;

        double docenas;
        double costoCompra;
        double ganancia;
        double porcentajeGanancia;

        System.out.println("Cantidad de naranjas:");
        cantidadNaranjas = Double.parseDouble(System.console().readLine());

        System.out.println("Precio por docena:");
        precioDocena = Double.parseDouble(System.console().readLine());

        System.out.println("Dinero obtenido por la venta:");
        dineroObtenido = Double.parseDouble(System.console().readLine());

        docenas = cantidadNaranjas / 12;

        costoCompra = docenas * precioDocena;

        ganancia = dineroObtenido - costoCompra;

        porcentajeGanancia = (ganancia * 100) / costoCompra;

        System.out.println("Porcentaje de ganancia: " + porcentajeGanancia + "%");

    }    
}
