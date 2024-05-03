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

import java.util.ArrayList;
import java.util.Scanner;

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
    public Asiento(char columna, int fila) {
        this.columna = columna;
        this.fila = fila;
        this.ocupado = false;
    }
}

public class POOCine {
    public static void main(String[] args) {
        ArrayList<Pelicula> peliculasProyectadas = new ArrayList<>();
        peliculasProyectadas.add(new Pelicula("Civil War", 169, 18, "Alex Garland"));
        peliculasProyectadas.add(new Pelicula("The Garfield Movie", 101, 0, "Mark Dindal"));
        peliculasProyectadas.add(new Pelicula("Immaculate", 89, 18, "Michael Mohan"));
        peliculasProyectadas.add(new Pelicula("The Fall Guy", 125, 12, "David Leitch"));
        peliculasProyectadas.add(new Pelicula("Challengers", 132, 16, "Luca Guadagnino"));
        peliculasProyectadas.add(new Pelicula("Dragonkeeper", 100, 0, "Salvador Simó"));

        double precioEntrada = 8.90;

        Asiento[][] asientos = new Asiento[8][9];
        // Rellenar automáticamente con letras de la A a la J (9 columnas) y números del 1 al 8 (8 filas)
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = new Asiento((char) ('A' + j), i + 1);
            }
        }

        ArrayList<Espectador> espectadores = new ArrayList<>();
                espectadores.add(new Espectador("Jose Ramírez", 21, 50.15));
                espectadores.add(new Espectador("Isabel Johansson", 29, 76.35));
                espectadores.add(new Espectador("Manuel Redondo", 27, 80.25));
                espectadores.add(new Espectador("Teresa Ruiz", 18, 17.90));
                espectadores.add(new Espectador("Íker Jiménez", 42, 3.50));
                espectadores.add(new Espectador("Luis Fuertes", 50, 90.35));
                espectadores.add(new Espectador("Rosa Prieto", 61, 9.10));
                espectadores.add(new Espectador("Paula Lluch", 38, 54.60));
                espectadores.add(new Espectador("Jaime Reque", 46, 150.99));
                espectadores.add(new Espectador("Esperanza Costas", 13, 4));
                espectadores.add(new Espectador("Dylan Montiel", 35, 96.45));
                espectadores.add(new Espectador("Samira Conde", 19, 21.80));
                espectadores.add(new Espectador("Juan Miguel Forqué", 31, 56.50));
                espectadores.add(new Espectador("Sandra Pizarro", 40, 105.10));
                espectadores.add(new Espectador("Carla Mansilla", 71, 570.20));
                espectadores.add(new Espectador("Jessica Frances", 37, 84.60));
                espectadores.add(new Espectador("Carlos Buendia", 38, 62.90));
                espectadores.add(new Espectador("Sergi Buendia", 10, 10.00));

        
        boolean repetir = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al cine.");
        while (repetir) {
            System.out.println("¿Qué película quieres ver? Escribe el número correspondiente");
            for (int i = 0; i < peliculasProyectadas.size(); i++) {
                System.out.println((i + 1) + ". " + peliculasProyectadas.get(i).getTitulo());
            }
            int numPelicula = sc.nextInt();
            sc.nextLine();
            if (numPelicula < 1 || numPelicula > 6) {
                System.out.println("Introduce un número válido (entre 1 y " + peliculasProyectadas.size() + ").");
            } else {
                System.out.println("Vas a ver " + peliculasProyectadas.get(numPelicula - 1).getTitulo());
            }

            System.out.println("Escribe tus datos a continuación: ");
            System.out.println("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            if (edad < peliculasProyectadas.get(numPelicula - 1).getEdadMinima()) {
                System.out.println("Lo siento, la película es para personas mayores de " + peliculasProyectadas.get(numPelicula - 1).getEdadMinima());
                System.out.println("Prueba otra película adecuada para tu edad.");
            } else {
                System.out.println("Dinero que tienes contigo: ");
                double dineroQueTiene = sc.nextDouble();
                sc.nextLine();
                if (dineroQueTiene < precioEntrada) {
                    System.out.println("Lo siento, no tienes dinero suficiente para entrar al cine. La entrada cuesta " + precioEntrada + " euros.");
                } else {
                    System.out.println("Muy bien, puedes entrar a ver la película.");
                    System.out.print("Nombre y primer apellido: ");
                    String nombre = sc.nextLine();
                    Espectador espectadorTu = new Espectador(nombre, edad, dineroQueTiene);
                    espectadores.add(espectadorTu);
                }
            }
        }

            sc.close();
    }
}
