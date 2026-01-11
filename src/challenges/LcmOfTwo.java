package challenges;

import java.util.Scanner;

public class LcmOfTwo {

    public static int userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        return sc.nextInt();
    }

    public static void LCM(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("LCM for zero ot defined");
        } else {
            for (int i = Math.max(a, b); i <= (a * b); i += Math.max(a, b)) {
                if ((i % a == 0) && (i % b == 0)) {
                    System.out.println("LCM = " + i);
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to LCM Calculator of Two Numbers !..\n");
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println();

        for (int i = Math.max(num1, num2); i < num1 * num2; i += Math.max(num1, num2)) {
            if ((i % num1 == 0) && (i % num2 == 0)) {
                System.out.println("LCM (" + num1 + "," + num2 + ") = " + i);
                break;
            }
        }
    }
}