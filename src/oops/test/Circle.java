package oops.test;

public class Circle {
    private float radius;

    public Circle() {
    }

    public Circle(float r) {
        this.radius = r;
    }

    float areaCircle() {
        return (float) (Math.PI * Math.pow(2, radius));
    }

    float circumferenceCircle() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return "Circle {" +
                "\narea = " + areaCircle() +
                "\ncircumference = " + circumferenceCircle() +
                "\n}";
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.radius = 5.5f;

        System.out.println();
        System.out.println(c1);
    }
}