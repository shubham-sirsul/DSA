public class Finding_intersectionOfTwoLinkedList {
    public static class Node{
     int data;
     Node next;
     Node(int data){
        this.data = data;
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
    public static Node Intersectin(Node a, Node b){
        Node temp1 =a;
        Node temp2 =b;
        if(size(temp1)> size(temp2)){
        
        for(int i =1; i<size(temp1)- size(temp2);i++){
            temp1 =temp1.next;

        }
        }
        else {
             for(int i =1; i<size(temp2)- size(temp1);i++){
            temp2 =temp2.next;
            
        }
        }
        while(temp1!= null){
            temp1=temp1.next;
            temp2=temp2.next;
            if(temp1==temp2) break;

        }
          return temp1;
        }
      
    
       
    public static void main(String[] args) {
        Node a= new Node(100);
        Node b= new Node(4);
        Node c= new Node(13);
        Node d= new Node(5);
        Node e= new Node(12);
        Node f= new Node(10);
        Node g= new Node(34);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next =g;
    //    System.out.println(size(a)
   
        Node x = new Node(90);
        Node y = new  Node(36);
        x.next =y;
        y .next =c;
        Node intersection  =Intersectin(a,x);
        System.out.println(intersection.data);

    }
}