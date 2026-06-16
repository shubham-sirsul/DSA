public class Merge_twoLinkedlist {

    // both lists  are sorted 




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


     public static Node merge(Node h1,Node h2){
        Node t1= h1;
        Node t2 =h2;
        Node t = new Node(1);
        Node h =t;
        while(t1!=null && t2 !=null){
          if(t1.data < t2.data){
          t.next =t1;
          t1 =t1.next;

          }
          else{
             t.next =t2;
             t2 =t2.next;
          }    
          t=t.next;   
     }
 
     // attaching remening part 
     if (t1 != null) t.next = t1;
    else t.next = t2;

        

           return h.next;
     }

     public static Node Merge_Linklist(Node headA, Node headB){
        // using extra space 
          Node temp1 = headA;
          Node temp2 = headB;
          
          Node temp = new Node(0);
          Node headN=temp;
        //   temp.next=null;
          while(temp1!=null && temp2 !=null){
          if(temp1.data < temp2.data){
            Node a = new Node(temp1.data);

             temp.next = a;
             temp= a;
             temp1=temp1.next;

           
          }
          else{
             Node a = new Node(temp2.data);
             temp.next = a;
             temp= a;
             temp2=temp2.next;
          }       
     }
     if(temp1==null){
        temp.next =temp2;
     }
     else{
         temp.next =temp1;
     }
          return headN.next;

     }

    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(3);
        Node c= new Node(4);
        Node d= new Node(8);
        Node e= new Node(11);
        Node h = new Node(33);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = h;
        


        Node i = new Node(2);
        Node j = new Node(9);
        Node k = new Node(13);
        Node l = new Node(23);
        Node m = new Node(27);
        Node n =new Node(30);
        
        i.next = j;
        j.next = k;
        k.next = l;
        l.next = m;
        m.next = n;
       Node x = Merge_Linklist(a, i);
        display(x);
        display(merge(a, i));

    }
}