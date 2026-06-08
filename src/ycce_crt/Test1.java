package ycce_crt;

import java.util.Arrays;

// This program can be done using hashmap.

public class Test1 {
    public static void main(String[] args) {
        int[] freq = new int[256];
        int[] arr = {1, 2, 4, 2, 2, 4, 3, 3, 4, 3, 3, 3, 1, 2};

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        System.out.println("Frequency of each element: ");

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(freq));
    }
}