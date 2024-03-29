import java.util.Scanner;
public class ExpresionTernariaMayorMenor2Numeros {
    public static void main(String[] args) {
        System.out.println("Escribe 2 números enteros para saber cuál es el número mayor y menor de los dos.");
        System.out.println("Escribe aquí el primer número:");              
        Scanner sc = new Scanner (System.in);
        int num1 = sc.nextInt();

        System.out.println("Escribe aquí el segundo número:");             
        int num2 = sc.nextInt();

        //Expresiones ternarias
        int menor = (num1 < num2) ? num1 : num2; //Si num1 < num2, menor = num1; si no, menor = num2
        int mayor = (num1 > num2) ? num1 : num2; //Si num1 > num2, mayor = num1; si no, mayor = num2

        //Nota: la siguiente estructura condicional es mejor utilizarla con un IF/ELSE, ya que no creamos ninguna variable. No es útil complicarse intentar hacerla con una expresión ternaria.
        if (num1==num2) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("El número menor es: " + menor);
            System.out.println("El número mayor es: " + mayor);
        }

        sc.close();
    }
}
