
import java.util.LinkedList;
import java.util.List;

// leetcode 257

public class BinaryTreePath {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    public static void helper(Node root,List<String> ans, String s){
      if(root==null) return;
      if(root.left==null && root.right==null){
        s+= root.data;
        ans.add(s);
        return;
      }
      helper(root.left,ans,s+root.data+"-->");
      helper(root.right,ans,s+root.data+"-->");
        
    }
    public static List<String> path(Node root){
     List<String> st = new LinkedList<>();
     helper(root,st,"");
     return st;
    }
    
    public static void main(String[] args) {
        Node root =new Node(1);
        Node a =new Node(2);
        Node b =new Node(3);
        Node c =new Node(4);
        Node d =new Node(5);
        Node e =new Node(6);
        Node f =new Node(7);
       
       // connections
       root.left =a;
       root.right =b;
       a.left =c;
       a.right= d;
       b.right =f; 
       b.left =e;      
       System.out.println(path(root)); 
    }
}