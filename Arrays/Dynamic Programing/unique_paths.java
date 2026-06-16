import java.util.*;

public class unique_paths {
   

   //  recursion +  memoization 
    public  static int uniquePaths(int m, int n) {
         int dp[][] = new int[m][n];
        path(0, 0, m, n, dp);

        // Print the DP table after filling
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        return dp[0][0]; // final answer stored at start cell

    }
    public static int path(int a,int b,int m,int n, int dp[][]){
        if( dp[a][b]!=0) return  dp[a][b];
        if(a==m-1 && b==n-1) return dp[a][b]= 1;
        if(a==m-1 && b!=n-1){
            return  dp[a][b]= path(a,b+1,m,n,dp);
        }
        else if(b==n-1 && a!=m-1)  return  dp[a][b]= path(a+1,b,m,n,dp);
       
        return  dp[a][b]= path(a+1,b,m,n,dp) + path(a,b+1,m,n,dp);
    }

    // tabulation 
    public int uniquePaths1(int m, int n) {
            int dp[][] = new int[m][n];

            
            for(int i=0;i<m;i++){
                dp[i][0] = 1;
            }
            for(int i=0;i<n;i++){
                dp[0][i] = 1;
            }


            for(int i=1;i<m;i++){
                for(int j =1;j<n;j++){
                    dp[i][j] = dp[i][j-1]+ dp[i-1][j];
                }
            }
            return dp[m-1][n-1];
        }


    public static void main(String[] args) {
        System.out.println(uniquePaths(3,3));
         
        
    }
}