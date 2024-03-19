/*2.Diseñar un código que pide por pantalla cuantos números aleatorios se desean calcular. 
Se deben generar estos números y mostrar los valores por pantalla.
 */

import java.util.Scanner;

public class MathNumAleatoriosEntre2Num {
    public static void main(String[] args) {
        
        //Pedimos el número de números aleatorios que se desean generar
        System.out.println("¿Cuántos números aleatorios deseas generar?");
        Scanner sc = new Scanner(System.in);
        int cuantosNum = sc.nextInt();

        //Pedimos entre qué números queremos que se genere
        System.out.println("Escribe ahora entre qué números deseas generar los números aleatorios");
        System.out.println("Mínimo: ");
        double min = sc.nextDouble();
        System.out.println("Máximo: ");
        double max = sc.nextDouble();
        
        System.out.println("Muy bien, aquí tienes: ");
        for (int i=1; cuantosNum >= i;i++) {
            double numAleatorio = Math.random() * (max - min) + min;
            System.out.println(numAleatorio);
        }

        sc.close();
    }
}
