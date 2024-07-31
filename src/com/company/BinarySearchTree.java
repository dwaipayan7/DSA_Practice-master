package com.company;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        this.left = this.right = null;
    }
}

public class BinarySearchTree {
    public static Node search(Node root, int key){
        if (root == null || root.val == key){
            return root;
        }
        if (root.val < key){
            return search(root.right, key);
        }
        return search(root.left,key);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        // Searching for keys in the BST
        System.out.println(search(root, 19) != null
                ? "Found"
                : "Not Found");
        System.out.println(search(root, 20) != null
                ? "Found"
                : "Not Found");
    }

}
