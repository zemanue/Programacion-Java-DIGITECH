/*
1. Diseña un programa en Java que pide por pantalla una palabra de x caracteres. Se
debe crear una matriz con el mismo número de celdas que letras tiene la palabra.
Consideraciones:
• Cada letra se debe almacenar en una celda.
• Se debe comprobar si hay algún valor repetido en alguna celda.
 */

import java.util.Scanner;

public class ArrayPalabraDivididaEnCaracteres {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe a continuación la palabra que quieras registrar: ");
        String palabra = sc.nextLine();
        
        //Contar el número de caracteres
        int numCaracteres = palabra.length();

        //Crear el array de tamaño = nº de caracteres
        char[] array = new char[numCaracteres];

        //Registar cada elemento 
        for (int i = 0; i < array.length; i++) {
            array[i] = palabra.charAt(i);
        }

        //Imprimir todos los elementos por orden y de forma visual (filas y columnas)
        System.out.println("Valores del array formado por los caracteres de la palabra: ");
        System.out.print("{-");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "-");
        }
        System.out.println("}");

        //Comprobar si hay algún valor repetido en alguna celda.
        boolean repetido = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    repetido = true;
                }
            }
        }

        if (repetido) {
            System.out.println("Hay caracteres repetidos.");
        } else {
            System.out.println("No hay caracteres repetidos.");
        }

        sc.close();
    }
}
