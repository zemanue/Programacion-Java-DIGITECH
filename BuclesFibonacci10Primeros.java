//2. Calcular los 10 primeros números de la serie de Fibonnaci. 

public class BuclesFibonacci10Primeros {
    public static void main(String[] args) {
        
        System.out.println("Los 10 primeros números de la sucesión de Fibonacci son: ");
        int num1, num2, siguiente;
        num1 = 0;
        num2 = 1;

        for (int contador = 0; contador < 10; contador++) {
            System.out.println (num1);
            siguiente = num1 + num2;
            num1 = num2; 
            num2 = siguiente;
        }
    }
}
