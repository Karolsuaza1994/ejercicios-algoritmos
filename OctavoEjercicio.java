public class OctavoEjercicio {
public static void main(String[] args) {

        double ladoA;
        double ladoB;
        double ladoC;
        double p;
        double area;

        System.out.println("Ingrese el lado A:");
        ladoA = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el lado B:");
        ladoB = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el lado C:");
        ladoC = Double.parseDouble(System.console().readLine());

        p = (ladoA + ladoB + ladoC) / 2;

        area = Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));

        System.out.println("El área del triángulo es: " + area);
}    
    
}
