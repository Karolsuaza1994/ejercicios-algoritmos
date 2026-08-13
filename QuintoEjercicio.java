public class QuintoEjercicio {
public static void main(String[] args) {

        double parcial1;
        double parcial2;
        double parcial3;
        double examenFinal;
        double trabajoFinal;
        double promedioParciales;
        double notaFinal;

        System.out.println("Ingrese la primera nota parcial:");
        parcial1 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la segunda nota parcial:");
        parcial2 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la tercera nota parcial:");
        parcial3 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la nota del examen final:");
        examenFinal = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la nota del trabajo final:");
        trabajoFinal = Double.parseDouble(System.console().readLine());

        promedioParciales = (parcial1 + parcial2 + parcial3) / 3;

        notaFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);

        System.out.println("La nota final es: " + notaFinal);

    }
}
