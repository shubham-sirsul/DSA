// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
// Example 1:
// Input: nums = [1,2,3,1]
// Output: 4
// Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
// Total amount you can rob = 1 + 3 = 4.

import java.util.*;

public class House_Robber {
    // without dp it gives TLE 

    // this is recursion +  memoization                 
     public  static int amount(int[] nums,int i,int[]  dp) {
        
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        
        int take = nums[i] +  amount(nums,i+2,dp);
        int skip = amount(nums,i+1,dp); 
        return dp[i] = Math.max(take,skip);
    }
    public static int rob(int[] nums) {

        int n = nums.length;
        if(n==1) return nums[0];
        //   dp[i] will store the vlaue of amount of i
        int dp[]= new int[nums.length];
        Arrays.fill(dp,-1);

        
        return amount(nums,0,dp);
    }

      // using tabulation 
    public static int robb(int[] nums) {

        int n = nums.length;
        if(n==1) return nums[0];
        int dp[]= new int[nums.length];
        
        dp[0] =  nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
         for(int i=2;i<nums.length;i++){
            dp[i] =  Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[nums.length-1];
        
        
    }
    public static void main(String[] args) {
        int nums[] = {114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240
};
System.out.println("maximum amount robber can rob  is "+ robb(nums));
    }
}