/*Dados como datos los valores enteros P y Q, determine si los mismos satisfacen la siguiente
 expresión: P3 + Q4 – 2*P2 > 680.  En caso afirmativo debe mostrar los valores de P y Q, 
 de lo contrario muestre un mensaje alusivo al hecho.  */
public class Treinta2Ejercicio {

    public static void main(String[] args) {

        int P;
        int Q;
        int resultado;

        System.out.println("Ingrese el valor de P:");
        P = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el valor de Q:");
        Q = Integer.parseInt(System.console().readLine());

        resultado = P * P * P + Q * Q * Q * Q - 2 * P * P;

        if (resultado > 680) {

            System.out.println("Los valores satisfacen la expresion");
            System.out.println("P = " + P);
            System.out.println("Q = " + Q);

        } else {

            System.out.println("Los valores no satisfacen la expresion");
        }
    }
}