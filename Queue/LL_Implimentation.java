public class LL_Implimentation {
   public static class Node{
       int data ;// value
       Node next; // address of next node 
   Node( int data ) {
   this.data =data;
    }
   } 
   public static class queue{
    private  Node head =null;
    private  Node tail= null;
     private static int  size =0;

      public void add(int val){
        Node temp =new Node(val);
        if(head == null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next =temp;
            tail =temp;
        }
        size++;

      }

      public int remove(){
        if(head == null){
            System.out.println("Queue is empty ");
            return -1;
        }
        else{
            int t =head.data;
            head =head.next;
            size--;
            return t;
        }
        
      }

      public int peek(){
        return head.data;
      }
       
      public void display(){
        if(head == null){
            System.out.println("queue is empty");
            return ;
        }
        else{
            Node temp =head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp =temp.next; 
                
            }
            System.out.println();
        }
      }
      public int size(){
        return size;
      }
      
   }

    public static void main(String[] args) {
     queue x =new queue();
     x.display();
    //  x.add(5);
    //  x.add(2);
    //  x.add(3);
    //  x.add(9);
    //  x.add(7);
    //  x.display();
    //   System.out.println(x.size());
}
}
