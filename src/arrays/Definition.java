package arrays;

import java.util.Arrays;

public class Definition {
    public static void main(String[] args) {

        /* 1. An array is a collection of elements of the same data type stored in contiguous memory locations
         * and accessed using an index.
         * 2. An array is just list of values.
         * 3. Arrays are used for storing multiple values in a single variable.
         * 4. Index starts with 0.
         * 5. All elements are of same type.
         * 6.Size is fixed once created.
         */

        // print array using loop
        int[] arrOdd = {1, 3, 5, 7, 9};
        for (int i = 0; i < arrOdd.length; i++) {
            System.out.print(arrOdd[i] + " ");
        }
        System.out.println();

        // print array using for each loop
        int[] arrEven = {0, 2, 4, 6, 8};
        for (int j : arrEven) {
            System.out.print(j + " ");
        }
        System.out.println();

        // print array using toString() in Arrays
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(arr));
        System.out.println();

    }
}