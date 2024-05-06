/*
1. Creamos la clase planta, que es una clase abstracta, en un fichero de clase. Con el método
sistema de riego, que devuelve dos opciones: goteo, permanente. Este método recibe un
parámetro que es el tipo de planta(interior, exterior, frutal).
- Crea dos propiedades que se te ocurran para esta clase
- Desde el main, se deben mostrar las dos propiedades que tiene nuestra clase abstracta.
- Desde main, utilizar el método sistema de riego. */

package abstractas;

public abstract class Planta {

    protected String tipoDePlanta;
    protected double litrosDeAgua = 0;

    public String getTipoDePlanta() {
        return tipoDePlanta;
    }

    public void setTipoDePlanta(String tipoDePlanta) {
        this.tipoDePlanta = tipoDePlanta;
    }

    public double getLitrosDeAgua() {
        return litrosDeAgua;
    }

    public void setLitrosDeAgua(double litrosDeAgua) {
        this.litrosDeAgua = litrosDeAgua;
    }

    public void sistemaDeRiego(String tipoDePlanta) {
        if (tipoDePlanta.equalsIgnoreCase("interior")) {
            System.out.println("Regando por goteo.");
            litrosDeAgua += 0.1;
        } else if(tipoDePlanta.equalsIgnoreCase("exterior") || tipoDePlanta.equalsIgnoreCase("frutal")) {
            System.out.println("Riego permanente.");
            litrosDeAgua += 10;
        } else {
            System.out.println("");
        }
    };

    public static void main(String[] args) {
        
        System.out.println("Los datos de mi clase abstracta son ");

    }
}
