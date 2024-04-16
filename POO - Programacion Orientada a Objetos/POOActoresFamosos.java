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
    String nombreActor = "0", respuesta = "0"; //Evita errores al poner estas variables como condición en los bucles
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
                System.out.println("Saliendo al menú.");
                break;
            } else {
                listaActores.add(nombreActor);
                System.out.println("Nombre registrado.");
            }
        }
        if (!nombreActor.equalsIgnoreCase("salir")) {
            System.out.println("Nuevos nombres agregados. Volvemos al menú.");
        }        
    }

    public void modificarNombres() {
        if (listaActores.isEmpty()) { //Si la lista está vacía, enviar de nuevo al menú.
            System.out.println("No hay ningún nombre registrado en la lista. Escriba '1' para agregar algún nombre primero.");
        } else {
            boolean repetir;
            System.out.println("Modificar un nombre.");
            do {
                repetir = false;
                System.out.println("La lista tiene actualmente " + listaActores.size() + " posiciones. Escriba la posición en la que está registrado el nombre que desea modificar (1, 2, 3, 4...):");
                posicion = sc.nextInt() - 1;
                sc.nextLine(); // Consumir la nueva línea después de nextInt()
                if (posicion+1 > listaActores.size() || posicion+1 <= 0) {
                    System.out.println("La posición indicada no existe en la lista actualmente. Debe ser un número entre 1 y " + listaActores.size() + ".");
                    repetir = true;
                } else {                                        
                    System.out.println("El nombre asignado en esa posición es: " + listaActores.get(posicion));
        
                    System.out.println("Escriba ahora por qué nombre lo quiere modificar.");
                    System.out.println("¿No es el nombre que buscaba? Escriba 'no' para escribir otra posición, o 'salir' si quiere cancelar la operación y volver al inicio.");
                    respuesta = sc.nextLine();
                    // if else para posibles respuestas: 'no', 'salir' u otras combinaciones para modificar el nombre.
                    if (respuesta.equalsIgnoreCase("no")) { //Si el usuario teclea 'no', se vuelve a pedir la posición.
                        System.out.println("Buscando otro nombre de la lista.");
                        repetir = true;
                    } else if (respuesta.equalsIgnoreCase("salir")) { //Si se escribe 'salir', se sale de nuevo al menú
                        System.out.println("Volviendo al menú.");
                    } else { //Si teclea cualquier valor que no sea 'n' o 'salir', se registra el nombre.
                        listaActores.set(posicion, respuesta);
                        System.out.println("Nombre modificado.");
                    }
                }
            } while (repetir);
        }
    }

/*    public void borrarNombres() {
        if (listaActores.isEmpty()) { //Si la lista está vacía, enviar de nuevo al menú.
            System.out.println("No hay ningún nombre registrado en la lista. Escriba '1' para agregar algún nombre primero.");
        } else {

        }
    }

    public String buscarNombre() {
                if (listaActores.isEmpty()) { //Si la lista está vacía, enviar de nuevo al menú.
            System.out.println("No hay ningún nombre registrado en la lista. Escriba '1' para agregar algún nombre primero.");
        } else {
            return ;
        }
    }
*/
    public void visualizarNombres() {
        if (listaActores.isEmpty()) { //Si la lista está vacía, enviar de nuevo al menú.
            System.out.println("No hay ningún nombre registrado en la lista. Escriba '1' para agregar algún nombre primero.");
        } else {
            System.out.println("Visualizar nombres. Estos son los nombres que están registrados en la lista actualmente: ");
            System.out.println(listaActores);
        }
    }

/*    public void visualizarCantantes() {
        if (listaActores.isEmpty()) { //Si la lista está vacía, enviar de nuevo al menú.
            System.out.println("No hay ningún nombre registrado en la lista. Escriba '1' para agregar algún nombre primero.");
        } else {
            
        }
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
                listaActores.modificarNombres();
                break;   
            case 3:
                //listaActores.borrarNombres();
                break;  
            case 4:
                //listaActores.buscarNombre();
                break; 
            case 5:
                listaActores.visualizarNombres();
                break; 
            case 6:
                //listaActores.visualizarCantantes();
                break;
            case 7:
                listaActores.salir();
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
