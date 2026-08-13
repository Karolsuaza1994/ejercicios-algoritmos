public class DiecinueveEjercicio {
public static void main(String[] args) {

        double presupuesto;
        double ginecologia;
        double traumatologia;
        double pediatria;

        System.out.println("Ingrese el presupuesto anual del hospital:");
        presupuesto = Double.parseDouble(System.console().readLine());

        ginecologia = presupuesto * 0.40;
        traumatologia = presupuesto * 0.30;
        pediatria = presupuesto * 0.30;

        System.out.println("Presupuesto para Ginecología: " + ginecologia);
        System.out.println("Presupuesto para Traumatología: " + traumatologia);
        System.out.println("Presupuesto para Pediatría: " + pediatria);

    }

    
}
