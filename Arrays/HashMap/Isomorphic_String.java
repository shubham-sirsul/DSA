
    import java.util.*;

    public class Isomorphic_String {
        public static boolean  is_isomorphic(String s, String t){
            if(s.length()!=t.length()) return false;
            HashMap<Character,Character> hm = new HashMap<>();
            HashMap<Character,Character> lm = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char a,b;
            a=s.charAt(i);
            b =t.charAt(i);
            if(!hm.containsKey(a) && !(hm.containsValue(b))){
                hm.put(a, b);
            }
            else if(!(hm.containsKey(a) && hm.get(a)==b) ) return false;   
            
                }
                return true;
                
            }

            public static boolean  is_isomorphic1(String s, String t){
            if(s.length()!=t.length()) return false;
            HashMap<Character,Character> hm = new HashMap<>();
            HashSet<Character> hs = new HashSet<>();

            for (int i = 0; i < s.length(); i++) {
                char a,b;
            a=s.charAt(i);
            b =t.charAt(i);
            if(!hm.containsKey(a) && (hs.add(b))){
                hm.put(a, b);
                hs.add(b);
            }
            else if(!(hm.containsKey(a) && hm.get(a)==b) ) return false;   
            
                }
                return true;
                
            }
            
           
        

        public static void main(String[] args) {
            System.out.println(is_isomorphic("xxb","aab"));
        }
    }