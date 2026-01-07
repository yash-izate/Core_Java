package challenges;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Age Gropus Classifier !...\n");
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age <= 0) {
            System.out.println("Invalid age");
            return;
        }

        if (age >= 65) {
            System.out.println("Senior Citizen");
        } else if (age >= 18) {
            System.out.println("Adult");
        } else if (age >= 13) {
            System.out.println("Teenager");
        } else {
            System.out.println("You are a Child");
        }
    }
}