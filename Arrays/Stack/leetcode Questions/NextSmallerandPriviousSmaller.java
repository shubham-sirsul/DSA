
import java.util.Stack;

public class NextSmallerandPriviousSmaller {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
     
     public static int[] Nextsmaller(int arr[]){
        Stack<Integer> st = new Stack<>();
        int res[] =new int[arr.length];
        res[arr.length-1] =-1;
        st.push(arr[arr.length-1]);
        for (int i = arr.length-2; i >= 0; i--) {
            while(!st.isEmpty() && arr[st.peek()] > arr[i] ){
                st.pop();
            }
            if(st.isEmpty()){
               res[i] = -1;
               st.push(i);
            }
            else{
                 res[i] =st.peek();
                st.push(i);
            }
            
        }
        return res;
    }

    public static int[] Previoussmaller(int arr[]){
        Stack<Integer> st = new Stack<>();
        int res[] =new int[arr.length];
        res[0] =-1;
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            while(!st.isEmpty() && arr[st.peek()]>arr[i] ){
                st.pop();
            }
            if(st.isEmpty()){
               res[i] = -1;
               st.push(i);
            }
            else{
                 res[i] =st.peek();
                st.push(i);
            }
            
        }
        return res;
    }
    public static void main(String[] args) {
         int arr[] ={5,2,4,6,3,5};
         System.out.println("Origina array");
         print(arr);

         // both function returns the indices of next smaller and previousx greater element 
         System.out.println("privious smaller ");
         print(Previoussmaller(arr));
         System.out.println("Next smaller");
         print(Nextsmaller(arr));
    }
}