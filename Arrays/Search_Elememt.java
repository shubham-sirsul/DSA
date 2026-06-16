
import java.util.Scanner;

public class Search_Elememt {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr ={1,2,3,4,5,6,7,8,9,10};
      System.out.println("Enter Element to search :");
      int n = sc.nextInt();
      int flag =0;
      for (int i = 0; i < arr.length; i++) {
       if (n==arr[i]){
          System.out.println("Element Found at "+i);
          flag =1;
          break;
       }
      }
      if (flag==0){
        System.out.println("Element not found ");
      }
  }
}