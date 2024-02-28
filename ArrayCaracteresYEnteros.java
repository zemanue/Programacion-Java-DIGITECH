/*3. Crear un array de caracteres, con los siguientes valores: a,e,r,t,y,u. Crea un array con datos
enteros con valores del 1 al 6.
Diseña un tercer array que tiene el mismo número de celdas que la suma de las celdas de los
dos arrays anteriores. */


public class ArrayCaracteresYEnteros {
    public static void main(String[] args) {
        
        //Creamos el array de caracteres:
        char[] arrayChar = new char[] {'a', 'e', 'r', 't', 'y', 'u'};

        //Creamos el array de enteros
        int[] arrayInt = new int[6];
        for (int i = 0; i < arrayInt.length; i++) {     
            arrayInt[i] = i+1; 
            }
            
        //Creación del tercer array con un número de celdas igual a la suma de los elementos de arrayChar y arrayInt
        int[] arraySuma = new int[arrayChar.length + arrayInt.length];        

        //Impresión de arrayChar
        System.out.print("Elementos de arrayChar: ");
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.print(arrayChar[i] + " ");
        }
        System.out.println("");

        //Impresión de arrayInt
        System.out.print("Elementos de arrayInt: ");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("");

        //Impresión de la longitud de arraySuma
        System.out.println("ArraySuma tiene " + arraySuma.length + " celdas, que son la suma de las celdas de arrayChar (" + arrayChar.length + "), y de arrayInt (" + arrayInt.length + ").");

        
    }
}
