/*
Práctica Archivos I
Crea un fichero de texto con el nombre y contenido que tu quieras. Ahora crea una aplicación
que lea este fichero de texto carácter a carácter y muestre su contenido por pantalla sin
espacios.
Por ejemplo, si un fichero tiene el siguiente texto “Esto es una prueba”, deberá mostrar
“Estoesunaprueba”.
 */

package Excepciones;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileLeerArchivo {

    public static void main(String[] args) {
        File archivo = new File("fichero-de-texto.txt");
        FileReader lector = null;
        try {
            lector = new FileReader(archivo);
            try {
                int caracter;
                while ((caracter = lector.read()) != -1) {
                    if (!Character.isWhitespace((char) caracter)) {
                        System.out.print((char) caracter);
                    }
                }
            } catch (Exception e) {
                System.err.println("Error inesperado: " + e.getMessage());
            } finally {
                lector.close();
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
