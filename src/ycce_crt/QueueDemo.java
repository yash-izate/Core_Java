package ycce_crt;

public class QueueDemo {
    int[] arr = new int[5];
    int front = -1;
    int rear = -1;

    void offer(int n) {
        if (rear == arr.length - 1) {
            System.out.println("Queue Overflow!");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        arr[++rear] = n;
        System.out.println(n + " inserted into queue");
    }

    void poll() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow!");
            return;
        }

        System.out.println("Deleted element: " + arr[front++]);
    }

    void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Front element: " + arr[front]);
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueDemo obj = new QueueDemo();

        obj.offer(10);
        obj.offer(20);
        obj.offer(30);
        obj.display();
//        obj.peek();
//        obj.offer(40);
//        obj.offer(50);
//        obj.offer(60); // Overflow
//        obj.display();
        obj.poll();
        obj.poll();
        obj.display();
        obj.peek();
    }
}