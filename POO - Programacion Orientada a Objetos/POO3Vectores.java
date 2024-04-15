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
        static void generarArrayAleatorio (int[] A) {
            Random random = new Random();
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(20) + 1; // Números aleatorios del 1 al 20
        }
    }

        static void tercerArraySuma(int[] A, int[] B) {
            int[] c = new int[20];
            for (int i = 0; i < A.length; i++) {
                c[i] = A[i] + B[i];
            }
        }
        
        static void visualizarTresArrays(int[] A, int[] B, int[] C) {
            //Imprimir el primer array (los valores entre corchetes y separados por comas)
            System.out.print("Vector A: {");
            for (int i = 0; i < A.length; i++) {
                if (i != 0) {
                    System.out.print(", ");
                }
                System.out.print(A[i]);
            }
            System.out.println("}");

            //Segundo array 
            System.out.print("Vector B: {");
            for (int i = 0; i < B.length; i++) {
                if (i != 0) {
                    System.out.print(", ");
                }
                System.out.print(B[i]);
            }
            System.out.println("}");
            
            //Tercer  array 
            System.out.print("Vector C: {");
            for (int i = 0; i < C.length; i++) {
                if (i != 0) {
                    System.out.print(", ");
                }
                System.out.print(C[i]);
            }
            System.out.println("}");            
        }
        
    }        

    public static void main(String[] args) {

    }
}
