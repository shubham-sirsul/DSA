
import java.util.Scanner;

public class digitCount {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 0;
      for(int i =0 ;n!=0;i++){
         count ++;
         n=n/10;
      }
      System.out.println(count);
  } 
}