public class Palindrome_List {
    
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
        public static Node middle(Node head){
            Node temp =head;
            Node  slow = head;
            Node fast = head;
            while(fast!=null && fast.next != null ){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
        }
        
         public static Node reverse(Node head){
         Node temp = head;
         Node prev =null;
         Node curr = head;
         Node Next = null;
         while(curr!=null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
         }

         return prev;

         }

        public static  boolean  ispalindrome(Node head ){
            Node temp = head;
            Node p1= head;
            Node slow  = middle(head);
            Node p2 =reverse(slow.next);
            while(p2!=null){
                if(p1.data!=p2.data ) return false;
                p2 =p2.next;
                p1= p1.next;
            }
         return true;
        }
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(3);
        Node e= new Node(2);
        Node f= new Node(1);
    
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(ispalindrome(a));
        display(a);
    }
}