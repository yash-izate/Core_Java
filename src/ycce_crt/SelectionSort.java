package ycce_crt;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        int swapCount = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            // Assume current index has minimum element
            int minIndex = i;

            // Find actual minimum element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap only if needed
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swapCount++;
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Total Swaps: " + swapCount);
    }
}