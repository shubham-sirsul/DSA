
import java.util.Stack;

public class preintpost {
     public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    public static void preorder(Node root){
  if(root==null) return;

System.out.println(root.data);
 preorder(root.left);
 preorder(root.right);
}
public static void inorder(Node root){// left root right 
  if(root==null) return;

 inorder(root.left);
 System.out.println(root.data);
 inorder(root.right);
}
public static  void inorderitrative(Node root){
         // 1. Handle the empty tree case
        if (root == null) {
            return;
        }

        // 2. Create an empty stack
        Stack<Node> stack = new Stack<>();
        Node current = root;

        // 3. Loop until the current node is null AND the stack is empty
        while (current != null || !stack.isEmpty()) {
            
            // Phase 1: Go to the leftmost node
            // Keep pushing nodes onto the stack as we go left
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Phase 2: Process the node (Root)
            // Current is now null (we hit the wall), so pop the top node.
            // This node is the leftmost unprocessed node (the Root of the current subtree).
            current = stack.pop();
            System.out.println(current.data); // Process the data (Root)

            // Phase 3: Move to the right subtree
            // Now that we've processed the Root, move to its right child
            // and repeat the process (Phase 1)
            current = current.right;
        }
}
 public static void postorder(Node root){
  if(root==null) return;

System.out.println(root.data);
 postorder(root.left);
 postorder(root.right);
}

 public void preorderIterative(Node root) {
        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            System.out.print(curr.data + " "); // process the node

            // Push right first so left is processed first
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
    }

 public static void postorderIterative(Node root) {
        if (root == null) return;
      // using 2 STACKS  
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        // Step 1: Push root to stack1
        stack1.push(root);

        // Step 2: Process nodes
        while (!stack1.isEmpty()) {
            Node current = stack1.pop();
            stack2.push(current);

            // Push children into stack1
            if (current.left != null) {
                stack1.push(current.left);
            }
            if (current.right != null) {
                stack1.push(current.right);
            }
        }

        // Step 3: Pop from stack2 (gives Left → Right → Root order)
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop().data);
        }
    }
    public static void postorderIterativeOneStack(Node root) {
    if (root == null) return;
 // harder to understand 
    Stack<Node> stack = new Stack<>();
    Node current = root;
    Node lastVisited = null;

    while (current != null || !stack.isEmpty()) {
        // Go as far left as possible
        if (current != null) {
            stack.push(current);
            current = current.left;
        } else {
            Node peekNode = stack.peek();
            // If right child exists and not processed yet → go right
            if (peekNode.right != null && lastVisited != peekNode.right) {
                current = peekNode.right;
            } else {
                // Process root (after left & right are done)
                System.out.println(peekNode.data);
                lastVisited = stack.pop();
            }
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
        Node f =new Node(7);
       
       // connections
       root.left =a;
       root.right =b;
       a.left =c;
       a.right= d;
       b.right =f; 
       b.left =e;
       inorder(root);       
       
    }
}