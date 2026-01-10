package challenges;

import java.util.Scanner;

public class LcmOfTwo {
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