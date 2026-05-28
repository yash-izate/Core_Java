package oops.inheritance;

class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("Base: I am setting X now.");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a constructor");
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

}

public class Main {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(45);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setX(100 * 5);
        System.out.println(d.getX());
    }
}