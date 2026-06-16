// copy list with randompointers

public class CopyWithRandom {
    public static class Node{
     int data;
     Node next;
     Node random;
     Node(int data){
        this.data = data;
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

     public static void copyasit(Node head){

        // step 1 create deep copy of using for next data only 
       Node temp = head;
       Node list = new Node(0);
       Node templ =list;

      
       while(temp!=null){
        Node cur  = new Node(temp.data) ;
        templ.next = cur;
        templ = templ.next;
        temp =temp.next;
       }
       list= list.next;

    //    step 2 use zig zag to point 

    Node headT = new Node(0);
    Node t =  headT;
    Node t1  = temp; // point 1st part of original list
    Node t2 = list; // point 1st part of copyied list

    while(t1 !=null){
        t.next =t1;
        t1 = t1.next;
        t=t.next;

        t.next =t2;
        t2 =t2.next;
        t =t.next;
    }
    headT=headT.next;
    display(headT);


// ASSIGNING RANDOM POINTERS

    t1 = headT;
    t2 =list;

    while(t1!=null   && t2.next!=null){
        if(t1.random == null) t2.random = null;
       else  t2.random= t1.random.next;

        t1= t1.next.next;
       if(t1!=null) t2 =t2.next.next;
    }
      

      // sepraring list
      t1 =headT;
      t2 = list;
      while(t1!= null){
        t1.next =t1.next.next;
        t1=t1.next;
        if(t1==null) break;
        t2.next =t2.next.next;
        if(t2.next!=null) break;
        t2=t2.next;
      }
      
      display(head);
      display(list);
      
       
     }
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(3);
        Node c= new Node(5);
        Node d= new Node(2);
        Node e= new Node(12);
        
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
      

        a.random = null;
        b.random =a;
        c.random =e;
        d.random= c;
        e.random =a;
        copyasit(a);
    }
}