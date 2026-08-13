public class DecimoEjercicio {
public static void main(String[] args) {

        double chelines;
        double dracmas;
        double pesetas;

        double pesetasChelines;
        double francos;
        double dolares;
        double liras;

        System.out.println("Ingrese la cantidad de chelines:");
        chelines = Double.parseDouble(System.console().readLine());

        pesetasChelines = (chelines * 956.871) / 100;

        System.out.println("Equivalente en pesetas: " + pesetasChelines);

        System.out.println("Ingrese la cantidad de dracmas:");
        dracmas = Double.parseDouble(System.console().readLine());

        francos = (dracmas * 20.110) / 100;

        System.out.println("Equivalente en francos franceses: " + francos);

        System.out.println("Ingrese la cantidad de pesetas:");
        pesetas = Double.parseDouble(System.console().readLine());

        dolares = pesetas / 122.499;
        liras = (pesetas * 100) / 9.289;

        System.out.println("Equivalente en dólares: " + dolares);
        System.out.println("Equivalente en liras italianas: " + liras);

    }    
}
