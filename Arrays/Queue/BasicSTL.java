
import java.util.LinkedList;
import java.util.Queue;

public class BasicSTL {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //  Queue<Integer> w= new ArrayDeque<>();
        q.add(5);
        q.add(6);
        q.add(2);
        q.add(1);
        q.add(3);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.element());// print topmost
        System.out.println(q.peek()); // print topmost
        System.out.println(q.size()); // print size
    }
}