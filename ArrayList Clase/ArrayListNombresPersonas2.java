/*
3. Diseña un arrayList con los siguientes datos:
• Sofía
• Chema
• Alex
• Rosa
Consideraciones
• Mostrar con la propiedad pertinente el tamaño del arraylist.
• Buscar el valor de Juan, con el método en cuestión para ver si lo contiene.
Mostrar el mensaje si lo contiene o no, según proceda.
• Borra el ultimo element del arraylist
*/

import java.util.ArrayList;

public class ArrayListNombresPersonas2 {
    public static void main(String[] args) {

        ArrayList<String> personas = new ArrayList<String>();

        personas.add("Sofía");
        personas.add("Chema");
        personas.add("Alex");
        personas.add("Rosa");

        System.out.println("Datos de las personas:");
        System.out.println(personas);

        System.out.println("Tamaño del array list: " + personas.size());

        if (personas.contains("Juan")) {
            System.out.println("La lista contiene el elemento 'Juan'.");
        } else {
            System.out.println("La lista no contiene el elemento 'Juan'.");
        }
    
        personas.removeLast();

        System.out.println("Datos de las personas después de eliminar el último elemento:");
        System.out.println(personas);

    }
}
