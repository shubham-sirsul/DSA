// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.

// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
import  java.util.*;

public class houseRobber2 {
    public  static int amount(int[] nums,int i,int[]  dp) {
        // go to 0 to n -1
        if(i>nums.length-1) return 0;
        if(dp[i]!=-1) return dp[i];
        
        int take = nums[i] +  amount(nums,i+2,dp);
        int skip = amount(nums,i+1,dp);
        return dp[i] = Math.max(take,skip);
    }
    public  static int amount1(int[] nums,int i,int[]  dp) {
        // go to 1 to n-2
        if(i>nums.length-2) return 0;
        if(dp[i]!=-1) return dp[i];
        
        int take = nums[i] +  amount1(nums,i+2,dp);
        int skip = amount1(nums,i+1,dp);
        return dp[i] = Math.max(take,skip);
    }
    public static int rob(int[] nums) {

        int n = nums.length;
        if(n==1) return nums[0];
        //   dp[i] will store the vlaue of amount of i
        int dp[]= new int[nums.length];
        int dp1[]= new int[nums.length];
        Arrays.fill(dp,-1);
        Arrays.fill(dp1,-1);

        
        return Math.max(amount1(nums,0,dp),amount(nums,1,dp1));
    }

}