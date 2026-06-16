

public class Cycle_linklist {
     public static class Node{
        int data;
        Node next;
       
        Node(int data){
            this.data =data;
        }
    }
    public static Node cycleNode(Node head){
        if(!iscycle(head)) return  null;
          if(head==null) return null;
        if(head.next==null) return null;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) break;

        }
        Node temp = head;
        while(slow!=temp){
            slow=slow.next;
            temp=  temp.next;
        }
        return temp;
    }
    public static boolean iscycle(Node head){
        

        if(head==null) return false;
        if(head.next==null) return false;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node a= new Node(100);
        Node b= new Node(4);
        Node c= new Node(13);
        Node d= new Node(5);
        Node e= new Node(12);
        Node h = new Node(33);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = h;
        h.next = b;
        System.out.println(iscycle(a));
        System.out.println(cycleNode(a).data);
    }
}