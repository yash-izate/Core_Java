package arrays;

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Array sum and average !...\n");
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        System.out.println();

        int[] numArr = new int[size];
        for (int i = 0; i < numArr.length; i++) {
            System.out.print("Enter element no. " + (i + 1) + ": ");
            numArr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int ele : numArr) {
            sum += ele;
        }

        System.out.println("\nSum of elements of array: " + sum);

        float avg = (float) sum / numArr.length;
        System.out.println("\nAverage of elements in array: " + avg);

    }
}