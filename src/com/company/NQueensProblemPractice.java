package com.company;

public class NQueensProblemPractice {

    class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }

    static Node search(Node root, int key){
        if (root == null || root.val == key){
            return root;
        }
        if (root.val < key){
            return search(root.right, key);
        }
        return search(root.left, key);
    }

    public static void main(String[] args) {


        NQueensProblemPractice bst = new NQueensProblemPractice();

        // Create the root node
        Node root = bst.new Node(10);

        // Add nodes to the BST
        root.left = bst.new Node(5);
        root.right = bst.new Node(15);
        root.left.left = bst.new Node(3);
        root.left.right = bst.new Node(7);
        root.right.left = bst.new Node(12);
        root.right.right = bst.new Node(18);

        // Search for different keys in the BST
        int[] keysToSearch = {7, 12, 20};  // Example keys to search for

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
