public class KeyPad_Combinations {
    static void Combinations(String kp[],String dig,String res) { // 253 kp[2]
     if(dig.length()==0){
        System.out.println(res);
        return;
     }
          //int Cur_num =(int)(dig.charAt(0));// gives ascii value not digit 
              int Cur_num =dig.charAt(0) -'0';
          String curr_choices =kp[Cur_num];
          for (int i = 0; i < curr_choices.length(); i++) {
              Combinations(kp, dig.substring(1), res+curr_choices.charAt(i));
          }

    }
    public static void main(String[] args) {
        String s = "253";
       String[] kp = {"" ,"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       //              0   1   2     3     4     5     6     7      8      9
    //    System.out.println(kp[2].length());
    Combinations(kp, s, "");
    }
}