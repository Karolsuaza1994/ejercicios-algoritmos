/*Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos, un médico 
determina si una persona tiene anemia o no, lo cual depende de su nivel de hemoglobina en la 
sangre, de su edad y de su sexo.  Si el nivel de hemoglobina que tiene una persona es menor que 
el rango que le corresponde, se determina su resultado como positivo y en caso contrario como 
negativo.  La tabla en la que el médico se basa para obtener el resultado es la siguiente: 
EDAD 
0  -  1  mes 
Mayor de 1 y menor o igual de 6 meses 
Mayor de 6 y menor o igual de 12 meses 
Mayor de 1 y menor o igual que 5 años 
Mayor de 5 y menor o igual que 10 años 
Mayor de 10 y menor o igual que 15 años 
Mujeres mayores de 15 años 
Hombres mayores de 15 años 
Desarrolle un algoritmo que indique, si una persona tiene Anemia o no. 
EDAD                                       NIVEL DE HEMOGLOBINA 
0  -  1  mes                               13  -  26   g% 
Mayor de 1 y menor o igual de 6 meses      10  -  18   g% 
Mayor de 6 y menor o igual de 12 meses     11  -  15   g% 
Mayor de 1 y menor o igual que 5 años      11.5 -  15   g% 
Mayor de 5 y menor o igual que 10 años     12.6 – 15.5 g% 
Mayor de 10 y menor o igual que 15 años    13  -  15.5  g% 
Mujeres mayores de 15 años                 12  -  16   g% 
Hombres mayores de 15 años                 14  -  18   g% 
Desarrolle un algoritmo que indique, si una persona tiene Anemia o no. */
public class Cuarenta2Ejercicio {
    public static void main(String[] args) {
        double edadMeses,hemoglobina,minimo;
        String sexo;

        System.out.println("Edad en meses:");
        edadMeses=Double.parseDouble(System.console().readLine());
        System.out.println("Sexo (M/F):");
        sexo=System.console().readLine();
        System.out.println("Hemoglobina:");
        hemoglobina=Double.parseDouble(System.console().readLine());

        if(edadMeses<=1) minimo=13;
        else if(edadMeses<=6) minimo=10;
        else if(edadMeses<=12) minimo=11;
        else if(edadMeses<=60) minimo=11.5;
        else if(edadMeses<=120) minimo=12.6;
        else if(edadMeses<=180) minimo=13;
        else if(sexo.equalsIgnoreCase("F")) minimo=12;
        else minimo=14;

        if(hemoglobina<minimo) System.out.println("Tiene anemia");
        else System.out.println("No tiene anemia");
    }
}
