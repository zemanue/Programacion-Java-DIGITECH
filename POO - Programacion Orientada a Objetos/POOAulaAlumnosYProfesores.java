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
profesor de la materia correspondiente en el aula correspondiente (un profesor de
filosofía no puede dar en un aula de matemáticas) y que haya más del 50% de alumnos.

• El objetivo es crear un aula de alumnos y un profesor y determinar si puede darse clase,
teniendo en cuenta las condiciones antes dichas. Si se puede dar clase mostrar cuantos
alumnos y alumnas (por separado) están aprobados de momento (imaginad que les
están entregando las notas).

• NOTA: Los datos pueden ser aleatorios (nombres, edad, calificaciones, etc.) siempre y
cuando tengan sentido (edad no puede ser 80 en un estudiante o calificación ser 12). 
*/

import java.util.Random;

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

        Profesor profesor1 = new Profesor("Jaime Pérez", 33, "hombre", "filosofia");
        if (!profesor1.asisteAClase()) {
            System.out.println("La clase no se puede celebrar porque el profesor no ha podido asistir.");
        } else {
            Aula aula1 = new Aula(001, 8, profesor1.getMateria());

            Alumno joseRamirez = new Alumno("Jose Ramírez", 15, "hombre", 7.2);
            Alumno isabelJohansson = new Alumno("Isabel Johansson", 14, "mujer", 8.5);
            Alumno manuelRedondo = new Alumno("Manuel Redondo", 14, "hombre", 7.9);
            Alumno teresaRuiz = new Alumno("Teresa Ruiz", 15, "mujer", 3.5);
            Alumno ikerJimenez = new Alumno("Íker Jiménez", 14, "hombre", 4.8);
            Alumno luisFuertes = new Alumno("Luis Fuertes", 15, "hombre", 9.6);
            Alumno rosaPrieto = new Alumno("Rosa Prieto", 15, "mujer", 8.1);
            Alumno paulaLluch = new Alumno("Paula Lluch", 15, "mujer", 5.3);
    
            int numAlumnos = 0;
    
            if (joseRamirez.asisteAClase()) {
                numAlumnos++;
            }
            if (isabelJohansson.asisteAClase()) {
                numAlumnos++;
            }
            if (manuelRedondo.asisteAClase()) {
                numAlumnos++;
            }
            if (teresaRuiz.asisteAClase()) {
                numAlumnos++;
            }
            if (ikerJimenez.asisteAClase()) {
                numAlumnos++;
            }
            if (luisFuertes.asisteAClase()) {
                numAlumnos++;
            }
            if (rosaPrieto.asisteAClase()) {
                numAlumnos++;
            }
            if (paulaLluch.asisteAClase()) {
                numAlumnos++;
            }
    
            if (numAlumnos <= (aula1.getMaximoAlumnos() / 2)) {
                System.out.println("No se puede celebrar la clase porque tiene que asistir más del 50% de lo alumnos/as.");
            } else {
                System.out.println("Se ha podido celebrar la clase.");
            }    
        }
    }
}


