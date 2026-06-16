public class is_BST_heap {

     class Node {
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
     }
    static int s;
    public static int size(Node root){
        return 1+size(root.left)+size(root.right);
    }

    public static boolean CBT(Node root,int idx){
        if(root==null) return true;
        if(idx>s) return false;
       return CBT(root.left, idx*2) && CBT(root.right, idx)  ;
    }

    public static boolean maxheap(Node root){
      if(root==null) return true;
      int leftval = (root.left!=null)? root.left.data : Integer.MIN_VALUE;
      int rightval = (root.right!=null)? root.right.data : Integer.MAX_VALUE;
      if(root.data<=leftval || root.data<=rightval) return false;
      return maxheap(root.left) && maxheap(root.right);
    }
    
     public static  boolean isHeap(Node tree) {     
        s =size(tree);
        return CBT(tree, 0) && maxheap(tree);
    }
    public static void main(String[] args) {
        
    }
}