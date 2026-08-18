/*El gobierno del estado de México desea reforestar un bosque que mide determinado número de 
hectáreas.  Si la superficie del terreno excede a 1 millón de metros cuadrados, entonces decidirá 
sembrar de la siguiente manera: 
 PORCENTAJE DE LA SUPERFICIE DEL BOSQUE TIPO DE ÁRBOL 
70% Pino 
20% Oyamel 
10% Cedro 
  Si la superficie del terreno es menor o igual a un millón de metros cuadrados, entonces decidirá 
sembrar de la siguiente manera: 
 PORCENTAJE DE LA SUPERFICIE DEL BOSQUE TIPO DE ÁRBOL 
 50% Pino 
 30% Oyamel 
 20% Cedro 
 
El gobierno desea saber el número de pinos, oyameles y cedros que tendrá que sembrar en el bosque, 
si se sabe que en 10 metros cuadrados caben 8 pinos, en 15 metros cuadrados caben 15 oyameles y
en 18 metros cuadrados caben 10 cedros.  También se sabe que una hectárea equivale a 10 mil 
metros cuadrados.  */
public class Cuarenta1Ejercicio {
    public static void main(String[] args) {
        double hectareas,superficie,pino,oyamel,cedro;

        System.out.println("Ingrese hectareas:");
        hectareas=Double.parseDouble(System.console().readLine());
        superficie=hectareas*10000;

        if(superficie>1000000){
            pino=superficie*0.70;
            oyamel=superficie*0.20;
            cedro=superficie*0.10;
        }else{
            pino=superficie*0.50;
            oyamel=superficie*0.30;
            cedro=superficie*0.20;
        }

        System.out.println("Pinos: "+pino/10*8);
        System.out.println("Oyameles: "+oyamel/15*15);
        System.out.println("Cedros: "+cedro/18*10);
    }
}

