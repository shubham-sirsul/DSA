// gp--> 1,2,4,8,16,32 .............. example of gp where each term multiply by  common ratio = 4/2 =2 
import java.util.Scanner;

public class GP {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter 1st term :");
      int a = sc.nextInt();
      System.out.print("Enter common ratio :");
      int d = sc.nextInt();
      System.out.print("Enter number of terms :");
      int n = sc.nextInt();
      int x =1;
      for (int i= a;x<=n;i*=d,x++){
        System.out.print(i+" ");
      }
      
  }
}