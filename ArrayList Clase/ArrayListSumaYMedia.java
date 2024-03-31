/*
1.Programa Java que lea una serie de valores numéricos enteros desde el teclado y los guarde
en un ArrayList de tipo Integer. La lectura de números enteros termina cuando se introduzca el
valor -99. Este valor no se guarda en el ArrayList.
A continuación el programa mostrará por pantalla el número de valores que se han leído, su
suma y su media. Por último se mostrarán todos los valores leídos, indicando cuántos de ellos
son mayores que la media.
 */

import java.util.*;

public class ArrayListSumaYMedia {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int entero;

        System.out.println("Escribe números enteros. Cuando quieras parar, escribe -99.");

        do {
            entero = sc.nextInt();
            if (entero != -99) {
                numeros.add(entero);                
            }
        } while (entero != -99);

        sc.close();

        //Mostrar los números de la lista
        System.out.println("Se han almacenado " + numeros.size() + " números en la lista. Son los siguientes: ");
        System.out.println(numeros);

        //Suma de los números
        int suma = 0;
        for (Integer i : numeros) {
            suma += i;
        }
        System.out.println("Suma total: " + suma);

        //Media
        double media = (double) suma / numeros.size();
        System.out.println("Media: " + media);

        //Números superiores a la media
        ArrayList<Integer> numerosSuperioresAMedia = new ArrayList<>();
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > Math.ceil(media)) {
                numerosSuperioresAMedia.add(i);
            }
        }
        System.out.println("Hay " + numerosSuperioresAMedia.size() + " números superiores a la media. Son los siguientes: ");
        System.out.println(numerosSuperioresAMedia);


    }
}
