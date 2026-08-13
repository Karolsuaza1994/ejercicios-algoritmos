public class SegundoEjercicio {
 public static void main(String[] args) {

        double capital;
        double interes;
        double total;

    
        System.out.println("Ingrese el capital invertido:");
        capital = Double.parseDouble(System.console().readLine());

        interes = capital * 0.02;

        total = capital + interes;

        System.out.println("El interés ganado es: " + interes);
        System.out.println("El total después de un mes es: " + total);

    }
    
}
