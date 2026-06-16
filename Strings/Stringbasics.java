
import java.util.*;
public class Stringbasics {
    public static void main(String[] args) {
        char[] x = new char[10]; //
        

        // string input 
         Scanner sc = new Scanner(System.in);
        //  String f =sc.next(); // string sfter space is ignored 
        // String s =sc.nextLine(); // string after space is not ignored 
        
        // indes of, charAT and length()
        // String h ="jsbkjs";
        // System.out.println(h.length());
        // System.out.println(h.charAt(0));
        // System.out.println(h.indexOf("j"));
         

         // compareto 
        //  String a ="zbc";
        //  String b ="abc";
        //  System.out.println(a.compareTo(b));
        // if both same ->0
        //  if a > b-> +ve 
        //  if a <  b-> -ve  
        // jo letters compare hote hee unka askie vale ka subtraction milta hee


        // contains, startsWith and endsWith 
        String str ="shubhs";
        System.out.println(str.contains("u"));
        System.out.println(str.startsWith("shu"));
        System.out.println(str.endsWith("fdd"));
        


        // tolowercase() toUpperCase() & concat() 
        // Chnages not afect original string 
        String a = "videography";
        System.out.println(a.toUpperCase()); // not chnage original string 
        System.out.println(a);

        String s1 = "shubhs";
        String s2 = "cinima";
        int w =34;
        System.out.println(s1.concat(s2)); //add s2 in s1 
        System.out.println(s1);
        System.out.println(s1+s2); // work same as  concat
        

    }
}