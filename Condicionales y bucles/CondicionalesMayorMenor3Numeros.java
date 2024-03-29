import java.util.Scanner;

public class CondicionalesMayorMenor3Numeros {

    public static void main(String[] args) {
        System.out.println("Escribe 3 números enteros para saber cuál es el número mayor y menor de los tres.");
        System.out.println("Escribe aquí el primer número:");              //Pedir el primer número
        Scanner datoScanner = new Scanner (System.in);
        int num1 = datoScanner.nextInt();

        System.out.println("Escribe aquí el segundo número:");             //Pedir el segundo número
        int num2 = datoScanner.nextInt();

        System.out.println("Escribe aquí el tercer número:");              //Pedir el tercer número
        int num3 = datoScanner.nextInt();

                                                                        //Condicional para saber cuál es el número mayor
        if (num1>num2 & num1>num3) {                                        //Si num1 es mayor que num2 y num3
            System.out.println (num1 + " es el número mayor.");              
        }
        else if (num2>num1 & num2>num3) {                                   //Si num2 es mayor que num1 y num3
            System.out.println (num2 + " es el número mayor.");
        }
        else if (num3>num1 & num3>num2) {                                   //Si num3 es mayor que num1 y num2 
            System.out.println (num3 + " es el número mayor.");              
        }            
        else {                                                              //Si hay 2 o 3 números iguales
            System.out.println("No hay un número mayor porque dos o más números son iguales."); 
        }
        
                                                                        //Condicional para saber cuál es el número menor
        if (num1<num2 & num1<num3) {                                        //Si num1 es menor que num2 y num3
            System.out.println (num1 + " es el número menor.");              
        }
        else if (num2<num1 & num2<num3) {                                   //Si num2 es menor que num1 y num3
            System.out.println (num2 + " es el número menor.");
        }
        else if (num3<num1 & num3<num2) {                                   //Si num3 es menor que num1 y num2 
            System.out.println (num3 + " es el número menor.");              
        }
        else {                                                              //Si hay 2 o 3 números iguales
            System.out.println("No hay un número menor porque dos o más números son iguales."); 
        }

        datoScanner.close();
    }
}