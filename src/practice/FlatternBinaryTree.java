package practice;

public class FlatternBinaryTree {
    static Node prev,head = null;

    class Node{
        int root;
        Node left;
        Node right;
        Node(int r){
            root = r;
            left = null;
            right = null;
        }
    }

    static void convertToDLL(Node root){
        if (root == null) return;
        convertToDLL(root.left);
        if(prev == null) head = root;
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        convertToDLL(root.right);
    }

    static void printDLL(Node head){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.root+" ");
            curr = curr.right;
        }
    }

    public static void main(String[] args) {
        FlatternBinaryTree tree = new FlatternBinaryTree();

        // Sample binary tree
        Node root = tree.new Node(10);
        root.left = tree.new Node(5);
        root.right = tree.new Node(20);
        root.left.left = tree.new Node(3);
        root.left.right = tree.new Node(7);
        root.right.right = tree.new Node(30);

        convertToDLL(root);

        // Print the converted DLL
        System.out.println("Doubly Linked List:");
        printDLL(head);
    }
}
