package arrays;

import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to array searching !...\n");
        System.out.print("Enter a number you want to search:  ");
        int n = sc.nextInt();

        int[] myArr = {25, 36, 85, 78, 45, 15, 95, 63, 67, 34, 91, 37, 16, 18};

        boolean found = false;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == n) {
                System.out.println("Element found at idx : " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found !");
        }

        sc.close();
    }
}