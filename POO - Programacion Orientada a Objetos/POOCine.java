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
(continuación del ejercicio, sacado de https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-programacion-orientado-a-objetos-java/)

8 A 8 B 8 C 8 D 8 E 8 F 8 G 8 H 8 I
7 A 7 B 7 C 7 D 7 E 7 F 7 G 7 H 7 I
6 A 6 B 6 C 6 D 6 E 6 F 6 G 6 H 6 I
5 A 5 B 5 C 5 D 5 E 5 F 5 G 5 H 5 I
4 A 4 B 4 C 4 D 4 E 4 F 4 G 4 H 4 I
3 A 3 B 3 C 3 D 3 E 3 F 3 G 3 H 3 I
2 A 2 B 2 C 2 D 2 E 2 F 2 G 2 H 2 I
1 A 1 B 1 C 1 D 1 E 1 F 1 G 1 H 1 I

Realizaremos una pequeña simulación, en el que generaremos muchos espectadores y los sentaremos aleatoriamente (no podemos donde ya este ocupado).
En esta versión sentaremos a los espectadores de uno en uno.

Solo se podrá sentar si tienen el suficiente dinero, hay espacio libre y tiene edad para ver la película, en caso de que el asiento este ocupado le buscamos uno libre.
Los datos del espectador y la película pueden ser totalmente aleatorios.
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

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

    static ArrayList<Pelicula> peliculasProyectadas = new ArrayList<>();
    static ArrayList<Espectador> espectadores = new ArrayList<>();
    static double precioEntrada = 8.90;
    static Asiento[][] asientos = new Asiento[8][9];

    static boolean repetir = true;
    static int numDias = 1, numSesion = 1;
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        //Registrar las películas en la lista de películas proyectadas
        peliculasProyectadas.add(new Pelicula("Civil War", 169, 18, "Alex Garland"));
        peliculasProyectadas.add(new Pelicula("The Garfield Movie", 101, 0, "Mark Dindal"));
        peliculasProyectadas.add(new Pelicula("Immaculate", 89, 18, "Michael Mohan"));
        peliculasProyectadas.add(new Pelicula("The Fall Guy", 125, 12, "David Leitch"));
        peliculasProyectadas.add(new Pelicula("Challengers", 132, 16, "Luca Guadagnino"));
        peliculasProyectadas.add(new Pelicula("Dragonkeeper", 100, 0, "Salvador Simó"));

        // Rellenar los asientos automáticamente con letras de la A a la J (9 columnas) y números del 1 al 8 (8 filas)
        for (int i = asientos.length-1; i >= 0; i--) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = new Asiento((char) ('A' + j), i + 1);
            }
        }

        //Añadir personas a la lista de espectadores
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
        espectadores.add(new Espectador("Samira Conde", 15, 21.80));
        espectadores.add(new Espectador("Juan Miguel Forqué", 31, 56.50));
        espectadores.add(new Espectador("Sandra Pizarro", 40, 105.10));
        espectadores.add(new Espectador("Carla Mansilla", 71, 570.20));
        espectadores.add(new Espectador("Jessica Frances", 37, 84.60));
        espectadores.add(new Espectador("Carlos Buendia", 38, 62.90));
        espectadores.add(new Espectador("Sergi Buendia", 10, 10.00));
        espectadores.add(new Espectador("Mar Fuentes", 24, 101.40));
        espectadores.add(new Espectador("Xavi Montes", 19, 90.10));
        espectadores.add(new Espectador("Amanda Cuesta", 13, 3.00));
        espectadores.add(new Espectador("Antonio Fernández", 30, 78.90));
        espectadores.add(new Espectador("Ángela Torres", 25, 32.00));     


        System.out.println("Bienvenido al cine. Contamos con solo una sala de cine, pero hacemos 3 sesiones al día.");
        while (repetir) {
            System.out.println("Día " + numDias + ", sesión " + numSesion);
            int numPelicula = random.nextInt(0, 6);
            System.out.println("Se va a proyectar " + peliculasProyectadas.get(numPelicula).getTitulo());
            //Añadir una pregunta al usuario sobre si quiere verla: si sí, pregunta sus datos. Si no, pasa a la siguiente sesión.

            System.out.println("Escribe tus datos a continuación: ");
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            if (edad < peliculasProyectadas.get(numPelicula).getEdadMinima()) {
                System.out.println("Lo siento, la película es para personas mayores de " + peliculasProyectadas.get(numPelicula).getEdadMinima());
                System.out.println("Prueba otra sesión en la que la película sea adecuada a tu edad.");
            } else {
                System.out.print("Dinero que tienes contigo: ");
                double dineroQueTiene = sc.nextDouble();
                sc.nextLine();
                if (dineroQueTiene < precioEntrada) {
                    System.out.println("Lo siento, no tienes dinero suficiente para entrar al cine. La entrada cuesta " + precioEntrada + " euros.");
                } else {
                    System.out.println("Muy bien, puedes entrar a ver la película.");
                    System.out.print("Nombre y primer apellido: ");
                    String nombre = sc.nextLine();
                    Espectador espectadorTu = new Espectador(nombre, edad, dineroQueTiene);

                    System.out.println("La sala tiene " + asientos.length + " filas y " + asientos[0].length + " columnas.");
                    System.out.println("Asientos ocupados: ");
                    adjudicarAsientos(numPelicula);
                    
                }
            }
            while (repetir) {
                System.out.println("¿Quieres ver la próxima película que se proyecte? (s/n)");
                String respuesta = sc.nextLine();
                if (respuesta.equalsIgnoreCase("s")) {
                    if (numSesion >= 3) {
                        numDias++;
                        numSesion = 1;
                        break;
                    } else {
                        numSesion++;
                        break;
                    }
                } else if (respuesta.equalsIgnoreCase("n")) {
                    System.out.println("Gracias por venir, vuelve cuando quieras.");
                    repetir = false;
                } else {
                    System.out.println("Introduce un carácter válido ('s' para sí, 'n' para no).");
                }
            }
        }
            sc.close();
    }

    public static void adjudicarAsientos(int numPelicula) {
        for (Espectador espectador : espectadores) {
            // Si la edad del espectador es >= edad mínima permitida y tiene suficiente dinero, se procede a asignar un asiento
            if (espectador.getEdad() >= peliculasProyectadas.get(numPelicula).getEdadMinima()
                    && espectador.getDineroQueTiene() >= precioEntrada) {                            
                //Se genera un número aleatorio de fila y columna, y se comprueba que no se haya ocupado el asiento.
                boolean numRepetido = true;
                while (numRepetido) {
                    int fila = random.nextInt(asientos.length);
                    int columna = random.nextInt(asientos[0].length);
                    //Si el asiento no está ocupado
                    if (!asientos[fila][columna].isOcupado()) {
                        System.out.print(asientos[fila][columna].getColumna() + "" + asientos[fila][columna].getFila() + ": ");
                        System.out.println(espectador.getNombre());
                        asientos[fila][columna].setOcupado(true); //El asiento pasa a estar ocupado y ya no puede ser elegido de nuevo
                        numRepetido = false;
                    }
                }
            }
        }
    }

    public static void imprimirAsientos() {
        for (int i = asientos.length-1; i >= 0; i--) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j].getColumna() + "" + asientos[i][j].getFila() + " ");
            }
            System.out.println("");
        }
    }
}
