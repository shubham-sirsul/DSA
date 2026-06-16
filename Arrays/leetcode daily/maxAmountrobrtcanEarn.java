// 3418. Maximum Amount of Money Robot Can Earn
// Attempted
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// You are given an m x n grid. A robot starts at the top-left corner of the grid (0, 0) and wants to reach the bottom-right corner (m - 1, n - 1). The robot can move either right or down at any point in time.

// The grid contains a value coins[i][j] in each cell:

// If coins[i][j] >= 0, the robot gains that many coins.
// If coins[i][j] < 0, the robot encounters a robber, and the robber steals the absolute value of coins[i][j] coins.
// The robot has a special ability to neutralize robbers in at most 2 cells on its path, preventing them from stealing coins in those cells.

// Note: The robot's total coins can be negative.

// Return the maximum profit the robot can gain on the route.

 

// Example 1:

// Input: coins = [[0,1,-1],[1,-2,3],[2,-3,4]]

// Output: 8

// Explanation:

// An optimal path for maximum coins is:

// Start at (0, 0) with 0 coins (total coins = 0).
// Move to (0, 1), gaining 1 coin (total coins = 0 + 1 = 1).
// Move to (1, 1), where there's a robber stealing 2 coins. The robot uses one neutralization here, avoiding the robbery (total coins = 1).
// Move to (1, 2), gaining 3 coins (total coins = 1 + 3 = 4).
// Move to (2, 2), gaining 4 coins (total coins = 4 + 4 = 8).
// Example 2:

// Input: coins = [[10,10,10],[10,10,10]]

// Output: 40

// Explanation:

// An optimal path for maximum coins is:

// Start at (0, 0) with 10 coins (total coins = 10).
// Move to (0, 1), gaining 10 coins (total coins = 10 + 10 = 20).
// Move to (0, 2), gaining another 10 coins (total coins = 20 + 10 = 30).
// Move to (1, 2), gaining the final 10 coins (total coins = 30 + 10 = 40).
 

// Constraints:

// m == coins.length
// n == coins[i].length
// 1 <= m, n <= 500
// -1000 <= coins[i][j] <= 1000



public class maxAmountrobrtcanEarn {
    public int ans(int[][] coins,int i,int j,int k,int[][][] dp) {
        // going out of bound 
        if(i>=coins.length || j>=coins[0].length)  return Integer.MIN_VALUE;
         
        // cheak if dp computed or not 
         if(dp[i][j][k]!=Integer.MIN_VALUE) return dp[i][j][k];

        // if reached at destination return sum
        if(i==coins.length-1 && j==coins[0].length-1){
            if (coins[i][j] < 0 && k > 0)
                return dp[i][j][k] = 0; // neutralize
            return dp[i][j][k] = 0 + coins[i][j];
            }

        

        // nutrilizing
        if(coins[i][j] < 0 && k > 0){

    int skip = Math.max(
        ans(coins, i, j+1, k-1, dp),
        ans(coins, i+1, j, k-1, dp)
    );

    int take = coins[i][j] + Math.max(
        ans(coins, i, j+1, k, dp),
        ans(coins, i+1, j, k, dp)
    );

    return dp[i][j][k] = Math.max(skip, take);
}
        
        int right =  ans(coins,i,j+1,k,dp); // go --> right 
        int left =  ans(coins,i+1,j,k,dp);// go --> down 

        return dp[i][j][k] =  coins[i][j] + Math.max(right,left);
    }
    public int maximumAmount(int[][] coins) {
        int dp[][][]= new int[coins.length][coins[0].length][2+1];
        int m = coins.length;
         int n = coins[0].length;
             for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < 3; k++) {
                        dp[i][j][k] = Integer.MIN_VALUE;
                    }
                }
            }

        return ans(coins, 0, 0,2,dp);
    }


    //recursion 
         public int ans1(int[][] coins,int i,int j,int sum,int k) {
         
        // if reached at destination return sum
        if(i==coins.length-1 && j==coins[0].length-1) return sum+coins[i][j];

        // going out of bound 
        if(i>=coins.length || j>=coins[0].length)  return Integer.MIN_VALUE;
        if(coins[i][j]<0 && k>0){
            int a = Math.max(ans1(coins,i,j+1,sum+0,k-1),ans1(coins,i,j+1,sum+coins[i][j],k));
            int b= Math.max(ans1(coins,i+1,j,sum+0,k-1),ans1(coins,i+1,j,sum+coins[i][j],k));
            return Math.max(a,b);
        }
        
        int right =  ans1(coins,i,j+1,sum+coins[i][j],k); // go --> right 
        int left =  ans1(coins,i+1,j,sum+coins[i][j],k);// go down 

        return  Math.max(right,left);
    }
    public int maximumAmount1(int[][] coins) {
        return ans1(coins, 0, 0, 0,2);
    }

    public static void main(String[] args) {
        maxAmountrobrtcanEarn obj = new maxAmountrobrtcanEarn();

        // Example matrix of coins
        int[][] coins = {
            {5, 3, 2},
            {1, 9, 4},
            {6, 2, 7}
        };

        // Start from top-left corner (0,0) with sum = 0
        int maxCoins = obj.maximumAmount(coins);

        System.out.println("Maximum amount robber can earn: " + maxCoins);
    }
}