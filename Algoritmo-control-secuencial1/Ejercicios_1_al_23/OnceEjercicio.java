public class OnceEjercicio {
 public static void main(String[] args) {

        String nombre;

        double horasNormales;
        double valorHora;
        double horasExtras;

        double sueldoBase;
        double sueldoExtra;
        double asignaciones;
        double deducciones;
        double sueldoNeto;

        int hijos;

        System.out.println("Nombre del trabajador:");
        nombre = System.console().readLine();

        System.out.println("Horas normales:");
        horasNormales = Double.parseDouble(System.console().readLine());

        System.out.println("Valor de la hora:");
        valorHora = Double.parseDouble(System.console().readLine());

        System.out.println("Horas extras:");
        horasExtras = Double.parseDouble(System.console().readLine());

        System.out.println("Número de hijos:");
        hijos = Integer.parseInt(System.console().readLine());

        sueldoBase = horasNormales * valorHora;

        sueldoExtra = horasExtras * (valorHora * 1.25);

        asignaciones = 25000 + (17300 * hijos) + 18000;

        deducciones = sueldoBase * (0.05 + 0.02 + 0.07);

        sueldoNeto = sueldoBase + sueldoExtra + asignaciones - deducciones;

        System.out.println("Asignaciones: " + asignaciones);
        System.out.println("Deducciones: " + deducciones);
        System.out.println("Sueldo neto: " + sueldoNeto);

    }    
    
}
