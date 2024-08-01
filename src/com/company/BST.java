package com.company;

public class BST {
    // Inner Node class
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    // Search method should be static as it doesn't rely on instance variables
    static Node search(Node root, int key) {
        if (root == null || root.val == key) {
            return root;
        }
        if (root.val < key) {
            return search(root.right, key);
        }
        return search(root.left, key);
    }

    public static void main(String[] args) {
        // Create the root node and build the BST
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        // Perform search operations
        int[] keysToSearch = {40, 60, 90};  // Example keys to search for

        for (int key : keysToSearch) {
            Node result = search(root, key);
            if (result != null) {
                System.out.println("Found key " + key + " in the BST.");
            } else {
                System.out.println("Key " + key + " not found in the BST.");
            }
        }
    }
}
