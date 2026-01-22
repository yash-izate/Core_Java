package oops.test;

import oops.classes.Car;

public class Driver {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.colour = "Red";
        myCar.maxSpeed = 300;
        myCar.noOfWheels = 4;
        myCar.noOfSeats = 6;

        myCar.addFuel(6);
        myCar.drive();
        System.out.println(myCar.getCurrentFuel());

        myCar.drive();
        System.out.println(myCar.getCurrentFuel());

        myCar.drive();
        System.out.println(myCar.getCurrentFuel());
    }
}