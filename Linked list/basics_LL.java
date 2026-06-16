
public class basics_LL {
    public static void printlist(Node head){
       if(head == null) return;
        System.out.println(head.data);
        printlist(head.next);

    }
    public static class Node{
        int data ;// value
        Node next; // address of next node 

        Node( int data ) {
         this.data =data;
        }
       
    } 
    public static void main(String[] args) {
        // Node x =new Node();
        // System.out.println(x.next);

        Node x =new Node(5);
        Node d =new Node(52);
        Node fd =new Node(6);
        Node f =new Node(98);


        //  x.next=d;
        // // d.next =fd;
        //  // 5--> 52 6 98
        //  System.out.println(x.next.data);//-->52
        //  System.out.println(x.next.next);


        x.next=d;
        d.next =fd;
        fd.next=f;
        // 5--> 52-->6-->98

     // sasta tarika to print linked list 
        // System.out.println(x.next);//basics_LL$Node@7344699f
        // System.out.println(d);//basics_LL$Node@7344699f
        // System.out.println(d.next);//basics_LL$Node@6b95977
        // System.out.println(fd);//basics_LL$Node@6b95977


       // display linklist 
        // System.out.println(x.next.data);
        // System.out.println(x.next.next.data);
        // System.out.println(x.next.next.next.data);

        // automated printing linked list 
        // Node temp =x;
        //   while(temp!=null){
        //     System.out.println(temp.data);
        //     temp=temp.next; 
        //   }
    printlist(x);
    printlist(x);

    }
}