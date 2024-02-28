
/*Guía sobre los distintos usos que voy encontrando a los arrays.
*/

import java.util.Scanner;

public class ArrayUsos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    //DECLARACIÓN Y CREACIÓN    
        //Declaración de arrayString
        String[] arrayString;
        //Creación de arrayString
        arrayString = new String[3];
        //Declaración y creación de arrayInt en una sola línea
        int[] arrayInt = new int[10];

        
    //INICIALIZAR:
        //Posiciones de una a una:
        /*arrayString[0] = "Isa";
        arrayString[1] = "Manu";*/

        //Crear e inicializar (cuando ya sabemos todos los valores y son pocos) (también declaramos arrayChar):
        char[] arrayChar = new char[]{'x', 'y', 'n', 'm'};

        //Bucle for para inicializar todos las posiciones de un array (para valores consecutivos como números):
        for (int i = 0; i < arrayInt.length; i++) {     //(se puede alterar el orden en el que se inicializan o inicializar solo unos pocos)
            arrayInt[i] = i+1; 
            }

        //Bucle for each (mismo propósito, pero siempre desde la posición 0 a la última):
        /*for (int i : arrayInt) {
            arrayInt[i] = i+1;
        }    */

        //Bucle for para inicializar todas las posiciones con el texto que ingrese el usuario
        System.out.print("Escribe uno a uno todos los elementos de arrayString: ");
        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i] = sc.nextLine();
        }


    //USAR ARRAYS
        //Imprimir todos los elementos de un array: bucle for
        System.out.print("Impresión de todos los elementos de arrayChar: ");
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.print(arrayChar[i] + " ");
        }
        System.out.println("");

        //Impresión de todos los elementos de forma inversa (de la última posición a la primera)
        System.out.print("Impresión de todos los elementos de arrayString de forma inversa: ");
        for (int i = arrayString.length-1; i >= 0; i--) {
            System.out.print(arrayString[i] + " ");
        }
        System.out.println("");

        //Impresión de los elementos pares de arrayInt
        for (int i = 1; i < arrayInt.length; i = i+2) {
            System.out.println(arrayInt[i]);
        }





        sc.close();
    }
}
