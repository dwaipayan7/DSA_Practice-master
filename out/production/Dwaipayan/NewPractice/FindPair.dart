
import 'dart:collection';

class Node{
  int data;
  Node? left;
  Node? right;
  Node(this.data);
}


bool util(Node? root, int sum, Set<int> set){
  if(root == null) return false;

  if(util(root.left, sum, set) == true){
    return true;
  }

  if(set.contains(sum - root.data)){
    return true;
  }

  set.add(root.data);

  return util(root.right, sum, set);

}

int isPairPresent(Node?root, int target){
  Set<int> set = new HashSet();

  bool ans = util(root, target, set);

  return ans ? 1: 0;

}


void main() {
  Node root = Node(10);
  root.left = Node(5);
  root.right = Node(15);
  root.left?.left = Node(3);
  root.left?.right = Node(7);
  root.right?.left = Node(12);
  root.right?.right = Node(18);

  int target = 22;

  int result = isPairPresent(root, target);

  if (result == 1) {
    print("Pair with sum $target exists in the tree.");
  } else {
    print("No pair with sum $target exists in the tree.");
  }
}
