
import java.util.Stack;

public class implimentation {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    public static void display(Node root){
        if(root==null) return;
       System.out.print(root.data+" -->");
      if(root.left!=null) System.out.print(root.left.data+" ,");
      else System.out.print(null+" ,");
       if(root.right!=null) System.out.println(root.right.data+" ");
       else System.out.println(null+" ,");
       display(root.left);
       display(root.right);
    }

    public static void displayIterative(Node root) {
        if (root == null) {
            return; // Nothing to display if the tree is empty
        }

        // 1. Create a stack to manage the nodes to visit
        Stack<Node> nodeStack = new Stack<>();

        // 2. Push the root node to start the process
        nodeStack.push(root);

        // 3. Loop as long as there are nodes to visit
        while (!nodeStack.isEmpty()) {
            // Get the next node to process
            Node currentNode = nodeStack.pop();

            // Print the current node's information
            System.out.print(currentNode.data + " -->");

            if (currentNode.left != null) {
                System.out.print(currentNode.left.data + " ,");
            } else {
                System.out.print("null" + " ,");
            }

            if (currentNode.right != null) {
                System.out.println(currentNode.right.data);
            } else {
                System.out.println("null");
            }

            // 4. Push children onto the stack for future processing
            // IMPORTANT: Push the right child first, then the left child.
            if (currentNode.right != null) {
                nodeStack.push(currentNode.right);
            }
            if (currentNode.left != null) {
                nodeStack.push(currentNode.left);
            }
        }
    }
    public static void main(String[] args) {
       Node root =new Node(1);
        Node a =new Node(2);
        Node b =new Node(3);
        Node c =new Node(4);
        Node d =new Node(5);
        Node e =new Node(6);
       
       // connections
       root.left =a;
       root.right =b;
       a.left =c;
       a.right= d;
       b.right =e; 

    //    display(root);
       displayIterative(root);

    }
}