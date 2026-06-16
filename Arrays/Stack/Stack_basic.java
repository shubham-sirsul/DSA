
import java.util.Stack;

public class Stack_basic {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(5); // add topmost element in stack
        st.push(32);
        st.push(90);
        st.push(3);
        // System.out.println(st.peek());  //  returns topmost element 
        // st.pop(); // retrun and delete topmost element of stack
        // System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.size()); // return the size of elelement 
    }
}