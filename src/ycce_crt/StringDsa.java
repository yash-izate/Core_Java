package ycce_crt;

public class StringDsa {

    public static void main(String[] args) {

        String str = "programming";
        String temp = "";

        for (int i = 0; i < str.length(); i++) {

            boolean flag = false;

            for (int j = 0; j < temp.length(); j++) {

                if (str.charAt(i) == temp.charAt(j)) {

                    flag = true;
                    break;
                }
            }

            if (!flag) {

                temp += str.charAt(i);
            }
        }

        System.out.println(temp);
    }
}