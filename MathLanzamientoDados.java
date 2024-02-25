//5. Explica el siguiente código y define un posible enunciado:

public class MathLanzamientoDados {
    public static void main(String[] args) {
        
        /*Enunciado del ejercicio: 
        Diseña un código que represente a 2 personas participando en un juego de dados (del 1 al 6). 
        Cada jugador lanza una vez, y el que saque mayor cantidad es el ganador.
        */
        
        System.out.println("Se presentan los participantes. A continuación, hará su lanzamiento el jugador 1");

        //Generación de 2 números aleatorios entre 0,5 y 6
        double aux1 = (Math.random()*6)+0.5; 
        double aux2 = (Math.random()*6)+0.5;

        //Redondeo de los números aleatorios a números enteros, simulando el resultado de un dado de 6 caras.
        double intento1 = Math.round(aux1);
        double intento2 = Math.round(aux2);

        //Se adjudica cada intento a un jugador
        int jugador1 = (int)intento1;
        int jugador2 = (int)intento2;
        System.out.println("El jugador 1 ha sacado: " + jugador1 + " y el jugador 2 ha sacado: " + jugador2);

        //Se anuncia la cifra mayor como ganadora
        int ganador = Math.max(jugador1, jugador2);
        System.out.println("Quien sacó " + ganador + " es el ganador.");

    }
}
