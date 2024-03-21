/*
3. Realizar un programa para gestionar la lista de Empleados, en que tendremos el
siguiente menú:
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

public class ArrayListGestionarEmpleados {
    public static void main(String[] args) {
        
        ArrayList<String> empleados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcion;

        System.out.println("Bienvenido/a al sistema de gestión de empleados.");

        do {
            System.out.println("Por favor, pulse uno de los siguientes números para hacer una acción:");
            System.out.println("- 1: Agregar nombres.");
            System.out.println("- 2: Modificar un nombre.");
            System.out.println("- 3: Borrar nombres.");
            System.out.println("- 4: Visualizar un nombre.");
            System.out.println("- 5: Visualizar todos los nombres.");
            System.out.println("- 6: Salir.");

            opcion = sc.nextInt();
            sc.nextLine(); // Esta línea consume el carácter de nueva línea (evita errores al cambiar de nextInt a nextLine)
            String nombreEmpleado = "0"; String respuesta = "0"; //Evita errores al poner ests variables como condición en los bucles
            int posicion;

            //Switch desarrollar una acción por cada número introducido
            switch (opcion) {
                case 1:     //AGREGAR NOMBRES
                    System.out.println("Agregar nombres.");
                    System.out.println("Introduzca uno a uno los nombres de los empleados que quiera agregar a la lista. Escriba 'salir' cuando haya terminado.");                    
                    do {
                        nombreEmpleado = sc.nextLine();
                        if (!nombreEmpleado.equalsIgnoreCase("salir")) {
                            empleados.add(nombreEmpleado);
                            System.out.println("Siguiente empleado:");
                        }
                    } while (!nombreEmpleado.equalsIgnoreCase("salir"));
                    System.out.println("Nuevos nombres añadidos.");

                    break;

                case 2:     //MODIFICAR UN NOMBRE
                    if (empleados.isEmpty()) { //Si la lista está vacía, enviar de nuevo al inicio.
                        System.out.println("No hay ningún empleado registrado en la lista. Escriba '1' para agregar algún nombre primero.");
                        break;
                    }
                    System.out.println("Modificar un nombre.");
                    do {
                        System.out.println("Escriba la posición en la que está registrado el nombre que desea modificar (1, 2, 3, 4...):");
                        posicion = sc.nextInt() - 1;
                        sc.nextLine(); // Consumir la nueva línea después de nextInt()
                        System.out.println("El nombre asignado en esa posición es: " + empleados.get(posicion));
                
                        System.out.println("Escriba ahora por qué nombre lo quiere modificar.");
                        System.out.println("¿No es el nombre que buscaba? Escriba 'n' para escribir otra posición, o 'salir' si quiere cancelar la operación y volver al inicio.");
                        respuesta = sc.nextLine();
                        // if else para posibles respuestas: 'n', 'salir' u otras combinaciones para registrar modificar el nombre.
                        if (respuesta.equalsIgnoreCase("n")) { //Si el usuario teclea 'n', se vuelve a pedir la posición.
                            System.out.println("Buscando otro nombre de la lista.");
                        } else if (respuesta.equalsIgnoreCase("salir")) { //Si se escribe 'salir', se sale de nuevo al inicio
                            System.out.println("Volviendo al inicio.");
                            break;
                        } else { //Si teclea cualquier valor que no sea 'n' o 'salir', se registra el nombre.
                            empleados.set(posicion, respuesta);
                            System.out.println("Nombre modificado.");
                            break;
                        }
                    } while (respuesta.equalsIgnoreCase("n"));
                    break;

                case 3:     //BORRAR NOMBRES
                    if (empleados.isEmpty()) { //Si la lista está vacía, enviar de nuevo al inicio.
                        System.out.println("No hay ningún empleado registrado en la lista. Escriba '1' para agregar algún nombre primero.");
                        break;
                    }
                    System.out.println("Borrar nombres.");

                    do {
                        System.out.println("Escriba '1' para borrar por posiciones, '2' para borrar por nombre, o 'salir' para cancelar la operación y volver al inicio.");
                        respuesta = sc.nextLine();

                        //Opción 1: borrar por posición
                        if (respuesta.equals("1")) {
                            System.out.println("Borrar por posición.");
                            //Bucle do while para volver a pedir la posición del empleado.
                            do {
                                System.out.println("Hay " + empleados.size() + " nombres registrados.");
                                System.out.println("Escriba la posición en la que está registrado el nombre que desea borrar (1, 2, 3...):");
                                posicion = sc.nextInt();
                                sc.nextLine(); // Consumir la nueva línea después de nextInt()

                                //Si el número es < 0 ó > empleados.size(), se pide de nuevo la posición (vuelta al comienzo del do while)
                                if (posicion < 1 || posicion > empleados.size()) {
                                    System.out.println("Debe ser un número comprendido entre 1 y " + empleados.size() + " (el tamaño de la lista actualmente).");

                                //Si el número es válido    
                                } else {
                                    System.out.println("El nombre asignado en esa posición es: " + empleados.get(posicion - 1));
                                    System.out.println("¿Es el nombre que buscaba? Escriba 's' para eliminarlo, 'n' para escribir otra posición, o 'salir' para cancelar la operación y volver al inicio.");
                                    respuesta = sc.nextLine();
                                    // if else para posibles respuestas: 's' para eliminar el nombre; 'n' para volver a pedir la posición, 'salir' para volver al inicio
                                    if (respuesta.equalsIgnoreCase("s")) {
                                        empleados.remove(posicion - 1);
                                        System.out.println("Nombre eliminado. ¿Quiere seguir eliminando nombres? Escriba 's' para continuar, o cualquier otro texto para terminar y volver al inicio.");
                                        respuesta = sc.nextLine();
                                        if (respuesta.equalsIgnoreCase("s")) {
                                            break;
                                        }
                                        break;
                                    } else if (respuesta.equalsIgnoreCase("n")) { //Si el usuario teclea 'n', se vuelve a pedir la posición.
                                        System.out.println("Buscando otra posición de la lista.");
                                    } else if (respuesta.equalsIgnoreCase("salir")) { //Si se escribe 'salir', se sale de nuevo al inicio
                                        System.out.println("Volviendo al inicio.");
                                        break;
                                    } else { //Si teclea cualquier valor que no sea 's', 'n' o 'salir', se vuelve a pedir la posición.
                                        System.out.println("No ha introducido carácter incluido en las opciones ('s', 'n' o 'salir').");
                                    }
                                }
                            } while (!respuesta.equalsIgnoreCase("salir"));

                        //Opción 2: borrar por nombre
                        } else if (respuesta.equals("2")) {
                            System.out.println("Borrar por nombre");
                            //Bucle do while para volver a pedir el nombre del empleado, exista o no exista el nombre.
                            do {
                                System.out.println("Escriba el nombre del empleado que quiere eliminar de la lista, o escriba 'salir' para volver.");
                                nombreEmpleado = sc.nextLine();
                                
                                if (nombreEmpleado.equalsIgnoreCase("salir")) { //Si se escribe 'salir', se sale de nuevo al inicio
                                    System.out.println("Volviendo al inicio.");
                                    break;
                                } else if (empleados.contains(nombreEmpleado.toLowerCase())) {   //Si coincide con algún elemento de la lista, se elimina el nombre y se pide otro nombre.
                                    empleados.remove(nombreEmpleado);
                                    System.out.println("'" + nombreEmpleado + "' eliminado de la lista. ¿Quiere continuar?");
                                    break;
                                } else{   //Si no coincide, se avisa y se vuelve a pedir el nombre.
                                    System.out.println("El nombre indicado no está en la lista.");
                                    break;
                                }
                            } while (!nombreEmpleado.equalsIgnoreCase("salir"));                        
                            
                        } else if (respuesta.equalsIgnoreCase("salir")) { //Si se escribe 'salir', se sale de nuevo al inicio
                                System.out.println("Volviendo al inicio.");
                                break;
                        } else {
                                System.out.println("Introduzca un número válido.");
                        }
                    } while (!respuesta.equalsIgnoreCase("salir") && !nombreEmpleado.equalsIgnoreCase("salir"));
                    break;

                case 4:     //VISUALIZAR UN NOMBRE
                    if (empleados.isEmpty()) { //Si la lista está vacía, enviar de nuevo al inicio.
                        System.out.println("No hay ningún empleado registrado en la lista. Escriba '1' para agregar algún nombre primero.");
                        break;
                    }                    
                    
                    System.out.println("Visualizar un nombre.");
                    do { 
                        
                    } while (!respuesta.equalsIgnoreCase("salir"));

                    break; 

                case 5:     //VISUALIZAR TODOS LOS NOMBRES
                    if (empleados.isEmpty()) { //Si la lista está vacía, enviar de nuevo al inicio.
                        System.out.println("No hay ningún empleado registrado en la lista. Escriba '1' para agregar algún nombre primero.");
                        break;
                    }                    
                    break;

                case 6:     //SALIR
                    
                    break;
                        
                default:    //Si la respuesta es diferente a los números especificados, repite el bucle.
                System.out.println("No has introducido ningún número válido.");
                    break;
            }

        } while (opcion != 6); //El bucle se repita mientras las opciones introducidas no sean 6.

        sc.close();
        sc.close();
    }
}
