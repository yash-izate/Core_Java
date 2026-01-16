package arrays;

import java.util.Scanner;

public class Array2DSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to 2D Array Searching\n");

        int[][] arr = {
                {1, 2, 3},
                {11, 22, 33},
                {111, 222, 333}
        };

        System.out.print("Enter the element you want to search: ");
        int num = sc.nextInt();

        boolean isPresent = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (num == arr[i][j]) {
                    System.out.println("Element found at index (" + i + ", " + j + ")");
                    isPresent = true;
                    break;
                }
            }
            if (isPresent) {
                break;
            }
        }

        if (!isPresent) {
            System.out.println("Element not found!");
        }

        sc.close();
    }
}