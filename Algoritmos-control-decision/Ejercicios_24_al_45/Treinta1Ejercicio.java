/*Una compañía de alquiler de automóviles sin conductor, desea calcular y mostrar lo que debe pagar cada
 cliente, de acuerdo a las siguientes condiciones: a. Si no se rebasan los 300 km, se cancelan 5000 
 Bolívares b. Si la distancia recorrida es superior a 300 km  Pero inferior a 1000 se cobran 5000 
 Bolívares más 200 Bolívares por cada kilómetro superior a 300.   Si es superior a 1000 se cobran 5000 
 Bolívares más 200 Bolívares por cada kilómetro, para las distancias entre 300 y 1000 kilómetros y 
 150 Bolívares por cada kilómetro para las distancias mayores a 1000.  */
public class Treinta1Ejercicio {

    public static void main(String[] args) {

        double distancia;
        double pago;

        System.out.println("Ingrese la distancia recorrida en kilometros:");
        distancia = Double.parseDouble(System.console().readLine());

        if (distancia <= 300) {

            pago = 5000;

        } else if (distancia <= 1000) {

            pago = 5000 + (distancia - 300) * 200;

        } else {

            pago = 5000 + (700 * 200) + (distancia - 1000) * 150;
        }

        System.out.println("El valor a pagar es: " + pago + " Bolivares");
    }
}
