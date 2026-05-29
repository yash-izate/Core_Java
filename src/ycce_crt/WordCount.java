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

        System.out.println("----------------------------------");

        String str1 = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                str1 += str.charAt(i);
            }
        }

        System.out.println(str1);
    }
}