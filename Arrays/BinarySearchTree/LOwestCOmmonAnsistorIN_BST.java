public class LOwestCOmmonAnsistorIN_BST {
    public static class TreeNode{
     int val;
     TreeNode left;
      TreeNode right;
      public TreeNode(int val){
          this.val = val;
      }
     }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val == root.val && (q.val>root.val || q.val<root.val)) return root;
        if(q.val == root.val && (p.val>root.val || p.val<root.val)) return root;
        if(p.val<root.val && q.val>root.val) return root;
        if(q.val<root.val && p.val>root.val) return root;
        if(p.val<root.val &&  q.val<root.val) return lowestCommonAncestor(root.left,p,q);
        if(p.val>root.val &&  q.val>root.val) return lowestCommonAncestor(root.right,p,q);
        return root;
    }
    public static void main(String[] args) {
        
    }
}