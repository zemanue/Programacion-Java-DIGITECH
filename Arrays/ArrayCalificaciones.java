/*
5.Diseñar un array con las calificaciones de 6 asignaturas de un alumno que se piden por
pantalla. Se debe calcular su nota media final.
 Si la media>=5, la calificación es aprobado
 Si la media<5, la calificación es suspenso
 Si la media>5 y <=6.5 la calificación es bien
 Si la media >6.5 y <=8.5 la calificación es notable
 Si la media >8.5 y >=9 la calificación es sobresaliente
 */

import java.util.Scanner;

public class ArrayCalificaciones {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota de las 6 asignaturas una detrás de otra:");

        double[] notas = new double[6];

        //Bucle for que pide 6 decimales al usuario y los almacena en el array
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextDouble();
            //Bucle while para volver a pedir al usuario la nota en el caso de que no sea un número comprendido entre 0 y 10
            while (notas[i] < 0 || notas[i] > 10) {
                System.out.println("La nota debe ser un número comprendido entre 0 y 10. Por favor, vuelve a escribir la nota");
                notas[i] = sc.nextDouble();
            }
        }

        //Bucle for que calcula la media aritmética 
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma+= notas[i];
        }

        System.out.println("La suma de tus notas es: " + suma + ".");
        double media = suma / notas.length;
        System.out.println("Tu nota media es: " + media + ".");

        //If para determinar si la media es suspenso, bien, notable o sobresaliente
        System.out.print("La calificación según tu media es: ");
        if (media<5) {
            System.out.println("Suspenso");
        }
        else if (media>=5) {
            System.out.print("Aprobado con un ");
            if (media > 8.5) {
                System.out.println("Sobresaliente.");
            }
            else if (media > 6.5) {
                System.out.println("Notable.");
            } 
            else {
                System.out.println("Suficiente.");
            }
        }
        sc.close();
    }
}
