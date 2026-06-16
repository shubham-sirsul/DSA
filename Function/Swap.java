
import java.util.Scanner;

public class Swap {
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    System.out.print(" Enter a :");
    int a= sc.nextInt();
    System.out.print(" Enter b :");
    int b =sc.nextInt();
    System.out.println("a ="+a+" b ="+b);
    
    // // 1st METHOD 
    // a =a+b;
    // b=a-b ;
    // a=a-b;

    // 2nd Methos 
    int temp =a;
    a=b;
    b=temp;
    System.out.println("a ="+a+" b ="+b);
  }
}