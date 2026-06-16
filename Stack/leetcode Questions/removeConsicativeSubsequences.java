
import java.util.Stack;

public class removeConsicativeSubsequences {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] remove(int[] arr){ // solved  with sirrr
      Stack<Integer> st = new Stack<>();
      for (int i = 0; i < arr.length; i++) {
        if(st.size() == 0 || st.peek()!=arr[i]) st.push(arr[i]);
        else if(arr[i] == st.peek()){
         if(i==arr.length -1 || arr[i] != arr[i+1]) st.pop();
        }
          
      }
        int res[] = new int[st.size()];
        int i =st.size()-1;
        while(i>=0){
            res[i] =st.pop();
            i--;
        }
        return res;
    }
    public static  int[] removesubsequence(int arr[]){ // self solved 
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int j =0;
            if(i+1<arr.length && arr[i]!=arr[i+1] ){
                st.push(arr[i]);
            }
            while(i+1<arr.length && arr[i]== arr[i+1]){
                i++;
            }
            if(i ==arr.length-1){
                if(arr[i]!=arr[i-1]) st.push(arr[i]);
            }
        }
        System.out.println(st);

        int res[] = new int[st.size()];
        int i =st.size()-1;
        while(i>=0){
            res[i] =st.pop();
            i--;
        }
    //   print(res);
       return res;
           
    }
    public static void main(String[] args) {
        
        int arr[] ={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
       int res[] =remove(arr);
       print(res);
    }
}