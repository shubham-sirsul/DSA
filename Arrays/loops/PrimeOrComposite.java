
import java.util.Scanner;

public class PrimeOrComposite {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number to cheak it is Prime or Composite : ");
      int n = sc.nextInt();
      boolean flag  =true;
      for (int i = 2; i < n ; i++) { 
          if (n%i==0) {
         System.out.println(n+" is Compoaite number");
         flag = false;
             break;
          }
      }
      if (n==1) System.out.println(" 1 is not prime nor composiite ");
      else if (flag==true){
        System.out.println(n+" is a prime number ");
      }
  }
}

// NOTE : if a number 'i' is a factor then 'n/i' us also a factor