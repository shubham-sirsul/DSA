

public class equals {
    public static void main(String[] args) {
         String a ="abcd";
         String b ="abcd";
         String c =new String("abcd");
         System.out.println(a==c); // compare memory adressw of both
         System.out.println(a.equals(c));
    }
}