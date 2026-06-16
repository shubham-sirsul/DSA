
import java.util.*;

public class valid_anagram {

    public static boolean is_anagram(String a, String b){
        if (a.length() != b.length()) return false;
          HashMap<Character,Integer> hm = new HashMap<>();
          for (int i = 0; i < a.length(); i++) {
            // for first string 
            char c = a.charAt(i);
            if(!hm.containsKey(c)){
                hm.put(c, 1);
            }
            else{
                int currfreq =hm.get(c);
                hm.put(a.charAt(i), currfreq+1);
            }
          }
          for (int i = 0; i < a.length(); i++) {
            // for first string 
            char c = b.charAt(i);
            if(hm.containsKey(c)){
                int freq =hm.get(c);
                hm.put(c, freq-1);
            }
            else{
                return false;
            }
            
          }
          for(Integer i: hm.values()){
            if(i!=0) return false;
          }
          return true;



    }
    public static void main(String[] args) {
        
        String s = "listen";
        String f ="silenty";
        
        
        // HashMap<Character,Integer> hm = new HashMap<>();
        //  HashMap<Character,Integer> sm = new HashMap<>();ismorphiv
        
        // for (int i = 0; i < s.length(); i++) {
        //     // for first string 
        //     char c = s.charAt(i);
        //     if(!hm.containsKey(c)){
        //         hm.put(c, 1);
        //     }
        //     else{
        //         int currfreq =hm.get(c);
        //         hm.put(s.charAt(i), currfreq+1);
        //     }

        //     // for second string
        //     char a = f.charAt(i);

        //      if(!sm.containsKey(a)){
        //         sm.put(a, 1);
        //     }
        //     else{
        //         int currfreq =sm.get(a);
        //         sm.put(a,currfreq+1);
        //     } 
            
        // }
        // System.out.println(hm.equals(sm));
        System.out.println(is_anagram(s,f));
        
    }
}