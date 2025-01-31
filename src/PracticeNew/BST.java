package PracticeNew;

public class BST {

    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            left = right = null;
            this.data = data;
        }
    }

    static Node insert(Node root, int data){
        if (root == null){
            return new Node(data);
        }
        if (data < root.data){
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    static boolean search(Node root, int x){
        if (root == null) return false;

        if (root.data == x) return true;

        if (root.data > x){
            search(root.left, x);
        }
        return search(root.right, x);

    }

    public static void main(String[] args) {
        // Creating a sample BST
        Node root = null;
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int value : values) {
            root = insert(root, value);
        }

        // Searching for values
        int searchValue1 = 40;
        int searchValue2 = 80;

        System.out.println("Is " + searchValue1 + " present? " + search(root, searchValue1));
        System.out.println("Is " + searchValue2 + " present? " + search(root, searchValue2));
    }

}
