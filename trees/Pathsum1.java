public class Pathsum1 {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    // Helper method to check if a path sum exists
    public static boolean helper(Node root, int targetSum, int sum) {
        if (root == null) return false;

        if (root.left == null && root.right == null) {
            return root.data + sum == targetSum;
        }

        return helper(root.left, targetSum, root.data + sum)
            || helper(root.right, targetSum, root.data + sum);
    }

    // Main method for testing
    public static void main(String[] args) {

        // Constructing the tree
        /*
                5
               / \
              4   8
             /   / \
            11  13  4
           / \       \
          7   2       1
        */

        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);

        int targetSum = 22;

        boolean result = helper(root, targetSum, 0);

        System.out.println("Has path sum = " + targetSum + " ? " + result);
    }
}
