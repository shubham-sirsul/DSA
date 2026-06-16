
import java.util.HashMap;

public class Two_Sum {


public int[] twoSum_Brutforce(int[] nums, int target) {
       
      int arr[]= new int [2];
     
      for (int i = 0; i < nums.length; i++) {
        for (int j = i+1; j< nums.length; j++) {
            if(nums[i]+nums[j]==target){
                
              arr[0]=i;
              arr[1]=j;
            }
        }
          
      }

for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]);
    
} 
return arr;
    }


    public static  int[] two_sum(int[] nums, int target){
         HashMap<Integer,Integer> hm  = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int rem  = target - nums[i];
            if(hm.containsKey(rem)){
                int ans[] = {i,hm.get(rem)};
                return ans;
            }
            else{
                hm.put(nums[i],i);
            }
        }
        int a[]={-1};
        System.gc();
        return a;

    }
    public static void main(String[] args) {
        int arr[] ={1,4,2,5,7,6,9};
        System.out.println(two_sum(arr, 13));

        
    }
}