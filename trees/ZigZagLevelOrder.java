import java.util.*;

public class ZigZagLevelOrder {
    public static class TreeNode{
     int val;
     TreeNode left;
      TreeNode right;
      public TreeNode(int data){
          this.val = data;
      }
     }
      public static void nthlevel(TreeNode root, int n,List<Integer> arr){
         if(root == null) return;
         if(n==1){
             arr.add(root.val);
            return;
         }
         nthlevel(root.left, n-1,arr);
         nthlevel(root.right, n-1,arr);
    }
     public static void nthlevel2(TreeNode root, int n,List<Integer> arr ){
         if(root == null) return;
         if(n==1){
            arr.add(root.val);
            return;
         }
         nthlevel2(root.right, n-1,arr);
          nthlevel2(root.left, n-1,arr);
    }
    public static int height(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       
       List<List<Integer>>  arr1 = new ArrayList<>();
        if(root==null) return arr1;
    int level = height(root)+1;
    for(int i= 1;i<=level;i++){
        List<Integer> arr = new ArrayList<>();
        if(i%2!=0){
          nthlevel(root,i,arr);

        }
        else{
            nthlevel2(root,i,arr);
        }
        arr1.add(arr);

    }
    return arr1;

    }
    public static void main(String[] args) {
         TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        
      
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        // System.out.println(zigzagLevelOrder(root));
        System.out.println(height(root));
    }
}