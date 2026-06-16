
import java.util.Scanner;

public class sumOFdigits {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Digits :");
      int n = sc.nextInt();
      int x=0;
      while(n!=0){
        x=x+n%10;
        n/=10;
        
      }
      System.out.println("Sum of Digits are :"+x);
  }
}