public class CuartoEjercicio {
 public static void main(String[] args) {

        double compra;
        double descuento;
        double totalPagar;

        System.out.println("Ingrese el valor de la compra:");
        compra = Double.parseDouble(System.console().readLine());

        descuento = compra * 0.15;

        totalPagar = compra - descuento;

        System.out.println("El descuento es: " + descuento);
        System.out.println("El total a pagar es: " + totalPagar);

    }    
    
}
