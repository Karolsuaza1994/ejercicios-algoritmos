public class Cuarenta5Ejercicio {

    public static void main(String[] args) {

        double A, B, C;
        double D;
        double X1, X2;

        System.out.println("Ingrese A:");
        A = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese B:");
        B = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese C:");
        C = Double.parseDouble(System.console().readLine());

        D = B * B - 4 * A * C;

        if (D == 0) {

            X1 = -B / (2 * A);
            X2 = X1;

            System.out.println("El discriminante es: " + D);
            System.out.println("X1 = " + X1);
            System.out.println("X2 = " + X2);

        } else if (D > 0) {

            X1 = (-B + Math.sqrt(D)) / (2 * A);
            X2 = (-B - Math.sqrt(D)) / (2 * A);

            System.out.println("El discriminante es: " + D);
            System.out.println("X1 = " + X1);
            System.out.println("X2 = " + X2);

        } else {

            System.out.println("El discriminante es: " + D);
            System.out.println("No tiene solucion en los Reales.");
        }
    }
}