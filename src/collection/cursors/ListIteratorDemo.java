package collection.cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Yash");
        ll.add("99");
        ll.add("Ojas");
        ll.add("78");
        ll.add("Varad");
        ll.add("88");

        System.out.println(ll);

        ListIterator<String> litr = ll.listIterator();

        while (litr.hasNext()) {
            String S = litr.next();

            if (S.equals("Yash")) {
                litr.remove();
            } else if (S.equals("Ojas")) {
                litr.add("Kaushal");
            } else if (S.equals("Varad")) {
                litr.set("Nandu");
            }
        }

        System.out.println(ll);
    }
}