//Codifique un programa que pide por pantalla una dirección de e-mail, 
//comprobar si contiene el carácter de la @ y del .

import java.util.Scanner;

public class StringEmail {
    public static void main(String[] args) {
        //Pedimos el e-mail
        System.out.println("Introduzca su dirección de correo electrónico: ");
        Scanner emailScanner = new Scanner(System.in);
        String email = emailScanner.nextLine();

        while (!email.matches(".*@.*\\..*")) {
            System.out.println("Tu correo electrónico no es válido. Recuerda: debe contener los caracteres '@' y '.'");
            System.out.println("Introduce de nuevo la dirección de correo: ");
            email = emailScanner.nextLine();
        }

        System.out.println("Tu correo electrónico es válido y se ha guardado correctamente.");
        
        
        
        emailScanner.close();
    }
}
