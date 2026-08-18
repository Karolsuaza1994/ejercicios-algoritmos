/*Un científico desea que un algoritmo le ayude en su trabajo analizándole tres valores que se suministran,
 para determinar si los dos primeros son las medidas de una figura conocida. Para ello, calcule el área de
 cada una de las figuras que se mencionan a continuación y compárela con el tercer valor suministrado; 
 si hay coincidencia, imprima un mensaje que indique de qué figura se trata. Las figuras a analizar son:
• Triángulo: b*h Valor1 y Valor2 son base y altura
• Círculo: pi * r2 Valor1 y Valor2 son radio y pi
• Rectángulo: b * h Valor1 y Valor2 son base y altura.*/

public class Veinti7Ejercicio {

    public static void main(String[] args) {

        double Valor1;
        double Valor2;
        double Valor3;

        double areaTriangulo;
        double areaCirculo;
        double areaRectangulo;

        System.out.println("Ingrese el Valor 1:");
        Valor1 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el Valor 2:");
        Valor2 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el Valor 3:");
        Valor3 = Double.parseDouble(System.console().readLine());

        areaTriangulo = (Valor1 * Valor2) / 2;

        if (areaTriangulo == Valor3) {

            System.out.println("La figura es un triangulo");

        } else {

            areaCirculo = Valor2 * Valor1 * Valor1;

            if (areaCirculo == Valor3) {

                System.out.println("La figura es un circulo");

            } else {

                areaRectangulo = Valor1 * Valor2;

                if (areaRectangulo == Valor3) {

                    System.out.println("La figura es un rectangulo");

                } else {

                    System.out.println("No coincide con ninguna de las figuras");

                }
            }
        }
    }
}
