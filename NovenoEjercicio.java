public class NovenoEjercicio {
  public static void main(String[] args) {

        double horasTrabajadas;
        double valorHora;
        double sueldoBase;
        double descuento;
        double salarioNeto;

        System.out.println("Ingrese las horas trabajadas:");
        horasTrabajadas = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor de la hora:");
        valorHora = Double.parseDouble(System.console().readLine());

        sueldoBase = horasTrabajadas * valorHora;

        descuento = sueldoBase * 0.20;

        salarioNeto = sueldoBase - descuento;

        System.out.println("El salario neto es: " + salarioNeto);

    }    
    
}
