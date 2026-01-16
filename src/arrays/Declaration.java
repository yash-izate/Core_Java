package arrays;

import java.util.Scanner;

public class Declaration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Array Input & Output !...\n");
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        System.out.print("Array Elements: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println();
        sc.close();
    }
}