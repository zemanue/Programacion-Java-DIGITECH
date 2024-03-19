/*
1. Diseña un programa en Java que crea un arraylist, que contiene los nombres de 4
personas. Mostrar los datos del array al completo.
 */


import java.util.ArrayList;

public class ArrayListNombresPersonas {
    public static void main(String[] args) {

        ArrayList<String> personas = new ArrayList<String>();

        personas.add("Jose Redondo");
        personas.add("Manuel Conde");
        personas.add("Isabel Johansson");
        personas.add("Beatriz Ramos");

        System.out.println("Datos de las personas:");
        System.out.println(personas);
    
    }
}
