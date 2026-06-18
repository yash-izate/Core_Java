package collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> st = new LinkedHashSet<>();

        st.add(30);
        st.add(40);
        st.add(50);


        System.out.println(st);
        System.out.println("Unique Element: " + st.size());
    }
}