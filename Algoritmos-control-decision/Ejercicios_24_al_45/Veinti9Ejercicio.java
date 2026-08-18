/*Una empresa que comercializa cosméticos tiene organizados a sus vendedores en tres departamentos y
 ha establecido un programa de incentivos para incrementar su productividad.  El gerente, 
 al final del mes, pide el importe global de las ventas de los tres departamentos y aquellos que excedan 
 el 33% de las ventas totales se les paga una cantidad extra equivalente al 20% de su salario mensual. 
  Si todos los vendedores ganan lo mismo, determinar cuánto recibirán los vendedores de los tres
   departamentos al finalizar el mes.  */
public class Veinti9Ejercicio {

    public static void main(String[] args) {

        double ventasDepartamento1;
        double ventasDepartamento2;
        double ventasDepartamento3;
        double salarioMensual;

        double ventasTotales;
        double porcentaje1;
        double porcentaje2;
        double porcentaje3;

        double incentivo1;
        double incentivo2;
        double incentivo3;

        double salarioFinal1;
        double salarioFinal2;
        double salarioFinal3;

        System.out.println("Ingrese las ventas del departamento 1:");
        ventasDepartamento1 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese las ventas del departamento 2:");
        ventasDepartamento2 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese las ventas del departamento 3:");
        ventasDepartamento3 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el salario mensual:");
        salarioMensual = Double.parseDouble(System.console().readLine());

        ventasTotales = ventasDepartamento1 + ventasDepartamento2 + ventasDepartamento3;

        porcentaje1 = (ventasDepartamento1 * 100) / ventasTotales;
        porcentaje2 = (ventasDepartamento2 * 100) / ventasTotales;
        porcentaje3 = (ventasDepartamento3 * 100) / ventasTotales;

        if (porcentaje1 > 33) {

            incentivo1 = salarioMensual * 0.20;
            salarioFinal1 = salarioMensual + incentivo1;

        } else {

            incentivo1 = 0;
            salarioFinal1 = salarioMensual;
        }

        if (porcentaje2 > 33) {

            incentivo2 = salarioMensual * 0.20;
            salarioFinal2 = salarioMensual + incentivo2;

        } else {

            incentivo2 = 0;
            salarioFinal2 = salarioMensual;
        }

        if (porcentaje3 > 33) {

            incentivo3 = salarioMensual * 0.20;
            salarioFinal3 = salarioMensual + incentivo3;

        } else {

            incentivo3 = 0;
            salarioFinal3 = salarioMensual;
        }

        System.out.println("Porcentaje departamento 1: " + porcentaje1 + "%");
        System.out.println("Porcentaje departamento 2: " + porcentaje2 + "%");
        System.out.println("Porcentaje departamento 3: " + porcentaje3 + "%");

        System.out.println("Salario final departamento 1: " + salarioFinal1);
        System.out.println("Salario final departamento 2: " + salarioFinal2);
        System.out.println("Salario final departamento 3: " + salarioFinal3);
    }
}