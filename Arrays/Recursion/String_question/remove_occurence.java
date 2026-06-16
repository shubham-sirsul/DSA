

public class remove_occurence {

   static String remove_elementone(String s,char a,int idx){

       String ans ="";
       if(idx>=s.length()) return ans;
       if (s.charAt(idx)!= a ){
          ans += s.charAt(idx);
       }
       
       return ans + remove_element(s, a, idx+1);
    }

    static String remove_element(String s,char a,int idx){

       String ans ="";
       if(idx>=s.length()) return ans;
       if (s.charAt(idx)!= a ){
          ans += s.charAt(idx);
       }
       
       return ans + remove_element(s, a, idx+1);
    }
    public static void main(String[] args) {
           String s = "shubham";

        System.out.println(remove_element(s, 'a', 0));
//         String s = "shubham";
//         String a="";
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) != 'a'){
//                 a += s.charAt(i);
//             }
            
//         }
//    System.out.println(a);



    }
}