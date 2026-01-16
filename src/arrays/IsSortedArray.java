package arrays;

import java.util.Scanner;

public class IsSortedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Array Sorting Check !");
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                isAscending = false;
            }
            if (arr[i] > arr[i - 1]) {
                isDescending = false;
            }
        }

        if (isAscending) {
            System.out.println("Array is sorted in Ascending order");
        } else if (isDescending) {
            System.out.println("Array is sorted in Descending order");
        } else {
            System.out.println("Array is NOT sorted");
        }

        sc.close();
    }
}