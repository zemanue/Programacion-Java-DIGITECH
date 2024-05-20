package Tarea9Herencia;

public class Deportivo extends Vehiculo {

    // Variable privada
    private boolean descapotable;

    // Getter y setter
    public boolean isDescapotable() {
        return descapotable;
    }
    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    // Constructor
    public Deportivo(String matricula, String marca, String modelo, String color, int numeroDePuertas, int potencia, boolean descapotable) {
        super(matricula, marca, modelo, color, numeroDePuertas, potencia);
        this.descapotable = descapotable;
    }



}
