
/*Guía sobre los distintos usos que voy encontrando a los arrays.
*/

import java.util.Scanner;

public class ArrayUsos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numCeldas = 20;


//ARRAYS UNIDIMENSIONALES

    //DECLARACIÓN Y CREACIÓN    
        //Declaración de un array
        String[] arrayString;
        //Creación de ese array
        arrayString = new String[2];
        //Declaración y creación de un array en una sola línea
        int[] arrayInt = new int[numCeldas];

        
    //INICIALIZAR:
        //Posiciones de una a una:
        /*arrayString[0] = "Isa";
        arrayString[1] = "Manu";*/

        //Crear e inicializar (cuando ya sabemos todos los valores y son pocos) (también declaramos arrayChar):
        char[] arrayChar = new char[]{'x', 'y', 'n', 'm'};

        //Bucle for para inicializar todos las posiciones de un array (para valores consecutivos como números):
        //(se puede alterar el orden en el que se inicializan o inicializar solo unos pocos)
        for (int i = 0; i < arrayInt.length; i++) {     
            arrayInt[i] = i+1; 
            }

        //Bucle for each (mismo propósito, pero siempre desde la posición 0 a la última):
        /*for (int i : arrayInt) {
            arrayInt[i] = i+1;
        }    */

        //Bucle for para inicializar todas las posiciones con el texto que ingrese el usuario
        System.out.print("Escribe uno a uno todos los elementos de arrayString: ");
        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i] = sc.nextLine();
        }

        //Bucle con condicional anidado para llenar un array solo con números pares y otro con números impares
            //Creamos los arrays pares e impares
        int[] pares = new int[arrayInt.length / 2];
        int[] impares = new int[arrayInt.length - pares.length];        
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + 1; 
            //Bucle if que detecta cuándo i+1 es par y lo almacena en el array de pares
            if ((i + 1) % 2 == 0) {
                pares[i / 2] = i + 1;
            } else { // almacena los otros números (impares) en el array de impares
                
                impares[i / 2] = i + 1;
            }
        }        


    //USAR ARRAYS
        //Imprimir todos los elementos de un array: bucle for
        System.out.print("Impresión de todos los elementos de arrayChar (bucle for): ");
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.print(arrayChar[i] + " ");
        }
        System.out.println("");

        //Imprimir todos los elementos de un array: bucle while
        System.out.print("Impresión de todos los elementos de arrayInt (bucle while): ");    
        int contador = 0;
        while (arrayInt.length > contador) {
            System.out.print(arrayInt[contador] + " ");
            contador++;
        }       
        System.out.println("");


        //Impresión de todos los elementos de forma inversa (de la última posición a la primera)
        System.out.print("Impresión de todos los elementos de arrayString de forma inversa: ");
        for (int i = arrayString.length-1; i >= 0; i--) {
            System.out.print(arrayString[i] + " ");
        }
        System.out.println("");

        //Impresión de los elementos de arrayInt de 5 en 5
        System.out.print("Impresión de los elementos de arrayInt de 5 en 5: ");
        for (int i = 0; i < arrayInt.length; i += 5) {
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("");


//ARRAYS MULTIDIMENSIONALES (MATRICES)
        
    //DECLARACIÓN Y CREACIÓN
        String[][] matrizString = new String[3][3];

    //INICIALIZAR
        
        //INICIALIZACIÓN DIRECTA: para valores específicos:
        int[][] matrizInt = new int[][] {
            {3,4,5,7,8}, 
            {0,0,0,0}, 
            {1,1,1,1}, 
            {6,6,6,-1} };        

        //BUCLES FOR ANIDADOS
        //Primer bucle: recorre las filas del array
        for(int i = 0; i < matrizString.length; i++){
            //Segundo bucle: por cada iteración del primer bucle, recorre todos las columnas.
            for (int j = 0; j < matrizString[i].length; j++) {
                matrizString[i][j] = "Fila " + i + ", columna " + j;
            }
        }

    //USAR
        
        //Imprimir todos los elementos de la matriz por orden
        System.out.println("Elementos de matrizString: ");
        //Primer bucle: recorre las filas del array
        for(int i = 0; i < matrizString.length; i++){
            //Segundo bucle: por cada iteración del primer bucle, recorre todas las columnas.
            for (int j = 0; j < matrizString[i].length; j++) {
                System.out.println(matrizString[i][j]);
            }
        }

        
        //Imprimir los valores de la primera y la última fila de la matriz
        //MÉTODO 2: un bucle para la primera fila y un bucle para la última
        System.out.print("Valores de la primera fila de matrizInt: ");
        //Bucle for que se repite el mismo número de veces que 'matrizInt[0]' (longitud de valores tiene la primera fila)
        for (int i = 0; i < matrizInt[0].length; i++) { 
            System.out.print(matrizInt[0][i] + " ");
        }
        System.out.println("");

        System.out.print("Valores de la última fila de matrizInt: ");
        //Bucle for que se repite el mismo número de veces que 'matrizInt[matrizInt.length-1]' (longitud de valores que tiene la última fila de cualquier array)
        for (int i = 0; i < matrizInt[matrizInt.length-1].length; i++) {
            System.out.print(matrizInt[matrizInt.length-1][i] + " ");
        }
        System.out.println("");
        
        //MÉTODO 2: un bucle anidado que salte de la primera fila a la última
        System.out.print("Valores de la primera y última fila: ");
        for(int i = 0; i < matrizInt.length; i += matrizInt.length-1){
            for (int j = 0; j < matrizInt[i].length; j++) {
                System.out.print(matrizInt[i][j] + " ");
            }
            System.out.print( "| ");
        }
        System.out.println("");


        //Mostrar el mayor y el menor de todos los números de la matriz
        int max = Integer.MIN_VALUE; //Inicializamos 'max' con el valor mínimo posible para enteros: -2147483648
        int min = Integer.MAX_VALUE; //Inicializamos 'min' con el valor máximo posible para enteros: 2147483647 

        for (int i = 0; i < matrizInt.length; i++) { //Revisamos cada valor del array
            for (int j = 0; j < matrizInt[i].length; j++) {
                max = Math.max(max, matrizInt[i][j]); //Se compara cada elemento con 'max', y se reasigna su valor cada vez que haya un elemento mayor que él
                min = Math.min(min, matrizInt[i][j]); //Lo mismo con 'min'
            }
        }
        System.out.println("El valor máximo de matrizInt es: " + max);
        System.out.println("El valor mínimo es: " + min);        

        sc.close();
    }
}
