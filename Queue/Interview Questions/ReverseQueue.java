
import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

 
 System.out.println(" original queue "+q);


        while(!q.isEmpty()){
       st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.println("reversed queue "+q);
    }
}