/*Diseña un programa para utilizar el objeto String. Se pide por pantalla una dirección
de correo electrónico, se debe comprobar:
• Que contiene la @
• Que no se teclea más de 1 @
• Que aparece un punto, al final del correo electrónico.
• Que la longitud mínima sea de 20 caracteres.
• Que los textos aparecen en minúsculas.
 */

import java.util.Scanner;

public class StringEmailCondiciones1 {
    public static void main(String[] args) {
        //Pedimos el e-mail
        System.out.println("Introduzca su dirección de correo electrónico: ");
        Scanner emailScanner = new Scanner(System.in);
        String email = emailScanner.nextLine();

        while (!email.matches(".*@.*")
        ) {    
            System.out.println("Tu dirección de correo electrónico incumple alguna condición: ");
            
            //Si la longitud de la contraseña es superior a 25 caracteres
            if (email.length()>25) {
                System.out.println("Debe tener como máximo 25 caracteres.");
            }
            //Si los caracteres especiales "@.$#&/" se encuentran (en cualquier número) dentro de la contraseña
            if (email.matches(".*[@.$#&/]")) {
                System.out.println("No puede contener los siguientes caracteres especiales: @ . $ # & /");
            }
            //Pedimos una nueva contraseña
            System.out.println("Escribe un nuevo correo electrónico que cumple las condiciones: ");
            email = emailScanner.nextLine();
        }        
        System.out.println("La contraseña introducida cumple las normas y se ha guardado correctamente.");


        while (!email.matches(".*@.*")) {
            System.out.println("Tu correo electrónico no es válido. Recuerda: debe contener los caracteres '@' y '.'");
            System.out.println("Introduce de nuevo la dirección de correo: ");
            email = emailScanner.nextLine();
        }

        System.out.println("Tu correo electrónico es válido y se ha guardado correctamente.");
        
        
        
        emailScanner.close();
    }
}
