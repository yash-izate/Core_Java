package basic;

import java.util.Scanner;

public class Function {

    public static float sumOfTwo(float x, float y) {
        return x + y;
    }

    public static float productOfTwo(float x, float y) {
        return x * y;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();
        System.out.println();

        float resAdd = sumOfTwo(a, b);
        float resMul = productOfTwo(a, b);

        System.out.println("Sum = " + resAdd);
        System.out.println("Multiply = " + resMul);

    }
}