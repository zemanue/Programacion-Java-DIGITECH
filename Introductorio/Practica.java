import java.util.*;

public class Practica {
    public static void main(String[] args) {
        
        String nombre = "Manué";

        if (nombre.equals("Manué")) {
            System.out.println("weno día makina");
            }
            else {
            System.out.println("Buenos días, caballero");
            }
        String palabra1 = "parabrisas";
        String palabra2 = "brisa";
        int posicion = palabra1.indexOf(palabra2);
        if (posicion==-1) {
            System.out.println(palabra2 + " no está contenido en " + palabra1);
        }
        else {
            System.out.println(palabra2 + " está contenido en " + palabra1 + " a partir de la posición " + posicion);
        }
        String s1 = new String(palabra1);
        System.out.println(s1);

        //Clase RANDOM, da número pseudoaleatorios
        Random rnd = new Random();
        System.out.println("Número aleatorio entero: " + rnd.nextInt());
        System.out.println("Número aleatorio entero hasta 10: " + rnd.nextInt(11));
        System.out.println("Número aleatorio entero entre 10 y 20: " + rnd.nextInt(10, 21));
        System.out.println("Número aleatorio decimal entre 0.0 y 1.0: " + rnd.nextDouble());

        //Método Math.round()
        System.out.println("Número PI redondeado a número entero (0 decimales): " + Math.round(Math.PI)); 
        System.out.println("Número PI redondeado a 1 decimal: " + (double)Math.round(Math.PI*10)/10); 
        System.out.println("Número PI redondeado a 2 decimales: " + (double)Math.round(Math.PI*100)/100); 
        System.out.println("Número PI redondeado a 3 decimales: " + (double)Math.round(Math.PI*1000)/1000); 

    }
} 
