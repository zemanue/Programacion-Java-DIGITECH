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
        System.out.print("La suma de " + a + " y " + b + " es: ");
        return suma;
    }
    
    public int restar(int a, int b) {
        int resta = a - b;
        System.out.print("La resta de " + a + " y " + b + " es: ");
        return resta;
    }

    public int multiplicar(int a, int b) {
        int multiplicacion = a * b;
        System.out.print("La multiplicación de " + a + " y " + b + " es: ");
        return multiplicacion;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            System.out.print("No se puede dividir entre ");
            return 0;
        } else {
            int division = a / b;
            System.out.print("La división de " + a + " y " + b + " es: ");
            return division;            
        }

    }
}

public class POOMetodosOperacionesMatematicas {
    public static void main(String[] args) {
        int opcion, num1, num2;
        OperacionesMatematicas operacion1 = new OperacionesMatematicas();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido/a al programa calculadora.");

        do {
        System.out.println("Escribe dos números para sumarlos, restarlos, multiplicarlos o dividirlos.");
        
        System.out.println("Primer número: ");
        num1 = operacion1.pedirNumero();
        System.out.println("Segundo número: ");
        num2 = operacion1.pedirNumero();

        System.out.println("¿Qué operación quieres hacer? Escribe el número de la opción que quieres elegir:");
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");
        System.out.println("5: Salir");

        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has elegido 'Sumar'");
                System.out.println(operacion1.sumar(num1, num2));
            break;        
            case 2:
                System.out.println("Has elegido 'Restar'");
                System.out.println(operacion1.restar(num1, num2));
            break;            
            case 3:
                System.out.println("Has elegido 'Multiplicar'");                
                System.out.println(operacion1.multiplicar(num1, num2));                
            break;
            case 4:
                System.out.println("Has elegido 'Dividir'");
                System.out.println(operacion1.dividir(num1, num2));                
            break;
            case 5:
                System.out.println("Has elegido 'Salir'. Vuelve cuando quieras.");

            break;
            
            default://Si la respuesta es diferente a los números especificados, repite el bucle.
            System.out.println("El número introducido no es válido (debe estar comprendido entre el 1 y el 5). Intentémoslo de nuevo.");
                break;
        }
    } while (opcion !=5);

        sc.close();
        operacion1.sc.close();
    }
}
