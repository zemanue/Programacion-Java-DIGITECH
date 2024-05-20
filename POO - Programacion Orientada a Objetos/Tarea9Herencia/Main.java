
/*  
1. Confeccionar una clase Persona que tenga como atributos el nombre, apellidos y la edad. 
Definir varios constructores (todos los posibles), getters y setters para cargar los datos personales y que los imprima.

Plantear una segunda clase Empleado que herede de la clase Persona. Añadir los atributos sueldo, comisión, y los métodos 
get, set e imprimir su sueldo y comisión.
También tendremos un método donde me calcule el total cobrado, tendremos que controlar que el sueldo y comisión sea > a 0.
Definir todos los constructores posibles y los getters y setters.

En la clase principal, vamos a definir 4 objetos de la clase Persona y llamar a sus métodos.
Tambien, crear 5 objetos de la clase Empleado y llamar a sus métodos
*/

package Tarea9Herencia;

public class Main {

    public static void main(String[] args) {
        //Objetos Persona
        Persona persona1 = new Persona("Juan", "Pérez Sancho", 21);
        persona1.imprimirDatos();
        System.out.println("");

        Persona persona2 = new Persona("María", "López Rueda");
        persona2.imprimirDatos();
        System.out.println("");

        Persona persona3 = new Persona(28);
        persona3.imprimirDatos();
        System.out.println("");

        Persona persona4 = new Persona("Bueno Delgado", 32);
        persona4.imprimirDatos();
        System.out.println("");


        //Objetos Empleado
        Empleado empleado1 = new Empleado("Begoña", "Prieto Fuertes", 29, 1200.0, 50.0);
        empleado1.imprimirDatos();
        System.out.println("");

        Empleado empleado2 = new Empleado("Jairo", "Ramírez Corral", 1300.50, 20);
        empleado2.imprimirDatos();
        System.out.println("");

        Empleado empleado3 = new Empleado("Roberto", "Aguilar Jiménez", 38, 1250.10);
        empleado3.imprimirDatos();
        System.out.println("");

        Empleado empleado4 = new Empleado("Marta", "Zumaquero Castro", 31);
        empleado4.imprimirDatos();
        System.out.println("");

        Empleado empleado5 = new Empleado("Teresa", "Moreno Puebla", 41, 0, -10.10); // Probamos un empleado al que se le intenta registrar un sueldo y comisión <= 0
        empleado5.imprimirDatos();
        System.out.println("");
    }
}
