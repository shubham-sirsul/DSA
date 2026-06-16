public class remove_nthnodefromend {
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

    public static Node remove_end_nth(Node head,int n){
    //  use 1 travelsel in loop 
        Node fast =head;
        Node slow = head;
        for(int i =1;i<=n;i++){
            fast=fast.next;
        }
        if(fast== null){
                head=head.next;
                return head;
            }
        while(fast.next!=null){
            fast=fast.next;
            slow = slow.next;
        }
        
       slow.next =slow.next.next;
       return head;
       
    }

    public static Node nthformend(Node head, int n){
        // this use 2 travelsel in loop 
        int size  =0;
        Node temp =head;

        while(temp!=null){
            size++;
            temp =temp.next;
        }
        int  a =size - n + 1 ;
        // ath node from start
        temp =head;
        for (int i=1;i<a;i++){
             temp= temp.next;
        }

      return temp;
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
        
   a= remove_end_nth(a, 6);

      display(a);
    }
}