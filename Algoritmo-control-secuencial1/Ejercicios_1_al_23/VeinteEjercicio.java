public class VeinteEjercicio {
 public static void main(String[] args) {

        double capital;
        double interes;
        double tiempo;
        double porcentajeAnual;

        System.out.println("Ingrese el capital del préstamo:");
        capital = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el interés pagado:");
        interes = Double.parseDouble(System.console().readLine());

        tiempo = 4;

        porcentajeAnual = (interes * 100) / (capital * tiempo);

        System.out.println("El porcentaje anual cobrado es: " + porcentajeAnual + "%");

    }

    
}
