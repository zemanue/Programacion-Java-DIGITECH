/*1. Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números
aleatorios entre 0 y 10.*/

import java.util.Scanner;

public class ArrayInicializarNumerosRandom {
    public static void main(String[] args) {
        
        int max = 10, min = 0;

        System.out.println("¿Cuántas columnas quieres que tenga tu array?");
        Scanner sc = new Scanner(System.in);
        int colum = sc.nextInt();

        int[][] matriz = new int[5][colum];

        //Bucle for anidado para inicializar el array
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)Math.floor(Math.random()* (max - min) + min); //Genera números enteros aleatorios entre 0-10
            }
        }
        
        //Imprimir el array con números aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Fila " + i + ", Columna " + j + ": " + matriz[i][j]);
            }
        }

        sc.close();
    }
}
