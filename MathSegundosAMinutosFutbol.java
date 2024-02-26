/*
Supón que un partido de fútbol tiene una duración de 90 minutos. El minuto 1 se considera que 
abarca desde los 0 segundos hasta los 59 segundos. El minuto 2 abarca desde los 60 segundos 
hasta los 119 segundos. Así sucesivamente hasta el último minuto, que es el minuto 90 y abarca
desde los 5340 segundos hasta los 5400 segundos.
Crea un programa que pida al usuario el número de segundos transcurridos y mediante el uso de 
alguna función de redondeo (floor, ceil o round) de la clase Math, muestre el minuto en que nos 
encontramos. El programa debe pedir valores de segundos hasta que el usuario decida terminar.
 */


import java.util.Scanner;

public class MathSegundosAMinutosFutbol {
    public static void main(String[] args) {

        Scanner segundosSc = new Scanner(System.in);
        Scanner seguirSc = new Scanner(System.in);
        String seguir = "s";

        //Bucle while para que pregunte mientras la respuesta del usuario sea 's'
        while (seguir.equals("s")) {                    
            //Ingresamos el número de segundos
            System.out.println("¿Cuántos segundos de partido han transcurrido?");
            int segundos = segundosSc.nextInt();

            //Pasar los segundos a minutos dividiendo entre 60 y redondeado con floor (+1)
            int minutos = (int)Math.floor(segundos/60)+1;

            System.out.println("El partido va por el minuto " + minutos + ".");
            
            System.out.println("¿Otro valor? (s/n):");
            seguir = seguirSc.nextLine();

            //Bucle while para comprobar si el texto introducido coincide con 's' o 'n'. Si no, se vuelve a pedir el texto.
            while (!seguir.equals("s") && !seguir.equals("n")) {
                System.out.println("Has ingresado un valor no válido. Por favor, escribe 's' si quieres ingresar otro valor o 'n' si has terminado:");
                seguir = seguirSc.nextLine();
            }
        }

        System.out.println("Has terminado de calcular los minutos del partido. Vuelve cuando quieras.");
        segundosSc.close();
        seguirSc.close();
    }
}
