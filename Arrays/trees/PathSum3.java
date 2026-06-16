public class PathSum3 {
    public static class TreeNode{
     int val;
     TreeNode left;
      TreeNode right;
      public TreeNode(int data){
          this.val = data;
      }
     }
      public int noOfpath(TreeNode root, long targetSum){
        int count=0;
     if (root == null) return 0;
     if (root.val == targetSum) count++;
     return count + noOfpath(root.left,targetSum - root.val) + noOfpath(root.right,targetSum - root.val);

    }
    public int pathSum(TreeNode root, int targetSum) { // bekar time complixity
        if(root==null) return 0;
        int count = noOfpath(root,(long) (targetSum));
        count+= pathSum( root.left,  targetSum)+pathSum( root.right,  targetSum);
        return count;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);

        int targetSum = 8;

        PathSum3 ps = new PathSum3();
        int result = ps.pathSum(root, targetSum);

        System.out.println("Number of paths with sum " + targetSum + ": " + result);
    }
}