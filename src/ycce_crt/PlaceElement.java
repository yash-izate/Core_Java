package ycce_crt;

import java.util.Arrays;

public class PlaceElement {

    public static void main(String[] args) {

        int[] arr = {-10, 1, 2, 5, 6, 7};
        int[] newArr = new int[arr.length + 1];

        int value = 4;
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < value) {
                newArr[idx] = arr[i];
            } else {
                newArr[idx] = value;
                value = arr[i];
            }
            idx++;
        }
        newArr[idx] = value;
        System.out.println(Arrays.toString(newArr));
    }
}