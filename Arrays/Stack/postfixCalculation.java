
import java.util.Stack;

public class postfixCalculation {
    public static void main(String[] args) {
        String str ="953+4*6/-";
        Stack<Integer> val  = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            int asci =(int)ch;
            if(asci>=48 && asci<=57){
            String s =""+ch;
            val.push(ch - '0');
          } else if(!(asci>=48 && asci<=57)){
            int v2 =val.pop();
            int v1 =val.pop();
            if(ch=='-') val.push(v1-v2);
            if(ch=='+') val.push(v1+v2);
            if(ch=='*') val.push(v1*v2);
            if(ch=='/') val.push(v1/v2);
          }

        }
        System.out.println(val.peek());
    }
}