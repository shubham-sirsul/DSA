public class CoinChange {
    public long ans(int coins[],int amount ,int idx,long dp[][]){
        
        if(amount<0) return Integer.MAX_VALUE;
        if(idx>= coins.length) return Integer.MAX_VALUE;
        if(dp[idx][amount]!=-1) return dp[idx][amount];
        if(amount ==0) return dp[idx][amount]=0 ;
          long drop =  ans(coins,amount,idx+1,dp);
        if(amount - coins[idx]<0) return drop;
        long pick = 1+  ans(coins,amount - coins[idx],idx,dp);
       
        
        return dp[idx][amount]= Math.min(pick,drop);

    }
    public int coinChange(int[] coins, int amount) {
        long dp[][] = new long[coins.length][amount+1];
        for(long t[]: dp){
            Arrays.fill(t,-1);
        }
        int x= (int)ans(coins,amount,0,dp) ;    

        return  (x==Integer.MAX_VALUE) ? -1 : x;
    }
}