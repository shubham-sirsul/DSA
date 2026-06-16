public class CriticalMIn_max_Distance {


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
       

    public static void critical_distances(Node head){
      Node temp =head.next;
      Node c1 =null;
      Node c2 =null;
      int dis =0;
      int min=0;


      while(temp.next!=null){
        dis =0;
        if((temp.prev.data< temp.data && temp.next.data<temp.data) ||(temp.prev.data> temp.data && temp.next.data >temp.data)){
              c1 =c2;
              c2 =temp;
              if(c1==null) continue;
            Node t = c1;
            while(c1!=c2){
                dis++;
                c1 =c1.next;
            }
            if(min < dis){
                min = dis;
            }
            
            

        }
        temp = temp.next;

       
        
      }
       System.out.println("minimum distance is "+min);
       Node h =head.next;
       c1= null;
       c2 =null;
       // WE HAVE TEMP THAT ALREADY ON TAIL
       temp= temp.prev;
       while(c1==null || c2==null){
        if(((h.prev.data< h.data && h.next.data<h.data )|| (h.prev.data< h.data && h.next.data<h.data)) && c1==null){
            c1 =h;
        }

         if(((temp.prev.data< temp.data && temp.next.data<temp.data )|| (temp.prev.data< temp.data && temp.next.data<temp.data)) && c2==null){
            c2 =temp;
        }
        h =h.next;
        temp =temp.prev;

       }
      dis =0;
       while(c1!=c2){
        dis ++;
        c1=c1.next;

       }
       System.out.println("The max distanc is :" +dis);


    }
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(5);
        Node d= new Node(3);
        Node e= new Node(2);
        Node f= new Node(7);
        Node i= new Node(8);
        Node j= new Node(9);
        Node k= new Node(1);
        Node l= new Node(10);
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
        f.next =i;

        i.prev =f;
        i.next =j;

        j.prev =i ;
        j.next =k;

        k.prev= j;
        k.next =l;

        l.prev =k;
      
    //   display(a);
    critical_distances(a);
        
    }
}
