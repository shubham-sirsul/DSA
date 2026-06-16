public class palindrome {
     static String reverse1(String s){
       if (s.length()<=1)  return s;
        return reverse1(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args) {
        String  s ="radar";
        String p = reverse1(s);
        System.out.println(s);
        System.out.println(p);
        if (s.equals(p)){
            System.out.println(" palindrome");
        }
        else System.out.println("Not palindrome");
    }

}