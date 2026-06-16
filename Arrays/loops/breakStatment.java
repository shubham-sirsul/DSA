// calculating highest factor of number 
import java.util.Scanner;

public class breakStatment {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("ENTER a number :");
    int n =sc.nextInt();
    // this is simple method that every coder use 
    // is loop me har ek value cheak hogi fir update bhi hogi 
    // int factor =1;
    //   for (int i = 1; i <  n; i++) {
    //       if (n%i==0) factor = i;

    //   }

      // this method use pro coders
      // iss loop mee ulta cheak hua  n see decrement bua jo sbse pehele fsctor bsnsgs wo hii highest factor hoga q kii loop ulta chala na 
      int factor =1;
      for (int i = n-1; i >  0; i--) {
          if (n%i==0) {
            factor = i;
             break;
          }

      }
      System.out.println("the Highest factor of "+n+" is "+factor);
  }
}