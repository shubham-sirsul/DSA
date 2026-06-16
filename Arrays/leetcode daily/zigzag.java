import java.util.*;
import javax.xml.transform.Source;


public class zigzag {
        public static String convert(String s, int numRows) {
            if(numRows == 1) return s;
      
        ArrayList<ArrayList<Character>> arr = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            arr.add(new ArrayList<Character>());   //  put a new ArrayList at each index
        }

        int i=0; // for row travel 
        int j=0; // for coloum travelsal
        while(j<s.length()){
            int a=0;

            // i --> 0 to n
            // a--> o to n
          while(a<numRows && j < s.length()) {
           arr.get(i).add(s.charAt(j));
            i++;
            j++;
            a++;
           }
        //    i--> i=n-1 to i;
        //    a--> n-1 to 0;
           i =  i - 2   ;
           a = numRows - 2;
 
             
           while(a>0 && j<s.length()){
            arr.get(i).add(s.charAt(j));
            i--;
            j++;
            a--;
           }
           i++;
        }
        String ans ="";
        for(ArrayList<Character> temp : arr ){
        for(char x:temp){
            ans+=x;
        }
    }
    return ans;
    }
    public static void main(String[] args) {
       String s= convert("paypalshiring", 3);
       System.out.println(s);
    }
}