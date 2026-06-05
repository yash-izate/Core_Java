package oops.abstraction;

interface Bicycle {
    int a = 45;

    void applyBrakes(int decrement);

    void speedUp(int increment);
}

interface HornBicycle {

    void blowHorn3kg();

    void blowHornmhn();

}

class AvonCycle implements Bicycle, HornBicycle {
    void blowHorn() {
        System.out.println("Horn Pee Poo");
    }

    @Override
    public void blowHorn3kg() {
        System.out.println("Pik Pik");
    }

    @Override
    public void blowHornmhn() {
        System.out.println("Bhooo Bhooo");
    }

    @Override
    public void applyBrakes(int decrement) {
        System.out.println("Applying Brakes");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Applying Speed");

    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrakes(10);
        cycleHarry.speedUp(20);

//     you can create properties in Interfaces
        System.out.println(Bicycle.a);

//     you cannot modify the properties in Interfaces as they are final

    }
}