
import java.util.Scanner;

public class initilization {
  public static void input2darray(int arr[][]){
    System.out.println("Enter Array element");
    Scanner sc = new Scanner(System.in);
     for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length; j++) {
            arr[i][j]=sc.nextInt();
          }
          
      }
  }
  
  public static void print2darray(int arr[][]){
    // arr.length retutn no. of rows
    // arr[i] returns number of colium in arr[i]
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length; j++) {
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
      }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     // int[][] arr= {{1,2,3},{5,6,7}}; // array declaration
      System.out.println("Enter rows and coloums");
      int r=sc.nextInt();
      int c = sc.nextInt();
      int[][] arr1 = new int[r][c];
       input2darray(arr1);
       print2darray(arr1);

      // int a[][]={{1,2,3},{1,2,3}};
      // print2darray(a);
      
  }
}