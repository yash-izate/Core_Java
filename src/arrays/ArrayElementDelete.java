package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementDelete {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Array Element delete !...\n");
        System.out.print("Enter an element you want to delete: ");
        int num = sc.nextInt();

        int[] orgArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Count occurrences
        int occ = 0;
        for (int ele : orgArr) {
            if (ele == num) {
                occ++;
            }
        }

        // Create new array
        int[] newArr = new int[orgArr.length - occ];

        // Copy elements except the deleted one
        int j = 0;
        for (int ele : orgArr) {
            if (ele != num) {
                newArr[j] = ele;
                j++;
            }
        }

        System.out.println("Original Array : " + Arrays.toString(orgArr));
        System.out.println("New Array      : " + Arrays.toString(newArr));

        sc.close();
    }
}