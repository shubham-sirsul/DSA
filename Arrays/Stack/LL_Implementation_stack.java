public class LL_Implementation_stack {
    public static class Node{
        int data ;// value
        Node next; // address of next node 
        Node( int data ) {
        this.data =data;
        }
    }

    public static class stack{
     private   Node head = null;
     private   int size =0;
        void push(int x){
            Node temp = new Node(x);
            temp.next =head;
            head =temp; 
            size++;
        }
        int pop(){
            if(head == null) {
                System.out.println("Empty");
                return -1;
            }
            Node temp =head;
            head =head.next; 
            temp.next =null;
            size--;
            return temp.data;
        }
        int peek(){
            if(head ==null){
                System.out.println("null");
                return -1;
            }
            return head.data;
        }
        void displayrev(){
            Node temp =head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp =temp.next;
            } 
        System.out.println();
        }
        void display_rec(Node h){
            if(h == null) return;
            display_rec(h.next);
            System.out.print(h.data+ " ");

        }
         
         void display(){
           Node temp =head;
           display_rec(temp);
           System.out.println();
         }

        int size(){
            return size;
        }


        boolean isEmpty(){
            if(head==null) return true ;
            return false;
        }

    } 
    public static void main(String[] args) {
        stack st = new stack();
        st.push(10);
        st.push(20);
        st.display();
        st.pop();
        st.pop();
        st.pop();
        st.peek();
        st.display();

        
    }
}