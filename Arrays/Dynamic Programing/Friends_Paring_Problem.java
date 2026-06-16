
import java.util.*;
public class Friends_Paring_Problem {

        // recursion 
        public static int pair(int n){
        if(n<=2) return n;
        return  (pair(n-1)  + (n-1)*pair(n-2));    
        }


        // recursion + memoization
        public static int pairs(int n,int dp[]){
        if(n<=2) return n;
        return  dp[n] =  (pair(n-1)  + (n-1)*pair(n-2));    
        }


        // recusion + tabulation
        public static int pairs1(int n,int dp[]){
        if(n<=2) return dp[n] = n;
        return  dp[n] =  (pairs1(n-1,dp) + (n-1)*pairs1(n-2,dp));    
        }

    

}