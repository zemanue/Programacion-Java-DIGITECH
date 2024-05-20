package Tarea9Herencia;

public class Turismo extends Vehiculo {

    // Variable privada
    private int numeroDePlazas;

    // Getter y setter
    public int getNumeroDePlazas() {
        return numeroDePlazas;
    }
    public void setNumeroDePlazas(int numeroDePlazas) {
        this.numeroDePlazas = numeroDePlazas;
    }

    // Método para imprimir datos
	public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("- Número de plazas: " + getNumeroDePlazas());
	}

    // Constructor
    public Turismo(String matricula, String marca, String modelo, String color, int numeroDePuertas, int potencia, int numeroDePlazas) {
        super(matricula, marca, modelo, color, numeroDePuertas, potencia);
        this.numeroDePlazas = numeroDePlazas;
    }




}
