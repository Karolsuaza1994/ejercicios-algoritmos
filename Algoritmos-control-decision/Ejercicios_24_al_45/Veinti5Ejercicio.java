/*Dado como dato el sueldo de un trabajador, aplique un aumento
del 15% si su sueldo es inferior a Bs. 40.000 y 12% en caso contrario.
Imprima el nuevo sueldo del trabajador.*/

public class Veinti5Ejercicio {

    public static void main(String[] args) {

        Double sueldo;
        Double aumento;
        Double nuevoSueldo;

        System.out.println("Ingrese el sueldo:");
        sueldo = Double.parseDouble(System.console().readLine());

        if (sueldo < 40000) {

            aumento = sueldo * 0.15;

        } else {

            aumento = sueldo * 0.12;
        }

        nuevoSueldo = sueldo + aumento;

        System.out.println("El aumento es: " + aumento);
        System.out.println("El nuevo sueldo es: " + nuevoSueldo);
    }
}
