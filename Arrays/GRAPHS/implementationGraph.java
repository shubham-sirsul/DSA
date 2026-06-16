
import java.util.*;

public class implementationGraph {

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


        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        
        graph[6].add(new Edge(6,5));
    }

    public static void BFS(ArrayList<Edge> graph[], int v){
        Queue<Integer> q =  new LinkedList<>();
        boolean visited[] =new boolean[v];

        Edge a =graph[0].get(0);
        q.add(a.src);

        while(!q.isEmpty()){
            int curr= q.remove();
            if(visited[curr]== false){
                visited[curr]= true;
                System.out.print(curr+" ");
                for(int i= 0;i<graph[curr].size();i++){
                    Edge temp =graph[curr].get(i);
                    q.add(temp.dest);
                }

            }
        }
        
        
    }

    public static  void DFS( ArrayList<Edge> graph[],int curr , boolean visited[]){
       
       if( visited[curr] ==true){
        return;
       }
       else{
         System.out.print(curr+" ");
        visited[curr] =true;
       }
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge temp =graph[curr].get(i);
            DFS(graph, temp.dest, visited);
            
        }
    }

    public static void stackDFS(ArrayList<Edge> graph[],int curr,int v){
         boolean visited[] = new boolean[v];
         Stack<Integer> st = new Stack<>();
         st.add(curr);

         while(!st.isEmpty()){
            curr= st.pop();
            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr] =true;
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge temp =graph[curr].get(i);
                
               if (!visited[temp.dest]) {
                    st.push(temp.dest);
                }
            }
            }

         }
    }


    public static void practice_BFS(ArrayList<Edge>  graph[],int v){
    Queue<Integer> q =new LinkedList<>();
    boolean visited[]= new boolean[v];
    
    Edge a =graph[0].get(0);
    int curr =a.src;
    q.add(curr);
       while(!q.isEmpty()){
         curr =q.remove();
        if(visited[curr]==false){
           visited[curr]=true;
         System.out.print(curr+" ");
        for(int i=0;i<graph[curr].size();i++){
            Edge temp =graph[curr].get(i);
            q.add(temp.dest);
        }

       }
       }

    }

    public static void practice_DFS(ArrayList<Edge> graph[],int v){
     Stack<Integer> st =new Stack<Integer>();
    boolean visited[]= new boolean[v];
    
    Edge a =graph[0].get(0);
    int curr =a.src;
    st.add(curr);
       while(!st.isEmpty()){
         curr =st.pop();
        if(visited[curr]==false){
           visited[curr]=true;
         System.out.print(curr+" ");
        for(int i=0;i<graph[curr].size();i++){
            Edge temp =graph[curr].get(i);
            st.add(temp.dest);
        }

       }
       }
    }

    public static void rec_dfs(ArrayList<Edge> graph[],int curr,boolean v[]){
        if(v[curr]==true){
           return;
        }
        else{
            v[curr]=true;
            System.out.print(curr+" ");
        }
        for (int i = graph[curr].size()-1; i >=0; i--) {
            Edge a =graph[curr].get(i);
            rec_dfs(graph, a.dest,v);
            
        }


    }

    public static void  all_paths(ArrayList<Edge> graph[],boolean v[], String str,int s,int d){
        if(s==d){
            System.out.println(str);
            return;
        }
        if(v[s]==true)
        return ;
        else v[s]=true;

        for (int i = 0; i < graph[s].size(); i++) {
            Edge a = graph[s].get(i);
            all_paths(graph, v, str + a.dest,a.dest, d);
        }
        v[s]=false;

    }

    
    public static void main(String[] args) { 

        int v =7;
        ArrayList<Edge> graph[]=  new ArrayList[v];
        createGraph(graph);
        boolean temp[] = new boolean[v];

        // stackDFS(graph,0,v);
        // System.out.println();
        // DFS(graph, 0 , temp);
        // practice_DFS(graph, v);
        // System.out.println();
        // rec_dfs(graph, 0,temp);
        all_paths(graph, temp, "",0,6);
        
    }
}