import java.util.Scanner;
public class CondicionalesMayorMenor2Numeros {
    public static void main(String[] args) {
        System.out.println("Escribe 2 números enteros para saber cuál es el número mayor y menor de los dos.");
        System.out.println("Escribe aquí el primer número:");              //Pedir el primer número
        Scanner datoScanner = new Scanner (System.in);
        int num1 = datoScanner.nextInt();

        System.out.println("Escribe aquí el segundo número:");             //Pedir el segundo número
        int num2 = datoScanner.nextInt();

        if (num1>num2) {                                                    //Condicional cuando num1 es mayor que num2
            System.out.println("El número " + num1 + " es mayor que el número " + num2);    
            System.out.println("El número " + num2 + " es menor que el número " + num1);
        }
        else if (num2>num1) {                                               //Condicional cuando num2 es mayor que num1
            System.out.println("El número " + num2 + " es mayor que el número " + num1);
            System.out.println("El número " + num1 + " es menor que el número " + num2);
        }
        else {                                                              //Condicional cuando los números son iguales
            System.out.println("Los números " + num1 + " y " + num2 + " son iguales.");
        }
        
        datoScanner.close();
    }
}
