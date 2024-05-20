package Tarea9Herencia;

public class Persona {

    // Variables privadas
    private String nombre, apellidos;
    private int edad;
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }       
    public int getEdad() {
        return edad;
    }

    // Setters
    public void setNombre(String suNombre) {
        this.nombre = suNombre;
    }
    public void setApellidos(String suApellido) {
        this.apellidos = suApellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para imprimir todos los datos
    public void imprimirDatos(Persona persona) {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Edad: " + getEdad());
    }

    //Constructores
    public Persona() {
    }
    public Persona(String apellidos) {
        this.apellidos = apellidos;
    }
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
    }
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public Persona(int edad) {
        this.edad = edad;
    }
    public Persona(String apellidos, int edad) {
        this.apellidos = apellidos;
        this.edad = edad;
    }
}
    
