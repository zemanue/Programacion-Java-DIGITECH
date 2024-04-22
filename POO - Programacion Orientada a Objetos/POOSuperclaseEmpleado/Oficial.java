package POOSuperclaseEmpleado;

public class Oficial extends Operario {

    //Constructores
    public Oficial () {}
    public Oficial(String nombre) {
        super(nombre);
    }

    //Método toString()
    public String toString() {
        return "Oficial " + getNombre();
    }


}
