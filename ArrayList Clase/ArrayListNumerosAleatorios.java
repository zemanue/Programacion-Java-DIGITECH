/*
2.Diseña un programa que almacena n números aleatorios, positivos. Se pide:
 Imprimir todos los valores del arraylist
 Mostrar cual es el primer valor
 Mostrar el último valor
 Se pide por pantalla al usuario si desea almacenar algún valor, si teclea si, se almacena
el valor tecleado en el arralist.
 */

import java.util.*;

public class ArrayListNumerosAleatorios {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos números aleatorios quieres almacenar?");
        int cantidad = sc.nextInt();
        sc.nextLine(); // Consumir la nueva línea después de nextInt()

        if (cantidad <= 0) { //Por si se ingresa un número igual o menor a 0.
            System.out.println("No se almacenará ningún número aleatorio.");

        } else {
            System.out.println("Generando " + cantidad +  " números enteros aleatorios del 0 al 100.");
            Random aleatorio = new Random();
            for (int i = 0; i < cantidad; i++) {
                numeros.add(aleatorio.nextInt(100));
            }

            System.out.println("Números aleatorios almacenados: ");
            System.out.println(numeros);
            System.out.println("Primer valor: " + numeros.getFirst());
            System.out.println("Último valor: " + numeros.getLast());            
        }        


        String siONo;
        do {
            System.out.println("Deseas almacenar algún valor más a la lista? (s/n)");
            siONo = sc.nextLine();

            if (siONo.equalsIgnoreCase("s")) {
                System.out.println("Muy bien. ¿Cuántos más quieres almacenar?");
                cantidad = sc.nextInt();
                sc.nextLine(); // Consumir la nueva línea después de nextInt()
                System.out.println("Vas a escribir " + " números más. Escríbelos uno por uno:");
                int masNumeros; 
                for (int i = 0; i < cantidad; i++) {
                    masNumeros = sc.nextInt();
                    numeros.add(masNumeros);
                }
                System.out.println("Números almacenados después de los añadidos: ");
                System.out.println(numeros);
            } else if (siONo.equalsIgnoreCase("n")) {
                System.out.println("Muy bien. Lista cerrada.");
            } else {
                System.out.println("El carácter introducido no es válido. Por favor, responde 's' para decir que sí o 'n' para decir que no.");
            }            
        } while (!siONo.equalsIgnoreCase("s") && !siONo.equalsIgnoreCase("n"));

        sc.close();
    }
}
