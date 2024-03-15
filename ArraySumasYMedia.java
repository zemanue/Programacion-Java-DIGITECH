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

        System.out.println("Valores de la matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("} ");
        }
        System.out.println("");

        //Pedir al usuario el número de fila que quiere sumar


        //Pedir al usuario el número de fila que quiere sumar


        //Sumar la diagonal principal
        int diagonalPrincipal = matriz [0][0] + matriz [1][1] + matriz [2][2] + matriz [3][3];
        System.out.println("Suma de la diagonal principal: " + diagonalPrincipal);

        //Sumar la diagonal inversa
        int diagonalInversa = matriz [3][0] + matriz [2][1] + matriz [1][2] + matriz [0][3];
        System.out.println("Suma de la diagonal inversa: " + diagonalInversa);

        //Media de todos los valores de la matriz
        int sumaMatriz = 0;
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                sumaMatriz = sumaMatriz + matriz[i][j];
            }
        }
        double mediaMatriz = (double) sumaMatriz / 16; //ALGO NO ESTÁ BIEN CON LA MEDIA
        System.out.println("Suma de la matriz: " + sumaMatriz);
        System.out.println("Media de la matriz: " + mediaMatriz);

        sc.close();
    }
}
