package strings;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("\nWelcome to String Methods !...\n");

        String str = "My Name is Yash";

        // returns string length
        System.out.println(str.length());

        // returns new string which has all lower case characters
        System.out.println(str.toLowerCase());

        // returns new string which has all lower case characters
        System.out.println(str.toUpperCase());

        // returns a new string after removing all the leading and trailing spaces from the original string
        String name = " Izate   ";
        System.out.println(name.trim());

        // returns a substring from start index to end index.
        // start idx is included and end idx is excluded.
        System.out.println(str.substring(1, 10));
        System.out.println(str.substring(5));
        System.out.println(str.substring(0, 10));

        // returns a new string after replacing y with z
        System.out.println(str.replace('a', 'x'));
        System.out.println(str.replace("Yash", "Sharwari"));

        // returns character at a given index
        System.out.println(str.charAt(11));

        // returns true if string starts with
        System.out.println(str.startsWith("My"));
        System.out.println(str.startsWith("MY"));
        System.out.println(name.startsWith("Izate"));

        // returns true if string ends with
        System.out.println(str.endsWith("Yash"));
        System.out.println(name.endsWith(" "));

        // returns the starting or first occurrence index of given string
        System.out.println(str.indexOf("Yash"));
        System.out.println(str.indexOf("a", 6));

        // returns true only if given string is equals
        String s = "Manoj";
        System.out.println(s.equals("Manoj"));
        System.out.println(s.equals("manoj"));

        // ignore the case of string and compares
        System.out.println(s.equalsIgnoreCase("MaNOj"));

    }
}