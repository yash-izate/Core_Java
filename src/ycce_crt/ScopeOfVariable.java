package ycce_crt;

public class ScopeOfVariable {
    static int a = 10;

    void run() {
        int b = 10;
        System.out.println(a + " " + b);
        ++a;
        ++b;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        ScopeOfVariable s1 = new ScopeOfVariable();
        s1.run();
        s1.run();

    }
}