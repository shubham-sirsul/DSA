
import java.util.Stack;

public class PreviousGraterELement {
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
            while(!st.isEmpty() && st.peek()<arr[i] ){
                st.pop();
            }
            if(st.isEmpty()){
               res[i] = -1;
               st.push(arr[i]);
            }
            else{
                 res[i] =st.peek();
                st.push(arr[i]);
            }
            
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] ={100,80,60,70,60,75,85};
        print(arr);
        print(PreviousGreater(arr));
    }    
}