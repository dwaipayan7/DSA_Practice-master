import java.util.Scanner;

public class TreePractice {
    static Scanner sc = null;

    class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    Node createTree() {
        Node root = null;

        System.out.print("Enter data: ");
        int data = sc.nextInt();

        if (data == -1) return null;

        root = new Node(data);
        System.out.println("Enter left of " + data + ": ");
        root.left = createTree();

        System.out.println("Enter right of " + data + ": ");
        root.right = createTree();

        return root;
    }

    static void inOrder(Node root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root) {
        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        TreePractice tree = new TreePractice();
        sc = new Scanner(System.in);

        System.out.println("Create your binary tree (-1 for no node):");
        Node root = tree.createTree();

        System.out.println("\nIn-Order Traversal:");
        inOrder(root);

        System.out.println("\n\nPre-Order Traversal:");
        preOrder(root);

        System.out.println("\n\nPost-Order Traversal:");
        postOrder(root);

        // Close the Scanner object to avoid resource leak
        sc.close();
    }
}
