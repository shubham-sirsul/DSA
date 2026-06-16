public class InsertBST {
    public static class TreeNode{
     int val;
     TreeNode left;
      TreeNode right;
      public TreeNode(int data){
          this.val = data;
      }
     }
      public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new  TreeNode(val); 
             if(val<root.val){
                root.left= insertIntoBST(root.left, val);
            }
            
        else  if(val>root.val){
                root.right= insertIntoBST(root.right, val);
            }
            return root; 
    }
    public static void main(String[] args) {
        
    }
}