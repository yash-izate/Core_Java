package collection.stack;

public class StackDemo {
    int[] arr = new int[5];
    int top = -1;

    void push(int n) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow!");
            return;
        }

        arr[++top] = n;
        System.out.println(n + " pushed into stack");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return;
        }
        System.out.println("Deleted element: " + arr[top--]);
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.println("Top element: " + arr[top]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackDemo obj = new StackDemo();

        obj.push(10);
        obj.push(20);
        obj.push(30);

        obj.display();

        obj.peek();

        obj.push(40);
        obj.push(50);
        obj.push(60); // Overflow

        obj.display();

        obj.pop();
        obj.pop();

        obj.display();

        obj.peek();
    }
}