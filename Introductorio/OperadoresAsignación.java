public class OperadoresAsignación {
    public static void main(String[] args) {

    double saldo = 105.50;

    System.out.println("Tu saldo inicial era de: " + saldo + " euros.");

    saldo+=27.50;
    saldo*=2;
    saldo/=2;
    saldo+=250.38;
    saldo-=55.37;
    saldo+=1200.96;

    System.out.println("Tu saldo ahora es de: " + saldo + " euros.");

    saldo-=85.23;

    System.out.println("Tu saldo final después de la cena es de: " + saldo + " euros.");

    }
}
