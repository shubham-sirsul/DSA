
import java.util.Stack;

public class InsertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(5); // add topmost element in stack
        st.push(32);
        st.push(90);
        st.push(3);

        int idx =0;
        int x= 333;
System.out.println(st);
        Stack<Integer> temp =new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());

        }
        System.out.println(temp);
        st.push(x);
        while(temp.size()!=0){
            st.push(temp.pop());
        }
        
        System.out.println(st);

        

    }
}