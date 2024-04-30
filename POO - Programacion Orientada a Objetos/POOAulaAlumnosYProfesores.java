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

class Persona {
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


    // método asisteONo()???

    // constructor Persona???
}

class Alumno extends Persona {
    private double calificacionActual;

    //Getter y setter
    public double getCalificacionActual() {
        return calificacionActual;
    }
    public void setCalificacionActual(double calificacionActual) {
        this.calificacionActual = calificacionActual;
    }

    public boolean asisteONo() {
        Random probabilidad = new Random; //genera número del 0-100
        if (probabilidad < 50) {
            boolean asisteAClase = false;
        } else {
            boolean asisteAClase = true;
        }
    }

    //Constructor
    public Alumno(String nombre, int edad, String sexo, double calificacionActual) {
        super(nombre);
        super(edad);
        super(sexo);
        this.calificacionActual = calificacionActual;
    }
}

class Profesor extends Persona {
    private String materia;

    //Getter y setter
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }

    public boolean asisteONo() {
        Random probabilidad = new Random; //genera número del 0-10
        if (probabilidad < 20) {
            return false;
        } else {
            return true;
        }
    }

    //Constructor
    public Alumno(String nombre, int edad, String sexo, String materia) {
        super(nombre);
        super(edad);
        super(sexo);
        this.materia = materia;
    }
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
        // if profesor1.asisteONo(), se puede celebrar la clase; else, no se puede.
        Aula aula1 = new Aula(001, 8, profesor1.getMateria);

        Alumno joseRamirez = new Alumno("Jose Ramírez", 15, "hombre", 7.2);
        Alumno isabelJohansson = new Alumno("Isabel Johansson", 14, "mujer", 8.5);
        Alumno manuelRedondo = new Alumno("Manuel Redondo", 14, "hombre", 7.9);
        Alumno teresaRuiz = new Alumno("Teresa Ruiz", 15, "mujer", 3.5);
        Alumno ikerJimenez = new Alumno("Íker Jiménez", 14, "hombre", 4.8);
        Alumno luisFuertes = new Alumno("Luis Fuertes", 15, "hombre", 9.6);
        Alumno rosaPrieto = new Alumno("Rosa Prieto", 15, "mujer", 8.1);
        Alumno paulaLluch = new Alumno("Paula Lluch", 15, "mujer", 5.3);

        int numAlumnos = 0;

        if (joseRamirez.asisteONo()) {
            numAlumnos++;
        }
        if (isabelJohansson.asisteONo()) {
            numAlumnos++;
        }
        if (manuelRedondo.asisteONo()) {
            numAlumnos++;
        }
        if (teresaRuiz.asisteONo()) {
            numAlumnos++;
        }
        if (ikerJimenez.asisteONo()) {
            numAlumnos++;
        }
        if (luisFuentes.asisteONo()) {
            numAlumnos++;
        }
        if (rosaPrieto.asisteONo()) {
            numAlumnos++;
        }
        if (paulaLluch.asisteONo()) {
            numAlumnos++;
        }

        if (numAlumnos <= (aula1.getMaximoAlumnos / 2)) {
            // no se puede dar clase
        } else {
            // se puede dar clase
        }
    }
}


