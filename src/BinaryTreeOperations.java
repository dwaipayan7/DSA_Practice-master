import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeOperations {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    class BinaryTree {
        private int idx = -1;  // Made non-static for instance context

        public Node buildTree(int[] nodes) {
            idx++;

            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public void levelOrder(Node root) {
            if (root == null) return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);  // Marker for end of current level

            while (!q.isEmpty()) {
                Node cur = q.poll();

                if (cur == null) {
                    System.out.println();
                    if (!q.isEmpty()) {
                        q.add(null);  // Add marker for next level
                    }
                } else {
                    System.out.print(cur.data + " ");
                    if (cur.left != null) {
                        q.add(cur.left);
                    }
                    if (cur.right != null) {
                        q.add(cur.right);
                    }
                }
            }
        }


        public static int height(Node root) {
            if(root == null) {
                return 0;
            }


            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }


        public static int diameter(Node root){
            if (root == null){
                return 0;
            }

            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = height(root.left) + height(root.right) + 1;

            return Math.max(diam3, Math.max(diam1, diam2));
        }

    }
    static class TreeInfo {
        int height;
        int diam;

        TreeInfo(int height, int diam) {
            this.height = height;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo leftTI = diameter(root.left);
        TreeInfo rightTI = diameter(root.right);

        int myHeight = Math.max(leftTI.height, rightTI.height) + 1;

        int diam1 = leftTI.height + rightTI.height + 1;
        int diam2 = leftTI.diam;
        int diam3 = rightTI.diam;

        int myDiam = Math.max(diam1, Math.max(diam2, diam3));

        return new TreeInfo(myHeight, myDiam);
    }


    public static void main(String[] args) {
        BinaryTreeOperations treeOps = new BinaryTreeOperations();
        BinaryTreeOperations.BinaryTree tree = treeOps.new BinaryTree();

        int nodes[] = {1, 3, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = tree.buildTree(nodes);

        System.out.println("Root node data: " + (root != null ? root.data : "Tree is empty"));

        System.out.println("This is Preorder Traversal:");
        tree.preorder(root);

        System.out.println("\nThis is Inorder Traversal:");
        tree.inorder(root);

        System.out.println("\nThis is Postorder Traversal:");
        tree.postorder(root);

        System.out.println("\nThis is Level Order Traversal:");
        tree.levelOrder(root);

        System.out.println("Diameter of the tree: ");
        System.out.println(tree.diameter(root));


        TreeInfo treeInfo = diameter(root);
        System.out.println("Diameter of the tree is: " + treeInfo.diam);

    }
}
