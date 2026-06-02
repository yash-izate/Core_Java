package ycce_crt;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                    count++;
                }
            }

            if (!flag) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Array is swapped " + count + " times");
    }
}