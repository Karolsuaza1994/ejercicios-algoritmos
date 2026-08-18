/*Una persona se encuentra en la disyuntiva de comprar un automóvil o un terreno, los cuales cuestan
 exactamente la misma cantidad de dinero. Sabe que mientras el automóvil se devalúa, con el terreno
  sucede lo contrario. Esta persona comprará el automóvil si al cabo de tres años la devaluación de éste
   no es mayor que la mitad del incremento del valor del terreno. Ayúdele a esta persona a determinar 
   si debe o no comprar el automóvil. */
public class Treinta9Ejercicio {

    public static void main(String[] args) {

        double devaluacion;
        double incremento;

        System.out.println("Ingrese la devaluacion del automovil:");
        devaluacion = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el incremento del terreno:");
        incremento = Double.parseDouble(System.console().readLine());

        if (devaluacion <= incremento / 2) {

            System.out.println("Debe comprar el automovil");

        } else {

            System.out.println("No debe comprar el automovil");
        }
    }
}