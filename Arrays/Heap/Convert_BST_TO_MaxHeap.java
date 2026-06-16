
import java.util.*;


public class Convert_BST_TO_MaxHeap {
   public static class Node{
    int val;
    Node left;
     Node right;
     public Node(int data){
         this.val = data;
     }
    }
    public static ArrayList<Integer> inorder(Node root,ArrayList<Integer> x){
        if(root==null) return x;
        inorder(root.left,x);
        x.add(root.val);
        inorder(root.right,x);
        return x;
        
    }
    static int i=0;
    public static void PostOrder(Node root,ArrayList<Integer> x){
        if(root==null) return;
        PostOrder(root.left, x);  
        PostOrder(root.right, x);
      
        root.val = x.get(i++);
      
    }
public static Node build(ArrayList<Integer> arr,int i ,int j){
    if (i>j) return null;
    Node root = new Node(arr.get(j));
    if(i==j) return root;
    j--;
    int mid = (i+j)/2;
    
    
    root.left = build(arr, i, mid);
    root.right= build(arr, mid+1, j);
    return root;

}
public static int size(Node root){
    if(root==null) return 0;
    return 1+size(root.left) + size(root.right);
}
    public static void main(String[] args) {
       Node root = new Node(4);
root.left = new Node(2);
root.right = new Node(6);
root.left.left = new Node(1);
root.left.right = new Node(3);
root.right.left = new Node(5);
root.right.right = new Node(7);

    //     ArrayList<Integer> x = new ArrayList<>();
    //     inorder(root, x);
    //     System.out.println(x);
    //    Node temp = build(x, 0, x.size()-1);
    //    ArrayList<Integer> t = new ArrayList<>();
    //     inorder(temp, t);
    //     System.out.println(t);

    ArrayList<Integer> x = new ArrayList<>();
        inorder(root, x);
        PostOrder(root, x);
        System.out.println(root.val);
       
       

        
    }
}