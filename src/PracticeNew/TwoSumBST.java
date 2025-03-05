package PracticeNew;

import java.util.HashSet;
import java.util.Set;

public class TwoSumBST {


   static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    static int isPairPresent(Node root, int target){
        Set<Integer> set = new HashSet<>();
        boolean ans = util(root, target, set);

        return ans ? 1 : 0;
    }

    static boolean util(Node root, int sum, Set<Integer> set){

        if (root == null) {
            return false;
        }

        if (util(root.left, sum, set) == true){
            return true;
        }

        if (set.contains(sum - root.data)){
            return true;
        }

        set.add(root.data);

        return util(root.right, sum, set);

    }

    public Node insert(Node root, int data){
        if (root == null){
            return new Node(data);
        }
        if (data < root.data){
            root.left = insert(root.left, data);
        }else{
            root.right = insert(root.right, data);
        }
        return root;
    }
    public static void main(String[] args) {
        TwoSumBST tree = new TwoSumBST();
        Node root = null;

        // Insert nodes into the BST
        root = tree.insert(root, 15);
        root = tree.insert(root, 10);
        root = tree.insert(root, 20);
        root = tree.insert(root, 8);
        root = tree.insert(root, 12);
        root = tree.insert(root, 16);
        root = tree.insert(root, 25);

        int target = 28;

        // Check if the pair exists
        if (isPairPresent(root, target) == 1) {
            System.out.println("Pair exists for sum: " + target);
        } else {
            System.out.println("No pair found for sum: " + target);
        }
    }
}
