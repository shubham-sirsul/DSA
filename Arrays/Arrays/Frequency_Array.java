
import java.util.Scanner;


public class Frequency_Array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int[] arr ={5,6,5,400,560,1000,400};
      int n=(int) Math.pow(10, 5);
      int[] freq=new int[n];
      for (int i=0;i<arr.length;i++){
        freq[arr[i]]++;
      }
      System.out.print("Emter No. of Queries :");
      int queries = sc.nextInt();
      for (int i = 0; i <queries; i++) {
        System.out.println("Enter number to search ");
          int a =sc.nextInt();
          if (freq[a]>0) System.out.println("YES");
          else System.out.println("NO");
      }
  }
}