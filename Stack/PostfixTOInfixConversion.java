
import java.util.Stack;

public class PostfixTOInfixConversion {
    public static void main(String[] args) {
          String str ="953+4*6/-";
        Stack<String> val  = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            int asci =(int)ch;
            if(asci>=48 && asci<=57){
            String s =""+ch;
            val.push(""+ch);
          } else if(!(asci>=48 && asci<=57)){
            String v2 =val.pop();
            String v1 =val.pop();
            // we want to add brackets for prioroty 
            String t = '('+v1+  ch+ v2+')';
            val.push(t);
           
          }

        }
        System.out.println(val.peek());
    }
}