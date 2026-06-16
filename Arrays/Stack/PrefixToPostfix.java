
import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val  = new Stack<>();
        for (int i =  str.length()-1; i >=0; i--) {
            char ch =str.charAt(i);
            int asci =(int)ch;
            if(asci>=48 && asci<=57){
            val.push(""+ch);
          } else if(!(asci>=48 && asci<=57)){
            String v1 =val.pop();
            String v2 =val.pop();
            String t = v1 + v2+ch;
           val.push(t);
          }

        }
        System.out.println(val.peek());
    }
}