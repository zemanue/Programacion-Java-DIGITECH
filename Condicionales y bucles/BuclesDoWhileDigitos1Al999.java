//5.Escribir un programa que pide por pantalla un número entre el 0 y 999.
//Nos aparece un mensaje, con el número de dígitos que tiene el número que introduce. 
//Si se teclea el valor cero, se acaba el juego.

import java.util.Scanner;
public class BuclesDoWhileDigitos1Al999 {

    public static void main(String[] args) {
        
        Scanner datoScanner = new Scanner (System.in);
        int num1;
        
        do {
            System.out.println("Escribe un número para conocer cuántas cifras tiene (o escribe 0 para salir del bucle):");
            num1 = datoScanner.nextInt();

            if (num1<0) {
                System.out.println("El número debe estar comprendido entre 0 y 999");
            }
            else if (num1<10) {
                System.out.println("El número " + num1 + " tiene 1 cifra.");
            }
            else if (num1<100) {
                System.out.println("El número " + num1 + " tiene 2 cifras.");
            }
            else if (num1<1000) {
                System.out.println("El número " + num1 + " tiene 3 cifras.");
            }
            else {
                System.out.println("El número debe estar comprendido entre 0 y 999");
            }
        } while (num1 != 0);
        System.out.println("¡Has salido del bucle!");

        datoScanner.close();
    }
}