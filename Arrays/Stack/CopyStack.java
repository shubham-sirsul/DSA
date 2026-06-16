
import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        
        // inputs 
        // int n;
        // System.out.println("Enter number of  elements want to insert in Stack :");
        // n=sc.nextInt();
        // for (int i = 0; i < n; i++) {
        //     int x =sc.nextInt();
        //     st.push(x);
        // }
        // System.out.println(st);
         
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5); 
        Stack<Integer> rev = new Stack<>();
        while(!st.isEmpty()){
        
            rev.push(st.pop()); // pop return topmost element and delete it
        }
        // System.out.println(st);
        
        // st =rev; // pass by refrences 
        // rev.pop(); // changes also happens in st
        // System.out.println(st);
        // System.out.println(rev);
       
       Stack<Integer> copy = new Stack<>();
       while(!rev.isEmpty()){
        copy.push(rev.pop());
       }
       System.out.println(copy);
    }
}