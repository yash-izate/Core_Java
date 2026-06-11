package ycce_crt;

class NodeC {
    int data;
    NodeC addr;
}

public class CircularLinkedList {

    public static void traverse(NodeC first) {

        if (first == null) {
            System.out.println("List is Empty");
            return;
        }

        NodeC temp = first;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.addr;
        } while (temp != first);

        System.out.println("FIRST");
    }

    public static NodeC insertFirst(NodeC first, int data) {

        NodeC newNode = new NodeC();
        newNode.data = data;

        if (first == null) {
            newNode.addr = newNode;
            return newNode;
        }

        NodeC temp = first;

        while (temp.addr != first) {
            temp = temp.addr;
        }

        temp.addr = newNode;
        newNode.addr = first;

        return newNode;
    }

    public static NodeC insertLast(NodeC first, int data) {

        NodeC newNode = new NodeC();
        newNode.data = data;

        if (first == null) {
            newNode.addr = newNode;
            return newNode;
        }

        NodeC temp = first;

        while (temp.addr != first) {
            temp = temp.addr;
        }

        temp.addr = newNode;
        newNode.addr = first;

        return first;
    }

    public static NodeC insertAtPosition(NodeC first,
                                         int data,
                                         int pos) {

        if (pos == 1) {
            return insertFirst(first, data);
        }

        NodeC newNode = new NodeC();
        newNode.data = data;

        NodeC temp = first;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.addr;
        }

        newNode.addr = temp.addr;
        temp.addr = newNode;

        return first;
    }

    public static NodeC deleteFirst(NodeC first) {

        if (first == null) {
            return null;
        }

        if (first.addr == first) {
            return null;
        }

        NodeC temp = first;

        while (temp.addr != first) {
            temp = temp.addr;
        }

        temp.addr = first.addr;

        return first.addr;
    }

    public static NodeC deleteLast(NodeC first) {

        if (first == null) {
            return null;
        }

        if (first.addr == first) {
            return null;
        }

        NodeC temp = first;

        while (temp.addr.addr != first) {
            temp = temp.addr;
        }

        temp.addr = first;

        return first;
    }

    public static NodeC deleteAtPosition(NodeC first,
                                         int pos) {

        if (pos == 1) {
            return deleteFirst(first);
        }

        NodeC temp = first;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.addr;
        }

        temp.addr = temp.addr.addr;

        return first;
    }

    public static void main(String[] args) {

        NodeC first = new NodeC();
        NodeC second = new NodeC();
        NodeC third = new NodeC();
        NodeC fourth = new NodeC();
        NodeC fifth = new NodeC();

        first.data = 10;
        second.data = 20;
        third.data = 30;
        fourth.data = 40;
        fifth.data = 50;

        first.addr = second;
        second.addr = third;
        third.addr = fourth;
        fourth.addr = fifth;
        fifth.addr = first;

        System.out.println("Original:");
        traverse(first);

        first = insertFirst(first, 5);
        System.out.println("\nAfter insertFirst:");
        traverse(first);

        first = insertLast(first, 60);
        System.out.println("\nAfter insertLast:");
        traverse(first);

        first = insertAtPosition(first, 25, 4);
        System.out.println("\nAfter insertAtPosition:");
        traverse(first);

        first = deleteFirst(first);
        System.out.println("\nAfter deleteFirst:");
        traverse(first);

        first = deleteLast(first);
        System.out.println("\nAfter deleteLast:");
        traverse(first);

        first = deleteAtPosition(first, 3);
        System.out.println("\nAfter deleteAtPosition:");
        traverse(first);
    }
}