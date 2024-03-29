import java.util.Scanner;
public class ExpresionTernariaParImpar {

    public static void main(String[] args) {
        System.out.println("Escribe un número para saber si es par o impar:");
        Scanner datoScanner = new Scanner (System.in);
        int num1 = datoScanner.nextInt();

        int residuo = num1%2;

        //Expresión ternaria: (condición) ? "Valor si verdadera" : "Valor si falsa";
        String mensaje = (residuo == 0) ? "El número "+ num1 +" es par." : "El número "+ num1 +" es impar.";

        System.out.println(mensaje);


        datoScanner.close();
    }
}