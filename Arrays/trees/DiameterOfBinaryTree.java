

public class DiameterOfBinaryTree {
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
    public static int diameter(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0; // leaf node 
        int leftAns = diameter(root.left);
        int rightAns = diameter(root.right);
        int mid =height(root.left) +height(root.right);
        if(root.left!=null) mid++; 
        if(root.right!=null) mid++;
        int height =Math.max(mid, Math.max(leftAns, rightAns));

        return height;
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
       
       // connections
       root.left =a;
       root.right =b;
       a.left =c;
       a.right= d;
       b.right =e; 
       e.left=f;
       d.left =g;
       int x =diameter(root);
       System.out.println(x);
    }
}