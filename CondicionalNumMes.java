/*
3.Crea un programa que pida al usuario un número de mes (por ejemplo, el 4) y escriba el nombre
del mes correspondiente (por ejemplo, "abril"). Debes usar la orden SWITCH.
 */

import java.util.Scanner;

public class CondicionalNumMes {
    public static void main(String[] args) {
        System.out.println("Escribe un número del 1 al 12 y te diré qué mes del año es:");
        Scanner entrada = new Scanner(System.in);
        int numMes = entrada.nextInt();        
    
        if (numMes==1) {
            System.out.println("Enero");
            }
        else if (numMes==2) {
            System.out.println("Febrero");                
            }
        else if (numMes==3) {
            System.out.println("Marzo");                
            }
        else if (numMes==4) {
            System.out.println("Abril");                
            }
        else if (numMes==5) {
            System.out.println("Mayo");                
            }
        else if (numMes==6) {
            System.out.println("Junio");                
            }
        else if (numMes==7) {
            System.out.println("Julio");                
            }
        else if (numMes==8) {
            System.out.println("Agosto");                
            }
        else if (numMes==9) {
            System.out.println("Septiembre");                
            }
        else if (numMes==10) {
            System.out.println("Octubre");                
            }
        else if (numMes==11) {
            System.out.println("Noviembre");                
            }
        else if (numMes==12) {
            System.out.println("Diciembre");                
            }                    
        else {
            System.out.println("El número introducido no es válido. Debe ser un número comprendido entre 1 y 12");
            }
        entrada.close();
    }
}
