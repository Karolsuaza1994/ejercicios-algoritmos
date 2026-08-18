public class VeintitresEjercicio {
 public static void main(String[] args) {

        double kilosHarina;
        double litrosAceite;

        double precioBulto;
        double precioCaja;
        double precioDetalleHarina;
        double precioDetalleAceite;

        int bultos;
        int cajas;

        double sobranteHarina;
        double sobranteAceite;

        double ingresoHarina;
        double ingresoAceite;
        double ingresoTotal;

        System.out.println("Kilogramos de harina:");
        kilosHarina = Double.parseDouble(System.console().readLine());

        System.out.println("Litros de aceite:");
        litrosAceite = Double.parseDouble(System.console().readLine());

        System.out.println("Precio del bulto:");
        precioBulto = Double.parseDouble(System.console().readLine());

        System.out.println("Precio de la caja:");
        precioCaja = Double.parseDouble(System.console().readLine());

        System.out.println("Precio harina al detal:");
        precioDetalleHarina = Double.parseDouble(System.console().readLine());

        System.out.println("Precio aceite al detal:");
        precioDetalleAceite = Double.parseDouble(System.console().readLine());

        bultos = (int) (kilosHarina / 24);
        cajas = (int) (litrosAceite / 15);

        sobranteHarina = kilosHarina % 24;
        sobranteAceite = litrosAceite % 15;

        ingresoHarina = (bultos * precioBulto) + (sobranteHarina * precioDetalleHarina);

        ingresoAceite = (cajas * precioCaja) + (sobranteAceite * precioDetalleAceite);

        ingresoTotal = ingresoHarina + ingresoAceite;

        System.out.println("Ingreso por harina: " + ingresoHarina);
        System.out.println("Ingreso por aceite: " + ingresoAceite);
        System.out.println("Ingreso total: " + ingresoTotal);

    }
    
}
