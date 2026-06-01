package multithreading;

class MyThreadRunnable1 implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread 1 : " + i);

            try {

                Thread.sleep(500);

            } catch (InterruptedException e) {

                System.out.println(e);
            }
        }
    }
}

class MyThreadRunnable2 implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread 2 : " + i);

            try {

                Thread.sleep(500);

            } catch (InterruptedException e) {

                System.out.println(e);
            }
        }
    }
}

public class RunnableDemo {

    public static void main(String[] args) {

        // Runnable objects
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();

        // Thread objects
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);

        // Starting threads
        gun1.start();
        gun2.start();

        System.out.println("Main Method Finished");
    }
}