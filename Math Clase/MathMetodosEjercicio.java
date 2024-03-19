/**
2. Dado el siguiente código, diseña el enunciado del ejercicio y explica el flujo  del código.
 */
public class MathMetodosEjercicio {
    public static void main(String[] args) {
        
        /*Elabora un programa que utilice métodos de la clase Math para:
        - Generar un número aleatorio
        - Obtener el valor absoluto de -123
        - Redondear el número 123.567
        - Hacer la potencia "2^4"
        - Obtener el valor máximo entre los siguientes números escritos en notación científica: 1e10 y 3e9.
        */

        //Se crean las variables
        int x;
        double rand, y, z;
        float max;

        //Se realizan las operaciones y se asignan un valor a las variables.
        rand = Math.random();
        x = Math.abs(-123);
        y = Math.round(123.567);
        z = Math.pow(2, 4);
        max = Math.max((float)1e10, (float)3e9);

        //Se muestran los resultados
        System.out.println(rand);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(max);
    }
}