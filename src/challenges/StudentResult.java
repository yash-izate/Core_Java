package challenges;

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Student Result Checker!\n");

        System.out.print("Enter marks of Physics (out of 100): ");
        float phy = sc.nextFloat();

        System.out.print("Enter marks of Chemistry (out of 100): ");
        float chem = sc.nextFloat();

        System.out.print("Enter marks of Math (out of 100): ");
        float math = sc.nextFloat();

        float percentage = (phy + chem + math) / 3;

        if (percentage >= 40 && phy >= 33 && chem >= 33 && math >= 33) {
            System.out.printf("Pass: %.2f%%", percentage);
        } else {
            System.out.printf("Fail: %.2f%%", percentage);
        }

        sc.close();
    }
}