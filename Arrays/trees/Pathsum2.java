import java.util.*;
// Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum.
// Each path should be returned as a list of the node values, not node references.
// A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.

// Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
// Output: [[5,4,11,2],[5,8,4,5]]
// Explanation: There are two paths whose sum equals targetSum:
// 5 + 4 + 11 + 2 = 22
// 5 + 8 + 4 + 5 = 22
 
public class Pathsum2 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.val = data;
        }

        // Recursive helper to find all root-to-leaf paths with sum
        public void hasPathSum(TreeNode root, int targetSum, List<List<Integer>> ans, List<Integer> arr) {
            if (root == null) return;

            arr.add(root.val);

            // Leaf node check
            if (root.left == null && root.right == null) {
                if (root.val == targetSum) {
                    ans.add(new ArrayList<>(arr)); // Add a copy
                }
            } else {
                hasPathSum(root.left, targetSum - root.val, ans, arr);
                hasPathSum(root.right, targetSum - root.val, ans, arr);
            }

            // Backtrack
            arr.remove(arr.size() - 1);
        }

        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> arr = new ArrayList<>();
            hasPathSum(root, targetSum, ans, arr);
            return ans;
        }
    }

    public static void main(String[] args) {
        // Create sample tree:
        /*
                  5
                 / \
                4   8
               /   / \
              11  13  4
             /  \      \
            7    2      1
        */
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
         root.right.right.left = new TreeNode(5);


        int targetSum = 22;

        // Since pathSum is inside TreeNode, create a dummy node to call it
        List<List<Integer>> paths = root.pathSum(root, targetSum);

        System.out.println("All root-to-leaf paths with sum " + targetSum + ":");
        for (List<Integer> path : paths) {
            System.out.println(path);
        }
    }
}
