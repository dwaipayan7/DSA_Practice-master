package com.company;

public class FlatternBinaryTreeToLinkedList {

    class Node {
        int val;
        Node left;
        Node right;

        Node(int x) {
            val = x;
            left = null;
            right = null;
        }
    }

    public static void flattern(Node root) {
        Node curr = root;
        while (curr != null) {
            if (curr.left != null) {
                Node prev = curr.left;
                while (prev.right != null) {
                    prev = prev.right;
                }
                prev.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }

    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.right;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        FlatternBinaryTreeToLinkedList tree = new FlatternBinaryTreeToLinkedList();

        // Creating a sample binary tree
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(5);
        root.left.left = tree.new Node(3);
        root.left.right = tree.new Node(4);
        root.right.right = tree.new Node(6);

        // Flatten the binary tree to linked list
        flattern(root);

        // Print the resulting linked list
        tree.printList(root);
    }
}
