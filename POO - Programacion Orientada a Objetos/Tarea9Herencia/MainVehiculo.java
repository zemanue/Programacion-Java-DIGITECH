/*
2. Desarrollar un programa Java que defina la clase Vehiculo y las subclases Turismo y Deportivo.
El programa principal debe crear objetos de tipo Vehiculo y colecciones de objetos utilizando arrays y listas.

Registrar la matrícula, la marca, el modelo, el color, el número de puertas y la potencia de todos los vehículos.
Además, defina las subclases correspondientes a dos tipos de vehículos: turismo y deportivo.
Para los turismos, es necesario registrar el número de plazas, mientras que para los deportivos se debe indicar 
si es descapotable o no.
*/

package Tarea9Herencia;

import java.util.ArrayList;

public class MainVehiculo {
    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        
        Vehiculo vehiculo1 = new Vehiculo("1919RTG", "Seat", "Ibiza", "rojo", 5, 130);
        vehiculos.add(vehiculo1);

        Turismo turismo1 = new Turismo("6473LOP", "Toyota", "Corolla", "negro", 5, 160, 5);
        vehiculos.add(turismo1);

        Deportivo deportivo1 = new Deportivo("1919RTG", "Porsche", "Panamera", "blanco", 3, 450, true);
        vehiculos.add(deportivo1);

        System.out.println("Vehículos en la lista: ");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Vehículo " + (vehiculos.indexOf(vehiculo) + 1) + ":");
            vehiculo.imprimirDatos();
            System.out.println("");
        }
    }
}
