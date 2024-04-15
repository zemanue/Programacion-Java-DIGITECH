/*
 * 3. Desarrollar un programa que utilice:
a) Un metodo para generar dos vectores A y B de 20 valores aleatorios del 1 al 20
cada uno. Como parámetros tendremos solo un vector.
b) Mediante un método calcular C(i)=A(i)+B(i).
c) Mediante otro método visualizaremos por pantalla los tres vectores A,B,C

 */

import java.util.Random;

public class POO3Vectores {
    
    public class Vector {
        static void dosArraysAleatorios (int[] array) {
            Random random = new Random();
            //Se rellena el primer array "a"
            int[] a = new int[20];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(20) + 1; // Genera un número aleatorio entre 1 y 20
            }
            System.out.println("Se ha rellenado el primer vector con " + a.length + " números aleatorios del 1 al 20.");
            
            //Se rellena el segundo array "b"
            int[] b = new int[20];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(20) + 1;
            }
            System.out.println("Se ha rellenado el primer vector con " + b.length + " números aleatorios del 1 al 20.");
        }

        static void tercerArraySuma(int[] array1, int[] array2) {
            int[] c = new int[20];
            for (int i = 0; i < array1.length; i++) {
                c[i] = array1[i] + array2[i];
            }
        }
        
        static void visualizarTresArrays(int[] array1, int[] array2, int[] array3) {
            //Imprimir el primer array (los valores entre corchetes y separados por comas)
            System.out.print("{");
            for (int i = 0; i < array1.length; i++) {
                if (i != 0) {
                    System.out.print(", ");
                }
                System.out.print(array1[i]);
            }
            System.out.println("}");

            //Segundo array 
            System.out.print("{");
            for (int i = 0; i < array1.length; i++) {
                if (i != 0) {
                    System.out.print(", ");
                }
                System.out.print(array1[i]);
            }
            System.out.println("}");
            
            //Tercer  array 
            System.out.print("{");
            for (int i = 0; i < array1.length; i++) {
                if (i != 0) {
                    System.out.print(", ");
                }
                System.out.print(array1[i]);
            }
            System.out.println("}");            
        }
        
    }        

    public static void main(String[] args) {
        
    }
}
