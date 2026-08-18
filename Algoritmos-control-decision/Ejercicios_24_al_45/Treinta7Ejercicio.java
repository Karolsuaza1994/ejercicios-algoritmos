/*Dados tres datos enteros positivos, que representan las longitudes de los lados de un probable 
triángulo, desarrolle un algoritmo que determine si los datos corresponden a un triángulo. En caso 
de que sí correspondan, escriba si el triángulo es equilátero, isósceles o escaleno.  Calcule además 
su área.  Considere que es triángulo si se cumple que la suma de los dos lados menores es mayor 
que la del lado mayor. Tome en cuenta además que el área de un triángulo la calculamos como: 
 area = √S(SA)(SB)(SC) donde S es la mitad de la suma de los lados A, B y C. 
Recuerde: 
Equilátero: todos los lados son iguales. 
Isósceles: 2 lados iguales y 1 diferente.  
Escaleno: Todos los lados diferentes.  */
public class Treinta7Ejercicio {
    public static void main(String[] args) {
        double A,B,C,S,area;

        System.out.println("Ingrese A:");
        A=Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese B:");
        B=Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese C:");
        C=Double.parseDouble(System.console().readLine());

        if (A+B>C && A+C>B && B+C>A) {
            S=(A+B+C)/2;
            area=Math.sqrt(S*(S-A)*(S-B)*(S-C));

            if (A==B && B==C)
                System.out.println("Equilatero");
            else if (A==B || A==C || B==C)
                System.out.println("Isosceles");
            else
                System.out.println("Escaleno");

            System.out.println("Area: "+area);
        } else {
            System.out.println("No es un triangulo");
        }
    }
}
