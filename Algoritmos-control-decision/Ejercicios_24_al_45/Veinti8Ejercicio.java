/*Rectángulo: b * h Valor1 y Valor2 son base y altura.
28. Una empresa quiere hacer una compra de varias piezas de la misma clase a un fabricante de refacciones.
 La empresa dependiendo del monto total de la compra, decidirá qué hacer para pagar al fabricante. 
 Si el monto total de la compra excede de $500000 la empresa tendrá la capacidad de invertir de su propio  dinero un 55% del monto de la compra, pedir presta al banco un 30% y el resto lo pagará solicitando un
crédito al fabricante. Si el monto total de la compra no excede de $500000 la empresa tendrá capacidad
de invertir de su propio dinero un 70% y el restante 30% lo pagará solicitando crédito al fabricante.
 El fabricante cobra por concepto de intereses un 20% sobre la cantidad que se le pague a crédito.
  Calcule y muestre la cantidad a invertir de los fondos de la empresa, la cantidad a pagar a crédito,
 el monto a pagar por intereses y si es necesario, la cantidad prestada al banco. */
public class Veinti8Ejercicio {
 public static void main(String[] args) {
 Double Compra;
 Double empresa;   
 Double credito;
 Double banco=0.0;
 Double interes;
 
 System.out.println("Ingrese el valor de la compra");
 Compra = Double.parseDouble(System.console().readLine());
 if (Compra > 500000){
     empresa=Compra*0.55;
     banco=Compra*0.30;
     credito=Compra*0.15;
     interes=credito*0.20;

    System.out.println("La cantidad invertida de la empresa es: "+empresa);
    System.out.println("la cantidad prestada por el banco es: "+banco);
    System.out.println("la cantidad a pagar a credito es: "+credito);
    System.out.println("El monto a pagar por intereses es: "+interes);
 } else {
empresa=Compra*0.70;
credito=Compra*0.30;
interes=credito*0.20;

 System.out.println("La cantidad invertida de la empresa es: "+empresa);
 System.out.println("la cantidad prestada por el banco es: "+banco);
 System.out.println("la cantidad a pagar a credito es: "+credito);
 System.out.println("El monto a pagar por intereses es: "+interes);

 }   

 }
 }  
