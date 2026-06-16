
import java.util.*;

public class printQueue {
    public static void main(String[] args) {
         Queue<Integer> q = new LinkedList<>();
        //  Queue<Integer> w= new ArrayDeque<>();
        q.add(5);
        q.add(6);
        q.add(2);
        q.add(1);
        q.add(3);
         Queue<Integer> z = new LinkedList<>();
         while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            z.add(q.remove());

         }
         while(!z.isEmpty()){
            // System.out.print(z.peek()+ " ");
            q.add(z.remove());
         }
         System.out.println();
         System.out.println(q);
    }
}