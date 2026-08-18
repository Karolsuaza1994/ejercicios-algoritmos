/*Dada una cantidad entera de Bolívares, desarrolle un algoritmo que permita desglosar dicha cantidad 
en los billetes de curso legal en el País. Recuerde que estos son: 50000, 20000, 10000, 5000, 2000, 1000,
 500, 100, 50, 20, 10. */
public class Treinta6Ejercicio {

    public static void main(String[] args) {

        int cantidad;
        int billetes;

        System.out.println("Ingrese la cantidad de Bolivares:");
        cantidad = Integer.parseInt(System.console().readLine());

        billetes = cantidad / 50000;
        cantidad = cantidad % 50000;
        System.out.println("Billetes de 50000: " + billetes);

        billetes = cantidad / 20000;
        cantidad = cantidad % 20000;
        System.out.println("Billetes de 20000: " + billetes);

        billetes = cantidad / 10000;
        cantidad = cantidad % 10000;
        System.out.println("Billetes de 10000: " + billetes);

        billetes = cantidad / 5000;
        cantidad = cantidad % 5000;
        System.out.println("Billetes de 5000: " + billetes);

        billetes = cantidad / 2000;
        cantidad = cantidad % 2000;
        System.out.println("Billetes de 2000: " + billetes);

        billetes = cantidad / 1000;
        cantidad = cantidad % 1000;
        System.out.println("Billetes de 1000: " + billetes);

        billetes = cantidad / 500;
        cantidad = cantidad % 500;
        System.out.println("Billetes de 500: " + billetes);

        billetes = cantidad / 100;
        cantidad = cantidad % 100;
        System.out.println("Billetes de 100: " + billetes);

        billetes = cantidad / 50;
        cantidad = cantidad % 50;
        System.out.println("Billetes de 50: " + billetes);

        billetes = cantidad / 20;
        cantidad = cantidad % 20;
        System.out.println("Billetes de 20: " + billetes);

        billetes = cantidad / 10;
        cantidad = cantidad % 10;
        System.out.println("Billetes de 10: " + billetes);

        System.out.println("Cantidad restante: " + cantidad);
    }
}
    

