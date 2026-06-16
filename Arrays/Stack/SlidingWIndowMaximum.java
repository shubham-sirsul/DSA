
import java.util.Stack;



// Return the max sliding window.

 

// Example 1:

// Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
// Output: [3,3,5,5,6,7]
// Explanation: 
// Window position                Max
// ---------------               -----
// [1  3  -1] -3  5  3  6  7       3
//  1 [3  -1  -3] 5  3  6  7       3
//  1  3 [-1  -3  5] 3  6  7       5
//  1  3  -1 [-3  5  3] 6  7       5
//  1  3  -1  -3 [5  3  6] 7       6
//  1  3  -1  -3  5 [3  6  7]      7



public class SlidingWIndowMaximum {
    // it needs T.S O(k*n)  -->  brutforce approch 
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] maxarr(int arr[], int k){
        int l =arr.length;
        int ans[] =new int[l -k+1];
        int z=0;
        for (int i = 0; i < l-k+1; i++) {
            int max =Integer.MIN_VALUE;
            for (int j = i; j < i+k; j++) {
                if(max<arr[j]) max =arr[j];
            }
            ans [z] =max;
            z++;
            
        }
            print(ans);
            return ans;
    }


    public static int[] maxarr1(int arr[], int k){
        int l =arr.length;
        int ans[] =new int[l -k+1];
        int z=0;
        Stack<Integer> st = new Stack<>(); 
        int nge[]  = new int[l];
        nge[l-1] =l;
        st.push(arr[l-1]);
        for (int i = l-2; i >=0; i--) {
            while(st.size()>0  && arr[st.peek()]< arr[i] ){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i] =l+1;
                st.push(i);

            }
            else{
                nge[i] =st.peek();
                st.push(i);
            }
            
        }
            // print(nge);
            // print(ans);

           int  j= 0;
            for (int i = 0; i < l-k+1; i++) {
                 if(j<i-k+1) {

                 }
                 else  j =i;
                 int max =0 ;
                 while(j<i+k){
                    max = arr[j];
                    j =nge[j];
                 }
                 ans[z++] =max;
            }
            return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int  k = 3 ;       
        print(maxarr1(nums, k));
    }
}