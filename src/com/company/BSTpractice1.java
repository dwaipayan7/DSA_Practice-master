package com.company;

public class BSTpractice1 {

    public class Node {
        int value;
        int height;
        Node left;
        Node right;
        Node(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }

    private Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }

        System.out.println(details + node.getValue());

        display(node.left, " Left child of " + node.getValue() + " : ");
        display(node.right, " Right child of " + node.getValue() + " : ");
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    public Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    private void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }
    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }

    public static void main(String[] args) {
        BSTpractice1 bst = new BSTpractice1();

        // Example input
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        // Populate the BST with the example input
        bst.populate(values);

        // Display the BST
        bst.display();

        // Populate the BST with a sorted array to create a balanced BST
        int[] sortedValues = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        bst = new BSTpractice1(); // Create a new BST
        bst.populatedSorted(sortedValues);

        // Display the balanced BST
        System.out.println("\nBalanced BST:");
        bst.display();
    }
}
