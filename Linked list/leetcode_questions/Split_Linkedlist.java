// givn linked list split it in two part such that one contains odd values and other cpntains even values 

public class Split_Linkedlist {
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
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(3);
        Node c= new Node(5);
        Node d= new Node(2);
        Node e= new Node(12);
        Node h = new Node(6);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = h;


        Node temp =a;
        Node h1 =a;
        Node h2 =null;

        while(temp!=null){
            if(temp.next.data % 2==0){
                h2= temp.next;
                temp.next=null;
                break;
            }
            temp=temp.next;
            
        }
        display(h1);
        display(h2);

        
    }
}