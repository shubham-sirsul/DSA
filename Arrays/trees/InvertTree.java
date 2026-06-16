
import java.util.*;

public class InvertTree {
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

     public static Node invertTreeItrative(Node root) {
       // itrative approch through BFS
    if (root == null) {
        return null;
    }

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        Node current = queue.poll();

        // Swap the children
        Node temp = current.left;
        current.left = current.right;
        current.right = temp;

        // Add children to the queue
        if (current.left != null) {
            queue.add(current.left);
        }
        if (current.right != null) {
            queue.add(current.right);
        }
    }
    return root;
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
       invertTreeItrative(root);
       invertTreeRecursive(root);
    }
}