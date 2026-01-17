package basic;

public class VariableArguments {

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int... arr) {
        int sum = a + b;
        for (int ele : arr) {
            sum += ele;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of (3, 5): " + sum(3, 5));
        System.out.println("Sum of (-3, 9, 69, -15): " + sum(-3, 9, 69, -15));
    }
}