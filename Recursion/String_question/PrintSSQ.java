public class PrintSSQ {
   static void  print_ssq(String s, String currAns){ //s = abc , currAns =""
   if (s.length()==0) {
    System.out.println(currAns);
    return;
   }
    char cur = s.charAt(0);// a
    String rem = s.substring(1); //bc
    // cur char chooss to be a part of current answer

   print_ssq(rem,currAns+cur); // rem = bc , cur =a , currans =""
  
    // cur char not chooss to be a part of current answer
     
     print_ssq(rem,currAns);
    }
    public static void main(String[] args) {
        print_ssq("abc", "");
    }
}