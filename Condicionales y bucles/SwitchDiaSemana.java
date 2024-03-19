/*
1.Haz un programa que pida un número al usuario un número de día de la semana (del 1 al 7) y
escriba el nombre de ese día (por ejemplo, "martes" para el día 2). Debes emplear la orden
SWITCH.
 */

import java.util.Scanner;

public class SwitchDiaSemana {
    public static void main(String[] args) {
        System.out.println("Escribe un número del 1 al 7 y te diré el día de la semana que es:");
        Scanner entrada = new Scanner(System.in);
        int diaSemana = entrada.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");                
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;                                                                                        
            default:
            System.out.println("El número introducido no es válido. Debe ser un número comprendido entre 1 y 7");
                break;
        }

        entrada.close();
    }
}
