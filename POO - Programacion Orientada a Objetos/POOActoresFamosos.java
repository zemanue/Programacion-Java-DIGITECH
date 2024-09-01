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
    - comenzar (): se ejecuta la opción seleccionada. Se debe utilizar switch
    - Main(): se crea el objeto y llama a al método menu().
- Clase ListaDeActores.
    Crearemos el ArrayList.
    Tendra los métodos que me realizan las distintas opciones. No tendremos nombres repetidos, 
    si ya existe me saldrá un mensaje de que no se puede insertar porque nombre de actor ya existe.
*/

import java.util.Scanner;
import java.util.ArrayList;

class Actor {
//nombreActor y esCantante con sus getters y setters.

    private String nombreActor;
    public String getNombreActor() {
        return nombreActor;
    }
    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    private boolean esCantante;
    public boolean getEsCantante() {
        return esCantante;
    }
    public void setEsCantante(boolean esCantante) {
        this.esCantante = esCantante;
    }

//Constructor
    public Actor(String nombreActor, boolean esCantante) {
        this.nombreActor = nombreActor;
        this.esCantante = esCantante;
    }
}

class ListaDeActores {

    ArrayList<Actor> listaActores = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String nombreActor;

    public void agregarNombre(String nombre, boolean esCantante) {
        for (Actor actor : listaActores) {
            if (actor.getNombreActor().equalsIgnoreCase(nombre)) {
                System.out.println("No se puede insertar porque el nombre del actor o actriz ya existe.");
                return;
            }
        }
        listaActores.add(new Actor(nombre, esCantante));
        System.out.println("Nombre agregado correctamente.");
    }

    public void modificarNombres(String nombreAnterior, String nombreNuevo) {
        for (Actor actor : listaActores) {
            if (actor.getNombreActor().equalsIgnoreCase(nombreAnterior)) {
                actor.setNombreActor(nombreNuevo);
                System.out.println("El nombre " + nombreNuevo + " se ha modificado correctamente por " + nombreNuevo + ".");
                return;
            }
        }
    }

    public void borrarNombres(String nombre) {
        for (Actor actor : listaActores) {
            if (actor.getNombreActor().equalsIgnoreCase(nombre)) { //Si coincide con algún elemento de la lista, se elimina el nombre
                listaActores.remove(actor);
                System.out.println("'" + actor.getNombreActor() + "' eliminado de la lista.");
                return;
            }
        }
        System.out.println("El nombre que intentas borrar no existe en la lista.");                        
    }

    public void buscarNombre(String nombre) {
        boolean coincide = false;
        // Comprobar si algún nombre coincide con el texto
        for (Actor actor : listaActores) {
            if (actor.getNombreActor().toLowerCase().contains(nombre.toLowerCase())) {
                coincide = true;
            }
        }
        if (!coincide) {
            System.out.println("No hay ningún nombre que coincida con el texto ingresado.");
        } else {
            System.out.println("Estos nombres coinciden con el texto ingresado, junto a su posición en la lista:");
            // Escribir todos los nombres que contengan el texto introducido por el usuario
            for (Actor actor : listaActores) {
                String nombreActor = actor.getNombreActor();
                if (nombreActor.toLowerCase().contains(nombre.toLowerCase())) {
                    System.out.println((listaActores.indexOf(actor) + 1) + "- " + nombreActor);
                }
            }
        }
    }

    public void visualizarNombres() {
        System.out.println("Visualizar nombres. ");
        System.out.println("La lista tiene " + listaActores.size() + " nombres registrados actualmente: ");
        for (Actor actor : listaActores) {
            String nombreActor = actor.getNombreActor();
            System.out.println((listaActores.indexOf(actor) + 1) + "- " + nombreActor);
        }
    }

    public void visualizarCantantes() {
        System.out.println("Cantidad de cantantes.");
        boolean hayCantantes = false;
        int numCantantes = 0;
        // Comprobar si algún nombre coincide con el texto
        for (Actor actor : listaActores) {
            if (actor.getEsCantante()) {
                hayCantantes = true;
                numCantantes++;
            }
        }
        if (!hayCantantes) {
            System.out.println("No hay ningún cantante en la lista actualmente.");
        } else {
            System.out.println("Hay " + numCantantes + " actores/actrices registrados que además son cantantes: ");
            // Escribir todos los nombres que contengan el texto introducido por el usuario
            for (Actor actor : listaActores) {
                String nombreActor = actor.getNombreActor();
                if (actor.getEsCantante()) {
                    System.out.println((listaActores.indexOf(actor) + 1) + "- " + nombreActor);
                }
            }
        }
    }

    public void salir() {
        System.out.println("Saliendo del programa.");
    }

}

public class POOActoresFamosos {

    ListaDeActores listaActores = new ListaDeActores();
    Scanner sc = new Scanner(System.in);

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

    public void estaLaListaVacia() {
        if (listaActores.listaActores.isEmpty()) {
            System.out.println("No hay ningún nombre registrado en la lista en este momento.");
            return;
        }
    }

    public void comenzar(int opcion) {
        boolean repetir;
        switch (opcion) {
            case 1:
                int numeroNombres;
                System.out.println("Agregar nombres.");
                System.out.println("¿Cuántos nombres quieres añadir?");
                numeroNombres = sc.nextInt();
                sc.nextLine(); // Consumir la nueva línea después de nextInt()
                System.out.println("Ahora introduce uno a uno los nombres que quiera agregar a la lista. Escribe 'salir' si quieres terminar antes.");                    
                //Bucle para escribir tantos nombres como haya indicado el usuario, comprobarlos y añadirlos si se da el caso.
                for (int i = 0; i < numeroNombres; i++) {
                    System.out.println("Siguiente nombre:");
                    String nombre = sc.nextLine();
                    if (nombre.equalsIgnoreCase("salir")) {
                        System.out.println("Saliendo al menú.");
                        return;
                    }
                    boolean cantanteSiONo = false;
                    do {
                        repetir = false;
                        System.out.println("¿Es cantante? (s/n)");
                        String respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("s")) {
                            cantanteSiONo = true;
                            listaActores.agregarNombre(nombre, cantanteSiONo);
                        } else if (respuesta.equalsIgnoreCase("n")) {
                            cantanteSiONo = false;
                            listaActores.agregarNombre(nombre, cantanteSiONo);
                        } else {
                            System.out.println("El texto introducido no es válido. Escribe 's' para decir que sí, o 'n' para decir que no.");
                            repetir = true;
                        }
                    } while (repetir);
                }    
                break;

            case 2:
                estaLaListaVacia();
                if (!listaActores.listaActores.isEmpty()) {
                    String nombreAnterior, nombreNuevo;
                    System.out.println("Modificar un nombre.");
                    do {
                        repetir = false;
                        System.out.println("Ingrese el nombre del actor a modificar (o escribe 'salir' si quieres volver al menú): ");
                        nombreAnterior = sc.nextLine(); // Se introduce el nombre del actor a modificar
                        if (nombreAnterior.equalsIgnoreCase("salir")) {
                            System.out.println("Volviendo al menú. Ningún nombre se ha modificado.");
                            return;
                        }
                        for (Actor actor : listaActores.listaActores) {
                            if (actor.getNombreActor().equalsIgnoreCase(nombreAnterior)) {
                                System.out.println("'" + actor.getNombreActor() + "' existe en la lista. Ingrese ahora el nuevo nombre del actor/actriz: ");
                                nombreNuevo = sc.nextLine(); // Se introduce el nuevo nombre del actor  
                                listaActores.modificarNombres(nombreAnterior, nombreNuevo);
                                return;
                            }
                        }
                        System.out.println("El nombre de actor que intenta modificar no existe en la lista.");
                        repetir = true;
                    } while (repetir);    
                }
                break;   

            case 3:
                estaLaListaVacia();
                if (!listaActores.listaActores.isEmpty()) {
                    String nombreActor;
                    System.out.println("Borrar nombres.");
                    // Bucle do while para pedir el nombre del empleado y comprobar si existe.
                    do {
                        repetir = false;
                        System.out.println(
                                "Escribe el nombre del empleado que quieres eliminar de la lista, o escribe 'salir' para volver.");
                        nombreActor = sc.nextLine();
                        if (nombreActor.equalsIgnoreCase("salir")) { // Si se escribe 'salir', se sale de nuevo al
                                                                     // inicio
                            System.out.println("Volviendo al inicio.");
                            return;
                        }
                        listaActores.borrarNombres(nombreActor);
                        System.out.println("¿Quieres continuar?");
                        repetir = true;
                    } while (repetir);
                }
                break;
                
            case 4:
                estaLaListaVacia();
                if (!listaActores.listaActores.isEmpty()) {
                    String nombreActor;
                    do {
                        repetir = false;
                        System.out.println("Escribe el nombre que quiera buscar, o escribe 'salir' volver al menú.");
                        nombreActor = sc.nextLine();
                        if (nombreActor.equalsIgnoreCase("salir")) {
                            System.out.println("Volviendo al inicio.");
                            return;
                        } else if (nombreActor.equals("")) { // Si el usuario no introduce ningún carácter
                            System.out.println("Debes escribir algún carácter.");
                            repetir = true;
                        } else {
                            listaActores.buscarNombre(nombreActor);
                            System.out.println("¿Quieres continuar?");
                            repetir = true;
                        }
                    } while (repetir);
                }
                break;
                
            case 5:
                estaLaListaVacia();
                if (!listaActores.listaActores.isEmpty()) {
                    listaActores.visualizarNombres();
                }
                break;

            case 6:
                estaLaListaVacia();
                if (!listaActores.listaActores.isEmpty()) {
                    listaActores.visualizarCantantes();
                }
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
