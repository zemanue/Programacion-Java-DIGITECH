
/*Guía sobre los distintos usos que voy encontrando a los arrays.
*/

import java.util.Scanner;

public class ArrayUsos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numCeldas = 20;

    //DECLARACIÓN Y CREACIÓN    
        //Declaración de arrayString
        String[] arrayString;
        //Creación de arrayString
        arrayString = new String[2];
        //Declaración y creación de arrayInt en una sola línea
        int[] arrayInt = new int[numCeldas];

        
    //INICIALIZAR:
        //Posiciones de una a una:
        /*arrayString[0] = "Isa";
        arrayString[1] = "Manu";*/

        //Crear e inicializar (cuando ya sabemos todos los valores y son pocos) (también declaramos arrayChar):
        char[] arrayChar = new char[]{'x', 'y', 'n', 'm'};

        //Bucle for para inicializar todos las posiciones de un array (para valores consecutivos como números):
        //(se puede alterar el orden en el que se inicializan o inicializar solo unos pocos)
        for (int i = 0; i < arrayInt.length; i++) {     
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

        //Bucle con condicional anidado para llenar un array solo con números pares y otro con números impares
            //Creamos los arrays pares e impares
        int[] pares = new int[arrayInt.length / 2];
        int[] impares = new int[arrayInt.length - pares.length];        
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + 1; 
            //Bucle if que detecta cuándo i+1 es par y lo almacena en el array de pares
            if ((i + 1) % 2 == 0) {
                pares[i / 2] = i + 1;
            } else { // almacena los otros números (impares) en el array de impares
                
                impares[i / 2] = i + 1;
            }
        }        


    //USAR ARRAYS
        //Imprimir todos los elementos de un array: bucle for
        System.out.print("Impresión de todos los elementos de arrayChar (bucle for): ");
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.print(arrayChar[i] + " ");
        }
        System.out.println("");

        //Imprimir todos los elementos de un array: bucle while
        System.out.print("Impresión de todos los elementos de arrayInt (bucle while): ");    
        int contador = 0;
        while (arrayInt.length > contador) {
            System.out.print(arrayInt[contador] + " ");
            contador++;
        }       
        System.out.println("");


        //Impresión de todos los elementos de forma inversa (de la última posición a la primera)
        System.out.print("Impresión de todos los elementos de arrayString de forma inversa: ");
        for (int i = arrayString.length-1; i >= 0; i--) {
            System.out.print(arrayString[i] + " ");
        }
        System.out.println("");

        //Impresión de los elementos de arrayInt de 5 en 5
        for (int i = 0; i < arrayInt.length; i += 5) {
            System.out.println(arrayInt[i]);
        }





        sc.close();
    }
}
