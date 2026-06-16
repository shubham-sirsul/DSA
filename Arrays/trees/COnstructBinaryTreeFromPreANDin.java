public class COnstructBinaryTreeFromPreANDin {

    // Node class for the binary tree
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    // Helper function to build the tree
    public static Node helper(int[] preorder, int prelow, int prehigh,
                              int[] inorder, int inlow, int inhigh) {
        if (prelow > prehigh || inlow > inhigh) return null;

        Node root = new Node(preorder[prelow]);

        int i = inlow;
        while (i <= inhigh && inorder[i] != preorder[prelow]) {
            i++;
        }

        int leftsize = i - inlow;

        root.left = helper(preorder, prelow + 1, prelow + leftsize,
                           inorder, inlow, i - 1);
        root.right = helper(preorder, prelow + leftsize + 1, prehigh,
                            inorder, i + 1, inhigh);

        return root;
    }

    // Main build function
    public static Node buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder, 0, n - 1, inorder, 0, n - 1);
    }

    // Function to print inorder traversal (for testing)
    public static void printInorder(Node root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    // Function to print preorder traversal (for testing)
    public static void printPreorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    // Main method
    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder  = {9, 3, 15, 20, 7};

        Node root = buildTree(preorder, inorder);

        System.out.println("Inorder traversal of constructed tree:");
        printInorder(root);

        System.out.println("\nPreorder traversal of constructed tree:");
        printPreorder(root);
    }
}
