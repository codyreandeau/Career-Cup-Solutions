public class BST {
  
  class Node{
    
    int data;
    Node left;
    Node right;
    
    Node(int x) {
      this.data = x;
      left = null;
      right = null;
    }
 }
  
  public Node root;
  
 /**
   * Adding nodes to a tree recursively
   */
  public void recursionAdd(int data){
    recursionAdd(data, root);
  }
  
  public Node recursionAdd(int data, Node node){
    
    node = new Node(data);
    
    if(root == null){
      root = node;
      return node;
    }else if(data < node.data){
      node.left = recursionAdd(data, node.left);
    }else {
      node.right = recursionAdd(data, node.right);
    }
    return node;
  }
  
 /**
   * Adding nodes to a tree using iteration
   */
  public void iterationAdd(int data) {
    iterationAdd(data, root);
  }
  
  public Node iterationAdd(int data, Node node) {
   
    Node newNode = new Node(data);
    Node current = root;
    
    if(root == null){
      root = newNode;
      return root;
    }
    Node previous = null;
    //Find where we need to insert the node
    while(current != null) {
      previous = current;
         if(current.data < data){
           current = current.right;
        }else{
           current = current.left;
       }
     }
    //Insert the node
     if(previous.data < data){
         previous.right = newNode;
        }else{
         previous.left = newNode;
        }
  return newNode;
}

/**
  * Printing out the elements in the tree
  */
  public void inOrder() {
    inOrder(root);
  }
  
  public void inOrder(Node node){
    if(node==null){
      return;
    }
    
    inOrder(node.left);
    System.out.print(node.data + " ");
    inOrder(node.right);
  }
  
}