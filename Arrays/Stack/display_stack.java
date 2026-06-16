
import java.util.Stack;

public class display_stack {
    public static void printStack(Stack<Integer> st){
        if(st.isEmpty()) return;
        
        int x =st.pop();
        printStack(st); 
       
       System.out.print(x+" ");
       st.push(x);
    }
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(1); // add topmost element in stack
        st.push(2);
        st.push(3);
        st.push(4);
        // System.out.println(st);


        // Stack<Integer> gt = new Stack<>();
        // while(st.size()>0){
        //     gt.push(st.pop());
        // }
        // while(gt.size()>0){
        //   System.out.print(gt.peek()+" ");
        //   st.push(gt.pop());
        // }
        // System.out.println();
        // System.out.println(st);

        // int n = st.size();
        // int arr[] = new int[n];
        // int i =arr.length-1;
        // while(i>=0){
        //     arr[i] =st.pop();
        //     System.out.print(arr[i]+" ");
        //     i--;
        // }
        // i =arr.length-1;
        // while(i>=0){
        //     st.push(arr[i]);
        //     i--;
        // }


        printStack(st);
        System.out.println(st);

    }
}