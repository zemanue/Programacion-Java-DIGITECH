/*
3. Nos piden crear una matriz de 4×4 de números enteros que inicialmente esta vacía, nos
piden hacer un menú con estas opciones:
- Rellenar TODA la matriz de números, debes pedírselo al usuario.
- Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
- Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
- Sumar la diagonal principal
- Sumar la diagonal inversa
- La media de todos los valores de la matriz
IMPORTANTE: hasta que no se haga la primera opción, el resto de opciones no se deberán de
ejecutar, simplemente mostrar un mensaje donde diga que debes rellenar la matriz.
 */

import java.util.Scanner;


public class ArraySumasYMedia {
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        Scanner sc = new Scanner(System.in);

        //Bucle for para inicializar la matriz al completo con los números que ingrese el usuario
        System.out.println("Escribe uno a uno todos los elementos de la matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Fila " + i + ":");
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }                
        }        

        //Imprimir la matriz de forma que se vean sus filas y columnas
        System.out.println("Valores de la matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("} ");
        }
        System.out.println("");

        //Pedir al usuario el número de fila que quiere sumar
        int sumaFila = 0;
        int fila;
        //Bucle do while para preguntar el número de fila y volver a pedir si no se da un número entre 0 y 3.
        do {
            System.out.println("¿Qué fila quieres sumar? (Filas: 0, 1, 2 y 3)");
            fila = sc.nextInt();
            if (fila < 0 || fila > 3) {
                System.out.println("El número de fila debe ser entre 0 y 3 (recuerda: 1ª fila = 0, 2ª fila = 1, etc.)");
            }
        } while (fila < 0 || fila > 3);
        //Se suman los elementos de la fila indicada por el usuario
        for (int i = 0; i < matriz.length; i++) {
            sumaFila += matriz[fila][i];
        }
        
        System.out.println("Suma de la fila " + fila + " = " + sumaFila);



        //Pedir al usuario el número de columna que quiere sumar
        int sumaColumna = 0;
        int columna;
        //Bucle do while para preguntar el número de columna y volver a pedir si no se da un número entre 0 y 3.
        do {
            System.out.println("¿Qué columna quieres sumar? (Columnas: 0, 1, 2 y 3)");
            columna = sc.nextInt();
            if (columna < 0 || columna > 3) {
                System.out.println("El número de columna debe ser entre 0 y 3 (recuerda: 1ª columna = 0, 2ª columna = 1, etc.)");
            }
        } while (columna < 0 || columna > 3);
        //Se suman los elementos de la columna indicada por el usuario
        for (int i = 0; i < matriz.length; i++) {
            sumaColumna += matriz[i][columna];
        }
        
        System.out.println("Suma de la columna " + columna + " = " + sumaColumna);

        //Sumar la diagonal principal
        int diagonalPrincipal = matriz [0][0] + matriz [1][1] + matriz [2][2] + matriz [3][3];
        System.out.println("Suma de la diagonal principal = " + diagonalPrincipal);

        //Sumar la diagonal inversa
        int diagonalInversa = matriz [3][0] + matriz [2][1] + matriz [1][2] + matriz [0][3];
        System.out.println("Suma de la diagonal inversa = " + diagonalInversa);

        //Media de todos los valores de la matriz
        int sumaMatriz = 0;
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                sumaMatriz += matriz[i][j];
            }
        }
        double mediaMatriz = (double) sumaMatriz / 16;
        System.out.println("Suma de la matriz = " + sumaMatriz);
        System.out.println("Media de la matriz = " + mediaMatriz);

        sc.close();
    }
}
