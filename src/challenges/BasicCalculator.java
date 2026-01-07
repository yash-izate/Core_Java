package challenges;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Basic Calculator !...");
        System.out.println("Enter value of A: ");
        float a = sc.nextFloat();
        System.out.println("Enter value of B: ");
        float b = sc.nextFloat();

        System.out.println();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

    }
}
