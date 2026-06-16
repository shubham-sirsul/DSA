
import java.util.Stack;

// code works only for single digit 
// to convert any ascie to number  do ascie -48
// eg. ascie 57  --> 57-48 =9
public class infix {
    public static boolean  isnum(char ch){
     if(ch>=48 && ch<=57) return true;
     return false;
    }
    public static void main(String[] args) {
        String str= "9-(5+3)*4/6";


        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0;i<str.length();i++){
            char ch =str.charAt(i);
            if(isnum(ch)){
                val.push(ch -'0');
            }
            
            else if(op.isEmpty() || ch=='(' || op.peek()=='(') op.push(ch);
            else if(ch ==')' ){
                while(op.peek()!='(' ){
                 int v2 =val.pop();
                 int v1 =val .pop();
                 if(op.peek()=='-') val.push(v1-v2);
                 if(op.peek()=='+') val.push(v1+v2);
                 if(op.peek()=='*') val.push(v1*v2);
                 if(op.peek()=='/') val.push(v1/v2);
                 op.pop();
                        
                }  
                op.pop();      
                        
            }
                else{
                    if(ch =='+' || ch =='-'){
                        int v2 =val.pop();
                        int v1 =val .pop();
                        if(op.peek()=='-') val.push(v1-v2);
                        if(op.peek()=='+') val.push(v1+v2);
                        if(op.peek()=='*') val.push(v1*v2);
                        if(op.peek()=='/') val.push(v1/v2);
                        op.pop();
                        op.push(ch);
                    }
                    if(ch =='*' || ch =='/'){
                        if(op.peek()=='*' || op.peek()=='/'){
                         int v2 =val.pop();
                        int v1 =val .pop();
                        if(op.peek()=='*') val.push(v1*v2);
                        if(op.peek()=='/') val.push(v1/v2);
                        op.pop();
                        op.push(ch);
                        }
                        else op.push(ch);
                }
            

        }
    }
    // System.out.println(val.peek());
    while(val.size()>1 && !op.isEmpty()){
          int v2 =val.pop();
          int v1 =val.pop();
          if(op.peek()=='-') val.push(v1-v2);
          if(op.peek()=='+') val.push(v1+v2);
          if(op.peek()=='*') val.push(v1*v2);
          if(op.peek()=='/') val.push(v1/v2);
          op.pop();
        //   System.out.println(val.peek());

    }
    System.out.println(val.peek());
}
}