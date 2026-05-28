package oops.inheritance;

class Base2 {
    int a;

    public void name() {
        System.out.println("Yash");
    }

}

class Derived2 extends Base2 {
    int b;

    @Override
    public void name() {
        System.out.println("Izate");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Derived2 d1 = new Derived2();
        d1.name();

    }
}