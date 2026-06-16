
import java.util.LinkedList;
import java.util.Queue;

// Given an array arr[]  and a positive integer k, find the first negative integer for each and every window(contiguous subarray) of size k.

// Note: If a window does not contain a negative integer, then return 0 for that window.

// Examples:

// Input: arr[] = [-8, 2, 3, -6, 10] , k = 2
// Output: [-8, 0, -6, -6]
// Explanation:
// Window [-8, 2] First negative integer is -8.
// Window [2, 3] No negative integers, output is 0.
// Window [3, -6] First negative integer is -6.
// Window [-6, 10] First negative integer is -6.


// Input: arr[] = [12, -1, -7, 8, -15, 30, 16, 28] , k = 3
// Output: [-1, -1, -7, -15, -15, 0] 
// Explanation:
// Window [12, -1, -7] First negative integer is -1.
// Window [-1, -7, 8] First negative integer is -1.
// Window [-7, 8, -15] First negative integer is -7.
// Window [8, -15, 30] First negative integer is -15.
// Window [-15, 30, 16] First negative integer is -15.
// Window [30, 16, 28] No negative integers, output is 0.


// Input: arr[] = [12, 1, 3, 5] , k = 3
// Output: [0, 0] 
// Explanation:
// Window [12, 1, 3] No negative integers, output is 0.
// Window [1, 3, 5] No negative integers, output is 0.

// Constraints:
// 1 <= arr.size() <= 106
// -105 <= arr[i] <= 105
// 1 <= k <= arr.size()

public class first_negative_EachWindow_ofSize_K {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={12,-1,-7,8,-15,30,16,28};
        int k = 3; // window size
        int res[]= new int[arr.length-k+1];
        int j =0;
        Queue<Integer> q = new LinkedList<>();

        // adding negaitve value indices in queue 
        for (int i =0;i<arr.length;i++){
            if(arr[i] <0) q.add(i);
        }
        
        for (int i = 0; i <=arr.length-k ; i++) {
            while(!q.isEmpty() && q.peek()<i){
                q.remove();
            }
            if(!q.isEmpty() && q.peek()>=i && q.peek()<=i+k-1){
              res[j] = arr[q.peek()];
              j++;
            }
            else if(q.isEmpty()){
                res[j] = 0;
                j++;
            }
            else{
                res[j] = 0;
                j++;
            }
        }

        print(res);
    }
}