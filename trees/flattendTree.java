public class flattendTree {
    public static class Node{
     int data;
     Node left;
      Node right;
      public Node(int data){
          this.data = data;
      }
     }
     public static void itrativedlatten(Node root){
        Node c= root;
       while(c!=null){
            if(c.left!=null){
                Node pred= c.left;
                while(pred.right!=null){
                    pred= pred.right;
                }
                pred.right= c.right;
                c.right= c.left;
                c.left= null;
                  
            }

         c=c.right;
       }
     }
    public static void flatten(Node root) {
        if(root==null) return;
        Node l =root.left;
        Node r = root.right;
        flatten(root.left);
        flatten(root.right);
        root.left= null;
        root.right = l;

        Node temp =root;
        while(temp.right!=null){
            temp=temp.right;
        }
        temp.right =r;
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
       flatten(root);

        
    }
}