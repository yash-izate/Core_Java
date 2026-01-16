package arrays;

import java.util.Arrays;

public class IsArrayPalindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Palindrome Checker !");

        int[] arr = {5, 4, 3, 2, 2, 3, 4, 5};

        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome)
            System.out.print("It is palindromic array: ");
        else
            System.out.print("It is not palindromic array: ");

        System.out.println(Arrays.toString(arr));
    }
}