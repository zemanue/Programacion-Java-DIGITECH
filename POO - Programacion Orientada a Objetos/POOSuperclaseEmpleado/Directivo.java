package POOSuperclaseEmpleado;

public class Directivo extends Empleado {

    //Constructores
    public Directivo () {}
    public Directivo(String nombre) {
        super(nombre);
    }

    //Método toString()
    public String toString() {
        return "Directivo " + getNombre();
    }

}
