/*
4. Realizar un programa donde se almacenan los nombres de diferentes animales. Se
piden nombres por pantalla hastaque se introduce la palabra salir
Se deben visualizar todos los valores introducidos y el número de valores que se
introducen
 */

import java.util.*;

public class ArrayListAnimalesHastaSalir {
    public static void main(String[] args) {
        
        ArrayList<String> animales = new ArrayList<>();

        System.out.println("Introduce uno a uno los nombres de los animales que quieras almacenar en el array list:");
        Scanner sc = new Scanner(System.in);

        //Bucle do while para seguir recogiendo datos del usuario hasta que introduzca "salir".
        do {
            animales.add(sc.nextLine());
        } while (!animales.contains("salir"));
        animales.removeLast(); //Elimina "salir" del array list para que solo se guarden los anteriores nombres.

        if (animales.size() == 0) {
            System.out.println("No has guardado ningún animal.");
        } else {
            System.out.println("Has terminado de almacenar nombres de animales.");
            System.out.println("Se han guardado un total de " + animales.size() + " animales.");
            System.out.println("Son los siguientes: " + animales);        
        }

        sc.close();
    }
}
