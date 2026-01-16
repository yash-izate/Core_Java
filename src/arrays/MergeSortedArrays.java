package arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Merging Sorted Array !");

        int[] arr1 = {0, 2, 4};
        int[] arr2 = {1, 3, 5, 7, 9};

        int[] newArr = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length || j < arr2.length) {
            if ((j == arr2.length) || (i < arr1.length && arr1[i] < arr2[j])) {
                newArr[k] = arr1[i];
                i++;
            } else {
                newArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        System.out.println(Arrays.toString(newArr));
    }
}