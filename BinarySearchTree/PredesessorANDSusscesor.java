
import java.util.*;

public class PredesessorANDSusscesor {
    public static class Node{
     int data;
     Node left;
      Node right;
      public Node(int data){
          this.data = data;
      }
     }
     public static void inorder(Node root, List<Integer> l) {
            if (root == null) return;
            inorder(root.left,l);
            l.add(root.data);
            inorder(root.right,l);
    }

    // globalvariables 
    static int pred =-1;
    static int succ =-1;
    static Node temp =null;
    static boolean flag =false;

    public static void inorder1(Node root,int key) {
        if (root == null) return;
        inorder1(root.left,key);
        if(temp ==null){
            temp =root;
        }
        else{
            if(root.data==key){
                pred = temp.data;
                flag =true;
            }
            else if(flag==true){
                succ = root.data;
                flag =false;
            }
            temp =root;
        }
        
        inorder1(root.right,key);
    }
    public static void main(String[] args) {
      Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
       int key =50;

        // method 1 
        // List<Integer> l =new ArrayList<>();
        // inorder(root, l);
        // 
        // for(int i= 0;i<l.size();i++){
        //     if(l.get(i)==key){
        //         if(i-1<0) System.out.println("predesssor not exists");
        //         else System.out.println(" predesicor is "+l.get(i-1));
        //         if(i+1>=l.size()) System.out.println("sucessor not exits");
        //         else System.out.println(" Sucessor is "+l.get(i+1));
        //         break;
        //     }
           
        // }

        // method 2 without using extra space 
        inorder1(root, key);
        System.out.println("pred is :"+pred);
        System.out.println("succ is :"+succ);
    }
}