package collection.stack;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        int[] arr = {3, 1, 5, 4};
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && st.peek() < arr[i]) {
                System.out.println(st.peek() + " -> " + arr[i]);
                st.pop();
            }
            st.push(arr[i]);
        }

        while (!st.isEmpty()) {
            System.out.println(st.peek() + " -> -1");
            st.pop();
        }

    }
}