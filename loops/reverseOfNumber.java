
import java.util.Scanner;

public class reverseOfNumber {
   
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Digits :");
      int n = sc.nextInt();
      int lastDigit=n%10;
      int sum =0;
      int revrese =0;
      while(n!=0){
        sum+=lastDigit;
        revrese +=lastDigit;
        revrese=revrese*10;
         n/=10;
         lastDigit=n%10;
        
      }
      revrese /=10;
      System.out.println("reverse of Digits are :"+revrese);
      System.out.println("sum of digits are :"+sum);
}
}