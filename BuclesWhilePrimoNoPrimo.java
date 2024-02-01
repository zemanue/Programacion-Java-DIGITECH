//1.Se pide por pantalla, un número, para comprobar si es primo. 
//Si se introduce el número cero termina el juego. 

import java.util.Scanner;
public class BuclesWhilePrimoNoPrimo {

    public static void main(String[] args) {
        System.out.println("Escribe un número entero para comprobar si es primo o no:");
        Scanner datoScanner = new Scanner (System.in);                          //Pedimos el número entero
        int num1 = datoScanner.nextInt();

        while (num1 != 0) {                           

            if (num1<0) {                                           //Comprobamos que num1 sea positivo
                System.out.println("El número debe ser positivo (los números negativos no son primos)");
                System.out.println("Escribe otro número (o introduce '0' si quieres terminar):");
                num1 = datoScanner.nextInt();
            }
            else {
                int contador = 0;                                       
                
                for (int cociente = 1; cociente <= num1; cociente++) {  //Bucle FOR: dividir num1 entre todos los números que haya entre 1 y sí mismo (1, 2, 3... num1)
                    if (num1%cociente == 0) {                           //Cada vez que el resto sea 0, se ha encontrado un divisor.
                        contador=contador+1;                                     //Se suma uno al contador
                    }
                }                                                       

                if (contador == 2) {                                    //IF: si el contador es = 2, solo se puede dividir de manera exacta entre 1 y sí mismo
                    System.out.println(num1 + " es primo.");            //Por lo tanto, es primo
                }
                else {                                                  //Si se ha podido dividir entre más o menos números, no es primo
                    System.out.println(num1 + " no es primo");
                }
                System.out.println("Escribe otro número (o introduce '0' si quieres terminar): ");
                num1 = datoScanner.nextInt();
            }                                                           //FIN IF
        }                                                               //FIN WHILE
        System.out.println("¡Has salido del bucle!");
        System.out.println("Dato curioso: 0 es el único número que no se puede dividir entre sí mismo. Por lo tanto, no es primo");

        datoScanner.close();
    }
}