package ycce_crt;

public class ArrayDemo {

    public static void dsa1(int[] arr) {
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[idx] = arr[i];
                idx++;
            }
        }

        while (idx < arr.length) {
            arr[idx] = 0;
            idx++;
        }

        System.out.print("Array: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 0, 0, 8, 4};
        dsa1(arr);

    }
}