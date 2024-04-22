package POOSuperclaseEmpleado;

public class EmpleadoMain {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Pepe");
        System.out.println(empleado1);

        Operario operario1 = new Operario("Juan");
        System.out.println(operario1);

        Directivo directivo1 = new Directivo("Juana");
        System.out.println(directivo1);

        Oficial oficial1 = new Oficial("Lucas");
        System.out.println(oficial1);

        Tecnico tecnico1 = new Tecnico("Dona");
        System.out.println(tecnico1);
    }
}
