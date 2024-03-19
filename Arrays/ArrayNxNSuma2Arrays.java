/*
2. Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra
matriz. Los valores y la longitud, seran insertados por el usuario. Mostrar las matrices
originales y el resultado.
 */

import java.util.Scanner;

public class ArrayNxNSuma2Arrays {
    public static void main(String[] args) {
        
        System.out.println("Vamos a crear dos matrices con los valores que indiques a continuación, para después crear una tercera matriz que almacene la suma de los valores de las otras dos matrices.");
        System.out.println("¿De cuántas filas quieres que sean tus matrices? Escribe el número a continuación: ");
        Scanner sc = new Scanner(System.in);
        int filas = sc.nextInt();

        System.out.println("¿Y de cuántas columnas? Escribe el número a continuación: ");
        int colum = sc.nextInt();

        int[][] matriz1 = new int[filas][colum];
        int[][] matriz2 = new int[filas][colum];

        //Bucle for para inicializar la 1ª matriz al completo con los números que ingrese el usuario
        System.out.println("Escribe uno a uno todos los elementos de la primera matriz: ");
        for (int i = 0; i < matriz1.length; i++) {
            System.out.println("Fila " + i + ":");
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = sc.nextInt();
            }                
        }

        //Bucle for para inicializar la 2ª matriz
        System.out.println("Escribe uno a uno todos los elementos de la segunda matriz: ");
        for (int i = 0; i < matriz2.length; i++) {
            System.out.println("Fila " + i + ":");
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = sc.nextInt();
            }                
        }
        
        int[][] matriz3 = new int[filas][colum];

        //Bucle for para inicializar la tercera matriz, sumando los valores de la 1ª y 2ª matriz
        System.out.println("Creando una tercera matriz sumando de los valores de las otras dos matrices... ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }                
        }
        
        //Imprimir la primera matriz
        System.out.println("Valores de la primera matriz: ");
        for (int i = 0; i < matriz1.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println("}");
        }
        System.out.println("");

        //Imprimir la segunda matriz
        System.out.println("Valores de la segunda matriz: ");
        for (int i = 0; i < matriz2.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("}");
        }
        System.out.println("");
        
        //Imprimir la tercera matriz, suma de las anteriores:
        System.out.println("Valores de la tercera matriz, suma de las anteriores: ");
        for (int i = 0; i < matriz2.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println("}");
        }   
        System.out.println("");

        sc.close();
    }
}
