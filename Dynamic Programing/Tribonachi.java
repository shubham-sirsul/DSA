// The Tribonacci sequence Tn is defined as follows: 

// T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

// Given n, return the value of Tn.

import java.util.*;


public class Tribonachi {
  
  
    // using recursion+ memoization
    public int tribonacci(int n) {
        if(n<=1) return n;
        int dp[] =new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        return helper(dp,n);

    }
    public int helper(int[] dp,int n){
        if(dp[n]!=-1) return dp[n];
       return dp[n]= helper(dp,n-1)+helper(dp,n-2)+helper(dp,n-3);
    }


    // using tabulation 
    public int tribonacci1(int n) {
        if(n<=1) return n;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];

    }
}