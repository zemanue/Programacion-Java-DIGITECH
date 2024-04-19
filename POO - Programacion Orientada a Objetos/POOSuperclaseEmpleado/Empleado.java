/*
La clase base es la clase Empleado. Esta clase contiene:
• Un atributo privado nombre de tipo String que heredan el resto de clases.
• Un constructor por defecto.
• Un constructor con parámetros que inicializa el nombre con el String que recibe.
• Método set y get para el atributo nombre.
• Un método toString() que devuelve el String: "Empleado " + nombre.
• El resto de clases solo deben sobrescribir el método toString() en cada una de ellas y
• declarar el constructor adecuado.
• Es decir en el resto de clase crearemos solo el método toString() que llamará al método
• padre y los constructores correspondientes, en cada clase agregaremos el nombre de la
clase en el método toString.
 */

package POOSuperclaseEmpleado;

public class Empleado{

    private String nombre;

    public Empleado() {
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString(Empleado empleado) {
        return "Empleado " + empleado.getNombre();
    }
}
