/*
2. Diseña un programa que pide por pantalla 5 datos de tipo int, y se almacenan en un
arraylist. Posteriormente se pregunta si se desean imprimir los datos, en caso
afirmativo mostrar los datos por pantalla.
 */

import java.util.*;

public class ArrayList5Numeros {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Introduce a continuación 5 números a almacenar: ");
        Scanner sc = new Scanner(System.in);

        numeros.add(sc.nextInt());
        numeros.add(sc.nextInt());
        numeros.add(sc.nextInt());
        numeros.add(sc.nextInt());
        numeros.add(sc.nextInt());
        
        System.out.println("¿Quieres imprimir los datos? (s/n)");
        Scanner resp = new Scanner(System.in);
        String respuesta = resp.nextLine();
        //Bucle while para comprobar si el texto introducido coincide con 's' o 'n'. Si no, se vuelve a pedir el texto.
        while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")) {
            System.out.println("Has ingresado un valor no válido. Por favor, escribe 's' si quieres ingresar otro valor o 'n' si has terminado:");
            respuesta = resp.nextLine();
        }

        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("Muy bien. Estos son los números almacenados: ");
            System.out.println(numeros);
        } else {
            System.out.println("Muy bien. Hasta pronto.");
        }
        sc.close();
        resp.close();
    }
}
