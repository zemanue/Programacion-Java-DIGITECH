/*
2. Desarrollar un programa Java que defina la clase Vehiculo y las subclases Turismo y Deportivo.
El programa principal debe crear objetos de tipo Vehiculo y colecciones de objetos utilizando arrays y listas.

Registrar la matrícula, la marca, el modelo, el color, el número de puertas y la potencia de todos los vehículos.
Además, defina las subclases correspondientes a dos tipos de vehículos: turismo y deportivo.
Para los turismos, es necesario registrar el número de plazas, mientras que para los deportivos se debe indicar 
si es descapotable o no.
*/

package Tarea9Herencia;

public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("1919RTG", "Seat", "Ibiza", "rojo", 5, 130);
        Turismo turismo1 = new Turismo("6473LOP", "Toyota", "Corolla", "negro", 5, 160, 5);
        Deportivo deportivo1 = new Deportivo("1919RTG", "Seat", "Ibiza", "blanco", 3, 450, true);


    }
}
