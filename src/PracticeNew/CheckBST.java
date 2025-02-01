package PracticeNew;

public class CheckBST {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    boolean isBST(Node root){
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean isBSTUtil(Node node, int min, int max){
        if (node == null){
            return true;
        }

        if (node.data < min || node.data > max){
            return false;
        }

        return (isBSTUtil(node.left, min, node.data-1)
                && isBSTUtil(node.right, node.data+1, max));
    }

    //Optimised
    Node prev = null;
    boolean isBST2(Node node){
        if (node != null){
            if (!isBST2(node.left)){
                return false;
            }

            if (prev != null && node.data <= prev.data){
                return false;
            }
            prev = node;

            return isBST2(node.right);
        }
        return true;
    }

    public static void main(String[] args) {
        CheckBST tree = new CheckBST();
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.right = new Node(20);

        System.out.println("Checking BST using isBST method: " + tree.isBST(root));
        System.out.println("Checking BST using isBST2 method: " + tree.isBST2(root));
    }
}
