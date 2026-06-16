

// input : abc 
// output: ans =  [ "bc","b","c","","abc","ab","ac","a"]
import java.util.ArrayList;

public class ReturnSSQ {
    
    static ArrayList<String> ssq(String s){
        ArrayList<String>  ans = new ArrayList<>();
        // base case 
        if (s=="") {
        ans.add("");
        return  ans;
        }
        char cur =s.charAt(0);
        ArrayList<String> smallAns = ssq((s.substring(1)));    //"bc " , " b"  ,"c",  " "    
     // ans =  [ "bc","b","c","","abc","ab","ac","a"]
        for(String ss : smallAns){
            ans.add(ss);
            ans.add(cur +ss);
        }
        return ans;
    }
     
    public static void main(String[] args) {
        System.out.println(ssq("abc"));
    }
}