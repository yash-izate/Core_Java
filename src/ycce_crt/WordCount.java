package ycce_crt;

public class WordCount {
    public static void main(String[] args) {
        String str = "Hello how are you";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                count++;
            }
        }

        System.out.println("Word count = " + (count + 1));
    }
}