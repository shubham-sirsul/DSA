public class implemantation_of_dublyy {
     public static class Node{
        int data ;// value
        Node next; // address of next node 
        Node prev;
        Node( int data ) {
         this.data =data;
        }
       
    } 
    public static class DLL{
        Node head =null;
        Node tail = null;
    
        void insertAthead(int val){
          Node temp = new Node(val);
           if(head==null){
            head =temp;
            tail = temp;
           }
           else{
            temp.next= head;
            head.prev =temp;
            head =temp;

           }
        }
        void insertatEnd(int val){
            Node temp =new Node(val);
            if(head==null){
                head =temp;
                tail = temp;
            }
            else{
                tail.next= temp;
                temp.prev =tail;
                tail =tail.next;
            }


        }
        
        void insertAt(int idx, int val){
        Node t1 =new Node(val);
         Node temp = head;
         int count =1;
         while(count<idx){
            count++;
            temp=temp.next;
         }
         if(idx>= size()){
            System.out.println("error : index out of bound");
            return;
         }
         if(idx ==0){
            insertAthead(val);
            return;
         }
         if(size() == idx){
           insertatEnd(val);
           return;
         }


         t1.next =temp.next; 
         temp.next.prev = t1; 
         t1.prev =temp;
         temp.next =t1;


        }

        void delete_value(int val){
        Node temp =  head;
        while(temp!=null){
            if(temp.data ==val) break;
            temp =temp.next;
        }
        if(head.data ==val){ 
            head=head.next;
        return;
        }
        if(tail.data ==val) {
            Node t =tail.prev;
            t.next =null;
            tail =t;
        return;
        }
        if(temp==null){
            System.out.println(" value is not present in given list");
            return;
        }
        temp.prev.next =temp.next;
        temp.next.prev =temp.prev;
        temp = null;
        

        }

         void display(){
            Node temp =head;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp =temp.next;
            }
            System.out.println();;
           }
           int size(){
            Node temp = head;
            int c=0;
            while(temp!=null){
             c++;
             temp =temp.next;
            }
            return c;
           }


    }

    public static void main(String[] args) {
        DLL x = new DLL();
        x.insertAthead(3);
        x.insertatEnd(5);
        x.insertatEnd(66);
        x.insertatEnd(54);
        x.insertAt(1, 11);
        x.display();
        x.delete_value(54);
        x.display();
    }
}