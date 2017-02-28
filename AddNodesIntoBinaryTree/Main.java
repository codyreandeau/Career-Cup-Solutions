public class Main {
  
  public static void main(String[] args){
    
    BST tree = new BST();
   
    tree.iterationAdd(9);
    tree.iterationAdd(12);
    tree.iterationAdd(14);
    tree.iterationAdd(5);
    tree.iterationAdd(17);
      
    tree.inOrder();
  }
}