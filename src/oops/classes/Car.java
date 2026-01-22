package oops.classes;

public class Car {
    public int noOfWheels;
    public String colour;
    public float maxSpeed;
    public float currentFuel;
    public int noOfSeats;

    public void drive() {
        if (currentFuel <= 0) {
            System.out.println("Car is out of fuel.");
        } else if (currentFuel < 5) {
            System.out.println("Car is in reserved mode, please refuel");

        } else {
            System.out.println("Car is driving.");
            currentFuel--;
        }
    }

    public void addFuel(float fuel) {
        currentFuel += fuel;
    }

    public float getCurrentFuel() {
        return currentFuel;
    }

}