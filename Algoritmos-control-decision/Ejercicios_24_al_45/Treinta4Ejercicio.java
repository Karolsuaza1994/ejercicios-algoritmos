/*Construya un programa que, dados como datos la categoría y el sueldo del trabajador, 
calcule el aumento correspondiente teniendo en cuenta la siguiente tabla:

Categoría	% aumento
1	            15%
2	            10%
3	            8%
4	            7%

Como salida, mostrar la categoría del trabajador y su nuevo sueldo. */
public class Treinta4Ejercicio {

    public static void main(String[] args) {

        int categoria;
        double sueldo;
        double aumento;
        double nuevoSueldo;

        System.out.println("Ingrese la categoria del trabajador:");
        categoria = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el sueldo del trabajador:");
        sueldo = Double.parseDouble(System.console().readLine());

        if (categoria == 1) {

            aumento = sueldo * 0.15;

        } else if (categoria == 2) {

            aumento = sueldo * 0.10;

        } else if (categoria == 3) {

            aumento = sueldo * 0.08;

        } else if (categoria == 4) {

            aumento = sueldo * 0.07;

        } else {

            aumento = 0;
            System.out.println("Categoria invalida");
        }

        nuevoSueldo = sueldo + aumento;

        System.out.println("Categoria: " + categoria);
        System.out.println("Nuevo sueldo: " + nuevoSueldo);
    }
}
