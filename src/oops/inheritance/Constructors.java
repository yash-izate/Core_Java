package oops.inheritance;

class Base1 {
    int x;

    public Base1() {
        System.out.println("I am a base constructor");
    }

    public Base1(int x) {
        System.out.println("I am x base constructor with value x: " + x);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1 {
    int y;

    Derived1() {
//        super(1);
        System.out.println("I am a derived constructor");
    }

    Derived1(int x, int y) {
//        super(10);
        System.out.println("I am an overloaded constructor with value of x:  " + x + " and y: " + y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Child extends Derived1 {
    int z;

    Child() {
        System.out.println("I am a child of derived class.");
    }

    Child(int x, int y, int z) {
        super(111, 222);
        System.out.println("Child: x =" + x + " y = " + y + " z = " + z);
    }
}

public class Constructors {
    public static void main(String[] args) {
//        Base1 b1 = new Base1();
//        Derived1 d1 = new Derived1();
//        Derived1 d2 = new Derived1(-10, -20);
//        Child c1 = new Child();
        Child c2 = new Child(5, 6, 7);
    }
}