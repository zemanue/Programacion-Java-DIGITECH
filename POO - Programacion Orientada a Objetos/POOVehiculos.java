class Vehicle {
    private String color;
    private int doors;
    
    // Getter
    public String getColor() {
        return color;
    }
    public int getDoors() {
        return doors;
    }
    
    // Setter
    public void setColor(String c) {
        this.color = c;
    }
    public void setDoors(int d) {
        this.doors = d;
    }
}


public class POOVehiculos {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.setColor("Red");
        System.out.println("Color: " + v1.getColor());
        v1.setDoors(5);
        System.out.println("Doors: " + v1.getDoors());
    }
}
