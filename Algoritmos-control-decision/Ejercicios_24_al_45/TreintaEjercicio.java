/*Se tienen 4 dígitos en las variables A, B, C, D que forman un entero positivo N.  
Se desea redondear N a la centena más próxima y mostrar el resultado.  
Considere los siguientes ejemplos:  Si A es 2, B es 3, C es 6 y D es 2, entonces N es 2362 y el resultado
 redondeado es 2400.  Si N es 2342, el resultado redondeado será 2300 y si N es 2962, el resultado 
 sredondeado será 3000.  */
public class TreintaEjercicio {

    public static void main(String[] args) {

        int A;
        int B;
        int C;
        int D;
        int N;
        int resultado;

        System.out.println("Ingrese el primer digito A:");
        A = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el segundo digito B:");
        B = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el tercer digito C:");
        C = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el cuarto digito D:");
        D = Integer.parseInt(System.console().readLine());

        N = A * 1000 + B * 100 + C * 10 + D;

        if (C >= 5) {

            resultado = (N / 100 + 1) * 100;

        } else {

            resultado = (N / 100) * 100;
        }

        System.out.println("El numero es: " + N);
        System.out.println("El numero redondeado es: " + resultado);
    }
}
