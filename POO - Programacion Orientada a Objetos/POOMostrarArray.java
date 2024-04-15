/*
 * 2. Rellena un vector de manera aleatoria (1 a 10) y muéstralo al derecho y al revés.
Vamos a tener dos métodos uno para mostrarlo al derecho y otro para mostrarlo al revés.
 */

import java.util.Random;

public class POOMostrarArray {
    
    static class Vector {
        void mostrarAlDerecho(int[] array) {
            System.out.println("Impresión al derecho de todos los valores del vector:");
            //Imprimir los valores entre corchetes y separados por comas
            System.out.print("{");
            for (int i = 0; i < array.length; i++) {
                if (i != 0) {
                    System.out.print(", ");
                }
                System.out.print(array[i]);
            }
            System.out.println("}");
        }

        void mostrarAlReves(int[] array) {
            System.out.println("Impresión al revés de todos los valores del vector:");
            //Imprimir los valores entre corchetes y separados por comas
            System.out.print("{");
            for (int i = array.length - 1; i >= 0; i--) {
                if (i != array.length - 1) {
                    System.out.print(", ");
                }
                System.out.print(array[i]);
            }
            System.out.println("}");
        }
    }

    public static void main(String[] args) {
        
        Vector vector1 = new Vector();
        // Crear y llenar el vector con números aleatorios del 1 al 10
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1; // Genera un número aleatorio entre 1 y 10
        }
        System.out.println("Se ha rellenado el vector con " + array.length + " números aleatorios del 1 al 10.");
        vector1.mostrarAlDerecho(array);
        vector1.mostrarAlReves(array);
        
    }
}
