/*
1. Queremos representar con programación orientada a objetos, un aula con estudiantes y un
profesor.

• Tanto de los estudiantes como de los profesores necesitamos saber su nombre, edad y
sexo. De los estudiantes, queremos saber también su calificación actual (entre 0 y 10) y
del profesor que materia da.

• Las materias disponibles son matemáticas, filosofía y física.

• Los estudiantes tendrán un 50% de hacer novillos, por lo que si hacen novillos no van a
clase pero aunque no vayan quedara registrado en el aula (como que cada uno tiene su
sitio).

• El profesor tiene un 20% de no encontrarse disponible (reuniones, baja, etc.) Las dos
operaciones anteriores deben llamarse igual en Estudiante y Profesor (polimorfismo).

• El aula debe tener un identificador numérico, el número máximo de estudiantes y para
que esta destinada (matemáticas, filosofía o física). Piensa que más atributos necesita.

• Un aula para que se pueda dar clase necesita que el profesor esté disponible, que el
profesor dé la materia correspondiente en el aula correspondiente (un profesor de
filosofía no puede dar en un aula de matemáticas) y que haya más del 50% de alumnos.

• El objetivo es crear un aula de alumnos y un profesor y determinar si puede darse clase,
teniendo en cuenta las condiciones antes dichas. Si se puede dar clase mostrar cuantos
alumnos y alumnas (por separado) están aprobados de momento (imaginad que les
están entregando las notas).

• NOTA: Los datos pueden ser aleatorios (nombres, edad, calificaciones, etc.) siempre y
cuando tengan sentido (edad no puede ser 80 en un estudiante o calificación ser 12). 
*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class PersonaAula {
    private String nombre;
    private int edad;
    private String sexo;

    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean asisteAClase() {
        return true;
    }
    
    public PersonaAula(){
    }
    
    public PersonaAula(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
}

class Alumno extends PersonaAula {
    private double calificacionActual;

    //Getter y setter
    public double getCalificacionActual() {
        return calificacionActual;
    }
    public void setCalificacionActual(double calificacionActual) {
        this.calificacionActual = calificacionActual;
    }

    public boolean asisteAClase() {
        Random probabilidad = new Random(); //genera número del 0-100
        if (probabilidad.nextInt(101) < 50) {
            return false;
        } else {
            return true;
        }
    }

    //Constructor
    public Alumno(String nombre, int edad, String sexo, double calificacionActual) {
        super(nombre, edad, sexo);
        this.calificacionActual = calificacionActual;
    }
}

class Profesor extends PersonaAula {
    private String materia;

    //Getter y setter
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }

    public boolean asisteAClase() {
        Random probabilidad = new Random(); //genera número del 0-10
        if (probabilidad.nextInt(101) < 20) {
            return false;
        } else {
            return true;
        }
    }
    
    public Profesor(String nombre, int edad, String sexo, String materia) {
        super(nombre, edad, sexo);
        this.materia = materia;
    }

    //Constructor
    
}

class Aula {
    private int idAula;
    private int maximoAlumnos;
    private String materia;
    // private Profesor profesor;

    public int getIdAula() {
        return idAula;
    }
    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }

    public int getMaximoAlumnos() {
        return maximoAlumnos;
    }
    public void setMaximoAlumnos(int maximoAlumnos) {
        this.maximoAlumnos = maximoAlumnos;
    }

    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Aula(int idAula, int maximoAlumnos, String materia) { //, Profesor profesor
        this.idAula = idAula;
        this.maximoAlumnos = maximoAlumnos;
        this.materia = materia;
        //this.profesor = profesor;
    }
}

public class POOAulaAlumnosYProfesores {
    public static void main(String args[]) {

        boolean repetir = true;
        int numDias = 1, diasDeClase = 0;
        Scanner sc = new Scanner(System.in);

        //Profesores
        Profesor profesor1 = new Profesor("Jaime Pérez", 33, "hombre", "Filosofía");

        //Aulas
        Aula aula1 = new Aula(001, 8, profesor1.getMateria());

        //Estudiantes
        Alumno joseRamirez = new Alumno("Jose Ramírez", 15, "hombre", 7.2);
        Alumno isabelJohansson = new Alumno("Isabel Johansson", 14, "mujer", 8.5);
        Alumno manuelRedondo = new Alumno("Manuel Redondo", 14, "hombre", 7.9);
        Alumno teresaRuiz = new Alumno("Teresa Ruiz", 15, "mujer", 3.5);
        Alumno ikerJimenez = new Alumno("Íker Jiménez", 14, "hombre", 4.8);
        Alumno luisFuertes = new Alumno("Luis Fuertes", 15, "hombre", 9.6);
        Alumno rosaPrieto = new Alumno("Rosa Prieto", 15, "mujer", 8.1);
        Alumno paulaLluch = new Alumno("Paula Lluch", 15, "mujer", 5.3);

        while (repetir) {
            System.out.println("Día " + numDias + " de clase:");

            if (!profesor1.asisteAClase()) {
                System.out.println("La clase no se puede celebrar porque el profesor no ha podido asistir.");
            } else {
                System.out.println("El profesor " + profesor1.getNombre() + " puede asistir a clase. Impartirá " + profesor1.getMateria() + ".");
                
                //Lista de alumnos/as que han asistido a clase
                ArrayList<Alumno> alumnosEnClase = new ArrayList<>();
                if (joseRamirez.asisteAClase()) {
                    alumnosEnClase.add(joseRamirez);
                }
                if (isabelJohansson.asisteAClase()) {
                    alumnosEnClase.add(isabelJohansson);
                }
                if (manuelRedondo.asisteAClase()) {
                    alumnosEnClase.add(manuelRedondo);
                }
                if (teresaRuiz.asisteAClase()) {
                    alumnosEnClase.add(teresaRuiz);
                }
                if (ikerJimenez.asisteAClase()) {
                    alumnosEnClase.add(ikerJimenez);
                }
                if (luisFuertes.asisteAClase()) {
                    alumnosEnClase.add(luisFuertes);
                }
                if (rosaPrieto.asisteAClase()) {
                    alumnosEnClase.add(rosaPrieto);
                }
                if (paulaLluch.asisteAClase()) {
                    alumnosEnClase.add(paulaLluch);
                }

                if (alumnosEnClase.isEmpty()) {
                    System.out.println("No ha venido nadie a clase.");
                } else {
                    System.out.println("Han venido a clase " + alumnosEnClase.size() + " estudiantes.");   
                }
                if (alumnosEnClase.size() <= (aula1.getMaximoAlumnos() / 2)) {
                    System.out.println("No se puede celebrar la clase porque tiene que asistir más del 50% de lo alumnos/as (más de "
                                        + aula1.getMaximoAlumnos() / 2 + " estudiantes).");
                } else {
                    System.out.println("Se ha podido celebrar la clase.");
                    diasDeClase++;

                    System.out.println("Nota de los alumnos:");
                    for (Alumno i : alumnosEnClase) {
                        if (i.getSexo().equals("hombre")) {
                            System.out.print("- " + i.getNombre() + ": " + i.getCalificacionActual());
                            System.out.println((i.getCalificacionActual() >= 5) ? " - Aprobado." : " - Suspenso.");                            
                        }
                    }
                    System.out.println("Nota de las alumnas:");
                    for (Alumno i : alumnosEnClase) {
                        if (i.getSexo().equals("mujer")) {
                            System.out.print("- " + i.getNombre() + ": " + i.getCalificacionActual());                            
                            System.out.println((i.getCalificacionActual() >= 5) ? " - Aprobada." : " - Suspensa.");                            
                        }
                    }
                }
            }
            do {
                System.out.println("¿Quieres avanzar al próximo día? (s/n)");
                String respuesta = sc.nextLine();
                if (respuesta.equalsIgnoreCase("s")) {
                    System.out.println("Avanzando de día.");
                    numDias++;
                    break;
                } else if (respuesta.equalsIgnoreCase("n")) {
                    System.out.println("Terminado. Después de " + numDias + ", se han podido celebrar " 
                                        + diasDeClase + " días de clase.");
                    repetir = false;
                } else {
                    System.out.println("Introduce un carácter válido ('s' para sí, 'n' para no).");
                }
            } while (repetir);
        }
        sc.close();
    }
}
