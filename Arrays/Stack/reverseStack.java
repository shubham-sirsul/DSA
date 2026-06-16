
import java.util.Stack;

public class reverseStack {
     public static void pushBottom(Stack<Integer> st, int x) {
        if(st.isEmpty()){
            st.push(x);
            return ;
        }

        int a =st.pop();
        pushBottom(st, x);
        st.push(a);

        

    }
    public static void reverse(Stack<Integer>  st ){
        if(st.size()==1) return;
       int top = st.pop();
       reverse(st);
       pushBottom(st, top);
       

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5); 
        reverse(st);
        System.out.println(st);

        // reversing stack ittratively
        // Stack<Integer> rev = new Stack<>();
        // while(!st.isEmpty()){
        
        //     rev.push(st.pop()); // pop return topmost element and delete it
        // }

        // Stack<Integer> tev = new Stack<>();
        // while(!rev.isEmpty()){
        
        //     tev.push(rev.pop()); // pop return topmost element and delete it
        // }
        // while(!tev.isEmpty()){
        
        //     st.push(tev.pop()); // pop return topmost element and delete it
        // }
        // System.out.println(st);
    }
}