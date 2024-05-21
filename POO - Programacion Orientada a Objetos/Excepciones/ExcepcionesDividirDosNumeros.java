/* 
1.Diseña un programa que divide dos números. El código tiene que contemplar:
- Que el segundo número no sea cero
- Que el primer número no sea cero ni menor que cero
- Que el primer valor sea mayor que 100
*/

package Excepciones;

import java.util.Scanner;

public class ExcepcionesDividirDosNumeros {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte a continuación dos números para dividirlos.");
        System.out.print("Dividendo: ");
        double dividendo = sc.nextDouble();

        System.out.print("Divisor: ");
        double divisor = sc.nextDouble();

        double cociente = dividendo / divisor;
        System.out.println(dividendo + " / " + divisor + " = " + cociente);

        sc.close();
    }
}
