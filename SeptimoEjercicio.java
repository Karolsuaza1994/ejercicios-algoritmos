public class SeptimoEjercicio {
  public static void main(String[] args) {

        double metros;
        double pulgadas;
        double pies;

        System.out.println("Ingrese la cantidad de metros:");
        metros = Double.parseDouble(System.console().readLine());

        pulgadas = metros * 39.27;

        pies = pulgadas / 12;

        System.out.println("Equivalente en pulgadas: " + pulgadas);
        System.out.println("Equivalente en pies: " + pies);

    }
    
}
