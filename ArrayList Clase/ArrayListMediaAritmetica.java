/*
1.Crear un arraylist con 5 valores de tipo integer. Calcular la media de todos los valores.
Visualizar todos los valores y la media.
 */

import java.util.*;

public class ArrayListMediaAritmetica {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe a continuación 5 números enteros para calcular su media:");

        for (int i = 0; i < 5; i++) {
            numeros.add(sc.nextInt());
        }

        System.out.println("Los valores son: " + numeros);

        //Hacer la media:
        int suma = 0;

        //Bucle for para ir sumando uno por uno los elementos del array list.
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }

        double media = (double) suma/numeros.size();

        System.out.println("La media de los números es de " + media + ".");

        sc.close();
    }
}
