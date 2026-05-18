package oops.classes;

class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void showX() {
        System.out.println("Value of X = " + x);
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void showY() {
        System.out.println("Value of Y = " + y);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();

        b.setX(101);   // 101 is set in b object
        System.out.println(d.getX());  // for d object x is still 0

        d.setX(100);
        System.out.println(d.getX());
        System.out.println(b.getX());
    }
}