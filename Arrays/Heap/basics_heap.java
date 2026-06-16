import java.util.*;

public class basics_heap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(12);
        pq.add(30);
        pq.add(2);
        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq.peek());
        for(int i : pq){
            System.out.print(i+" ");
        }

    }
}