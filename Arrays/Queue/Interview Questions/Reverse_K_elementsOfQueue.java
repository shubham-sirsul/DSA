
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_K_elementsOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
    
    int k = 3; // reverse first k elements 
 
 System.out.println(" original queue "+q);
      
      for (int i = 0; i < k; i++) {
        st.push(q.remove());
      }
    //   System.out.println(st);
       for (int i = 0; i < k; i++) {
        q.add(st.pop());
      }
      for(int i = 0; i< q.size()-k;i++){
        q.add(q.poll());
      }

       
        System.out.println("reversed queue "+q);
    }
}