package challenges;

import java.util.Scanner;

public class MultiplicationTable {

    public static float userInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        return sc.nextFloat();
    }

    public static void printTable(float num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }

    public static void main(String[] args) {
        System.out.println("\nWelcome to Multiplication Table Creator !...\n");
        // calling take input function / method
        float num = userInput();

        // calling print table function / method
        printTable(num);

    }
}