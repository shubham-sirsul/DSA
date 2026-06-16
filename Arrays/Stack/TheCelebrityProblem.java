
import java.util.Stack;

// Given a square matrix mat[][] of size n x n, where mat[i][j] == 1 means person i knows person j, and mat[i][j] == 0 means person i does not know person j, find the celebrity person where,
// A celebrity is defined as someone who:

// Is known by everyone else
// Does not know anyone (except themselves)
// Return the index of the celebrity if one exists, otherwise return -1.

// Note: It is guaranteed that mat[i][i] == 1 for all i

// Examples:  

// Input: mat[][] = [[1, 1, 0], 
//                  [0, 1, 0], 
//                  [0, 1, 1]]
// Output: 1
// Explanation: 0th and 2nd person both know 1. Therefore, 1 is the celebrity.

// Input: mat[][] = [[1, 1], 
//                  [1, 1]]
// Output: -1
// Explanation: The two people at the party both know each other. None of them is a celebrity.

// Input: mat[][] = [[1]]
// Output: 0


public class TheCelebrityProblem {
    public static int celebrity(int m[][], int n){
       Stack<Integer> st = new Stack<>();
       for (int i = 0; i < n; i++) {
           st.push(i);
       }

       while(st.size()>1){
         int a = st.pop();
        int b = st.pop();
         // a knows b → a cannot be celebrity  beacausew celebrity Does not know anyone (except themselves)
        if(m[a][b]== 1) st.push(b);
        
          // a does not know b → b cannot be celebrity
        else  st.push(a);
         
       }
       if(st.size() == 0 ) return -1;
       int c =st.pop();
       for (int i = 0; i < n; i++) {
         if(i!=c){
             // Celebrity should not know anyone
             if( m[c][i] == 1) return -1;
         // Everyone should know celebrity
           if (m[i][c] == 0) return -1;
         }
       }
       return c;


        
    }
    public static void main(String[] args) {
        int[][] mat1 = {
                         {1, 1, 0},     
                         {0, 1, 0},
                         {0, 1, 1}
                                   };                     

System.out.println(celebrity(mat1, 3));
    }
} 