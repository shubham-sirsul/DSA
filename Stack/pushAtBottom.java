
import java.util.Stack;

public class pushAtBottom {

    public static void pushBottom(Stack<Integer> st, int x) {
        if(st.isEmpty()){
            st.push(x);
            return ;
        }

        int a =st.pop();
        pushBottom(st, x);
        st.push(a);

        

    }
    
    public static void main(String[] args) {
        
        Stack<Integer> st =new Stack<>();
        st.push(5); // add topmost element in stack
        st.push(32);
        st.push(90);
        st.push(3);
        

        System.out.println(st);
        pushBottom(st, 100);
        System.out.println(st);
    }
}