public class validBST {
    public static class TreeNode{
     int data;
     TreeNode left;
      TreeNode right;
      public TreeNode(int data){
          this.data = data;
      }
     }
    static TreeNode temp ;
    static Boolean flag ;
    
    public void inorder(TreeNode root){
         if (root == null) return;
        inorder(root.left);
        if(temp==null){
            temp =root;
        }
        else {
            if(root==null) return;
            if(temp.data>=root.data){
                flag =false;
            }
            temp =root;
        }
        inorder(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        flag =true;
        temp =null;
        inorder(root);
        return flag;
        
    }
    public static void main(String[] args) {
        
    }
}