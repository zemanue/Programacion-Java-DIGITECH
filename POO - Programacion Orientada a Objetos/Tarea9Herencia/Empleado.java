package Tarea9Herencia;

public class Empleado extends Persona{

    // Atributos privados 
    private double sueldo, comision;

    // Getters
    public double getSueldo() {
        return sueldo;
    }
    public double getComision() {
        return comision;
    }

    // Setters
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public void setComision(double comision) {
        this.comision = comision;
    }

    // Métodos
    public void imprimirDatos(Empleado empleado) {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sueldo: " + getSueldo());
        System.out.println("Comisión: " + getComision());
    }

    // Constructores
    public Empleado(String apellidos) {
        super(apellidos);
    }
    public Empleado(String nombre, String apellidos) {
        super(nombre, apellidos);
    }
    public Empleado(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
    }
    public Empleado(int edad) {
        super(edad);
    }
    public Empleado(String apellidos, int edad) {
        super(apellidos, edad);
    }


}
