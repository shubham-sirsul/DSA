public class DoublyLL {
     public static class Node{
        int data ;// value
        Node next; // address of next node 
        Node prev ;
        Node( int data ) {
         this.data =data;
        }
       
    } 

    public static void display(Node head){
        Node temp =head;
        while(temp!=null){
            System.out.print (temp.data+" ");
            temp= temp.next;
        }
        System.out.println();
     }
     public static void display_2(Node head){ // it display form tail to head
        Node temp =head;
        while(temp!=null){
            System.out.print (temp.data+" ");
            temp= temp.prev;
        }
        System.out.println();
     }

    public static void display_random(Node random){
        Node temp =random;
        while(temp.prev!=null){
            temp= temp.prev;
        }
           while(temp!=null){
            System.out.print (temp.data+" ");
            temp= temp.next;
        }
        System.out.println();
     }


    public static void main(String[] args) {
         
        Node a= new Node(100);
        Node b= new Node(4);
        Node c= new Node(13);
        Node d= new Node(5);
        Node e= new Node(12);
        Node f= new Node(10);
        a.next = b;
        a.prev =null;

        b.next = c;
        b.prev=a;

        c.next = d;
        c.prev =b;

        d.next = e;
        d.prev =c;

        e.next = f;
        e.prev =d;

        f.prev =e;
    //   display(a);
    //   display_2(f);
      display_random(c);

    }
}