/**
1.Programa que tome como dato de entrada un número que corresponde a la longitud del radio
una esfera y nos calcula y escribe el volumen de la esfera que se corresponden con dicho radio.
La fórmula para calcular el volumen de la esfera es:
v = (4/3)*PI*r^3
 */
import java.util.Scanner;

public class MathVolumenEsfera {

    public static void main(String[] args) {
        System.out.println("Déjame que calcule el volumen de la esfera por ti.");
        //Pedimos radio de la esfera
        System.out.println("Escribe a continuación el radio de la esfera:");
        Scanner radioScanner=new Scanner(System.in);
        double radio = radioScanner.nextDouble();
        //Pedimos unidad de medida
        System.out.println("Escribe también la unidad de medida (mm, cm, m...):");
        Scanner unidadScanner = new Scanner(System.in);
        String unidadMedida = unidadScanner.nextLine();

        //Aplicamos la fórmula del volumen de la esfera
        System.out.println("Aplicando la fórmula: v = (4/3)*PI*radio^3");
        double volumen = (4/3)*Math.PI*Math.pow(radio, 3);

        System.out.println("El volumen de la esfera es " + volumen + " " + unidadMedida + "^3.");

        //Pedimos nº de decimales a los que queremos redondear
        System.out.println("¿Quieres redondear la cantidad? Escribe a continuación el número de decimales que quieres conservar (si no quieres decimales, escribe 0): ");
        Scanner decimalesScanner=new Scanner(System.in);
        int decimales = decimalesScanner.nextInt();
        
        //Convertimos el nº de decimales en el número que necesitamos para redondear: potencia de 10 (10^decimales)
        double decimalconvert = Math.pow(10, decimales);

        //Calculamos el resultado aproximado
        double volRedondeado = (double)Math.round(volumen*decimalconvert)/decimalconvert;

        System.out.println("El volumen de la esfera, redondeado a " + decimales + " decimales, es: " + volRedondeado + " " + unidadMedida + "^3.");


        radioScanner.close();
        unidadScanner.close();
        decimalesScanner.close();
    }
}