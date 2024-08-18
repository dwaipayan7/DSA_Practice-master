package com.company;

public class BinaryTreeToDLL {

    Node prev = null, head = null;

    class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    void convertToDLL(Node root) {
        if (root == null) return;

        convertToDLL(root.left);
        if (prev == null) head = root;
        else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        convertToDLL(root.right);
    }

    void printDLL(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.right;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BinaryTreeToDLL tree = new BinaryTreeToDLL();

        // Creating the binary tree
        Node root = tree.new Node(10);
        root.left = tree.new Node(5);
        root.right = tree.new Node(20);
        root.left.left = tree.new Node(2);
        root.left.right = tree.new Node(8);
        root.right.left = tree.new Node(15);
        root.right.right = tree.new Node(25);

        // Convert binary tree to DLL
        tree.convertToDLL(root);

        // Print the DLL
        System.out.println("Flattern binary to OR converted to DLL: ");
        tree.printDLL(tree.head);
    }
}
