/*
1. Creamos la clase planta, que es una clase abstracta, en un fichero de clase. Con el método
sistema de riego, que devuelve dos opciones: goteo, permanente. Este método recibe un
parámetro que es el tipo de planta(interior, exterior, frutal).
- Crea dos propiedades que se te ocurran para esta clase
- Desde el main, se deben mostrar las dos propiedades que tiene nuestra clase abstracta.
- Desde main, utilizar el método sistema de riego. */

package Abstractas;

public abstract class Planta {

    protected String nombre;
    protected String tipoDePlanta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDePlanta() {
        return tipoDePlanta;
    }

    public void setTipoDePlanta(String tipoDePlanta) {
        this.tipoDePlanta = tipoDePlanta;
    }

    public void sistemaDeRiego(String tipoDePlanta) {
        System.out.print("Sistema de riego: ");
        if (tipoDePlanta.equalsIgnoreCase("interior")) {
            System.out.println("Riego por goteo.");
        } else if(tipoDePlanta.equalsIgnoreCase("exterior") || tipoDePlanta.equalsIgnoreCase("frutal")) {
            System.out.println("Riego permanente.");
        } else {
            System.out.println("El tipo de planta no es válido.");
        }
    }

    public void mostrarPropiedades() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo de planta: " + tipoDePlanta);
    }

    public static void main(String[] args) {

        Planta ficus = new PlantaDeInterior("ficus", "interior");
        ficus.mostrarPropiedades();
        ficus.sistemaDeRiego(ficus.getTipoDePlanta());
        System.out.println("");

        Planta calendula = new PlantaDeInterior("caléndula", "exterior");
        calendula.mostrarPropiedades();
        calendula.sistemaDeRiego(calendula.getTipoDePlanta());
        System.out.println("");

        Planta limonero = new PlantaDeInterior("limonero", "frutal");
        limonero.mostrarPropiedades();
        limonero.sistemaDeRiego(limonero.getTipoDePlanta());
        System.out.println("");
    }
}

class PlantaDeInterior extends Planta {

    // Constructor
    public PlantaDeInterior(String nombre, String tipoDePlanta) {
        this.nombre = nombre;
        this.tipoDePlanta = tipoDePlanta;
    }
}

class PlantaDeExterior extends Planta {

    // Constructor
    public PlantaDeExterior(String nombre, String tipoDePlanta) {
        this.nombre = nombre;
        this.tipoDePlanta = tipoDePlanta;
    }
}

class PlantaFrutal extends Planta {

    // Constructor
    public PlantaFrutal(String nombre, String tipoDePlanta) {
        this.nombre = nombre;
        this.tipoDePlanta = tipoDePlanta;
    }
}
