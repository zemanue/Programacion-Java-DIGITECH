
/*1.Se pide por pantalla el radio de un circulo, se calcula su área. 
Mostrar el resultado aplicando una función para redondear el valor.
*/

import java.util.Scanner;

public class MathAreaCirculo {
    public static void main(String[] args) {
        
        System.out.println("Vamos a calcular el área de un círculo. Para eso, necesitamos la longitud de su radio.");
        //Pedimos la unidad de medida
        System.out.println("Escribe primero la unidad de medida (mm, cm, m...):");
        Scanner unidadScanner = new Scanner(System.in);
        String unidadMedida = unidadScanner.nextLine();

        //Pedimos la longitud del radio
        System.out.println("¿Cuánto mide el radio?");
        Scanner radioScanner = new Scanner(System.in);
        double radio = radioScanner.nextDouble();

        //Aplicamos la fórmula del área del círculo
        System.out.println("Aplicando la fórmula: Area = PI*radio^2");
        double area = Math.PI*Math.pow(radio, 2);

        //Pedimos nº de decimales a los que queremos redondear
        System.out.println("¿Quieres redondear la cantidad? Escribe a continuación el número de decimales que quieres conservar (si no quieres decimales, escribe 0): ");
        Scanner decimalesScanner=new Scanner(System.in);
        int decimales = decimalesScanner.nextInt();        

        //Convertimos el nº de decimales en el número que necesitamos para redondear: potencia de 10 (10^decimales)
        double decimalconvert = Math.pow(10, decimales);

        //Calculamos el resultado aproximado
        double areaRedondeada = (double)Math.round(area*decimalconvert)/decimalconvert;
        
        System.out.println("El área del círculo, redondeada a " + decimales + " decimales, es: " + areaRedondeada + " " + unidadMedida + "^2.");
        

        unidadScanner.close();
        radioScanner.close();
        decimalesScanner.close();


    }
}
