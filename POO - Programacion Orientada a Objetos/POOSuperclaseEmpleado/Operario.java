package POOSuperclaseEmpleado;

public class Operario extends Empleado {

    //Constructores
    public Operario () {}
    public Operario(String nombre) {
        super(nombre);
    }

    //Método toString()
    public String toString() {
        return "Operario " + getNombre();
    }

}
