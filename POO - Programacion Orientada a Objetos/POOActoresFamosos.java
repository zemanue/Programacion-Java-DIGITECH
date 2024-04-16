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
    Scanner sc = new Scanner(System.in);
    String nombreActor;
    int numeroNombres, posicion;

    public void agregarNombres() {
        System.out.println("Agregar nombres.");
        System.out.println("¿Cuántos nombres quiere escribir?");
        numeroNombres = sc.nextInt();
        sc.nextLine(); // Consumir la nueva línea después de nextInt()
        System.out.println("Ahora introduzca uno a uno los nombres que quiera agregar a la lista. Escriba 'salir' si quiere terminar antes.");                    
        for (int i = 0; i < numeroNombres; i++) {
            nombreActor = sc.nextLine();
            if (nombreActor.equalsIgnoreCase("salir")) {
                System.out.println("Volviendo al inicio.");
                break;
            } else {
                listaActores.add(nombreActor);
                System.out.println("Nombre registrado.");
            }
        }
        System.out.println("Nuevos nombres agregados. Volvemos al menú.");
    }

/*     public void modificarNombres() {

    }

    public void borrarNombres() {

    }

    public String buscarNombre() {
        return ;
    }
*/
    public void visualizarNombres() {
        if (listaActores.isEmpty()) { //Si la lista está vacía, enviar de nuevo al inicio.
            System.out.println("No hay ningún empleado registrado en la lista. Escriba '1' para agregar algún nombre primero.");
        } else {
            System.out.println("Visualizar nombres. Estos son los nombres que están registrados en la lista: ");
            System.out.println(listaActores);
        }
    }

/*    public void visualizarCantantes() {

    }*/

    public void salir(){
        System.out.println("Saliendo del programa.");
    }

}

public class POOActoresFamosos {

    ListaDeActores listaActores = new ListaDeActores();

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
                listaActores.agregarNombres();
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
                listaActores.visualizarNombres();
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
        POOActoresFamosos actoresFamosos = new POOActoresFamosos();

        System.out.println("¡Bienvenido/a al programa de nombres de actores y actrices famosos/as!");
        
        do {

        //LLamar a menu()
        actoresFamosos.menu();
        opcion = sc.nextInt();

        //Llamar a comenzar(opcion)
        actoresFamosos.comenzar(opcion);
        //Según la opcion elegida, se ejecutará un método u otro.

        } while (opcion != 7);

        System.out.println("Gracias por participar. Vuelve cuando quieras.");

        sc.close();
    }

}
