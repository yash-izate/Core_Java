package collection.set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("A");
        t.add("b");
        t.add("a");
        t.add("B");
        t.add("Z");
        t.add("L");

        System.out.println(t);

//        heterogenous object not allowed
//        t.add(new Integer(10));

//        for empty treeset only , null is allowed.
//        t.add(null);

        System.out.println(t);

    }
}