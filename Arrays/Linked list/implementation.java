

public class implementation {
    public static class Node{
        int data ;
        Node next;

        Node(int data) {
        this.data =data;
        }
        
    }
    public static class linkedlist{
             Node head =null;
             Node tail =null;
             int size = 0;


             
             void insertatEnd(int val){
                Node temp =new Node(val);
               if(head ==null){  // empty list
               head= temp ;
                //tail =temp;
               }
               
               else{ //non empty lsit 
                tail.next =temp;
                //tail= temp;
               }
               size++;
               tail=temp;
             }
         
            void insertAtstart(int val){
                Node temp = new Node(val);
                if(head==null){// empty list 
                    head =temp;
                    tail =temp;
                }
                else{ // non empty list 
                    temp.next = head;
                }
                size++;
                head =temp;
            }
            
            void insertAt(int idx,int val){
                 Node x= new Node(val);
                Node temp =head;
               
                if (idx==0){
                     insertAtstart(val);
                     return;
                }
               if(idx==size){
                   insertatEnd(val);
                    return;
                }
                if(idx<0){
                System.out.println("wrong idx ");
                return;
               }
               
                int count=0;
              
                while(count!=idx-1){
                    count++;
                    temp =temp.next;
                    if(temp ==null) break;
                }
                 x.next=temp.next;
                 temp.next =x;  
                 size++;
                 

            }

           void  deletAt(int idx){
            if(idx>size || idx <0) return;
               Node temp = head;
                
               int i=0;
            
               if(idx==0){
                head = temp.next;
                size--;
                return;
               }
               
               while(i!=idx-1){
                temp=temp.next;
                i++;
               }
               if(temp.next.next ==null){
                temp.next =null;
                tail = temp;
               }
              else  temp.next = temp.next.next;
              
               size--;

              
               
            }
     
            int getelement(int idx){
                Node temp =head;
                if(idx>size || idx<0) return -1;
                for (int i = 0; i <idx; i++) {
                    temp =temp.next;
                }
                return temp.data;
            }

             void display(){
                Node temp =head;
                while(temp!=null){
                    System.out.print (temp.data+" ");
                    temp= temp.next;
                }
             }
            //  int size(){
            //     int count =0;
            //     Node temp = head;
            //     while(temp!=null){
            //         count++;
            //         temp=temp.next;
            //     }    
            //     return count;
            //  }

    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        // ll.insertatEnd(5);   
        // ll.insertatEnd(9);   
        // ll.display();
        // System.out.println();
        // System.out.println(ll.size());
        ll.insertAtstart(88);
        // ll.insertAt(0, 100);
        ll.display();
        System.out.println();
        ll.deletAt(0);
        ll.display();
        System.out.println();
        // System.out.println(ll.head.data);

        // System.out.println();
        // System.out.println(ll.tail.data);     
        // System.out.println(ll.getelement(3 ));
        // System.out.println(ll.size);

        
            }
}