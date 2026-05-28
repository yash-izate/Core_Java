package basic;

class Car {

    // Private variables
    private String brand;
    private int speed;

    // Default constructor
    public Car() {
        brand = "Unknown";
        speed = 0;
    }

    // Parameterized constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    // Setter methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Other method
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

public class Main {

    public static void main(String[] args) {

        // Using default constructor
        Car c1 = new Car();

        c1.display();

        System.out.println();

        // Using parameterized constructor
        Car c2 = new Car("BMW", 220);

        c2.display();

        System.out.println();

        // Using setters
        c1.setBrand("Audi");
        c1.setSpeed(180);

        // Using getters
        System.out.println(c1.getBrand());
        System.out.println(c1.getSpeed());
    }
}