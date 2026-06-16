
import java.util.ArrayList;

public class DisJoin_Set_Union {
     static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }
    public static void main(String[] args) {
     ArrayList<Edge> graph[] = new ArrayList[7];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));      

    }
}
