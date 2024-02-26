
//3.Diseña el enunciado del siguiente ejercicio, y explica su funcionamiento:


import java.util.Scanner;

public class ArrayGestionCalificacionesSinFunciones {
    public static void main(String[] args) {
        
        /*Enunciado: Diseña un programa de gestión de calificaciones para un grupo de estudiantes. 
        El programa debe poder realizar las siguiente funciones:
        - El usuario debe indicar el número de estudiantes que haya en el grupo y ponerle una calificación a cada uno/a.
        - Se debe mostrar el promedio de las calificaciones de todos los estudiantes, además de la calificación mínima y máxima.
        - El programa permitirá después consultar la nota del estudiante que indique el usuario.
        - Por último, se mostrarán las calificaciones ordenadas de menor a mayor.
        */
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = scanner.nextInt();

        // Crear array para almacenar calificaciones
        double[] calificaciones = new double[numEstudiantes];   //"calificaciones" almacenará tantos valores como estudiantes que indique el usuario

        // Ingreso de calificaciones
        for (int i = 0; i < numEstudiantes; i++) {      //el bucle se repetirá tantas veces como haya indicado el usuario
            System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();   //por cada iteración, se registrará un número decimal empezando desde la posición 0 hasta n
        }
        // Mostrar promedio
        double sumaCalificaciones = 0;
        for (int i = 0; i < numEstudiantes; i++) {  //en cada iteración se suma un valor del array a "sumaCalificaciones", desde la posición 0 hasta n
            sumaCalificaciones += calificaciones[i];
        }
        double promedio = sumaCalificaciones / numEstudiantes;  //se divide entre el numEstudiantes para obtener la media
        System.out.println("Promedio de calificaciones: " + promedio);

        // Mostrar calificación mínima y máxima
        double calificacionMinima = calificaciones[0];      //se crean dos variables decimales, una para la calificación máxima y otra para la mínima
        double calificacionMaxima = calificaciones[0];        
        //bucle para comparar las calificaciones máximas y mínimas (que al comienzo son 0) con cada uno de los valores en el array
        for (int i = 1; i < numEstudiantes; i++) {      
            if (calificaciones[i] < calificacionMinima) {   //si calificaciones[i] es menor que calificacionMinima, calificaciones[i] pasará a ser la mínima calificación
                calificacionMinima = calificaciones[i];
            }
            if (calificaciones[i] > calificacionMaxima) {   //si calificaciones[i] es mayor que calificacionMaxima, calificaciones[i] pasará a ser la máxima calificación
                calificacionMaxima = calificaciones[i];
            }
        }
        System.out.println("Calificación mínima: " + calificacionMinima);
        System.out.println("Calificación máxima: " + calificacionMaxima);

        // Búsqueda de calificación
        System.out.print("Ingrese el número de estudiante a buscar: ");
        int numEstudianteBuscar = scanner.nextInt();
        boolean encontrado = false;                 //se crea variable booleana "encontrado" que comienza en false
        for (int i = 0; i < numEstudiantes; i++) {  //se repite el condicional tantas veces como estudiantes haya 
            if (i + 1 == numEstudianteBuscar) {     //si el número del usuario coincide con una posición del array:
                System.out.println("Calificación del estudiante " + numEstudianteBuscar + ": " + calificaciones[i]); //se indica la calificación de ese estudiante
                encontrado = true;                  //y "encontrado" pasa a ser true
                break;
            }
        }
        if (!encontrado) {                          //si "encontrado" sigue siendo false, se indica que no ha sido encontrado
            System.out.println("Estudiante no encontrado.");
        }

        // Ordenar calificaciones
        //Algoritmo de ordenación "Bubble Sort" u ordenamiento de burbuja
        for (int i = 0; i < numEstudiantes - 1; i++) {              //se repite tantas veces como numEstudiantes-1
            for (int j = 0; j < numEstudiantes - i - 1; j++) {      //'numEstudiantes - i - 1' evita comparar elementos ya ordenados. En cada iteración, se realizará una comparación menos
                if (calificaciones[j] > calificaciones[j + 1]) {    //si calificaciones[j] es mayor que [j+1] (su adyacente):
                    // Intercambiar elementos si están en el orden incorrecto
                    double temp = calificaciones[j];                //se almacena calificaciones[j]en una variable temporal 
                    calificaciones[j] = calificaciones[j + 1];      //calificaciones[j] pasa a tener el valor de [j+1]
                    calificaciones[j + 1] = temp;                   //calificaciones[j+1] pasa a tener el valor inicial de [j]
                } 
            }
        }   /*Cuidado: después de este algoritmo, el orden de las calificaciones ha cambiado y ya no corresponde con el orden inicial
            Si se quisiera consultar de nuevo la calificación de un estudiante, el resultado saldría incorrecto. 
            Habría que crear una variable aparte para no perder los valores iniciales de calificaciones*/

        // Mostrar calificaciones ordenadas
        System.out.print("Calificaciones ordenadas: ");
        for (int i = 0; i < numEstudiantes; i++) { //se imprime cada valor de calificaciones desde 0 hasta n, estando ahora ordenadas de menor a mayor.
            System.out.print(calificaciones[i] + " ");
        }

        scanner.close();
    }
}

