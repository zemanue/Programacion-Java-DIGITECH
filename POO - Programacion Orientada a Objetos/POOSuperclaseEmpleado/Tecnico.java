package POOSuperclaseEmpleado;

public class Tecnico extends Operario {

    //Constructores
    public Tecnico () {}
    public Tecnico(String nombre) {
        super(nombre);
    }

    //Método toString()
    public String toString() {
        return "Técnico " + getNombre();
    }

}
