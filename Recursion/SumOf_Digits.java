public class SumOf_Digits {
    static int sumOFDigits(int n){
        if(n<0){
            // convert negative number to positive 
            n=Math.abs(n);
        }
         if(n==0){
        return 0;
        }
     
      return n%10+sumOFDigits(n/10);
    }
    public static void main(String[] args) {
        System.out.println(sumOFDigits(-1234));
    }
}