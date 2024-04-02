/*
4. Crea un programa en Java para gestionar una lista de números utilizando tanto un ArrayList
como un array convencional. El programa permitirá realizar operaciones básicas como agregar
números, calcular la suma y encontrar el número más grande en ambas estructuras.
 */

import java.util.*;

public class ArrayListGestionarListaNumeros {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayListNumeros = new ArrayList<>();
        int[] arrayNumeros = new int[100]; //Array con un máximo de 100 números.
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
            int numero;

            switch (opcion) {
                case 1:     //AGREGAR NÚMEROS
                    System.out.println("Agregar números.");
                    String arrayOArrayList;
                    do {
                        System.out.println("Escribe '1' para agregar números en el array, o escribe '2' para agregarlos en el ArrayList.");
                        arrayOArrayList = sc.nextLine();
                        switch (arrayOArrayList) {
                            case "1":
                                
                                break;
                        
                            case "2":
                                
                            break;
    
                            default:
                            System.out.println("El número introducido no es válido.");
                                break;
                        }
                    } while (!arrayOArrayList.equalsIgnoreCase("salir"));


                    //Implementar la funcionalidad para que el usuario pueda elegir a qué estructura quiere añadir números (ArrayList y array convencional).

                break;


                case 2:     //MOSTRAR LA LISTA DE NÚMEROS
                System.out.println("Mostrar la lista de números.");

                break;


                case 3:     //CALCULAR LA SUMA
                System.out.println("Calcular la suma.");
                //Se suman los números en ambas estructuras.

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