package strings;

public class StringProblems {
    public static void main(String[] args) {
        // convert to lower case and upper case
        String name = "James Bond";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println();

        // replace spaces with underscore
        String str1 = "  I Love My India ";
        System.out.println(str1.replace(" ", "_"));
        System.out.println();

        // fill the letter template
        String letter = "Dear <|name|>, Thanks a lot! \nOnce again it was nice to meet you <|name|>.";
        String s = "Yash";
        String r = "<|name|>";
        System.out.println(letter.replace(r, s));

        //

    }
}