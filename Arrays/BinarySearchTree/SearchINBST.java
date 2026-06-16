public class SearchINBST {
    public static class TreeNode{
     int val;
     TreeNode left;
      TreeNode right;
      public TreeNode(int data){
          this.val = data;
      }
     }
     public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        TreeNode temp= root;
        while(temp!=null){
            
            if(val>temp.val){
                temp=temp.right;
            }
            else if(val<temp.val){
                temp=temp.left;
            }
            else{
                return temp;
            }
            
        }
        return null;
        
    }
    public static void main(String[] args) {
        
    }
}