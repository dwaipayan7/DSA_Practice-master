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

       public static void preorder(Node root){
            if (root == null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        static void inorder(Node root){
            if (root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        static void postorder(Node root){
            if (root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }


    }

    public static void main(String[] args) {
        BinaryTreeOperations treeOps = new BinaryTreeOperations();
        BinaryTreeOperations.BinaryTree tree = treeOps.new BinaryTree();

        int nodes[] = {1, 3, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = tree.buildTree(nodes);

        System.out.println("Root node data: " + (root != null ? root.data : "Tree is empty"));

        System.out.println("This is Preorder Traversal");
        tree.preorder(root);

        System.out.println("\nThis is Inorder Traversal");
        tree.inorder(root);

        System.out.println("\nThis is PostOrder Traversal");
        tree.postorder(root);

    }
}
