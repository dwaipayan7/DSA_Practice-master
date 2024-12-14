package NewPractice;

public class TreeTraversal {

    static class Node{
        int data;
        Node left;
        Node right;
    }

    public void inOrder(Node root){
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public void postOrder(Node root){
        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public void preOrder(Node root){
        if (root == null) return;
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);

    }

    public static void main(String[] args) {
        // Creating nodes
        Node root = new Node();
        root.data = 1;
        root.left = new Node();
        root.left.data = 2;
        root.right = new Node();
        root.right.data = 3;
        root.left.left = new Node();
        root.left.left.data = 4;
        root.left.right = new Node();
        root.left.right.data = 5;

        // Creating an instance of TreeTraversal
        TreeTraversal tree = new TreeTraversal();

        // Performing traversals
        System.out.print("In-Order Traversal: ");
        tree.inOrder(root); // Output: 4 2 5 1 3
        System.out.println();

        System.out.print("Pre-Order Traversal: ");
        tree.preOrder(root); // Output: 1 2 4 5 3
        System.out.println();

        System.out.print("Post-Order Traversal: ");
        tree.postOrder(root); // Output: 4 5 2 3 1
        System.out.println();
    }

}
