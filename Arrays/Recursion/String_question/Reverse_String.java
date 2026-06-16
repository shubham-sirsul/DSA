public class Reverse_String {
    static String reverse(String s,int idx){
         if (idx>=s.length()) return  "";
         String ans = reverse(s, idx+1);
         ans+= s.charAt(idx);
         return ans;
    }
    static String reverse1(String s){
      
       if (s.length()<=1)  return s;
        return reverse1(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(reverse1("SHubham"));
        // System.out.println(reverse("SHubham",0));
    }
}