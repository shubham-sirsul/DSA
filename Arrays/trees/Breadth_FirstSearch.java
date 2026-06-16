
import java.util.LinkedList;
import java.util.Queue;



public class Breadth_FirstSearch {
     public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    public static void BFS(Node root){
       Queue<Node> q = new LinkedList<>();
      if (root!=null) q.add(root);
       while(!q.isEmpty()){
        System.out.print(q.element().data+" 1*-"); // printing elemrnt of topp in queue
        Node temp =q.remove();
        if(temp.left!=null) q.add(temp.left);
        if(temp.right!=null) q.add(temp.right);

       }
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
       BFS(root);
    }
}