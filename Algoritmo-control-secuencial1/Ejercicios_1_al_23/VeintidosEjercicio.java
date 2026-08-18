public class VeintidosEjercicio {
public static void main(String[] args) {

        double precioContado;
        double valorCuota;

        double totalCuotas;
        double recargo;
        double porcentajeRecargo;

        System.out.println("Precio de contado:");
        precioContado = Double.parseDouble(System.console().readLine());

        System.out.println("Valor de cada cuota:");
        valorCuota = Double.parseDouble(System.console().readLine());

        totalCuotas = valorCuota * 12;

        recargo = totalCuotas - precioContado;

        porcentajeRecargo = (recargo * 100) / precioContado;

        System.out.println("El porcentaje de recargo es: " + porcentajeRecargo + "%");

    }

}
