package multithreading;

class Thr1 extends Thread {
    public Thr1(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Thank You ! " + this.getName());
            i++;
        }

    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Thr1 t1 = new Thr1("Tommy");
        Thr1 t2 = new Thr1("Jerry");
        Thr1 t3 = new Thr1("Harry (Min)");
        Thr1 t4 = new Thr1("Mickey");
        Thr1 t5 = new Thr1("Oggy (Nor)");
        Thr1 t6 = new Thr1("Jack");
        Thr1 t7 = new Thr1("Doraemon (Imp)");

        t7.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

    }
}