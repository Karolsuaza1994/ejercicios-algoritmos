public class TercerEjercicio {
  public static void main(String[] args) {

        double sueldoBase;
        double venta1;
        double venta2;
        double venta3;
        double totalVentas;
        double comision;
        double sueldoTotal;

        System.out.println("Ingrese el sueldo base:");
        sueldoBase = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor de la primera venta:");
        venta1 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor de la segunda venta:");
        venta2 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor de la tercera venta:");
        venta3 = Double.parseDouble(System.console().readLine());

        totalVentas = venta1 + venta2 + venta3;

        comision = totalVentas * 0.10;

        sueldoTotal = sueldoBase + comision;

        System.out.println("La comisión es: " + comision);
        System.out.println("El sueldo total es: " + sueldoTotal);

    }    
    
}
