
import java.util.Scanner;

public class factorialOfFirst_n_numbers {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number :");
      int n = sc.nextInt();
      int fact =1;
          for (int i =1;i<=n;i++){
            fact =fact*i;
            System.out.println("factorial of"+i+" is :"+fact);
          }
}
}