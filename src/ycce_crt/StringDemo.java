package ycce_crt;

public class StringDemo {
    public static void main(String[] args) {

        String str = "Yeshwantrao";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }
}