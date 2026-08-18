public class SextoEjercicio {
 public static void main(String[] args) {

        int hombres;
        int mujeres;
        int total;

        double porcentajeHombres;
        double porcentajeMujeres;

        System.out.println("Ingrese la cantidad de hombres:");
        hombres = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese la cantidad de mujeres:");
        mujeres = Integer.parseInt(System.console().readLine());

        total = hombres + mujeres;

        porcentajeHombres = (hombres * 100.0) / total;
        porcentajeMujeres = (mujeres * 100.0) / total;

        System.out.println("Porcentaje de hombres: " + porcentajeHombres + "%");
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");

    }    
    
}
