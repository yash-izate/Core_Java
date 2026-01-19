package basic;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Ternary Operator Demo !");
        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();
        System.out.println();

        float result = (num1 > num2) ? num1 : num2;
        System.out.println("The Largest number is " + result);
        sc.close();
    }
}