/*
1. Dada la siguiente matriz, crear un bloque de código que aparezca de la siguiente
forma:    
{3 4 5 7 8 }
{0 0 0 0 }
{1 1 1 1}
{6 6 6 -1}
Consideraciones:
• Mostrar cual es el mayor valor de todos los que tiene la matriz
• Mostrar cual es el menor valor de todos los que tiene la matriz
• Imprime solamente los valores de la primera y la última fila de la matriz
 */


public class ArrayMaxYMin {
    public static void main(String[] args) {
        
        int[][]numeros=new int[][] {
            {3,4,5,7,8}, 
            {0,0,0,0}, 
            {1,1,1,1}, 
            {6,6,6,-1} };

        //Mostrar el mayor y el menor de todos los números de la matriz
        int max = Integer.MIN_VALUE; //Inicializamos 'max' con el valor mínimo posible para enteros: -2147483648
        int min = Integer.MAX_VALUE; //Inicializamos 'min' con el valor máximo posible para enteros: 2147483647 

        for (int i = 0; i < numeros.length; i++) { //Revisamos cada elemento de la matriz
            for (int j = 0; j < numeros[i].length; j++) {
                max = Math.max(max, numeros[i][j]); //Se compara cada elemento con 'max', y se reasigna su valor cada vez que haya un elemento mayor que él
                min = Math.min(min, numeros[i][j]); //Lo mismo con 'min'
            }
        }
        System.out.println("El valor máximo de la matriz es: " + max);
        System.out.println("El valor mínimo es: " + min);

        //Método 1: un bucle para la primera fila y un bucle para la última
        System.out.print("Valores de la primera fila: ");
        //Bucle for que se repite el mismo número de veces que 'numeros[0]' (longitud de valores tiene la primera fila)
        for (int i = 0; i < numeros[0].length; i++) { 
            System.out.print(numeros[0][i] + " ");
        }
        System.out.println("");

        System.out.print("Valores de la última fila: ");
        //Bucle for que se repite el mismo número de veces que numeros[numeros.length-1] (longitud de valores que tiene la última fila de cualquier array)
        for (int i = 0; i < numeros[numeros.length-1].length; i++) {
            System.out.print(numeros[numeros.length-1][i] + " ");
        }
        System.out.println("");


        //Método 2: un bucle anidado que salte de la primera fila a la última
        System.out.print("Valores de la primera y última fila: ");
        for(int i = 0; i < numeros.length; i += numeros.length-1){
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.print( "| ");
        }
        System.out.println("");

        }
}
