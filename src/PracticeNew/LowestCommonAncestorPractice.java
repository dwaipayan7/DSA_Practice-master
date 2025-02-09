package PracticeNew;

public class LowestCommonAncestorPractice {

    static class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    static Node lowestCommonAncestor(Node root, Node p, Node q){

        if (root == null){
            return null;
        }

        if (root.equals(p) || root.equals(q)){
            return root;
        }

        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);

        if (left == null){
            return right;
        }else if (right == null){
            return left;
        }

        return root;
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        Node p = root.left; // Node with value 5
        Node q = root.left.right.right; // Node with value 4

        Node lca = lowestCommonAncestor(root, p, q);

        System.out.println("Lowest Common Ancestor: " + (lca != null ? lca.data : "None"));
    }
}
