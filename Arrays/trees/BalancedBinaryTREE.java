// height of  balanced binary tree in which depth of two subtrees og every single  node never differ by more than one 
// leetcode 110
public class BalancedBinaryTREE {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    public static int height(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }

    public static Boolean isbalanced(Node root) {
        if(root==null) return true;
        int a = height(root.left);
        if(root.left!=null) a++;
        int b= height(root.right);
        if(root.right!=null) b++;
        if(a-b>1 || a-b<-1) return false;
        return isbalanced(root.left) && isbalanced(root.right) ;
    
    }
    public static void main(String[] args) {
        Node root =new Node(1);
        Node a =new Node(2);
        Node b =new Node(3);
        Node c =new Node(4);
        Node d =new Node(5);
        Node e =new Node(6);
        Node f =new Node(7);
        Node g = new Node(8);
        Node q = new Node(11);
       
       // connections
       root.left =a;
       root.right =b;
       a.left =c;
       a.right= d;
       b.right =e; 
       e.left=f;
       d.left =g;
       g.left =q;
       System.out.println(isbalanced(root));
    }
}