/*Desarrolle un algoritmo que reciba como dato de entrada la fecha de nacimiento de una persona 
y a continuación escriba el nombre del signo del zodiaco correspondiente; así como su edad.  
Considere la siguiente tabla de signos: 
Signo          Dia Mes
Sagitario     22/11 al 21/12
Capricornio   22/12 al 20/01
Acuario       21/01 al 19/02
Pisis         20/02 al 19/03
Aries         21/03 al 20/04 
Tauro         22/05 al 21/06
Geminis       22/06 al 22/07
Cancer        23/07 al 23/08
Leo           23/07 al 23/08
Virgo         24/08 al 22/09 
Libra         23/09 al 22/10
Escorpion     23/10 al 21/11
 */
public class Treinta8Ejercicio {

    public static void main(String[] args) {

        int dia;
        int mes;
        int anio;
        int diaActual;
        int mesActual;
        int anioActual;
        int edad;
        String signo;

        System.out.println("Ingrese el dia de nacimiento:");
        dia = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el mes de nacimiento:");
        mes = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el año de nacimiento:");
        anio = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el dia actual:");
        diaActual = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el mes actual:");
        mesActual = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el año actual:");
        anioActual = Integer.parseInt(System.console().readLine());

        edad = anioActual - anio;

        if (mesActual < mes || (mesActual == mes && diaActual < dia)) {
            edad = edad - 1;
        }

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";

        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";

        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Geminis";

        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cancer";

        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";

        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";

        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";

        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";

        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";

        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricornio";

        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";

        } else {
            signo = "Piscis";
        }

        System.out.println("Signo: " + signo);
        System.out.println("Edad: " + edad);
    }
}

