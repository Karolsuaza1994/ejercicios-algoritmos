/*Un hombre desea saber cuánto dinero se generará por concepto de intereses
sobre la cantidad que tiene en inversión en el banco. El decidirá reinvertir
los intereses siempre y cuando éstos excedan a $7000 y en ese caso,
desea saber cuánto dinero tendrá finalmente en su cuenta.*/
import java.util.Scanner;

public class Veinti4Ejercicio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Double Capital;
        Double tasaInteres;
        Double interes;
        Double capitalFinal;

        System.out.println("Ingrese el capital:");
        Capital = entrada.nextDouble();

        System.out.println("Ingrese la tasa de Interes:");
        tasaInteres = entrada.nextDouble();

        interes = Capital * tasaInteres / 100;

        System.out.println("Los intereses generados son: " + interes);

        if (interes > 7000) {

            capitalFinal = Capital + interes;

            System.out.println("Los intereses exceden los 7 mil");
            System.out.println("Los intereses se vuelven a invertir");

        } else {

            capitalFinal = Capital;

            System.out.println("Los intereses no exceden los 7 mil");
            System.out.println("Los intereses se retiran");
        }

        System.out.println("El capital final es: " + capitalFinal);

        entrada.close();
    }
}
