package NewPractice;

public class GoodNodeTree {

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public int goodNodes(TreeNode root) {
        return helper(root, 0, Integer.MIN_VALUE);
    }

    private int helper(TreeNode root, int ans, int currMax) {
        if (root == null) {
            return 0;
        }
        int rootAnswer = 0;
        if (root.data >= currMax) {
            rootAnswer = 1;
            currMax = root.data;
        }
        int lans = helper(root.left, ans, currMax);
        int rans = helper(root.right, ans, currMax);
        return lans + rans + rootAnswer;
    }

    public static void main(String[] args) {
        GoodNodeTree gnt = new GoodNodeTree();

        // Create a binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        // Calculate the number of good nodes
        int result = gnt.goodNodes(root);
        System.out.println("Number of good nodes: " + result);
    }
}
