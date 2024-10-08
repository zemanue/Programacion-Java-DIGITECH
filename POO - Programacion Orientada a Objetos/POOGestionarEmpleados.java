/*
VERSIÓN ALTERNATIVA DE "ArrayListGestionarEmpleados", empleando POO (clases, métodos)... 
Debe tener las mismas funcionalidades: 
3. Realizar un programa para gestionar la lista de Empleados, en que tendremos el siguiente menú:
1. Agregar Nombres.
2. Modificar nombre
3. Borrar Nombres.
4. Visualizar un Nombre
5. Visualizar todos Nombres.
6. Salir.
Si se selecciona 1, nos pedirá cuantos nombres queremos introducir en el arraylist.
La opción 2 modificará los datos de un empleado.
La opción 3, nos dirá cómo queremos borrar, nos tiene que dar opción a borrar por posición o por nombre.
La opción 4 muestra un nombre, según la posición que queremos, hay que comprobar si la posición es correcta.
La opción 5 muestra por pantalla un listado de todos los empleados
Tras procesar cada opción, se debe mostrar de nuevo el menú inicial, hasta que se seleccione la opción 6, que terminará el programa.
 */

import java.util.*;

class Empleado {
    private String nombre;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado(String nombre) {
        setNombre(nombre);
    }
}

public class POOGestionarEmpleados {

    Scanner sc = new Scanner(System.in);
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public void menu() {
        System.out.println("Por favor, pulse uno de los siguientes números para hacer una acción:");
        System.out.println("- 1: Agregar nombres.");
        System.out.println("- 2: Modificar un nombre.");
        System.out.println("- 3: Borrar nombres.");
        System.out.println("- 4: Visualizar un nombre.");
        System.out.println("- 5: Visualizar todos los nombres.");
        System.out.println("- 6: Salir.");
    }

    public void comenzar(int opcion) {
        switch (opcion) {
            case 1:
                agregarNombres();
                break;
            case 2:
                estaLaListaVacia();
                if (!listaEmpleados.isEmpty())
                    modificarUnNombre();
                break;
            case 3:
                estaLaListaVacia();
                if (!listaEmpleados.isEmpty())
                    borrarNombres();
                break;
            case 4:
                estaLaListaVacia();
                if (!listaEmpleados.isEmpty())
                    visualizarUnNombre();
                break;
            case 5:
                estaLaListaVacia();
                if (!listaEmpleados.isEmpty())
                    visualizarTodosLosNombres();
                break;
            case 6: // SALIR
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("La opción elegida no es válida. Volviendo al menú.");
                menu();
                break;
        }
    }

    public void estaLaListaVacia() {
        if (listaEmpleados.isEmpty()) { // Si la lista está vacía, enviar de nuevo al inicio.
            System.out.println(
                    "No hay ningún nombre registrado en la lista. Escriba '1' para agregar algún nombre primero.");
            return;
        }
    }

    public void agregarNombres() {
        int numeroNombres;
        System.out.println("Agregar nombres.");
        do {
            System.out.println("¿Cuántos nombres quiere escribir?");
            numeroNombres = sc.nextInt();
            if (numeroNombres == 0) {
                System.out.println("No se ha agregado ningún nombre.");
                return;
            } else if (numeroNombres < 0)
                System.out.println("Número no válido.");
        } while (numeroNombres < 0);
        sc.nextLine(); // Consumir la nueva línea después de nextInt()
        System.out.println(
                "Ahora introduzca uno a uno los nombres que quiera agregar a la lista. Escriba 'salir' si quiere terminar antes.");
        for (int i = 0; i < numeroNombres; i++) {
            String nombreEmpleado = sc.nextLine();
            if (nombreEmpleado.equalsIgnoreCase("salir")) {
                System.out.println("Volviendo al inicio.");
                return;
            } else {
                listaEmpleados.add(new Empleado(nombreEmpleado));
                System.out.println("Nombre registrado.");
            }
        }
        System.out.println("Nuevos nombres añadidos.");
    }

    public void modificarUnNombre() {
        System.out.println("Modificar un nombre.");
        String respuesta = "0";
        boolean repetir;
        System.out.println("Hay " + listaEmpleados.size() + " nombres registrados.");
        do {
            repetir = false;
            System.out.println(
                    "Escriba la posición en la que está registrado el nombre que desea modificar (1, 2, 3...):");
            int posicion = sc.nextInt();
            // Si el número es < 0 ó > empleados.size(), se pide de nuevo la posición
            // (vuelta al comienzo del do while)
            if (posicion < 1 || posicion > listaEmpleados.size()) {
                System.out.println("Debe ser un número comprendido entre 1 y " + listaEmpleados.size()
                        + " (el tamaño de la lista actualmente).");
                repetir = true;
            // Si el número es válido
            } else {
                sc.nextLine(); // Consumir la nueva línea después de nextInt()                
                String nombreEmpleado = listaEmpleados.get(posicion - 1).getNombre();
                System.out.println(
                        "El nombre asignado en esa posición es: " + nombreEmpleado);
                System.out.println("Escriba ahora por qué nombre lo quiere modificar.");
                System.out.println(
                        "¿No es el nombre que buscaba? Escriba 'n' para escribir otra posición, o 'salir' si quiere cancelar la operación y volver al inicio.");
                respuesta = sc.nextLine();
                // if else para posibles respuestas: 'n', 'salir' u otras combinaciones para
                // registrar modificar el nombre.
                if (respuesta.equalsIgnoreCase("n")) { // Si el usuario teclea 'n', se vuelve a pedir la posición.
                    System.out.println("Buscando otro nombre de la lista.");
                    repetir = true;
                } else if (respuesta.equalsIgnoreCase("salir")) { // Si se escribe 'salir', se sale de nuevo al
                                                                  // inicio
                    System.out.println("Volviendo al inicio.");
                    return;
                } else { // Si teclea cualquier valor que no sea 'n' o 'salir', se registra el nombre.
                    listaEmpleados.get(posicion - 1).setNombre(respuesta);
                    System.out.println("El nombre '" + nombreEmpleado + "' ha sido modificado por '" + respuesta + "'.");
                    System.out.println("Volviendo al inicio.");
                    return;
                }
            }
        } while (repetir);
    }

    public void borrarNombres() {
        System.out.println("Borrar nombres.");
        String respuesta = "";
        do {
            System.out.println(
                    "Escriba '1' para borrar por posiciones, '2' para borrar por nombre, o 'salir' para cancelar la operación y volver al inicio.");
            respuesta = sc.nextLine();
            if (respuesta.equals("1")) {
                borrarPorPosicion();
                return;
            } else if (respuesta.equals("2")) {
                borrarPorNombre();
                return;
            } else if (respuesta.equalsIgnoreCase("salir")) { // Si se escribe 'salir', se sale de nuevo al
                                                              // inicio
                System.out.println("Volviendo al inicio.");
            } else {
                System.out.println("Introduzca un número válido.");
            }
        } while (!respuesta.equalsIgnoreCase("salir"));
    }

    public void borrarPorPosicion() {
        System.out.println("Borrar por posición.");
        String respuesta = "";
        do {
            System.out.println("Hay " + listaEmpleados.size() + " nombres registrados.");
            System.out.println(
                    "Escriba la posición en la que está registrado el nombre que desea borrar (1, 2, 3...):");
            int posicion = sc.nextInt();
            sc.nextLine();
            // Si el número es < 1 ó > empleados.size(), se pide de nuevo la posición
            if (posicion < 1 || posicion > listaEmpleados.size()) {
                System.out.println("Debe ser un número comprendido entre 1 y " + listaEmpleados.size()
                        + " (el tamaño de la lista actualmente).");
            } else {
                String nombreEmpleado = listaEmpleados.get(posicion - 1).getNombre();
                System.out.println(
                        "El nombre asignado en esa posición es: " + nombreEmpleado);
                System.out.println(
                        "¿Es el nombre que buscaba? Escriba 's' para eliminarlo, 'n' para escribir otra posición, o 'salir' para cancelar la operación y volver al inicio.");
                respuesta = sc.nextLine();
                if (respuesta.equalsIgnoreCase("s")) {
                    listaEmpleados.remove(posicion - 1);
                    System.out.println(
                            "'" + nombreEmpleado + "' eliminado de la lista.");
                    return;
                } else if (respuesta.equalsIgnoreCase("n")) { // Si el usuario teclea 'n', se vuelve a
                                                              // pedir la posición.
                    System.out.println("Buscando otra posición de la lista.");
                } else if (respuesta.equalsIgnoreCase("salir")) { // Si se escribe 'salir', se sale de
                                                                  // nuevo al inicio
                    System.out.println("Volviendo al inicio.");
                    return;
                } else { // Si teclea cualquier valor que no sea 's', 'n' o 'salir', se vuelve a pedir
                         // la posición.
                    System.out.println(
                            "No ha introducido carácter incluido en las opciones ('s', 'n' o 'salir').");
                }
            }
        } while (!respuesta.equalsIgnoreCase("salir"));

    }

    public void borrarPorNombre() {
        System.out.println("Borrar por nombre");
        String nombreEmpleado = "";
        // Bucle do while para volver a pedir el nombre del empleado, exista o no exista
        // el nombre.
        do {
            System.out.println(
                    "Escriba el nombre del empleado que quiere eliminar de la lista, o escriba 'salir' para volver.");
            nombreEmpleado = sc.nextLine();

            if (nombreEmpleado.equalsIgnoreCase("salir")) { // Si se escribe 'salir', se sale de nuevo
                                                            // al inicio
                System.out.println("Volviendo al inicio.");
                return;
            }
            boolean coincide = false;
            for (Empleado empleado : listaEmpleados) {
                if (empleado.getNombre().equalsIgnoreCase(nombreEmpleado)){
                    coincide = true;
                    listaEmpleados.remove(empleado);
                    System.out.println("'" + nombreEmpleado + "' eliminado de la lista.");
                    return;
                }
            }
            if (!coincide) {
                System.out.println("El nombre indicado no está en la lista.");
            }
        } while (!nombreEmpleado.equalsIgnoreCase("salir"));
    }

    public void visualizarUnNombre() {
        int posicion;
        System.out.println("Visualizar un nombre.");
        System.out.println("Hay " + listaEmpleados.size() + " nombres registrados.");
        do {
            System.out.println(
                    "Indique la posición que desea visualizar (1, 2, 3...), o indique '0' si desea salir:");
            posicion = sc.nextInt();
            if (posicion == 0) {
                System.out.println("Volviendo al inicio");
            } else if (posicion < 1 || posicion > listaEmpleados.size()) {
                System.out.println("Debe ser un número comprendido entre 0 y " + listaEmpleados.size()
                        + " (el tamaño de la lista actualmente).");
            } else {
                System.out.println(
                        "Nombre de la posición " + posicion + ": " + listaEmpleados.get(posicion - 1).getNombre() + ".");
                System.out.println("¿Quiere visualizar algún nombre más?");
            }
        } while (posicion != 0);
    }

    public void visualizarTodosLosNombres() {
        System.out.println("Estos son los nombres que están registrados en la lista: ");
        for (int i = 0; i < listaEmpleados.size(); i++) {
            System.out.println(i + 1 + "- " + listaEmpleados.get(i).getNombre());
        }
        System.out.println("Volviendo al inicio.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        POOGestionarEmpleados programaEmpleados = new POOGestionarEmpleados();

        System.out.println("Bienvenido/a al sistema de gestión de empleados.");

        do {
            programaEmpleados.menu();
            opcion = sc.nextInt();
            programaEmpleados.comenzar(opcion);
        } while (opcion != 6); // El bucle se repita mientras las opciones introducidas no sean 6.

        sc.close();
    }
}
