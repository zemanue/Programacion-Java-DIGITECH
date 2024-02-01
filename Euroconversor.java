import java.util.Scanner;
public class Euroconversor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println ("Escribe un importe en euros: ");
        double euros = entrada.nextDouble();
        
        double libras = euros*0.86270;

        System.out.println(euros + " euros en libras equivalen a: " + libras + " libras.");

        entrada.close();
        }
}
