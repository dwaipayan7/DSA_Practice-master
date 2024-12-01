package NewPractice;

import com.company.FlatternBinaryTreeToLinkedList;

public class FlatternBinaryTree {

    class Node{
        int data;
        Node left;
        Node right;

        Node(int x){
            data = x;
            left = right = null;
        }
    }

    public static void flattern(Node root){
        Node curr = root;
        while (curr != null){

            if (curr.left != null){
                Node prev = curr.left;
                while (prev.right != null){
                    prev = prev.right;
                }
                prev.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }

            curr = curr.right;
        }

    }

    public static void printList(Node root){
        Node temp = root;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.right;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        FlatternBinaryTree tree = new FlatternBinaryTree();

       Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(5);
        root.left.left = tree.new Node(3);
        root.left.right = tree.new Node(4);
        root.right.right = tree.new Node(6);

        // Flatten the binary tree to linked list
        flattern(root);

        // Print the resulting linked list
        printList(root);
    }

}
