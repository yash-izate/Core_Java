package challenges;

import java.util.Scanner;

public class GcdOfTwo {
    public static int userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        return sc.nextInt();
    }

    public static void GCD(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("GCD is not defined if any one number is zero.");
        } else {
            for (int i = Math.min(a, b); i >= 1; i--) {
                if ((a % i == 0) && (b % i == 0)) {
                    System.out.println("GCD = " + i);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\nWelcome to GCD Calculator of Two Numbers !...\n");
        int a = userInput();
        int b = userInput();
        System.out.println();

        GCD(a, b);
    }
}