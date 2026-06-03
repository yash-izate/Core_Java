package ycce_crt;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 1, 7, 9, 8, 6, 4};
        int shiftCount = 0;

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
                shiftCount++;
            }
            arr[j + 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Total Shifts: " + shiftCount);
    }
}