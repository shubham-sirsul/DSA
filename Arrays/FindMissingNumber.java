
import java.util.HashSet;

// Given an array nums containing n distinct numbers in the range [0, n], n is length of array, return the only number in the range that is missing from the array.
// Example 1:
// Input: nums = [3,0,1]
// Output: 2

public class FindMissingNumber {
    // brute force approch 
    // o(n2)
    public static int missingNumber(int[] nums) {
        HashSet<Integer> hs  = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++){
           if(!hs.contains(i)) return i;
        }
        return 0;
    }
    public  static int missingNumber2(int[] nums) {
        // o(n) ts
        int ans = 0;
        int n = nums.length;

        // XOR all numbers from 0..n
        for (int i = 0; i <= n; i++) {
            ans ^= i;
        }

        // XOR all elements in nums
        for (int num : nums) {
            ans ^= num;
        }

        return ans;
        // SIMPLE DRY RUN 
        // nums = [3, 0, 1]
        //  XOR OF all numbers --> 0 ^ 1 ^ 2 ^ 3
        //  XOR all elements in nums --> (3 ^ 0 ^ 1)
        //  take XOR  of both 
        //  (0 ^ 1 ^ 2 ^ 3) ^ (3 ^ 0 ^ 1)
        //  Now rearrange (XOR order doesn't matter):
        //     0 ^ 0 ^ 1 ^ 1 ^ 3 ^ 3 ^ 2

        //     pairs cancle each other 
        //     0 ^ 0 = 0
        //     1 ^ 1 = 0
        //     3 ^ 3 = 0

        //     lat remaning 0^2 = 2 

    }
    public static void main(String[] args){
        int nums[] = {3,0,1};
        System.out.println(missingNumber(nums));
        System.out.println(missingNumber2(nums));   

    }

    // rules of XOR
    // a ^ a = 0
    // a ^ 0 = a
    // For 5 ^ 3 = 6 , if you want the fastest mental method:

    // 5 = 4 + 1
    // 3 = 2 + 1

    // common 1 cancels
    // 4 + 2 = 6

}