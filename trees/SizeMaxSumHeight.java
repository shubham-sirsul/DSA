



public class SizeMaxSumHeight {
    static int size=0;
     public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
public static void preorder(Node root){
  if(root==null) return;
size++;
System.out.println(root.data);
 preorder(root.left);
 preorder(root.right);
}

   
    public static int size(Node root){
        if(root == null) return 0;

        return 1 +size(root.left)+size(root.right);
    }
    public static int sum(Node root){
        if(root == null) return 0;

        return root.data +sum(root.left)+sum(root.right);
    }
    public static int height(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }

    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int a =root.data;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a, Math.max(b,c));
    }
     public static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int a =root.data;
        int b = max(root.left);
        int c = max(root.right);
        return Math.min(a, Math.min(b,c));
    }
    public static int product(Node root){
        if(root == null) return 1;
        if(root.left==null && root.right==null) return root.data;

        return root.data *product(root.left)*product(root.right);
    }
    public static void main(String[] args) {
         Node root =new Node(1);
        Node a =new Node(2);
        Node b =new Node(3);
        Node c =new Node(4);
        Node d =new Node(5);
        Node e =new Node(6);
        Node f =new Node(9);
       
       // connections
       root.left =a;
       root.right =b;
       a.left =c;
       a.right= d;
       b.right =e; 
       e.left=f;
       preorder(root);
    // System.out.println(sum(root));
    System.out.println(product(root));
    }
}