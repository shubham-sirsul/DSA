



public class Subsetsum {


    // do it again it notundestanding at all 

    // recursion
    public static boolean  sum(int nums[], int target,int i ){
     if(target==0) return true;
     if(i>=nums.length) return false;
    
     boolean skip =  sum(nums,target,i+1);
    //  if(target-nums[i]<0) return false; // target negative ho raha hee tho koi call lagane kii jarurat nhii but only sirf sare numbers positive hoo thoo hii ye kam ayega 
     boolean pick = sum(nums,target -  nums[i],i+1);
     
     return (pick || skip);


    //  time complixity -  O(2^n)
    // space complixity -- O(n*t)
    }

    public static boolean  sum1(int nums[], int target,int i ,int dp[][]){

     if(target==0) return true;
     if(i>=nums.length) return false;
     boolean ans = false;

    if(dp[i][target]!=-1) {  // if it is computed 
        if(dp[i][target]==1) return true; // if their is sumset  exists 
        else return false; // no any subset exist whose sum is equals target 
    }
    
    boolean skip =  sum1(nums,target,i+1,dp);
     if(target-nums[i]<0 ||target-nums[i]>target ){ 
     dp[i][target]=0;
     return false; // target negative ho raha hee tho koi call lagane kii jarurat nhii but only sirf sare numbers positive hoo thoo hii ye kam ayega 
    }
     boolean pick = sum1(nums,target -  nums[i],i+1,dp);
     

     ans = pick || skip;
     if(ans){
        dp[i][target]=1;
     }
     else{
        dp[i][target]=0;
     }
     return ans;
    }
    public static void main(String[] args) {
        int nums[] = { 8,-1,2,4};
        int target  = 7;
        int dp[][]= new int[nums.length][target+1]; 
        // we store only 3 valuses in dp 
        // - 1 → not yet computed
        // - 0 → false (no subset found)
        // - 1 → true (subset exists)

        // filling dp with -1 

        for(int i = 0;i<nums.length;i++){
            for(int j = 0 ;j<=target;j++){
                dp[i][j] = -1;
            }
        }
        
        System.out.println(sum1(nums, target,0,dp));
        
    }
}