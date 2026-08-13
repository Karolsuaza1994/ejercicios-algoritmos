public class DieciochoEjercicio {
 public static void main(String[] args) {

        double galones;
        double litros;
        double totalPagar;

        System.out.println("Ingrese la cantidad de galones surtidos:");
        galones = Double.parseDouble(System.console().readLine());

        litros = galones * 3.785;

        totalPagar = litros * 100;

        System.out.println("Los litros surtidos son: " + litros);
        System.out.println("El total a pagar es: " + totalPagar + " Bolívares");

    }    
    
}
