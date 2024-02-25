/*2.Diseñar un código que pide por pantalla cuantos números aleatorios se desean calcular. 
Se deben generar estos números y mostrar los valores por pantalla.
 */

import java.util.Scanner;

public class MathNumAleatorios {
    public static void main(String[] args) {
        
        //Pedimos el número de números aleatorios que se desean generar
        System.out.println("¿Cuántos números aleatorios deseas generar?");
        Scanner sc = new Scanner(System.in);
        int cuantosNum = sc.nextInt();

        System.out.println("Muy bien, aquí tienes: ");
        for (int i=1; cuantosNum >= i;i++) {
            double numAleatorio = Math.random();
            System.out.println(numAleatorio);
        }

        sc.close();
    }
}
