package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to array reversal !...\n");

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] orgArr = new int[size];
        int[] revArr = new int[size];

        System.out.println("Enter elements of array below: ");
        for (int i = 0; i < orgArr.length; i++) {
            System.out.print("Enter element no. " + (i + 1) + ": ");
            orgArr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(orgArr));

        int ele = 0;
        for (int j = revArr.length - 1; j >= 0; j--) {
            revArr[j] = orgArr[ele];
            ele++;
        }

        System.out.println(Arrays.toString(revArr));

        sc.close();
    }
}