// 1-->2-->3-->4-->5  tooo this  1-->3-->5-->2-->4 
// first all odd then all even        
// not solve yet  solve  ittt 
public class OddEvenLinkedList {
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
                System.out.println();
            }
    

    public static void oddevenList1(Node head){
             Node temp = head;
             Node odd =null;
             Node hO = null;
             Node even =null;
             Node hE =null;
             while(temp!=null){
                if(temp.data % 2 != 0){
                    odd =temp;
                    break;
                }
             }
              while(temp!=null){
                if(temp.data % 2 == 0){
                    even =temp;
                    break;
                }
             }
             hE = even;
             hO = odd;
             temp =head;
             while(temp!= null){
                if(temp.data % 2 == 0){
                odd.next =temp;
             }
             else{
                even.next = temp;
             }
             
             display(hO);
             display(hE);
               
             }
    }
    public static Node oddevenList(Node head){
       Node temp =head;
       Node tempO = new Node(-1);
       Node h1 =tempO;
       Node tempE = new Node(0);
       Node h2 =tempE;
       while(temp!=null){
        if(temp.data % 2==0){
            Node x =new Node(temp.data);
             tempE.next =x;
             tempE = tempE.next;
        }
       
        else {
             Node x =new Node(temp.data);
             tempO.next =x;
            tempO = tempO.next;
        }

        temp= temp.next;

       }
       tempO.next =h2.next;// neglate first elementbecause it is created by usss
      return h1.next;
    }
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);
        Node e= new Node(5);
        Node h = new Node(6);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = h;
    //   display(oddevenList(a)); // using extra space 
      oddevenList1(a);
    }
}