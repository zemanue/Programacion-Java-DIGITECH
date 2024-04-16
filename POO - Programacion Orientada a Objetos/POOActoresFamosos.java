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

    public void agregarNombres() {
        int numeroNombres;
        System.out.println("Agregar nombres.");
        System.out.println("¿Cuántos nombres quieres escribir?");
        numeroNombres = sc.nextInt();
        sc.nextLine(); // Consumir la nueva línea después de nextInt()
        System.out.println("Ahora introduce uno a uno los nombres que quiera agregar a la lista. Escribe 'salir' si quieres terminar antes.");                    
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
            System.out.println("No hay ningún nombre registrado en la lista. Escribe '1' para agregar algún nombre primero.");
            return;
        }
        boolean repetir;
        System.out.println("Modificar un nombre.");
        do {
            repetir = false;
            System.out.println("La lista tiene actualmente " + listaActores.size() + " posiciones. Escribe la posición en la que está registrado el nombre que deseas modificar (1, 2, 3, 4...):");
            int posicion = sc.nextInt() - 1;
            sc.nextLine(); // Consumir la nueva línea después de nextInt()
            if (posicion+1 > listaActores.size() || posicion+1 <= 0) {
                System.out.println("La posición indicada no existe en la lista actualmente. Debe ser un número entre 1 y " + listaActores.size() + ".");
                repetir = true;
            } else {                                        
                System.out.println("El nombre asignado en esa posición es: " + listaActores.get(posicion));
    
                System.out.println("Escribe ahora por qué nombre lo quieres modificar.");
                System.out.println("¿No es el nombre que buscabas? Escribe 'no' para escribir otra posición, o 'salir' si quieres cancelar la operación y volver al inicio.");
                String respuesta = sc.nextLine();
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

    public void borrarNombres() {
        if (listaActores.isEmpty()) { //Si la lista está vacía, enviar de nuevo al menú.
            System.out.println("No hay ningún nombre registrado en la lista. Escribe '1' para agregar algún nombre primero.");
        } else {
            boolean repetir;
            System.out.println("Borrar nombres.");
            do {
                repetir = false;
                System.out.println("Escribe '1' para borrar por posiciones, '2' para borrar por nombre, o 'salir' para cancelar la operación y volver al menú.");
                String respuesta = sc.nextLine();
                    //Opción 1: borrar por posición
                    if (respuesta.equals("1")) {
                        System.out.println("Borrar por posición.");
                        //Bucle do while para volver a pedir la posición del empleado.
                        do {
                            repetir = false;                            
                            System.out.println("Hay " + listaActores.size() + " nombres registrados.");
                            System.out.println("Escribe la posición en la que está registrado el nombre que deseas borrar (1, 2, 3...):");
                            int posicion = sc.nextInt() - 1;
                            sc.nextLine(); // Consumir la nueva línea después de nextInt()

                            //Si la posición es >= listaActores.size() ó < 0, se pide de nuevo la posición (vuelta al comienzo del do while)
                            if (posicion >= listaActores.size() || posicion < 0) {
                                System.out.println("Debe ser un número comprendido entre 1 y " + listaActores.size() + " (el tamaño de la lista actualmente).");
                                repetir = true;

                            //Si el número es válido    
                            } else {
                                System.out.println("El nombre asignado en esa posición es: " + listaActores.get(posicion));
                                System.out.println("¿Es el nombre que buscabas? Escribe 's' para eliminarlo, 'n' para escribir otra posición, o 'salir' para cancelar la operación y volver al inicio.");
                                respuesta = sc.nextLine();
                                // if else para posibles respuestas: 's' para eliminar el nombre; 'n' para volver a pedir la posición, 'salir' para volver al inicio
                                if (respuesta.equalsIgnoreCase("s")) {
                                    listaActores.remove(posicion);
                                    System.out.println("Nombre eliminado. ¿Quieres seguir eliminando nombres? Escribe 's' para continuar, o cualquier otro texto para terminar y volver al inicio.");
                                    respuesta = sc.nextLine();
                                    if (respuesta.equalsIgnoreCase("s")) {
                                        repetir = true;
                                    } else {
                                    System.out.println("Volviendo al inicio.");
                                    }
                                } else if (respuesta.equalsIgnoreCase("n")) { //Si el usuario teclea 'n', se vuelve a pedir la posición.
                                    System.out.println("Buscando otra posición de la lista.");
                                    repetir = true;
                                } else if (respuesta.equalsIgnoreCase("salir")) { //Si se escribe 'salir', se sale de nuevo al inicio
                                    System.out.println("Volviendo al inicio.");
                                } else { //Si teclea cualquier valor que no sea 's', 'n' o 'salir', se vuelve a pedir la posición.
                                    System.out.println("No has introducido ningún carácter incluido en las opciones ('s', 'n' o 'salir').");
                                    repetir = true;
                                }
                            }
                        } while (repetir);

                    //Opción 2: borrar por nombre
                    } else if (respuesta.equals("2")) {
                        System.out.println("Borrar por nombre");
                        //Bucle do while para volver a pedir el nombre del empleado, exista o no exista el nombre.
                        do {
                            repetir = false;
                            System.out.println("Escribe el nombre del empleado que quieres eliminar de la lista, o escribe 'salir' para volver.");
                            nombreActor = sc.nextLine();
                            
                            if (nombreActor.equalsIgnoreCase("salir")) { //Si se escribe 'salir', se sale de nuevo al inicio
                                System.out.println("Volviendo al inicio.");
                                break;
                            } else if (listaActores.contains(nombreActor.toLowerCase())) {   //Si coincide con algún elemento de la lista, se elimina el nombre y se pide otro nombre.
                                listaActores.remove(nombreActor);
                                System.out.println("'" + nombreActor + "' eliminado de la lista. ¿Quieres continuar?");
                                repetir = true;
                            } else{   //Si no coincide, se avisa y se vuelve a pedir el nombre.
                                System.out.println("El nombre indicado no está en la lista.");
                                System.out.println("Si quieres consultar qué nombres hay en la lista, puedes elegir la opción 4 o 5 del menú.");
                                System.out.println("Volviendo al menú.");
                            }
                        } while (repetir);                        
                        
                    } else if (respuesta.equalsIgnoreCase("salir")) { //Si se escribe 'salir', se sale de nuevo al inicio
                            System.out.println("Volviendo al inicio.");
                    } else {
                            System.out.println("Introduce un número válido.");
                            repetir = true;
                    }

            } while (repetir);
        }
    }

    public void buscarNombre() {
        if (listaActores.isEmpty()) { 
            System.out.println("No hay ningún nombre registrado en la lista. Escribe '1' para agregar algún nombre primero.");
            return;
        }
        System.out.println("Buscar por nombre.");
        boolean repetir;
        do {
            System.out.println("Escribe el nombre que quiera buscar, o escribe 'salir' si quieres terminar de buscar.");
            nombreActor = sc.nextLine();
            if (nombreActor.equalsIgnoreCase("salir")) {
                repetir = false;
                System.out.println("Volviendo al inicio.");
            } else if (nombreActor.equals("")) { //Si el usuario no introduce ningún carácterç
                repetir = true;
                System.out.println("Debes escribir algún carácter.");
            } else {                   
                repetir = true;
                boolean coincide = false;                    
                //Comprobar si algún nombre coincide con el texto
                for (String actores : listaActores) {
                    if (actores.toLowerCase().contains(nombreActor.toLowerCase())) {
                        coincide = true;
                    }
                }                    
                if (!coincide) {
                    System.out.println("No hay ningún nombre que coincida con el texto ingresado.");
                } else {
                    System.out.println("Estos nombres coinciden con el texto ingresado:");
                    //Escribir todos los nombres que contengan el texto introducido por el usuario
                    for (int i = 0; i < listaActores.size(); i++) {
                        String actor = listaActores.get(i);
                        if (actor.toLowerCase().contains(nombreActor.toLowerCase())) {
                            System.out.println((i+1) + "- " + actor);
                        }
                    }
                }
            }
        } while (repetir);
    }

    public void visualizarNombres() {
        if (listaActores.isEmpty()) { 
            System.out.println("No hay ningún nombre registrado en la lista. Escribe '1' para agregar algún nombre primero.");
            return;
        }
        System.out.println("Visualizar nombres. Estos son los nombres que están registrados en la lista actualmente: ");
        System.out.println(listaActores);
    }

/*    public void visualizarCantantes() {
        if (listaActores.isEmpty()) { 
            System.out.println("No hay ningún nombre registrado en la lista. Escriba '1' para agregar algún nombre primero.");
            return;
        }
        
    }*/

    public void salir(){
        System.out.println("Saliendo del programa.");
    }

}

public class POOActoresFamosos {

    ListaDeActores listaActores = new ListaDeActores();

    public void menu() {

        System.out.println("Por favor, pulsa uno de los siguientes números para hacer una acción:");
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
                listaActores.borrarNombres();
                break;  
            case 4:
                listaActores.buscarNombre();
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
        actoresFamosos.menu();
        opcion = sc.nextInt();
        actoresFamosos.comenzar(opcion);
        } while (opcion != 7);

        System.out.println("Gracias por participar. Vuelve cuando quieras.");
        sc.close();
    }
}
