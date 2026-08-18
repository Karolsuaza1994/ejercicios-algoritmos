public class DoceEjercicio {
public static void main(String[] args) {

        double examenMatematicas;
        double tareaMatematica1;
        double tareaMatematica2;
        double tareaMatematica3;

        double examenFisica;
        double tareaFisica1;
        double tareaFisica2;

        double examenQuimica;
        double tareaQuimica1;
        double tareaQuimica2;
        double tareaQuimica3;

        double notaFinalMatematicas;
        double notaFinalFisica;
        double notaFinalQuimica;
        double promedioGeneral;

        
        System.out.println("Ingrese la nota del examen de Matemáticas:");
        examenMatematicas = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la nota de la tarea 1 de Matemáticas:");
        tareaMatematica1 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la nota de la tarea 2 de Matemáticas:");
        tareaMatematica2 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la nota de la tarea 3 de Matemáticas:");
        tareaMatematica3 = Double.parseDouble(System.console().readLine());

        
        System.out.println("Ingrese la nota del examen de Física:");
        examenFisica = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la nota de la tarea 1 de Física:");
        tareaFisica1 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la nota de la tarea 2 de Física:");
        tareaFisica2 = Double.parseDouble(System.console().readLine());

        
        System.out.println("Ingrese la nota del examen de Química:");
        examenQuimica = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la nota de la tarea 1 de Química:");
        tareaQuimica1 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la nota de la tarea 2 de Química:");
        tareaQuimica2 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la nota de la tarea 3 de Química:");
        tareaQuimica3 = Double.parseDouble(System.console().readLine());

        
        notaFinalMatematicas = (examenMatematicas * 0.90)
                + (((tareaMatematica1 + tareaMatematica2 + tareaMatematica3) / 3) * 0.10);

        notaFinalFisica = (examenFisica * 0.80)
                + (((tareaFisica1 + tareaFisica2) / 2) * 0.20);

        notaFinalQuimica = (examenQuimica * 0.85)
                + (((tareaQuimica1 + tareaQuimica2 + tareaQuimica3) / 3) * 0.15);

        promedioGeneral = (notaFinalMatematicas + notaFinalFisica + notaFinalQuimica) / 3;

    
        System.out.println("La nota final de Matemáticas es: " + notaFinalMatematicas);
        System.out.println("La nota final de Física es: " + notaFinalFisica);
        System.out.println("La nota final de Química es: " + notaFinalQuimica);
        System.out.println("El promedio general es: " + promedioGeneral);

    }

    
}
