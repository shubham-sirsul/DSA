public class maxTwinSum {
    public static class Node{
        int data;
        Node next;
       
        Node(int data){
            this.data =data;
        }
    }
    public static Node Reverse(Node head){
        Node temp =head;
        Node prev =null;
        Node curr= head;
        Node Next= null;

        while(curr!=null){
            Next =  curr.next;
            curr.next = prev ;
            prev =curr;
            curr = Next;

            // temp =temp.next;
        }

        return prev;
    }
    public static Node middel(Node head){
       Node temp =head;
       Node slow =head;
       Node fast = head;

       while(fast!=null && fast.next!=null){
        slow= slow.next;
        fast = fast.next.next;
       }
       return slow;
    }
    public static void display(Node head){
        Node temp =head;
        while(temp!=null){
            System.out.print (temp.data+" ");
            temp= temp.next;
        }
        System.out.println();
     }

     public static int Maxtwinsum(Node head){
        Node  temp = head;
        Node p1 =head;
        Node slow =middel(head);
        Node p2 =Reverse(slow.next);
        
        int sum =0;
        int max =0;

        while(p2!=null){
            sum =p1.data + p2.data;
            if(max<sum) max =sum;
            p1=p1.next;
            p2=p2.next;
        }
        return max;
     }
    public static void main(String[] args) {
        Node a= new Node(100);
        Node b= new Node(4);
        Node c= new Node(13);
        Node d= new Node(5);
        Node e= new Node(12);
        Node f= new Node(10);
        // Node h =new Node(77);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
    
       System.out.println(Maxtwinsum(a));
        
    }
}