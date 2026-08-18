public class CatorceEjercicio {
public static void main(String[] args) {

        double a, b, c, d, e, f;
        double x, y;

        System.out.println("Ingrese a:");
        a = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese b:");
        b = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese c:");
        c = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese d:");
        d = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese e:");
        e = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese f:");
        f = Double.parseDouble(System.console().readLine());

        x = ((c * e) - (b * f)) / ((a * e) - (b * d));
        y = ((a * f) - (c * d)) / ((a * e) - (b * d));

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
}    
    
}
