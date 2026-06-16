public class Flatten_Multilevel_Dbly_ll {
    
    public static class Node{
     int data;
     Node next;
     Node child;
     Node(int data){
        this.data = data;
     }
    }

    public static Node  flatten(Node head){
        Node temp =head;
        while(temp.next!= null){
            if(temp.child != null){
                Node prev =temp.next;
                temp.next = temp.child;
                temp.child=null;
                flatten(temp.next).next =prev;
                

            }
            // System.out.println(1);
            temp =temp.next;

        } 
        return temp;

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
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);
        Node e= new Node(5);
        
        
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        

        Node w= new Node(7);
        Node x= new Node(8);
        Node y= new Node(9);
        Node z= new Node(10);
       
        
        
        w.next = x;
        x.next = y;
        y.next = z;

       


        Node m= new Node(11);
        Node n= new Node(12);
        // Node o= new Node(13);
        // Node p= new Node(14);
        // Node q= new Node(15);
        
        
        m.next = n;
        // n.next = o;
        // o.next = p;
        // p.next = q;

        c.child = w;
         x.child =m;

       flatten(a);
       display(a);
    
    }
}