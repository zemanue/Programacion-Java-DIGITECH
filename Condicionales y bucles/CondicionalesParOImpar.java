import java.util.Scanner;
public class CondicionalesParOImpar {

    public static void main(String[] args) {
        System.out.println("Escribe un número para saber si es par o impar:");
        Scanner datoScanner = new Scanner (System.in);
        int num1 = datoScanner.nextInt();

        int residuo = num1%2;

        if (residuo == 0) {
            System.out.println("El número "+ num1 +" es par.");
        }
        else {
            System.out.println("El número "+ num1 +" es impar.");
        }

        datoScanner.close();
    }
}