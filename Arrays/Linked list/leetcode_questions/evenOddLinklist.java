// convert this 1--2--3--4--5--6 to 1--3--5--2--4--6 this 
// convert on basis of indices all odd indices at first and all even indices after that
// 1st index is always odd and 2nd is even 

public class evenOddLinklist {
     public static class Node{
     int data;
     Node next;
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

    public static Node odd_even(Node head){
        // 1st appeoch
      Node temp = head;
      Node odd = new Node(1);
      Node tempO = odd;
      Node even = new Node(-1);
      Node tempE = even;
      int i=1;
      while(temp!=null){
         if(i%2 != 0){
          tempO.next = temp;
          tempO= tempO.next;

         }
         else{
          tempE.next = temp;
          tempE= tempE.next;
         }

         i++;
         temp= temp.next;
      }
      tempO.next = even.next;
      return odd.next;
    }

    public static Node oddeven1(Node head){
        //2nd apperoch 
        Node temp = head;
        Node odd = new Node (0);
        Node even = new Node(-1);
        Node tempo =odd;
        Node tempe =even;

        while(temp != null){
            tempo.next =temp;
            temp =temp.next;
            tempo =tempo.next;
            if(temp==null) break;
            tempe.next =temp;
            temp =temp.next;
            tempe =tempe.next;


        }
        odd =odd.next;
        tempo.next =even.next;
        return  odd;

    }
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);
        Node e= new Node(5);
        Node f= new Node(6);
    
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(oddeven1(a));

    }
}