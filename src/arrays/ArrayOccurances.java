package arrays;

import java.util.Scanner;

public class ArrayOccurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Array Occurrences Finder !...\n");
        System.out.print("Enter the number you want to check: ");
        int n = sc.nextInt();

        int[] numArr = {1, 5, 8, 7, 6, 5, -9, 2, 4, -5, 2, 1, 7, 8, 6, -9, 1, 1, -9};
        int count = 0;

        for (int ele : numArr) {
            if (ele == n) {
                count++;
            }
        }

        System.out.println("Number of occurrences of " + n + " are : " + count);
    }
}