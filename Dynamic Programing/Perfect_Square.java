import java.util.*;

public class Perfect_Square {
    // recursion 
    class Solution {

    public boolean isperfect(int n){
    int a = (int)Math.sqrt(n);
    return a*a == n;
}
    public int answer(int n,int dp[]){
     if(dp[n]!=-1) return dp[n];
      if(  isperfect(n)) return dp[n]=1;
        int min = n;
        
        for(int i =1;i<=n/2;i++){
             min = Math.min(min,answer(i,dp) + answer(n-i,dp));
            if(dp[n]!=-1 && dp[n]>min){
                dp[n] = min;
            }
            else{
                dp[n] =  min;
            }
           
           
        }   
        return dp[n];
    }



    public int numSquares(int n) {
      int dp[] = new int[n+1];
      Arrays.fill(dp,-1);
      return answer(n,dp);
        
    }
   
    // recursion + memoization
   
    public int answer1(int n,int dp[]){
     if(dp[n]!=-1) return dp[n];
      if(  isperfect(n)) return dp[n]=1;
        int min = n;
        
        for(int i =1;i<=n/2;i++){
             min = Math.min(min,answer1(i,dp) + answer1(n-i,dp));
             if(min==2){
                dp[n] = min;
                 break;
                }
            dp[n] = min;
           
           
        }   
        return dp[n];
    }

    public int numSquares1(int n) {
      int dp[] = new int[n+1];
      Arrays.fill(dp,-1);
      return answer(n,dp);
        
    }

// tabulation 
  
    public int numSquares2(int n) {
        int dp[] = new int[n+1];
        for(int i=1;i<=n;i++){
            if(isperfect(i)) dp[i] = 1;
            else{
                int min = n;
                for(int j = 1;j*j<=i;j++){
                   int count = dp[j*j] + dp[i-j*j];
                   min = Math.min(count,min);
                }
                dp[i] = min;
            }
        }
        return dp[n];
        
        
    }
}

    public static void main(String[] args) {
        
    }
}