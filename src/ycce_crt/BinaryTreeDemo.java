package ycce_crt;

class NodeB {
    int data;
    NodeB left;
    NodeB right;

    NodeB(int data) {
        this.data = data;
    }
}

public class BinaryTreeDemo {

    // Root -> Left -> Right
    static void preOrder(NodeB root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preOrder(root.left);
        preOrder(root.right);
    }

    // Left -> Root -> Right
    static void inOrder(NodeB root) {

        if (root == null) {
            return;
        }

        inOrder(root.left);

        System.out.print(root.data + " ");

        inOrder(root.right);
    }

    // Left -> Right -> Root
    static void postOrder(NodeB root) {

        if (root == null) {
            return;
        }

        postOrder(root.left);

        postOrder(root.right);

        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        // Creating Nodes
        NodeB root = new NodeB(10);
        NodeB n2 = new NodeB(20);
        NodeB n3 = new NodeB(40);
        NodeB n4 = new NodeB(50);
        NodeB n5 = new NodeB(30);
        NodeB n6 = new NodeB(60);
        NodeB n7 = new NodeB(70);

        // Connecting Nodes
        root.left = n2;
        root.right = n5;

        n2.left = n3;
        n2.right = n4;

        n5.left = n6;
        n5.right = n7;

        System.out.print("Preorder  : ");
        preOrder(root);

        System.out.print("\nInorder   : ");
        inOrder(root);

        System.out.print("\nPostorder : ");
        postOrder(root);
    }
}