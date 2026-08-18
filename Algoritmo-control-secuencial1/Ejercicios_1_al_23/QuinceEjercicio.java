public class QuinceEjercicio {
public static void main(String[] args) {

        double lecturaAnterior;
        double lecturaActual;
        double costoKw;
        double consumo;
        double total;

        System.out.println("Lectura anterior:");
        lecturaAnterior = Double.parseDouble(System.console().readLine());

        System.out.println("Lectura actual:");
        lecturaActual = Double.parseDouble(System.console().readLine());

        System.out.println("Costo por kilovatio:");
        costoKw = Double.parseDouble(System.console().readLine());

        consumo = lecturaActual - lecturaAnterior;

        total = consumo * costoKw;

        System.out.println("Total a pagar: " + total);

    }
    
}
