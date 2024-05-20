
package Tarea9Herencia;

public class Vehiculo {

    // Variables privadas
    private String matricula, marca, modelo, color;
    private int numeroDePuertas, potencia;
    
    // Getters
    public String getMatricula() {
        return matricula;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getColor() {
        return color;
    }
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }
    public int getPotencia() {
        return potencia;
    }

    // Setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    // Método para imprimir datos
	public void imprimirDatos() {
		System.out.println("- Matrícula: "+ getMatricula());
		System.out.println("- Marca: "+ getMarca());
		System.out.println("- Modelo: "+ getModelo());
		System.out.println("- Color: "+ getColor());
		System.out.println("- Puertas: "+ getNumeroDePuertas());
		System.out.println("- Potencia en caballos: "+ getPotencia());
	}

    // Constructor
    public Vehiculo(String matricula, String marca, String modelo, String color, int numeroDePuertas, int potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numeroDePuertas = numeroDePuertas;
        this.potencia = potencia;
    }
}
