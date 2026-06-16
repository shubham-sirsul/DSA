
import java.util.LinkedList;
import java.util.Queue;

public class StackImplimentation_using_Queue {
    public static class Qstack{
     Queue<Integer> q1 =new LinkedList<>();
     Queue<Integer> q2 =new LinkedList<>();
     
     void push(int val){
        q1.add(val);
     }

     int peek(){
        if(q1.isEmpty()) return -1;
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        int x = q1.element();
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        q1.add(q1.remove());
        System.out.println(q1);
        return x;
     }

     int pop(){
        if(q1.isEmpty()) return -1;
         while(q1.size()>1){
            q2.add(q1.remove());
        }
        
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
       return q1.remove();
     }



    }



   public static  class MyStack {
   Queue<Integer> q = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        if(q.isEmpty()){
            q.add(x);
            return;
        }
         q.add(x);
        for(int i =1;i<=q.size()-1;i++){
            q.add(q.remove());
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
    public static void main(String[] args) {
        Qstack st =new Qstack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.peek();

        MyStack dt =new MyStack();
        dt.push(5);
        st.push(6);
        dt.push(7);
        


    }
}