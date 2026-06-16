
import java.util.Scanner;
import java.util.Stack;

public class balance_bracket {
    public static boolean balance(String str){
        Stack<Character> st = new Stack<>();
         for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '('){
               st.push('(');
            }
            if(str.charAt(i) == ')' && st.size() == 0) return false;
            if(str.charAt(i) == ')' && st.peek() =='(' ){
                 st.pop();
            }
         }
         if(st.isEmpty()){
            return true;

         }
         return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(balance(str));
    }
}