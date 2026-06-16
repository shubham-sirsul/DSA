// leetcode minstack;
import java.util.Stack;

public class minstack {
  public static class MinStack{
      Stack<Integer> st = new Stack<>();
    Stack<Integer> ss = new Stack<>();
    
    
    public void push(int val) {
       if(st.size() == 0){
        st.push(val);
        ss.push(val);
       }
       else{
        st.push(val);
        if(ss.peek()<=val){
            ss.push(ss.peek());
        }
        else ss.push(val);
       }
    }
    
    public void pop() {
        st.pop();
        ss.pop();
    }
    
    public int top() {
       return  st.peek();
        
    }
    
    public int getMin() {
        return ss.peek();
    }
  }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */