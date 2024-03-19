/* Codifique un programa que permita cargar una oración por teclado, después mostrar cada
palabra ingresada en una línea distinta.
Por ejemplo si cargamos:
La mañana está fría. 
Debe aparecer:
La
mañana
está
fría. */

import java.util.Scanner;

public class StringDividirPorPalabrasSplit {
    public static void main(String[] args) {
        System.out.println("Inserta una cadena de texto para separarla por palabras:");
        Scanner entradaUsuario = new Scanner(System.in);
        String cadena = entradaUsuario.nextLine();

        String[] cadenaPorPalabras = cadena.split(" ");

        for (int i = 0; i < cadenaPorPalabras.length; i++) {
            System.out.println(cadenaPorPalabras[i]);
        }
        
        entradaUsuario.close();
}
}