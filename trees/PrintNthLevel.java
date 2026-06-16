public class PrintNthLevel {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    public static void nthlevel(Node root, int n){
         if(root == null) return;
         if(n==1){
            System.out.print(root.data+" ");
            return;
         }
         nthlevel(root.left, n-1);
         nthlevel(root.right, n-1);
    }
    public static int height(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
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
       for(int i =1; i<=height(root)+1;i++){
        nthlevel(root, i);
        System.out.println();
       }
    }
}