/*Desarrolle un algoritmo, que dado como dato una temperatura en grados Fahrenheit, determine el deporte
 que es apropiado practicar a esa temperatura, teniendo en cuenta la siguiente tabla:
 Natacion  Temp.>85
 Tennis    70< Temp. <85
 Golf      32< Temp. <70
 Esqui     20< Temo. <82
 Marcha    Teemp. <=10 */
public class Treinta5Ejercicio {

    public static void main(String[] args) {

        double temperatura;
        String deporte;

        System.out.println("Ingrese la temperatura en grados Fahrenheit:");
        temperatura = Double.parseDouble(System.console().readLine());

        if (temperatura > 85) {

            deporte = "Natacion";

        } else if (temperatura > 70) {

            deporte = "Tenis";

        } else if (temperatura > 32) {

            deporte = "Golf";

        } else if (temperatura > 10) {

            deporte = "Esqui";

        } else {

            deporte = "Marcha";
        }

        System.out.println("El deporte apropiado es: " + deporte);
    }
}
