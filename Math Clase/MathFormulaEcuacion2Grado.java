/*4.(RETO) Diseña la fórmula de la ecuación de segundo grado:
x = (-b +- raíz cuadrada(b^2 - 4 * a * c)) / (2 * a)
 */
import java.util.Scanner;

public class MathFormulaEcuacion2Grado {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);

        //Pedimos los coeficientes a, b y c
        System.out.println("Vamos a aplicar la fórmula de la ecuación de segundo grado. Para ello, necesito los valores a, b y c.");
        System.out.println("Por ejemplo, para la ecuación 'x^2 - 4x + 2 = 0', a=1, b=-4 y c=2.");
        System.out.println("Escribe el coeficiente a:");
        double a = sc.nextDouble();
        System.out.println("Escribe el coeficiente b:");
        double b = sc.nextDouble();
        System.out.println("Escribe el coeficiente c:");
        double c = sc.nextDouble();

        // Calculamos el discriminante (lo que contiene la raíz cuadrada)
        double discriminante = b * b - 4 * a * c;
        System.out.println("El discriminante es igual a " + discriminante);

        //Si el discriminante es mayor que 0, tiene 2 soluciones:
        if (discriminante > 0) {
            System.out.println("Como da un resultado positivo, las dos raíces son reales y distintas:");
            double soluc1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double soluc2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Solución 1: " + soluc1);
            System.out.println("Solución 2: " + soluc2);
        }
        //Si el discriminante es igual a 0, tiene 1 solución: 
        else if (discriminante == 0) {
            // Raíces reales e iguales
            double solucion = -b / (2 * a);
            System.out.println("Como es igual a 0, la ecuación solo tiene una solución:");
            System.out.println("Solución: " + solucion);
        } 
        //Si el discriminante es menor que 0, son 
        else {
            // Raíces complejas
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(Math.abs(discriminante)) / (2 * a);
            System.out.println("Como tiene un resultado negativo, las raíces son complejas conjugadas:");
            System.out.println("Solución 1: " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("Solución 2: " + parteReal + " - " + parteImaginaria + "i");
        }

        sc.close();

    }
}