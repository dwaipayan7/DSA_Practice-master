package PracticeNew;

public class LowestCommonAncesterBST {

    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    Node lca(Node root, int n1, int n2){
        if (root == null) return null;

        if (root.data == n1 || root.data == n2) return root;

        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if (left == null) return right;
        if (right == null) return left;

        return root;

    }

    public static void main(String[] args) {
        LowestCommonAncesterBST tree = new LowestCommonAncesterBST();

        // Creating a sample BST
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.left = new Node(25);
        root.right.right = new Node(35);

        int n1 = 5, n2 = 15;
        Node lcaNode = tree.lca(root, n1, n2);

        if (lcaNode != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is: " + lcaNode.data);
        } else {
            System.out.println("No LCA found");
        }
    }

}
