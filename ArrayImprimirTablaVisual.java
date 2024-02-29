/*
1. Diseña el siguiente programa:
• Se pide por pantalla el número de celdas de la tabla o Array
• Si hay 10 celdas, cada celda guarda el número correspondiente a su posición.
• Imprimir el array con un bucle for
• Imprimir el array con un bucle while
• Se debe pintar la tabla, con caracteres gráficos -------, o por el contrario: |, simulando una tabla
visualmente.
 */

import java.util.Scanner;

public class ArrayImprimirTablaVisual {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de celdas: ");
        int numCeldas = sc.nextInt();

        int[] array = new int[numCeldas];

        //Creamos el array
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        //Imprimir con un bucle for
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        //Imprimir con un bucle while
        int contador = 0;
        while (array.length > contador) {
            System.out.print(array[contador] + " ");
            contador++;
        }
        System.out.println("");

        // Imprimimos la tabla visualmente
        System.out.println("|---------------- |");
        System.out.println("| Índice |  Valor |");
        System.out.println("|---------------- |");
        
        for (int i = 0; i < array.length; i++) {
            System.out.printf("|  %3d   |  %3d   |\n", i, array[i]);
            System.out.println("|-----------------|");            
        }
        System.out.println("|-----------------|");
        
        sc.close();
    }
}
