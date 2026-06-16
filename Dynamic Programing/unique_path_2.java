public class unique_path_2 {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int [][] dp = new int[m][n];
        return path(0,0,m,n,arr,dp);

    }
    public int path(int i,int j,int m,int n,int arr[][],int[][] dp){
        if(dp[i][j]!=0) return dp[i][j]  ;
        if(arr[i][j]==1) return dp[i][j] =  0 ;
        if(i==m-1 && j==n-1){
            return dp[i][j]=1;
        }
        if(i==m-1 && j!=n-1 ){
         return  dp[i][j]= path(i,j+1,m,n,arr,dp);

        }
         if(i!=m-1 && j==n-1 ){
         return dp[i][j]=  path(i+1,j,m,n,arr,dp);

        }
        return dp[i][j]=path(i,j+1,m,n,arr,dp)+path(i+1,j,m,n,arr,dp);
    }   
    public static void main(String[] args) {
        
    }
}