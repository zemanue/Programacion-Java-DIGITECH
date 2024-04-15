/*
5. Desarrollar un programa que utilice: Realizar un programa que permita tener los nombres de los actores famosos.
Tendremos dos clases:
- Clase Principal:
    Tendrá los métodos:
    - menu(): realizar las siguientes acciones sobre la lista.
        1) Para agregar Nombres
        2) Para modificar Nombres.
        3) Para borrar Nombres.
        4) Para buscar Nombre y en que posición esta.
        5) Para visualizar Nombres.
        6) Cantidad de cantantes
        7) Salir.
        La variable será local.
    - comenzar (): se ejecuta la opción seleccionada. Se debe utizar switch
    - Main(): se crea el objeto y llama a al método menu().
- Clase ListaDeActores.
    Crearemos el ArrayList.
    Tendra los métodos que me realizan las distintas opciones. No tendremos nombres repetidos, 
    si ya existe me saldrá un mensaje de que no se puede insertar porque nombre de actor ya existe.
*/

import java.util.Scanner;
import java.util.ArrayList;

class ListaDeActores {

    ArrayList<String> listaActores = new ArrayList<>();

    public void agregarNombres() {

    }

    public void modificarNombres() {

    }

    public void borrarNombres() {

    }

    public String buscarNombre() {
        return ;
    }

    public String visualizarNombres() {
        return ;
    }

    public String visualizarCantantes() {
        return ;
    }

    public void salir(){

    }

}

public class POOActoresFamosos {
    


    public void menu() {

        System.out.println("Por favor, pulse uno de los siguientes números para hacer una acción:");
        System.out.println("- 1: Agregar nombres.");
        System.out.println("- 2: Modificar un nombre.");
        System.out.println("- 3: Borrar nombres.");
        System.out.println("- 4: Visualizar un nombre y en qué posición está.");
        System.out.println("- 5: Visualizar todos los nombres.");
        System.out.println("- 6: Visualizar la cantidad de cantantes.");
        System.out.println("- 7: Salir.");
    }

    public void comenzar(int opcion) {
        switch (opcion) {
            case 1:
                //agregarNombres()
                break;
            case 2:
                //modificarNombres()
                break;   
            case 3:
                //borrarNombres()
                break;  
            case 4:
                //buscarNombre()
                break; 
            case 5:
                //visualizarActores()
                break; 
            case 6:
                //visualizarCantantes()
                break;
            case 7:
                //salir()
                break;
            default:
            System.out.println("La opción elegida no es válida. Volviendo al inicio.");
            menu();
                break;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        ListaDeActores listaActores = new ListaDeActores();

        System.out.println("¡Bienvenido/a al programa de nombres de actores y actrices famosos/as!");
        
        do {
            
        
        //LLamar a menu()
        opcion = sc.nextInt();

        //Llamar a comenzar(opcion)
        //Según la opcion elegida, se ejecutará un método u otro.

        } while (opcion != 7);

        sc.close();
    }

}
