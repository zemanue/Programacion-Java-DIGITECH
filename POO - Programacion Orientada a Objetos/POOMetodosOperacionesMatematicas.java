/*
Realizar un programa calculadora que tendrá las siguientes características:
Realiza menú con las siguientes opciones:
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir.
Vamos a tener los siguientes métodos:
- pedirNumero.(pediremos un número y me devolverá dicho número).
- sumar.(introduciremos los dos números como parámetros y me devolverá la suma).
- restar.(introduciremos los dos números como parámetros y me devolverá la resta).
- multiplicar.(introduciremos los dos números como parámetros y me devolverá la multiplicación).
- dividir.(introduciremos los dos números como parámetros y me devolverá la división).
- En el main tendremos el menú y las llamadas a los métodos, imprimiremos por pantalla los resultados de los métodos anteriores, 
 */

import java.util.Scanner;

class OperacionesMatematicas {
    Scanner sc = new Scanner(System.in);
    
    public int pedirNumero(int numPedido) {
        numPedido = sc.nextInt();
        return numPedido;
    }
    
    public int sumar(int num1, int num2) {
        int suma = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = ");
        return suma;
    }
    
    public int restar(int num1, int num2) {
        int resta = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = ");
        return resta;
    }

    public int multiplicar(int num1, int num2) {
        int multiplicacion = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = ");
        return multiplicacion;
    }

    public int dividir(int num1, int num2) {
        int division = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = ");
        return division;
    }
}

public class POOMetodosOperacionesMatematicas {
    public static void main(String[] args) {

        OperacionesMatematicas Operacion1 = new OperacionesMatematicas();

        System.out.println(Operacion1.sumar(10, 5));
        System.out.println(Operacion1.restar(10, 5));
        System.out.println(Operacion1.multiplicar(10, 5));
        System.out.println(Operacion1.dividir(10, 5));

    }
}
