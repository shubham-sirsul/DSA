public class SymmetricTree {
    public static class Node{
     int data;
     Node left;
      Node right;
      public Node(int data){
          this.data = data;
      }
     }
     public static Node invertTreeRecursive(Node root) {

        if (root == null)
            return null;
        Node left = invertTreeRecursive(root.left);
        Node right = invertTreeRecursive(root.right);
        root.left = right;
        root.right = left;
        return root;

    }
     public static boolean same(Node p, Node q ){
       if(p==null && q==null) return true;
       if(p==null || q==null) return false;

       if(p.data!=q.data) return false ;
       return same(p.left, q.left) && same(p.right,q.right);
    }

    public  static boolean symmetric(Node root){
        if(root.left==null && root.right==null) return true;
      invertTreeRecursive(root.left);
       return same(root.left, root.right);


    }
    public static void main(String[] args) {
         Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(2);
    root.left.left = new Node(3);
    root.left.right = new Node(4);
    root.right.left = new Node(4);
    root.right.right = new Node(3);
    System.out.println(symmetric(root));
    }
}