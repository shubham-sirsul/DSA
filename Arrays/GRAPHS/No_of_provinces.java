public class No_of_provinces {
    public int find(int a,int parent[]){
        if(parent[a]==a) return a;
        int x = find(parent[a],parent);
        parent[a]=x; // backtrack making all node parent sireact  leader 
        return x;
     }
    public void union(int a  , int b, int[] parent,int size[]){
        int x = find(a,parent);
        int y  = find(b,parent);
        if(x==y) return ;
        // optimazition 
        if(size[x]>size[y]){ // X SHOULD PARENTR OF Y
            // we using size not levels 
        parent[y] = x;  
        size[a] +=size[b];
        } else{ parent[x]=y;
             size[b]+=size[a];
    }
    }
    public int findCircleNum(int[][] isConnected) {
        int n  = isConnected.length;
        int Parent [] = new int[n];
        int size[] = new int[n];
        // jitne bhii nodes hee sabke parents khud hee 
        for(int i=0;i<n;i++){
            Parent[i] = i;
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++ ){
                // i city connected to j city 
                if(isConnected[i][j]==1){
                    union(i,j,Parent,size);
                }
            }
        }

        int ans = 0;
         for(int i=0;i<n;i++){
            if(Parent[i]==i) ans++;
        }

        return ans; 

    }
}
