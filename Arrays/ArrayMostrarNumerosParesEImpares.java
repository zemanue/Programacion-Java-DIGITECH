/* ArrayMostrarNumerosParesEImpares
 */
public class ArrayMostrarNumerosParesEImpares {

    public static void main(String[] args) {
        
        //Crear array
        int[] array = new int[57];
        
        //Creamos los arrays pares e impares
        int[] pares = new int[array.length / 2];
        int[] impares = new int[array.length - pares.length];

        //Almacenar los números del 1 al 57
        for (int i = 0; i < array.length; i++) {
            array[i] =  i + 1;
            //Bucle if que detecta cuándo i+1 es par y lo almacena en el array de pares
            if ((i + 1) % 2 == 0) {
                pares[i / 2] = i + 1;
            } else { // almacena el resto de números (impares) en el array de impares                
                impares[i / 2] = i + 1;
            }
        }

        System.out.print("En el array hay " + array.length + " números: " );
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        System.out.print("Hay " + pares.length + " números pares: " );
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println("");


        System.out.print("Hay " + impares.length + " números pares: " );
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println("");

    }
}