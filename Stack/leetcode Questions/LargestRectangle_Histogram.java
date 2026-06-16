
import java.util.Stack;

public class LargestRectangle_Histogram {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
     
        public static int[] PreviousGreater(int arr[]){
        Stack<Integer> st = new Stack<>();
        int res[] =new int[arr.length];
        res[0] =-1;
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i] ){
                st.pop();
            }
            if(st.isEmpty()){
               res[i] = -1;
               
            }
            else{
                 res[i] =st.peek();
            }
            st.push(i);
            
        }
        return res;
    }

    public static int[] NextGreater(int[] arr){
        int n =arr.length;
        int[] res =new int[n];
        Stack<Integer> st = new Stack<>();
        res[n-1] =arr.length; // there is no next greater for last index so we set it as -1
        st.push(arr[n-1]);
        for(int i = n-2 ; i>=0 ; i--){
            // System.out.println(i);
            while(!st.isEmpty() && arr[st.peek()] >= arr[i] ){
                st.pop();
            }
            if(st.size()==0){
                res[i]=arr.length;
                

            }
            else {
                res[i] =st.peek();
                
            }
            st.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {5,2,4,6,3,5};
        int nse[]= NextGreater(arr);
        int pse[] =PreviousGreater(arr);
        // print(arr);
        // print(nse);
        // print(pse);
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int area = arr[i]*(nse[i] - pse[i] - 1);
            if(max <area) max = area;
        }
        System.out.println(max);
    }
}