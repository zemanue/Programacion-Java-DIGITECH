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
        if (sueldo > 0) {
            this.sueldo = sueldo;
        } else {
            System.out.println("No se ha asignado ningún sueldo porque debe ser mayor a 0€.");
        }
    }
    public void setComision(double comision) {
        if (sueldo > 0) {
            this.comision = comision;
        } else {
            System.out.println("No se ha asignado ninguna comisión porque debe ser mayor a 0€.");
        }
    }

    // Métodos
    public void imprimirDatos(Empleado empleado) {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sueldo: " + getSueldo() + "€");
        System.out.println("Comisión: " + getComision()+ "€");
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
    public Empleado(String nombre, String apellidos, double sueldo) {
        super(nombre, apellidos);
        this.sueldo = sueldo;
    }
    public Empleado(String nombre, String apellidos, double sueldo, double comision) {
        super(nombre, apellidos);
        this.sueldo = sueldo;
        this.comision = comision;
    }
    public Empleado(String nombre, String apellidos, int edad, double sueldo) {
        super(nombre, apellidos, edad);
        this.sueldo = sueldo;
    }
    public Empleado(String nombre, String apellidos, int edad, double sueldo, double comision) {
        super(nombre, apellidos, edad);
        this.sueldo = sueldo;
        this.comision = comision;
    }
}
