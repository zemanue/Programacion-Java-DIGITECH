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
    
    public int pedirNumero() {
        int numPedido = sc.nextInt();
        return numPedido;
    }

    public int sumar(int a, int b) {
        int suma = a + b;
        System.out.println(a + " + " + b + " = ");
        return suma;
    }
    
    public int restar(int a, int b) {
        int resta = a - b;
        System.out.println(a + " - " + b + " = ");
        return resta;
    }

    public int multiplicar(int a, int b) {
        int multiplicacion = a * b;
        System.out.println(a + " * " + b + " = ");
        return multiplicacion;
    }

    public int dividir(int a, int b) {
        int division = a / b;
        System.out.println(a + " / " + b + " = ");
        return division;
    }
}

public class POOMetodosOperacionesMatematicas {
    public static void main(String[] args) {
        int num1, num2;
        OperacionesMatematicas Operacion1 = new OperacionesMatematicas();
        
        System.out.println("Escribe el primer número: ");
        num1 = Operacion1.pedirNumero();
        System.out.println("Escribe el segundo número: ");
        num2 = Operacion1.pedirNumero();
        
        System.out.println(Operacion1.sumar(num1, num2));
        System.out.println(Operacion1.restar(num1, num2));
        System.out.println(Operacion1.multiplicar(num1, num2));
        System.out.println(Operacion1.dividir(num1, num2));

        Operacion1.sc.close();
    }
}
