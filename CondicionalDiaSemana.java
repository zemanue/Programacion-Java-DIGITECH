/**
2.Crea una variante del ejercicio 5.1, en la que emplees varios SI-ENTONCES en vez de SWITCH:
5.1.Haz un programa que pida un número al usuario un número de día de la semana (del 1 al 7) y
escriba el nombre de ese día (por ejemplo, "martes" para el día 2). Debes emplear la orden
SWITCH.
 */
import java.util.Scanner;

public class CondicionalDiaSemana {
    public static void main(String[] args) {
        System.out.println("Escribe un número del 1 al 7 y te diré el día de la semana que es:");
        Scanner entrada = new Scanner(System.in);
        int diaSemana = entrada.nextInt();

        if (diaSemana==1) {
            System.out.println("Lunes");
            }
        else if (diaSemana==2) {
            System.out.println("Martes");                
            }
        else if (diaSemana==3) {
            System.out.println("Miércoles");                
            }
        else if (diaSemana==4) {
            System.out.println("Jueves");                
            }
        else if (diaSemana==5) {
            System.out.println("Viernes");                
            }
        else if (diaSemana==6) {
            System.out.println("Sábado");                
            }
        else if (diaSemana==7) {
            System.out.println("Domingo");                
            }                                    
        else {
            System.out.println("El número introducido no es válido. Debe ser un número comprendido entre 1 y 7");
            }

        entrada.close();
    }
}