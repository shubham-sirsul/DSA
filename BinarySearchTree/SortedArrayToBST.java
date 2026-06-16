// converted sorted array to balanced binary tree 
import java.util.*;

public class SortedArrayToBST {
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
        System.out.print(q.element().data+" "); // printing elemrnt of topp in queue
        Node temp =q.remove();
        if(temp.left!=null) q.add(temp.left);
        if(temp.right!=null) q.add(temp.right);

       }
    }

    public static Node ArraytoTree(int[] arr, int l ,int h){
        if(l>h ) return null;
       int mid= (l+h)/2;
       Node root= new Node(arr[mid]);
       root.left = ArraytoTree(arr, l, mid-1);
       root.right = ArraytoTree(arr, mid+1, h);
       return root;


    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
       Node root = ArraytoTree(arr, 0, arr.length-1);
       BFS(root);



    }
}