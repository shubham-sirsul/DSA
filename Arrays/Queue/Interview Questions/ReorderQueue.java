// // 1 2 3 4 5 6 7 8
// 1st half -->  1 2 3 4 
// 2nd half --> 5 6 7 8 

// final changes in original queue --> 1 5 2 6 3 7 4 8 pu


// approch 

import java.util.*;

public class ReorderQueue {
    public static Queue<Integer> reorderOueue( Queue<Integer> q){
       int n =q.size();
       Stack<Integer> st = new Stack<>();
       for (int i = 0; i < n; i++) {
           st.push(q.remove());
       }
    //    System.out.println(st);
       
       for (int i = 0; i < n/2 ; i++) {
              q.add(st.pop());
       }
      
       for (int i = 0; i < n/2; i++) {
           q.add(q.remove());
           q.add(st.pop());
       }
    //    System.out.println(q);
       for (int i = 0; i < n; i++) {
           q.add(q.remove());
       }
        for (int i = 0; i < n; i++) {
           st.push(q.remove());
       }
    //    System.out.println(st);
       
       for (int i = 0; i < n ; i++) {
              q.add(st.pop());
       }
       System.out.println(q);
       return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
       reorderOueue(q);
    }
}