/*Dados los datos A, B, C y D que representan números enteros; escriba un algoritmo que calcule el 
resultado de las siguientes expresiones:
Si D=0 (AC)2
Si D>0 (AB )3
D */
public class Veinti6Ejercicio {

    public static void main(String[] args) {

        int A;
        int B;
        int C;
        int D;
        double resultado;

        System.out.println("Ingrese el valor de A:");
        A = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el valor de B:");
        B = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el valor de C:");
        C = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el valor de D:");
        D = Integer.parseInt(System.console().readLine());

        if (D == 0) {

            resultado = (A - C) * (A - C);

        } else if (D > 0) {

            resultado = (A - B) * (A - B) * (A - B) / D;

        } else {

            System.out.println("D debe ser mayor o igual a 0");
            return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
