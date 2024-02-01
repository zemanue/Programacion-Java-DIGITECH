import java.util.Scanner;
public class ScannerNombreYApellidos {
    public static void main(String[] args) {
        //Creamos un nuevo objeto de la clase Scanner de esta manera:
        Scanner entrada = new Scanner(System.in);
        
        //Para pedir los datos al usuario (cadena de texto) creamos una variable String y escribimos = entrada.nextLine();
        System.out.println ("Escribe tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.println ("Escribe ahora tu primer apellido: ");
        String apellido1 = entrada.nextLine();
        System.out.println ("Escribe ahora tu segundo apellido: ");
        String apellido2 = entrada.next();
        
        System.out.println("Buenos días, " + nombre + " " + apellido1 + " " + apellido2 + ".");
        
        /*Si quisiéramos pedir datos numéricos, escribiríamos:
        Entero: int entero = datosp.nextInt();
        Decimal: double decimal = datosp.nextDouble();
        */
        
        //Si queremos que no haya errores, HAY QUE CERRAR EL SCANNER con el método .close()
        entrada.close();
        }
}