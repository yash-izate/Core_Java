package collection.vector;

import java.util.*;

public class VectorDemo1 {
    public static void main(String[] args) {
        Vector v = new Vector();

        System.out.println(v.capacity());

        for (int i = 0; i <= 10; i++) {
            v.add(i * 100);
        }
        v.add(10, "Hello");
        v.set(11, "World");
        System.out.println(v);
        System.out.println(v.capacity());
    }
}