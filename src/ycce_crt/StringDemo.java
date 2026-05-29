package ycce_crt;

public class StringDemo {

    public static void main(String[] args) {

        String str = "level";
        String temp = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            temp += str.charAt(i);
        }

        System.out.println(temp);

        if (str.equals(temp)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        System.out.println("---------------------------------------------");

        String str2 = "Hello how are you";
        String temp2 = "aeiou";

        int n = 0;

        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < temp2.length(); j++) {

                if (str2.charAt(i) == temp2.charAt(j)) {
                    n++;
                }
            }
        }

        System.out.println("Total vowels: " + n);

        System.out.println("------------------------------------");

        String str3 = "My name is Yash";
        int count = 0;

        for (int i = 0; i < str3.length(); i++) {
            char ch = str3.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Modern Approach volwels count = " + count);
    }
}