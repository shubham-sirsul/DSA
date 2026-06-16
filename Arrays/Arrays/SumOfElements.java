
import java.util.Scanner;

public class SumOfElements {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter array size :");
      int n = sc.nextInt();
      int [] arr= new int[n];
      int sum = 0;
      for (int i = 0; i < arr.length; i++) {
       System.out.print("Enter array element "+i+" : ");
       arr[i] = sc.nextInt();
      }
      for (int i = 0; i < arr.length; i++) {
       sum+=arr[i];
      }
      System.out.println("The Sum Of All elememts Of Array is : "+sum);
  }
}