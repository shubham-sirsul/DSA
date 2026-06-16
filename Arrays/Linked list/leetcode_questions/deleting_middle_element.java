

public class deleting_middle_element {
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

     public static  int size(Node head){
        Node temp =head;
        int count  =0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;

    }

     public static Node delet_middelElement(Node head){
         if(head.next == null){ //  if only single element in list 
            return null;
        }
        Node temp = head;
        Node slow = head;
        Node fast = head;
        int size  = size(temp);
        Node prev = head;

       
        // 1st method 
        // we are wsting one travelsel to calculate size 
        // if(size%2!=0){
        //     while(fast.next!=null){
        //         slow =slow.next;
        //         fast =fast.next.next;
        //     }
        // }
        // else{

        //     while(fast!=null){
        //         slow =slow.next;
        //         fast =fast.next.next;
        //     }    
        // }

        //2nd method 
        // we also can doo this 
        // while(fast!=null && fast.next!=null){
        //     prev =slow;
        //         slow =slow.next;
        //         fast =fast.next.next;
        //     }
   
        // //   System.out.println("previous middle"+slow.data);
        // prev.next =slow.next;
        // slow.next =null;
        // // System.out.println("present middel:"+slow.data);

        // 3rd method
        while(fast.next.next !=null && fast.next.next.next!=null){
          slow =slow.next;
          fast =fast.next.next;
        }
        slow.next=slow.next.next;
        // slow.next.next=null;
     return slow;

     }
    public static void main(String[] args) {
         Node a= new Node(100);
        Node b= new Node(4);
        Node c= new Node(13);
        Node d= new Node(5);
        Node e= new Node(12);
        Node f= new Node(10);
        Node h =new Node(77);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = h;
        display(a);
        delet_middelElement(a);
        display(a);
        delet_middelElement(a);
        display(a);
         delet_middelElement(a);
         display(a);
         delet_middelElement(a);
        display(a);
         delet_middelElement(a);
        display(a);
         delet_middelElement(a);
         display(a);
        
        
        
     }
}