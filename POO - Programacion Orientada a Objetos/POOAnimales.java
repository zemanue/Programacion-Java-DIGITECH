

class Perro {
    String nombre;
    void ladrar() { 
        System.out.println(nombre + ": Guau Guau!");
    }
}
        
public class POOAnimales {
    public static void main(String[ ] args) {
        Perro perro1 = new Perro();
        perro1.nombre = "Toby";
        perro1.ladrar();
        
        Perro perro2 = new Perro();
        perro2.nombre = "Max";
        perro2.ladrar();
    }
}




