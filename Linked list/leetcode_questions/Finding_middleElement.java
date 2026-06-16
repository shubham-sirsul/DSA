public class Finding_middleElement {

     public static class Node{
        int data;
        Node next;
       
        Node(int data){
            this.data =data;
        }
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

     public static Node middelElement(Node head){
        Node temp = head;
        Node slow = head;
        Node fast = head;
        int size  = size(temp);
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
        // we also can doo this 

        while(fast!=null && fast.next.next!=null){
                slow =slow.next;
                fast =fast.next.next;
            }
        return slow;
     }
    public static void main(String[] args) {
         Node a= new Node(100);
        Node b= new Node(4);
        Node c= new Node(13);
        Node d= new Node(5);
        Node e= new Node(12);
        Node f= new Node(10);
        // Node h =new Node(77);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // f.next = h;
        System.out.println(middelElement(a).data);
    }
}