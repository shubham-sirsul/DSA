
import java.util.*;



public class KthSmallestelementInBST {
    public static class Node{
     int data;
     Node left;
      Node right;
      public Node(int data){
          this.data = data;
      }
     }

    // using extra space 
    public static void inOrder(Node root, List<Integer> list) {
        if(root == null) return;
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }
    public static  int kthSmallest(Node root, int k) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list.get(k-1);
    }

    // without using extra space 

   static  int c=0;
   static int r;
    public static void inorder(Node root,int k){
        if(root==null) return;
        inorder(root.left,k);
        c++;
        if(c==k){
            r= root.data;
            return;
        }
        inorder(root.right,k);
    }
    public static int kthSmallest1(Node root, int k) {
    
    inorder(root,k);
    return r;
        
    }
    public static void main(String[] args) {

         Node root = new Node(15);
    Node a = new Node(10);
    Node b = new Node(20);
    Node c = new Node(8);
    Node d = new Node(12);
    Node e = new Node(17);
    Node f = new Node(25);

    // Connect nodes to form BST
    root.left = a;
    root.right = b;
    a.left = c;
    a.right = d;
    b.left = e;
    b.right = f;

    // Choose k
    int k = 1;

    // Test both methods
    System.out.println("kth smallest using extra space: " + kthSmallest(root, k));
    System.out.println("kth smallest without extra space: " + kthSmallest1(root, k));
        
    }
}