
import java.util.Scanner;

public class Maximum_ELement {
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      System.out.println("Enter array size :");
      int n = sc.nextInt();
      int [] arr= new int[n];
      int max=Integer.MIN_VALUE;
      int smax = Integer.MIN_VALUE;
    //   System.out.println(max);
      for (int i = 0; i < arr.length; i++) {
       System.out.print("Enter array element "+i+" : ");
       arr[i] = sc.nextInt();
      }
      for (int i = 0; i < arr.length; i++) {
      if( max<arr[i]){
        max=arr[i];
      }
      
      }
       for (int i = 0; i < arr.length; i++) {
      if( smax<arr[i] && arr[i]!=max){
          smax=arr[i];
      }
      
      }
      System.out.println("Maximum Element Of Array is : "+max);
      System.out.println("Second Maximum Element Of Array is : "+smax);
  }
}