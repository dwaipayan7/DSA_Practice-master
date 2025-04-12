package NewPractice;

public class SizeOfBinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static int size(Node root) {
        if (root == null) {
            return 0;
        }

        return size(root.left) + size(root.right) + 1;
    }

    static int maximum(Node root){
        if (root == null){
            return Integer.MIN_VALUE;
        }

        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }

    public static void main(String[] args) {
        // Creating a sample binary tree:
        //         1
        //       /   \
        //      2     3
        //     / \
        //    4   5

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int treeSize = size(root);
        int maxElement = maximum(root);

        System.out.println("Size of the binary tree: " + treeSize);
        System.out.println("Maximum value in the binary tree: " + maxElement);
    }

}
