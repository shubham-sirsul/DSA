public class RemoveDuplicates {
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
             public static void removeDuplicates(Node head){
                Node temp= head;
                Node temp1 = temp.next;
                while(temp1.next!= null){
                
                   if(temp.data == temp1.data)  temp1= temp1.next;
                   else {
                    temp.next = temp1;
                    temp=temp.next;
                    temp1 =temp.next;
                   }


                }
                temp.next =null;
                display(head);
             }
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(1);
        Node c= new Node(1);
        Node d= new Node(3);
        Node e= new Node(3);
        Node f= new Node(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        removeDuplicates(a);
    }
}