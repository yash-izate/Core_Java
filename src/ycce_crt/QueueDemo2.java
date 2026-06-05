package ycce_crt;

//first non-repeating character

public class QueueDemo2 {
    public static void main(String[] args) {

        String str = "aaabbcmdcdn";

        for (int i = 0; i < str.length(); i++) {

            boolean repeat = false;

            for (int j = 0; j < str.length(); j++) {

                if (i != j && str.charAt(i) == str.charAt(j)) {
                    repeat = true;
                    break;
                }
            }

            if (!repeat) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}