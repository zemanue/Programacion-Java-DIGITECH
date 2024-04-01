/*
3. Crea un programa en Java para gestionar una lista de nombres de asignaturas utilizando un
ArrayList. El programa permitirá agregar nuevas asignaturas, mostrar la lista de asignaturas y
buscar asignaturas por su nombre.
 */

import java.util.*;

public class ArrayListGestionarAsignaturas {
    public static void main(String[] args) {
        
        ArrayList<String> asignaturas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcion;

        System.out.println("Bienvenido/a al sistema de gestión de asignaturas.");

        do {
            System.out.println("Por favor, pulse uno de los siguientes números para hacer una acción:");
            System.out.println("- 1: Agregar asignaturas.");
            System.out.println("- 2: Mostrar la lista de asignaturas.");
            System.out.println("- 3: Buscar una asignatura por nombre.");
            System.out.println("- 4: Salir.");

            opcion = sc.nextInt();
            sc.nextLine(); // Esta línea consume el carácter de nueva línea (evita errores al cambiar de nextInt a nextLine)

            String nombreAsignatura;

            switch (opcion) {
                case 1:     //AGREGAR ASIGNATURAS
                    System.out.println("Agregar asignaturas.");
                    System.out.println("Introduzca una a una las asignaturas que quiera agregar a la lista. Escriba 'salir' cuando quiera terminar.");
                    do {
                        nombreAsignatura = sc.nextLine();
                        if (nombreAsignatura.equalsIgnoreCase("salir")) {
                            System.out.println("Volviendo al inicio.");
                            break;
                        } else {
                            System.out.println("Nombre escrito: " + nombreAsignatura + ".");
                            System.out.println("¿Quieres agregarlo a la lista? Esta acción no se puede revertir. Escribe 's' para registrarlo o cualquier otro texto para volver a escribir el nombre.");
                            String siONo = sc.nextLine();
                            if (siONo.equals("s")) {
                                asignaturas.add(nombreAsignatura);
                                System.out.println("Nombre registrado.");
                                System.out.println("Escribe el nombre de la siguiente asignatura (o escribe 'salir' para terminar).");
                            } else {
                                System.out.println("Nombre no registrado.");
                                System.out.println("Escribe el nombre de la siguiente asignatura (o escribe 'salir' para terminar).");
                            }
                        }
                    } while (!nombreAsignatura.equalsIgnoreCase("salir"));
                    break;

                case 2:     //VISUALIZAR TODOS LOS NOMBRES
                if (asignaturas.isEmpty()) { //Si la lista está vacía, enviar de nuevo al inicio.
                    System.out.println("No hay ninguna asignatura registrada en la lista. Escriba '1' para agregar algún nombre primero.");
                    break;
                }
                System.out.println("Estos son los nombres que están registrados en la lista: ");
                System.out.println(asignaturas);
                break;

                case 3: //BUSCAR UNA ASIGNATURA POR NOMBRE
                if (asignaturas.isEmpty()) { //Si la lista está vacía, enviar de nuevo al inicio.
                    System.out.println("No hay ninguna asignatura registrada en la lista. Escriba '1' para agregar algún nombre primero.");
                    break;
                }
                System.out.println("Buscar asignatura por nombre.");
                do {
                    System.out.println("Escriba el nombre de la asignatura que quiera buscar, o escriba 'salir' si quiere terminar de buscar.");
                    nombreAsignatura = sc.nextLine();
                    if (nombreAsignatura.equalsIgnoreCase("salir")) {
                        System.out.println("Volviendo al inicio.");
                        break;
                        }
                    boolean coincide = false;
                    
                    //Comprobar si alguna asignatura coincide con el texto
                    for (String asignatura : asignaturas) {
                        if (asignatura.toLowerCase().contains(nombreAsignatura.toLowerCase())) {
                            coincide = true;
                        }
                    }
                    
                    if (!coincide) {
                        System.out.println("No hay ninguna asignatura que coincida con el texto que ha ingresado.");
                    } else {
                        System.out.println("Estos nombres coinciden con el texto que ha ingresado:");
                        //Escribir todas las asignaturas que contengan el texto introducido por el usuario
                        for (String asignatura : asignaturas) {
                            if (asignatura.toLowerCase().contains(nombreAsignatura.toLowerCase())) {
                                coincide = true;
                                System.out.println(asignatura);
                            }
                        }
                    }
                } while (!nombreAsignatura.equalsIgnoreCase("salir"));
                
                break;

                case 4:     //SALIR
                System.out.println("Saliendo del programa.");
                break;
                
                default://Si la respuesta es diferente a los números especificados, repite el bucle.
                System.out.println("El número introducido no es válido.");
                    break;
            }

        } while (opcion != 4); //El bucle se repita mientras las opciones introducidas no sean 4.

        sc.close();
    }
}
