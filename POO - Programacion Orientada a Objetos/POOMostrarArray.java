/*
 * 2. Rellena un vector de manera aleatoria (1 a 10) y muéstralo al derecho y al revés.
Vamos a tener dos métodos uno para mostrarlo al derecho y otro para mostrarlo al revés.
 */

import java.util.Scanner;

public class POOMostrarArray {
    
    //int[] array = new int[10];

    class Vector {
        void mostrarAlDerecho(int[] array) {
            System.out.println("Impresión al derecho de todos los valores del vector:");
            System.out.print("{");
            for (int i = 0; i < array.length; i++) {
                if (i+1 != array.length) {
                    System.out.print(array[i] + ", ");
                } else {
                    System.out.println(array[i] + "}");
                }
            }
        }

        void mostrarAlReves(int[] array) {
            System.out.println("Impresión al derecho de todos los valores del vector:");
            System.out.print("{");
            for (int i = array.length; i >= 0; i--) {
                if (i+1 != array.length) {
                    System.out.print(array[i] + ", ");
                } else {
                    System.out.println(array[i] + "}");
                }
            }
        }
    }

    public static void main(String[] args) {
        


    }
}
