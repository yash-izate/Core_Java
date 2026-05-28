package oops.inheritance;

class Base1 {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1 {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Constructors {
    public static void main(String[] args) {

        Base1 b1 = new Base1();
    }
}