/* 
1.Diseña un programa que divide dos números. El código tiene que contemplar:
- Que el segundo número no sea cero
- Que el primer número no sea cero ni menor que cero
- Que el primer valor sea menor que 100
*/

package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionesDividirDosNumeros {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Inserte a continuación dos números para dividirlos.");
            System.out.print("Dividendo (debe ser mayor que 0 y menor que 100): ");
            double dividendo = sc.nextDouble();
            if (dividendo <= 0 || dividendo >= 100) {
                throw new IllegalArgumentException("El número debe ser mayor que 0 y menor que 100.");
            }

            System.out.print("Divisor: ");
            double divisor = sc.nextDouble();
            if (divisor == 0) {
                throw new IllegalArgumentException("Error: no se puede dividir entre 0.");
            }

            double cociente = dividendo / divisor;
            System.out.println("Resultado: " + dividendo + " / " + divisor + " = " + cociente);

        } catch (InputMismatchException e) {
            System.err.println("Error: Se debe introducir un número entero o decimal.");
        } finally {
            sc.close();
        }
    }
}
