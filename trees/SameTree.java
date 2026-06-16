// leetcode 100 +
public class SameTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    public static boolean same(Node p, Node q ){
       if(p==null && q==null) return true;
       if(p==null || q==null) return false;

       if(p.data!=q.data) return false ;
       return same(p.left, q.left) && same(p.right,q.right);
    }
    public static void main(String[] args) {
    
    }
}