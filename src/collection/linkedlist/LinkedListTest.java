package collection.linkedlist;

import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Yash");
        l.add(1, "100");
        l.add(2, 67);
        l.add(3, "Hello");

        System.out.println(l);

        l.set(2, 999);
        System.out.println(l);
        l.addFirst("CCC");
        l.remove("100");
        System.out.println(l.reversed());
    }
}