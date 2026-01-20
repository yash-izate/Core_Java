package basic;

import java.util.Scanner;

public class TernaryOperator {

    static void largestNo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Ternary Operator Demo !");
        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();
        System.out.println();

        float result = (num1 > num2) ? num1 : num2;
        System.out.println("The Largest number is " + result);

    }

    static void oddEven() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Odd Even Number Checker !");
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println("It is a " + result);
    }

    static void absoluteValue() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Absolute Value Checker !");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println();

        int result = (num >= 0) ? num : -num;
        System.out.println("The absolute value of given number is " + result);

    }

    static void studentScore() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Student Score Checker !");
        System.out.print("Please enter student score (out of 100): ");
        float score = sc.nextFloat();
        System.out.println();

        String grade = (score > 80) ? "High" : (score > 50) ? "Moderate" : "Low";
        System.out.println("Student Grade: " + grade);
    }

    public static void main(String[] args) {
//        largestNo();
//        System.out.println();
//        oddEven();
//        absoluteValue();
        studentScore();
    }
}