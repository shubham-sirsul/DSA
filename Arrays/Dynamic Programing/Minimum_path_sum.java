// Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

// Note: You can only move either down or right at any point in time.

// Example 1:

// Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
// Output: 7
// Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
// Example 2:

// Input: grid = [[1,2,3],[4,5,6]]
// Output: 12

public class Minimum_path_sum {

    // recursion 
    public  static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        return minp(0,0,m,n,grid);
    }
    
    public static int  minp( int i,int j,int m,int n, int grid[][] ){

        if(i==m-1 && j==n-1) return grid[m-1][n-1];
        if(i>=m-1 && j!=n-1) return  grid[i][j] + minp(i,j+1,m,n,grid);
        if (j>=n-1 && i!=m-1) return  grid[i][j] +  minp(i+1,j,m,n,grid);
        int right = grid[i][j] + minp(i,j+1,m,n,grid);
        int down = grid[i][j] + minp(i+1,j,m,n,grid);
       return Math.min(right,down);
    }

    // recursion + memoization 
    public static int minPathSum1(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
         minp1(0,0,m,n,grid,dp);
           for(int i=0;i<m;i++){
                for(int j =0;j<n;j++){
                   System.out.print(dp[i][j]+" ");
                }
                System.out.println();
            }

        return dp[0][0];
         
    }
    
    public static  int  minp1( int i,int j,int m,int n, int grid[][] ,int [][]dp){
        if(dp[i][j]!=0) return dp[i][j];
        if(i==m-1 && j==n-1) return  dp[m-1][n-1]= grid[m-1][n-1];
        if(i>=m-1 && j!=n-1) return dp[i][j] =  grid[i][j] + minp1(i,j+1,m,n,grid,dp);
        if (j>=n-1 && i!=m-1) return  grid[i][j] +  minp1(i+1,j,m,n,grid,dp);
        int right = grid[i][j] + minp1(i,j+1,m,n,grid,dp);
        int down = grid[i][j] + minp1(i+1,j,m,n,grid,dp);
        return dp[i][j] =  Math.min(right,down);
    }

    // tabulation 
    public int minPathSum2(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n]; 
        dp[0][0] = grid[0][0];
       for(int i=1;i<m;i++){
        dp[i][0] = grid[i][0]+dp[i-1][0];
       }
        for(int i=1;i<n;i++){
        dp[0][i] = grid[0][i]+dp[0][i-1];
       }
       
       for(int i  = 1;i<m;i++){ 
        for(int j=1;j<n;j++){
            dp[i][j] = grid[i][j] + Math.min(dp[i-1][j],dp[i][j-1]);
        }
       }

       return dp[m-1][n-1];
        
    }
    public static void main(String[] args) {
        int grid[][] = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum1(grid));
    }
}