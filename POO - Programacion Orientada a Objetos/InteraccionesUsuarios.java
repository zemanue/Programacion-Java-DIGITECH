import java.util.Scanner;

public class InteraccionesUsuarios {

    static Scanner sc = new Scanner(System.in);

    public static boolean IntentaSalir(String string) {

        if (string.equalsIgnoreCase("salir")) {
            System.out.println("Saliendo al menú.");
            return true;
        }

        return false;
    }

    public static String PedirString(String titulo) {
        System.out.println(titulo);
        return sc.nextLine();
    }

    public static int PedirNumero(String titulo) {
        System.out.println(titulo);
        return sc.nextInt();
    }
    
}
