/*
 * 4. Tenemos una persona que tiene las propiedades: nombre, apellido, calle, teléfono, aficiones.
Vamos a crear 3 clases.
- 1ª clase: 
Vamos a tener los atributos privados de la clase de persona.
- 2ª clase: 
Vamos a tener los métodos:
    -cargarDatos(): Vamos a asignar valores a los atributos. Para el atributo aficiones, tendremos 3 aficiones.
    -mostrarDatos().
    -cambiarDatos().
- 3ª clase:
Vamos a tener el método principal que llame a los métodos de la 2ª clase. Vamos a cargar los datos, 
los visualizaremos y si se ha producido alguna modificación se vuelve a mostrar todos los datos.
 */


    class Persona {
        private String nombre, apellido, calle, telefono;
        private String[] aficiones = new String[3];
        
        //Getters
        public String getNombre() {
            return nombre;
        }
        public String getApellido() {
            return apellido;
        }       
        public String getCalle() {
            return calle;
        }
        public String getTelefono() {
            return telefono;
        }
        public String[] getAficiones() {
            return aficiones;
        }

        //Setters
        public void setNombre(String suNombre) {
            this.nombre = suNombre;
        }
        public void setApellido(String suApellido) {
            this.apellido = suApellido;
        }
        public void setCalle(String suCalle) {
            this.calle = suCalle;
        }
        public void setTelefono(String suTelefono) {
            this.telefono = suTelefono;
        }
        public void setAficiones(String[] susAficiones) {
            this.aficiones = susAficiones;
        }
    }

    class MetodosPersona {
        static void cargarDatos(Persona persona) {
            persona.setNombre("Juan");
            persona.setApellido("Perez");
            persona.setCalle("Calle Diablo");
            persona.setTelefono("677776776");
            String[] susAficiones = {"Deporte", "Leer", "Viajar"};
            persona.setAficiones(susAficiones);
        }

        static void mostrarDatos(Persona persona) {
            System.out.println("Nombre: " + persona.getNombre());  
            System.out.println("Apellido: " + persona.getApellido());  
            System.out.println("Calle: " + persona.getCalle());  
            System.out.println("Teléfono: " + persona.getTelefono());  
            System.out.println("Aficiones: "); 
            for (String susAficiones : persona.getAficiones()) {
                System.out.println("- " + susAficiones);
            }
        }

        static void cambiarDatos(Persona Persona, String suNombre, String suApellido, String suCalle, String suTelefono, String[] susAficiones) {
            Persona.setNombre(suNombre);
            Persona.setApellido(suApellido);
            Persona.setCalle(suCalle);
            Persona.setTelefono(suTelefono);
            Persona.setAficiones(susAficiones);
        }
    }
public class POOPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona();

        MetodosPersona.cargarDatos(persona1);

        MetodosPersona.mostrarDatos(persona1);

        String[] nuevasAficiones = {"Montar a caballo", "Esquiar", "Programar"};
        MetodosPersona.cambiarDatos(persona1, "Ana", "Lopez", "Calle Angel", "611223344", nuevasAficiones);

        MetodosPersona.mostrarDatos(persona1);

    }
}
