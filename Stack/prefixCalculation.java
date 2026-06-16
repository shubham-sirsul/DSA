
import java.util.Stack;

public class prefixCalculation {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> val  = new Stack<>();
        for (int i =  str.length()-1; i >=0; i--) {
            char ch =str.charAt(i);
            int asci =(int)ch;
            if(asci>=48 && asci<=57){
            val.push(ch - '0');
          } else if(!(asci>=48 && asci<=57)){
            int v1 =val.pop();
            int v2 =val.pop();
            if(ch=='-') val.push(v1-v2);
            if(ch=='+') val.push(v1+v2);
            if(ch=='*') val.push(v1*v2);
            if(ch=='/') val.push(v1/v2);
          }

        }
        System.out.println(val.peek());
    }
}