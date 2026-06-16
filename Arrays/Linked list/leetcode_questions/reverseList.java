public class reverseList {


     public static class Node{
        int data;
        Node next;
       
        Node(int data){
            this.data =data;
        }
    }
    
            public static void display(Node head){
                Node temp =head;
                while(temp!=null){
                    System.out.print (temp.data+" ");
                    temp= temp.next;
                }
             }

    public static Node reverse_recursion(Node head){
        if(head.next == null) return head;
        Node Newhead = reverse_recursion(head.next);
        head.next.next = head;
        head.next=null;
        return Newhead;
    }


    public static Node reverse(Node head) {
    Node prev = null;
    Node curr = head;
    
    while (curr != null) {
        Node agla = curr.next; // save next node
        curr.next = prev;      // reverse link
        prev = curr;           // move prev forward
        curr = agla;           // move curr forward
    }
    return prev; // new headqw
}


    public static void recursion_Display(Node head){
        if(head==null) return;
           recursion_Display(head.next);
           System.out.print(head.data+" ");
    }
    
    public static void main(String[] args) {
         Node a= new Node(100);
        Node b= new Node(4);
        Node c= new Node(13);
        Node d= new Node(5);
        Node e= new Node(12);
        Node f= new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // recursion_Display(a);
        Node x = reverse_recursion(a);
        display(x);
        // reverse(a);
        
    }
}