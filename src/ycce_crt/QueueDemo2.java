package ycce_crt;

//first non-repeating character

public class QueueDemo2 {
    public static void main(String[] args) {

        String str = "aab";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (i != j && str.charAt(i) == str.charAt(j)) {
                    count = 1;
                    break;
                }
            }

            if (count != 1) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}