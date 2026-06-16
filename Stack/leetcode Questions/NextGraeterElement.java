
import java.util.Stack;

public class NextGraeterElement {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] NextGreater(int[] arr){
        int n =arr.length;
        int[] res =new int[n];
        Stack<Integer> st = new Stack<>();
        res[n-1] =-1; // there is no next greater for last index so we set it as -1
        st.push(arr[n-1]);
        for(int i = n-2 ; i>=0 ; i--){
            System.out.println(i);
            while( !st.isEmpty() && st.peek() < arr[i] ){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
                st.push(arr[i]);

            }
            else {
                res[i] =st.peek();
                st.push(arr[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
         int arr[] ={5,2,4,6,3,5};
        //  int brr[] =new int[arr.length];
        //  int flag =0;
        //  for (int i = 0; i < arr.length; i++) {
        //     flag =0;
        //       for (int j = i+1; j < arr.length; j++) {
        //           if(flag==0 && arr[i]<arr[j]){ brr[i]= arr[j]; flag =1;}
        //       }
        //       if(flag==0 && brr[i]==0) brr[i]=-1;
        //  }
         print(NextGreater(arr));
    }
}