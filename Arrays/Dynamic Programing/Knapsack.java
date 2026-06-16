

public class Knapsack {
    public static void main(String[] args) {
        int[]  val = {5,3,9,16};
        int [] weight = {1,2,8,10};
        int c = 8;
        
        int dp[] = new int[val.length];
        // int ans = profit(val, weight, c, 0); // recursion

        // to apply dp cheak how many varibles are changing 
        // 2 variables -->  profit , capacity 
        // we need 2d dp to solve this
        // and index changing 0 to n-1 
        // capacity changing  C --> 0 
        

        int dpp[][] = new int[val.length][c+1];
       
        for(int i = 0;i<val.length;i++){
            for(int j = 0 ;j<=c;j++){
                dpp[i][j] = -1;
            }
        }
         int ans1 =  profit1(val, weight, c,0,dpp);

        System.out.println(ans1);
    }


    // recursion 
    private static int profit( int[] val, int[] weight,int capacity,int i) {
        if(i>=val.length) return 0;
        if(capacity<weight[i]) {
            return profit(val, weight, capacity, i+1);
        }

       int pick =  val[i] + profit(val, weight, capacity-weight[i], i+1);
       int drop = profit(val, weight, capacity, i+1);

       return Math.max(pick,drop);
    }


    // recursion + memoization 
        private static int profit1( int[] val, int[] weight,int capacity,int i,int dp[][]) {
            if(i>=val.length) return 0;
            if(dp[i][capacity]!=-1) return dp[i][capacity];
            if(capacity<weight[i]) {
                return dp[i][capacity]=profit1(val, weight, capacity, i+1,dp);
            }

        int pick =  val[i] + profit1(val, weight, capacity-weight[i], i+1,dp);
        int drop = profit1(val, weight, capacity, i+1,dp);

        return dp[i][capacity]=Math.max(pick,drop);
        }
}