package challenges;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Original Numbers: \nA = " + a + "   B = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Original Numbers: \nA = " + a + "   B = " + b);
        sc.close();
    }
}