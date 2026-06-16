
import java.util.Scanner;

public class SumOfEvenDigits {
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Digits :");
      int n = sc.nextInt();
      int lastDigit;
      int sum=0;
      while(n!=0){
        lastDigit = n%10;
       if (lastDigit%2==0){
         sum +=lastDigit;
       }
         n/=10;
        
      }
      System.out.println("Sum of Digits are :"+sum);
}
}