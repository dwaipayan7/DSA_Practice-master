static class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

static void inOrder(Node root){
    if (root == null){
        return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
}

static void preOrder(Node root){
    if (root == null){
        return;
    }
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
}

static void postOrder(Node root){
    if (root == null){
        return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");
}

public static void main(String[] args) {
    /*
          1
         / \
        2   3
       / \
      4   5
    */

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);

    System.out.println("In-order Traversal:");
    inOrder(root);        // Output: 4 2 5 1 3
    System.out.println();

    System.out.println("Pre-order Traversal:");
    preOrder(root);       // Output: 1 2 4 5 3
    System.out.println();

    System.out.println("Post-order Traversal:");
    postOrder(root);      // Output: 4 5 2 3 1
    System.out.println();
}
