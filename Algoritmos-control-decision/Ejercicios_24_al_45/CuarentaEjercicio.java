/* Desarrolle un programa que calcule y muestre el monto que debe pagar un suscriptor por concepto
 de consumo de luz eléctrica y servicio de aseo urbano. Dicho monto se calcula multiplicando 
 la diferencia de la lectura anterior y la lectura actual por el costo de cada Kilovatio hora, según
  la siguiente escala: 
0 - 100     2.622,00 Bs.  
 101 - 300  79,78 Bs. / Kwh 
 301 – 500  89,52 Bs. /Kwh                
 501 – en adelante      97,95 Bs. / Khw */
 public class CuarentaEjercicio {

    public static void main(String[] args) {

        double lecturaAnterior;
        double lecturaActual;
        double consumo;
        double costoKwh;
        double monto;

        System.out.println("Ingrese la lectura anterior:");
        lecturaAnterior = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la lectura actual:");
        lecturaActual = Double.parseDouble(System.console().readLine());

        consumo = lecturaActual - lecturaAnterior;

        if (consumo <= 100) {

            costoKwh = 2622;

        } else if (consumo <= 300) {

            costoKwh = 79.78;

        } else if (consumo <= 500) {

            costoKwh = 89.52;

        } else {

            costoKwh = 97.95;
        }

        monto = consumo * costoKwh;

        System.out.println("Consumo: " + consumo + " KWh");
        System.out.println("Monto a pagar: " + monto + " Bs");
    }
}