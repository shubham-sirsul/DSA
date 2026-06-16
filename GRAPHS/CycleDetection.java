
import java.util.*;

public class CycleDetection {
     static class Edge{
    int src;
    int dest;

    public Edge(int s, int d){
        src =s;
        dest= d;
    }
}
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0 ;i<graph.length;i++){
            graph[i]= new ArrayList<Edge>();
        }


    graph[0].add(new Edge(0, 2));
    graph[1].add(new Edge(1, 0));
    graph[2].add(new Edge(2, 3));  // <- forms cycle (0 → 2 → 0)
    graph[3].add(new Edge(3,0));

    }

    public static boolean dfs(ArrayList<Edge> graph[],int curr,boolean vis[],boolean rec[]){
        vis[curr]= true;
        rec[curr]=true;

        for (int i = 0; i < graph[curr].size(); i++) {
           Edge t = graph[curr].get(i);
           if(rec[t.dest]) return true;
           else if(!vis[t.dest] &&  dfs(graph, t.dest, vis, rec)){
          return true;
           }   
        }
        rec[curr]=false;
    return false;
    }


    public static boolean cycle(ArrayList<Edge> graph[],int curr,boolean vis[],int rec_stack[]){
        
          vis[curr]=true;
          rec_stack[curr]=1;
          for (int i = 0; i < graph[curr].size(); i++) {
              Edge a =graph[curr].get(i);
              if(rec_stack[a.dest]==1) return true;
              else  if(!vis[a.dest] && cycle(graph, a.dest, vis, rec_stack)){
                return  true;
              }
          }
          rec_stack[curr]=0;
          return false;


    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[7];
        createGraph(graph);

       System.out.println(cycle(graph, 0, new boolean[7],new int[7] ));

    }
}