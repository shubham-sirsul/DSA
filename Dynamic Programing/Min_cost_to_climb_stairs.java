// You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

// You can either start from the step with index 0, or the step with index 1.

// Return the minimum cost to reach the top of the floor.

// Example 1:

// Input: cost = [10,15,20]
// Output: 15
// Explanation: You will start at index 1.
// - Pay 15 and climb two steps to reach the top.
// The total cost is 15.
// Example 2:

// Input: cost = [1,100,1,1,1,100,1,1,100,1]
// Output: 6
// Explanation: You will start at index 0.
// - Pay 1 and climb two steps to reach index 2.
// - Pay 1 and climb two steps to reach index 4.
// - Pay 1 and climb two steps to reach index 6.
// - Pay 1 and climb one step to reach index 7.
// - Pay 1 and climb two steps to reach index 9.
// - Pay 1 and climb one step to reach the top.
// The total cost is 6.

import java.util.*;
public class Min_cost_to_climb_stairs {
     // recursion giving TLE
     int ans = Integer.MAX_VALUE;
        public int minCost(int[] cost) {
            helper(cost,0,0);
            helper(cost,1,0);
            return ans;

        }
        public void helper(int[] cost,int n,int sum){
        if(n>=cost.length){
            ans = Math.min(ans,sum);
            return ;
        }
        sum+=cost[n];
        helper(cost, n + 1, sum);
        helper(cost, n + 2, sum);


        }

        // using recursion + memoization

    public int minCostClimbingStairs(int[] cost) {
           int n= cost.length;
           int dp[] = new int [n];
            Arrays.fill(dp,-1);
           return Math.min(helper(cost, n-2,dp),helper( cost, n-1,dp));

        }
        public int helper(int[] cost,int n,int dp[]){
            if(n<=1) return cost[n];
            if(dp[n]!=-1) return dp[n];
             return dp[n] = cost[n] + Math.min(helper(cost,n-1,dp),helper(cost,n-2,dp));
        }

        //   using tabulation 
         public int minCostClimbingStairs1(int[] cost) {
           int n= cost.length;
           int dp[] = new int [n];
            Arrays.fill(dp,-1);
            dp[0]= cost[0];
            dp[1]=cost[1];
           for(int i = 2;i<n;i++){
            dp[i] = cost[i]+ Math.min(dp[i-1],dp[i-2]);
           }
           return Math.min(dp[n-1],dp[n-2]);

        }

    public static void main(String[] args) {
        int cost[] = {10,15,20};
    
    }
}