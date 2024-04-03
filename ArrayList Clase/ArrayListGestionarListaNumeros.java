/*
4. Crea un programa en Java para gestionar una lista de números utilizando tanto un ArrayList
como un array convencional. El programa permitirá realizar operaciones básicas como agregar
números, calcular la suma y encontrar el número más grande en ambas estructuras.
 */

import java.util.*;

public class ArrayListGestionarListaNumeros {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayListNumeros = new ArrayList<>();
        int[] arrayNumeros = new int[30]; //Array con un máximo de 30 números.
        Scanner sc = new Scanner(System.in);

        int opcion;

        System.out.println("Gestión de lista de números.");

        do {
            System.out.println("Por favor, pulse uno de los siguientes números para hacer una acción:");
            System.out.println("- 1: Agregar números.");
            System.out.println("- 2: Mostrar la lista de números.");
            System.out.println("- 3: Calcular la suma.");
            System.out.println("- 4: Encontrar el número más grande");
            System.out.println("- 5: Salir.");

            opcion = sc.nextInt();
            int numero, cantidad;

            switch (opcion) {
                case 1:     //AGREGAR NÚMEROS
                    System.out.println("Agregar números.");
                    int elegirArrayOArrayList;
                    do {
                        System.out.println("Escribe '1' para agregar números en el array, o escribe '2' para agregarlos en el ArrayList.");
                        elegirArrayOArrayList = sc.nextInt();
                        switch (elegirArrayOArrayList) {

                            case 1: //Añadir al array
                                System.out.println("Añadiendo al array convencional. Si había números registrados, se restablecerán. ¿Cuántos números quieres añadir?");
                                System.out.println("Nota: el array tiene un tamaño máximo de " + arrayNumeros.length + " números. Si quieres añadir menos números, el resto se rellenarán con ceros.");
                                cantidad = sc.nextInt();
                                if (cantidad > arrayNumeros.length) {
                                    System.out.println("No se pueden registrar " + cantidad + " números porque el array solo puede almacenar un máximo de " + arrayNumeros.length + " números.");
                                    System.out.println("Volviendo al inicio.");
                                } else {
                                    System.out.println("Muy bien. Escribe uno a uno los números a añadir:");
                                for (int i = 0; i < cantidad; i++) {
                                    numero = sc.nextInt();
                                    arrayNumeros[i] = numero;
                                }
                                System.out.println("Números registrados. Volviendo al inicio.");                  
                                }                                              
                                break;
                        
                            case 2: //Añadir al ArrayList
                                System.out.println("Añadiendo al ArrayList. ¿Cuántos números quieres añadir?");
                                cantidad = sc.nextInt();
                                System.out.println("Muy bien. Escribe uno a uno los números a añadir:");
                                for (int i = 0; i < cantidad; i++) {
                                    numero = sc.nextInt();
                                    arrayListNumeros.add(numero);
                                }
                                System.out.println("Números registrados. Volviendo al inicio.");                                
                            break;
    
                            default:
                            System.out.println("El número introducido no es válido.");
                                break;
                        }
                    } while (elegirArrayOArrayList != 1 && elegirArrayOArrayList != 2);
                break;


                case 2:     //MOSTRAR LA LISTA DE NÚMEROS
                System.out.println("Mostrar la lista de números.");
                System.out.print("Valores del array: ");
                System.out.print("{"); //Algoritmo para imprimir el array entre llaves y comas
                for (int i = 0; i < arrayNumeros.length; i++) { 
                    if (i+1 != arrayNumeros.length) {   
                        System.out.print(arrayNumeros[i] + ", ");
                    } else {
                        System.out.println(arrayNumeros[i] + "}");
                    }
                }
                System.out.println("Nota: todos los números que no han sido rellenados por el usuario se presentan como ceros.");
                System.out.println("Valores del ArrayList: " +  arrayListNumeros);

                break;


                case 3:     //CALCULAR LA SUMA
                System.out.println("Calcular la suma.");
                int sumaArray = 0;
                for (int i = 0; i < arrayNumeros.length; i++) {
                    sumaArray+=arrayNumeros[i];
                }
                System.out.println("Suma de los valores del array: " + sumaArray + ".");

                int sumaArrayList = 0;
                for (Integer i : arrayListNumeros) {
                    sumaArrayList += i;
                }
                System.out.println("Suma de los valores del ArrayList: " + sumaArrayList);

                break;


                case 4:     //ENCONTRAR EL NÚMERO MÁS GRANDE
                System.out.println("Encontrar el número más grande.");
                //Hacerlo en ambas estructuras

                break;


                case 5:     //SALIR
                System.out.println("Saliendo del programa.");
                break;
                
                default://Si la respuesta es diferente a los números especificados, repite el bucle.
                System.out.println("El número introducido no es válido.");
                    break;
            }

        } while (opcion != 5);

        sc.close();
    }
}