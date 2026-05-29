package oops.inheritance;

import java.util.Scanner;

class Circle {

    private final float radius;

    // Constructor
    public Circle(float radius) {
        this.radius = radius;
    }

    // Getter
    public float getRadius() {
        return radius;
    }

    // Method
    public float calculateArea() {
        return (float) (Math.PI * radius * radius);
    }

    // Display method
    public void displayCircle() {
        System.out.println("Radius: " + radius);
        System.out.println("Circle Area: " + calculateArea());
    }
}


class Cylinder extends Circle {

    private final float height;

    // Constructor
    public Cylinder(float radius, float height) {

        // Calling parent constructor
        super(radius);

        this.height = height;
    }

    // Getter
    public float getHeight() {
        return height;
    }

    // Method
    public float calculateVolume() {
        return (float) (Math.PI * Math.pow(getRadius(), 2) * height);
    }

    // Method
    public float calculateSurfaceArea() {
        return (float) (2 * Math.PI * getRadius()
                * (height + getRadius()));
    }

    // Display method
    public void displayCylinder() {

        System.out.println("Height: " + height);

        System.out.println("Cylinder Volume: "
                + calculateVolume());

        System.out.println("Cylinder Surface Area: "
                + calculateSurfaceArea());
    }
}

public class CalculateArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        float radius = sc.nextFloat();

        System.out.print("Enter height: ");
        float height = sc.nextFloat();

        // Constructor called here
        Cylinder obj = new Cylinder(radius, height);

        System.out.println("\n--- Circle Details ---");
        obj.displayCircle();

        System.out.println("\n--- Cylinder Details ---");
        obj.displayCylinder();

        sc.close();
    }
}