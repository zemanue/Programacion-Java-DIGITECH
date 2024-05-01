/*
2. Nos piden hacer un programa orientado a objetos sobre un cine (solo de una sala) que tiene 
un conjunto de asientos (8 filas por 9 columnas, por ejemplo).

• Del cine nos interesa conocer la película que se está reproduciendo y el precio de la
entrada en el cine.

• De las películas nos interesa saber el título, duración, edad mínima y director.

• Del espectador, nos interesa saber su nombre, edad y el dinero que tiene.

• Los asientos son etiquetados por una letra (columna) y un número (fila), la fila 1
empieza al final de la matriz como se muestra en la tabla. También deberemos saber si está
ocupado o no el asiento.
*/

class Pelicula {
    private String titulo; 
    private int duracionMinutos;
    private int edadMinima;
    private String director;
    //Getters y setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getDuracionMinutos() {
        return duracionMinutos;
    }
    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
    public int getEdadMinima() {
        return edadMinima;
    }
    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    //Constructor
    public Pelicula(String titulo, int duracionMinutos, int edadMinima, String director) {
    this.titulo = titulo;
    this.duracionMinutos = duracionMinutos;
    this.edadMinima = edadMinima;
    this.director = director;
    }
    
}

class Espectador {
    private String nombre;
    private int edad;
    private double dineroQueTiene;

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
    public double getDineroQueTiene() {
        return dineroQueTiene;
    }
    public void setDineroQueTiene(double dineroQueTiene) {
        this.dineroQueTiene = dineroQueTiene;
    }
    
    //Constructor
    public Espectador(String nombre, int edad, double dineroQueTiene) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroQueTiene = dineroQueTiene;
    }
}

class Asiento {
    private char columna;
    private int fila;
    private boolean ocupado;

    //Getters y setters
    public char getColumna() {
        return columna;
    }
    public void setColumna(char columna) {
        this.columna = columna;
    }
    public int getFila() {
        return fila;
    }
    public void setFila(int fila) {
        this.fila = fila;
    }
    public boolean isOcupado() {
        return ocupado;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    //Constructor
    public Asiento(char columna, int fila, boolean ocupado) {
        this.columna = columna;
        this.fila = fila;
        this.ocupado = ocupado;
    }
}

public class POOCine {
    public static void main(String[] args) {
        String peliculaProyectada;
        double precioEntrada;

        Asiento[][] asientos = new Asiento[8][9];
        //Rellenar automáticamente con letras de la A a la J (9 columnas) y números del 1 al 8 (filas)
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {

            }
        }

    }
}
