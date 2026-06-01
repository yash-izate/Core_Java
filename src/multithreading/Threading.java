package multithreading;

class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("Thread 2 for cooking food " + i);
            System.out.println("I am happy");
            i++;
        }
    }

}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("Thread 2 for chatting with her " + i);
            System.out.println("I am sad");
            i++;
        }
    }
}

public class Threading {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

    }
}