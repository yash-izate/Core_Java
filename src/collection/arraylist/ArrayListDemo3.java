package collection.arraylist;

import java.util.*;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Object> l = new ArrayList<>(10);

        l.add(10);
        l.add(1, "Middle");
        l.add(22);
        l.add(100);
        l.add(9);
        l.add(-50);
        l.add('Z');

        System.out.println(l.get(3));

        System.out.println("Initial list: " + l);
        l.remove(2);
        l.add(3, "Yash");
        l.add(null);
        System.out.println(l);
    }
}