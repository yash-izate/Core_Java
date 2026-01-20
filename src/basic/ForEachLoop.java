package basic;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] array = new String[]{"  Yash ", "Ojas   ", "   Shivam "};

        for (String name : array) {
            System.out.println(name.toUpperCase().trim());
        }
    }
}