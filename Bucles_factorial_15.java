//3. Calcular el factorial del número 15.

public class Bucles_factorial_15 {
    public static void main(String[] args) {
        
        long factorial = 1;

        for (int num = 1; num <= 15; num++) {
            factorial *= num; 
        }
        System.out.println("El factorial de 15 es: " + factorial);
    }
}
