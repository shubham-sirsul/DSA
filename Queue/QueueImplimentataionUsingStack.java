import java.util.*;

public class QueueImplimentataionUsingStack {
    public static class MyQueue {
   Stack <Integer>  st = new Stack<>();
   Stack<Integer>  dt = new Stack<>();
   
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        if(st.isEmpty()) return -1;
        while(!st.isEmpty()){
            dt.push(st.pop());

        }
        int x =dt.pop();
        while(!dt.isEmpty()){
            st.push(dt.pop());
        }
        return x;
    }
    
    public int peek() {
        if(st.isEmpty()) return -1;
        while(!st.isEmpty()){
            dt.push(st.pop());

        }
        int x =dt.peek();
        while(!dt.isEmpty()){
            st.push(dt.pop());
        }
        return x;
    }

    public static class MyQueue1 {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    
    
    public void push(int x) {
        if(s1.isEmpty()) {
            s1.push(x);
            return;
        }

        
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        
    }
    
    public int pop() {
     if(s1.isEmpty()) return -1;
     return s1.pop();
    }
    
    public int peek() {
         if(s1.isEmpty()) return -1;
        return s1.peek();
    }
    
    public boolean empty() {
        if(s1.isEmpty()) return true ;
        return false;

    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
    
    public boolean empty() {
        return st.isEmpty();
    }
} 

public static void main(String[] args) {
    
}
}