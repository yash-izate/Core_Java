package oops.abstraction;

abstract class Animal {

    Animal() {
        System.out.println("I am a Animal");
    }

    // Abstract Methods
    public abstract void sound();

    public abstract void eat();

    // Normal methods
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dogs Barks!");
    }

    public void eat() {
        System.out.println("Dog eat bones.");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat Meows!");
    }

    public void eat() {
        System.out.println("Cat eat mice.");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        //Runtime Polymorphism
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        // Calling Methods
        System.out.println();
        a1.sound();
        a1.sleep();
        System.out.println();
        a2.sound();
        a2.sleep();
        System.out.println();

        // Objects
        Cat c1 = new Cat();
        c1.eat();

    }
}