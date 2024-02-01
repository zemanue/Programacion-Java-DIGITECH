/*
2. Programa Java que calcule el área de un triángulo en función de las longitudes de sus lados (a, b, c), según la siguiente fórmula:
Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c))
donde p = (a+b+c)/2
Para calcular la raíz cuadrada se utiliza el método Math.sqrt()
*/

import java.util.Scanner;

public class MathAreaTriangulo {
    public static void main(String[] args) {
        
        System.out.println("Vamos a calcular el área de un triángulo. Para eso, necesitamos la longitud de sus tres ángulos.");
        //Pedimos unidad de medida
        System.out.println("Escribe primero la unidad de medida (mm, cm, m...):");
        Scanner unidadScanner = new Scanner(System.in);
        String unidadMedida = unidadScanner.nextLine();

        //Pedimos la longitud de a, b y c
        System.out.println("Escribe la longitud del lado 'a': ");
        Scanner ladoScanner = new Scanner(System.in);
        double a = ladoScanner.nextDouble();

        System.out.println("Escribe la longitud del lado 'b': ");
        double b = ladoScanner.nextDouble();

        System.out.println("Escribe la longitud del lado 'c': ");
        double c = ladoScanner.nextDouble();

        //Calculamos el perímetro
        double p = a+b+c;

        //Aplicamos la fórmula del área del triángulo
        System.out.println("Aplicando la fórmula: Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c))");
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("El área del triángulo es: " + area + " " + unidadMedida + "^2");

        //Pedimos nº de decimales a los que queremos redondear
        System.out.println("¿Quieres redondear la cantidad? Escribe a continuación el número de decimales que quieres conservar (si no quieres decimales, escribe 0): ");
        Scanner decimalesScanner=new Scanner(System.in);
        int decimales = decimalesScanner.nextInt();
        
        //Convertimos el nº de decimales en el número que necesitamos para redondear: potencia de 10 (10^decimales)
        double decimalconvert = Math.pow(10, decimales);

        //Calculamos el resultado aproximado
        double areaRedondeada = (double)Math.round(area*decimalconvert)/decimalconvert;

        System.out.println("El volumen de la esfera, redondeado a " + decimales + " decimales, es: " + areaRedondeada + " " + unidadMedida + "^3.");

        unidadScanner.close();
        ladoScanner.close();
        decimalesScanner.close();
    }
}
