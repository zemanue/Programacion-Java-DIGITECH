public class StringMetodos {
    public static void main(String[] args) {
        // Crear una cadena / String
        String cadena = "Hola, Mundo!";

        // Obtener la longitud de la cadena
        int longitud = cadena.length();
        System.out.println("Longitud de la cadena: " + longitud);

        // Obtener un carácter en una posición específica
        char caracterEnPosicion = cadena.charAt(7);
        System.out.println("Carácter en la posición 7: " + caracterEnPosicion);

        // Encontrar la posición de una subcadena / substring
        int posicionSubstring = cadena.indexOf("Mundo");
        System.out.println("Posición de 'Mundo': " + posicionSubstring);

        // Obtener una subcadena / substring
        String subcadena = cadena.substring(0, 5);
        System.out.println("Subcadena desde 0 hasta 5: " + subcadena);

        // Concatenar cadenas
        String nuevaCadena = cadena.concat(" ¡Java es divertido!");
        System.out.println("Nueva cadena concatenada: " + nuevaCadena);

        // Reemplazar caracteres
        String cadenaReemplazada = cadena.replace('o', '0');
        System.out.println("Cadena con 'o' reemplazada por '0': " + cadenaReemplazada);

        // Convertir a minúsculas
        String enMinusculas = cadena.toLowerCase();
        System.out.println("Cadena en minúsculas: " + enMinusculas);

        // Convertir a mayúsculas
        String enMayusculas = cadena.toUpperCase();
        System.out.println("Cadena en mayúsculas: " + enMayusculas);

        // Verificar si una cadena comienza con un prefijo
        boolean empiezaCon = cadena.startsWith("Hola");
        System.out.println("¿La cadena comienza con 'Hola'? " + empiezaCon);

        // Verificar si una cadena termina con un sufijo
        boolean terminaCon = cadena.endsWith("!");
        System.out.println("¿La cadena termina con '!'? " + terminaCon);

        // Comparar cadenas con equals()
        String otraCadena = "Hola, Mundo!";
        boolean sonIguales = cadena.equals(otraCadena);
        System.out.println("¿Las cadenas son iguales? " + sonIguales);

        // Comparar cadenas sin importar mayúsculas o minúsculas con equalsIgnoreCase()
        String mayusculas = "HOLA, MUNDO!";
        boolean sonIgualesIgnorandoMayusculas = cadena.equalsIgnoreCase(mayusculas);
        System.out.println("¿Las cadenas son iguales sin importar mayúsculas o minúsculas? " + sonIgualesIgnorandoMayusculas);

        // Verificar si toda la cadena coincide con un patrón proporcionado dentro del parámetro con matches()
        String coincide = "Hola, Mundo!";
        boolean coincideConPatron = coincide.matches(".*[,!].*");
        System.out.println("¿La cadena contiene caracteres especiales? " + coincideConPatron);

        // Dividir la cadena en palabras con split() (se toma como división cada vez que hay un espacio)
        String[] palabras = cadena.split(" ");
        System.out.println("Palabras en la cadena: " + cadena.length());
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
        
    }
}
