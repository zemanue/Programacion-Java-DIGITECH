/*
2.Se pide por pantalla el número de posiciones que queremos que tenga nuestro array, se
piden los datos por pantalla.
Se crea otro array, pidiendo el número de posiciones por pantalla. Los valores se cargan con un
bucle for.
Crear un tercer array, que contiene los datos de los dos arrays.
*/

import java.util.Scanner;

public class ArrayInicializar3Array {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Solicitamos al usuario el número de elementos del primer array
        System.out.println("Introduce el número de elementos que deseas que tenga el Array 1");
        int x = sc.nextInt();
        int[] array1 = new int[x];

        //Bucle for que pide x números al usuario y los almacena en el array
        System.out.println("Introduce uno a uno los números que quieres almacenar: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }            
        

        //Solicitamos al usuario el número de elementos del segundo array
        System.out.println("Introduce el número de elementos que deseas que tenga el Array 2");
        int y = sc.nextInt();
        int[] array2 = new int[y];

        //Bucle for que almacena los números de 1 a y.
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i+1;
        }
        

        //Creación del tercer array a partir de la suma de los elementos de array1 y array2
        int[] array3 = new int[x + y];

        //Bucle para que los primeros elementos de array3 sean los mismos que los de array1
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        //Bucle para cargar los datos de array2 en array3 a partir de la última posición anterior
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        
        System.out.print("Array 1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");            
        }
        System.out.println("");
        
        System.out.print("Array 2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");            
        }
        System.out.println("");

        System.out.print("Array 3: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");            
        }
        System.out.println("");


        sc.close();
    }
}
