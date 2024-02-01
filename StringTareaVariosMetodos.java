/*2.Diseña un objeto de tipo String que pide por teclado un grupo de dos-tres palabras.
Implementar los siguientes métodos:
• Imprimir la primera mitad de los caracteres de la cadena
• Imprimir el último carácter
• Imprimir la cadena de forma inversa
• Imprimir cada carácter del String separado por un guión
• Imprimir la cantidad de vocales almacenadas
NOTA: Verificar si la cadena se lee igual de izquierda a derecha tanto como de derecha
a izquierda.
 */
import java.util.Scanner;

public class StringTareaVariosMetodos {
    public static void main(String[] args) {
        System.out.println("Inserta una cadena de texto de dos-tres palabras: ");
        Scanner entradaUsuario = new Scanner(System.in);
        String cadena = entradaUsuario.nextLine();

        cadena = cadena.trim();
        String[] cadenaPorPalabras = cadena.split(" ");
        
        //IF: si la cadena tiene dos palabras o tres
        if (cadenaPorPalabras.length == 2 || cadenaPorPalabras.length == 3) {

            //Imprimir la primera mitad de los caracteres de la cadena
            System.out.println("La primera mitad de la cadena es: " + cadena.substring(0, cadena.length()/2));

            //Imprimir el último carácter
            System.out.println("El último carácter es: " + cadena.substring(cadena.length()-1));

            //Imprimir la cadena de forma inversa
            //Bucle for que imprime desde el último carácter (cadena.length()-1) hasta el primero de manera consecutiva
            System.out.print("De forma invertida, la cadena se escribe así: ");
            for (int contador=1; contador<=cadena.length();contador++) {
                System.out.print(cadena.substring(cadena.length()-contador, cadena.length()-contador+1));
            }
            System.out.println("");

            //Imprimir cada carácter del String separado por un guión
            //Bucle for que imprime cada carácter + un guion sin saltar de línea, desde el primero hasta el último
            System.out.print("Cada carácter de la cadena separado por un guion: ");
            for (int contador=0; contador<cadena.length();contador++) {
                System.out.print(cadena.substring(contador, contador+1)+"-");
            }
            System.out.println("");

            //Imprimir la cantidad de vocales almacenadas: matches()
            //Bucle for que vaya yendo letra por letra, comprobando si coincide con alguna vocal, en cuyo caso se suma uno a "vocales"
            System.out.print("La cadena tiene las siguientes vocales: ");
            int vocales = 0;
            for(int contador=0; contador<cadena.length();contador++){
                if (cadena.substring(contador, contador+1).matches(".*[aeiou].*")) {
                    vocales++;
                }
            }
            System.out.println("");
            System.out.println("La cadena tiene " + vocales + " vocales.");

            //Implementar un método que verifique si la cadena se lee igual de izquierda a derecha tanto como de derecha a izquierda
            //Convertir la cadena a minúsculas para comparar adecuadamente
            String cadenaMin = cadena.toLowerCase();
            int palindromo = 0;
            //Bucle for para comprobar desde la primera letra hasta la letra intermedia
            for (int contador=0; contador<cadenaMin.length()/2;contador++ ) {
                
                //Bucle IF: comprobar que la letra en la posición contador es la misma que la letra en la última posición - contador
                if (cadenaMin.charAt(contador) != cadenaMin.charAt(cadenaMin.length()-1-contador)) {
                palindromo++;
                }
            }
            if (palindromo!=0) {
                System.out.println("La cadena no es un palíndromo: no se lee igual de izquierda a derecha que de derecha a izquierda");
            }
            else {
                System.out.println("La cadena se lee igual de izquierda a derecha que de derecha a izquierda");
                System.out.println("¡Es un palíndromo!");
                }

        }
        else {
            System.out.println("El texto introducido tiene que tener entre 2 y 3 palabras");
        }
        
        entradaUsuario.close();
    }
}
