package collection.stack;

import java.util.Stack;

public class StackDemo3 {

    public static void main(String[] args) {

        Stack<String> st = new Stack<>();

        String str = "coding is good";
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {

                temp += ch;
            } else {

                st.push(temp);
                temp = "";
            }
        }


        st.push(temp);

        while (!st.isEmpty()) {

            System.out.print(st.pop() + " ");
        }
    }
}