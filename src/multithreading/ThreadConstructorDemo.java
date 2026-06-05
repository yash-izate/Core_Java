package multithreading;

class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("I am a thread = " + i);
            i++;
        }
    }

}

public class ThreadConstructorDemo {
    public static void main(String[] args) {
        MyThr h = new MyThr("Harry");
        MyThr y = new MyThr("Yash");

        h.start();
        y.start();

        System.out.println("The Id of the thread H is " + h.threadId());
        System.out.println("The name of the thread H is " + h.getName());

        System.out.println("The Id of the thread Y is " + y.threadId());
        System.out.println("The name of the thread Y is " + y.getName());
    }
}