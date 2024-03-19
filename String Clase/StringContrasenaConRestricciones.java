
/*1.Desarrollar un programa que solicita la contraseña o password. Se debe comprobar:
• Que la longitud de la cadena no es superior a 25 caracteres.
• No debe contener caracteres especiales:@,.,$,#,&,/
• Se debe almacenar la primera letra y la última en mayúsculas
*/

import java.util.Scanner;

public class StringContrasenaConRestricciones {
    public static void main(String[] args) {
        
        //Pedimos por primera vez la contraseña
        System.out.println("Escribe aquí la contraseña:");
        Scanner entradaUsuario = new Scanner(System.in);
        String contrasena = entradaUsuario.next();
        
        //Creamos dos String que contengan la primera y última letra de la contraseña
        //También se puede guardar como char, pero entonces habría que usar la función charAt() y más tarde utilizar la clase Character.
        String primeraletra = contrasena.substring(0,1);
        String ultimaletra = contrasena.substring(contrasena.length()-1);

        while (
            contrasena.length()>25 
            || contrasena.matches(".*[@.$#&/]") 
            || primeraletra.equals(primeraletra.toLowerCase()) 
            || ultimaletra.equals(ultimaletra.toLowerCase())
        ) {    
            System.out.println("Tu contraseña incumple alguna condición: ");
            
            //Si la longitud de la contraseña es superior a 25 caracteres
            if (contrasena.length()>25) {
                System.out.println("Debe tener como máximo 25 caracteres.");
            }
            //Si los caracteres especiales "@.$#&/" se encuentran (en cualquier número) dentro de la contraseña
            if (contrasena.matches(".*[@.$#&/]")) {
                System.out.println("No puede contener los siguientes caracteres especiales: @ . $ # & /");
            }
            //Si la primera letra equivale a la primera letra convertida a minúsculas, y lo mismo con la última letra
            if (primeraletra.equals(primeraletra.toLowerCase()) || ultimaletra.equals(ultimaletra.toLowerCase())) {
                System.out.println("La primera y la última letra deben ser mayúsculas.");
            }
            
            //Pedimos una nueva contraseña
            System.out.println("Escribe una nueva contraseña: ");
            contrasena = entradaUsuario.next();
            
            //Actualizamos la primeraletra y ultima letra de acuerdo a la nueva contraseña.
            primeraletra = contrasena.substring(0,1);
            ultimaletra = contrasena.substring(contrasena.length()-1);
        }        
        System.out.println("La contraseña introducida cumple las normas y se ha guardado correctamente.");
        
        entradaUsuario.close();
        }               
    }
