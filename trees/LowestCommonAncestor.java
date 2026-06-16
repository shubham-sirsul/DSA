public class LowestCommonAncestor {
    public static class Node{
     int data;
     Node left;
      Node right;
      public Node(int data){
          this.data = data;
      }
     }

     public static boolean contains(Node root, Node node){
        if(root== null) return false;
        if(root==node) return true;
             return contains(root.left,node)|| contains(root.right,node);
     }
    public static  Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(p==root || q==root) return root;
        if(p==q) return q;
         boolean leftp = contains(root.left,p);
         boolean rightq =contains(root.right,q);
         if(leftp && rightq) return root;
         if(leftp && !rightq) return lowestCommonAncestor( root.left,  p,  q);
         if(!leftp && rightq) return lowestCommonAncestor( root.right,  p,  q);
         if(!leftp && !rightq) return root;
         return root;
    }

     public static Node lowestCommonAncestor1(Node root, Node p, Node q) {
         if (root == null) return null;
        if (root == p || root == q) return root;
         Node left = lowestCommonAncestor(root.left, p, q);
         Node right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) return root;
        return left == null ? right : left;
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
       Node ans =lowestCommonAncestor1(root,b,c);
       System.out.println(ans.data);
              

    }
}