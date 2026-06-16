
import java.util.Scanner;

public class Rotate_90deg {
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
    // arr[i].length  returns number of colium in arr[i]
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length; j++) {
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
      }
  }
  public static void reverserow(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
        int a=0;
        int b= arr[i].length -1;
        while(a<b){
          int temp = arr[i][a];
          arr[i][a]= arr[i][b];
          arr[i][b]= temp;
            a++;
            b--;

        }
    }
    
}
 public static int[][] transpose(int[][] arr,int r, int c){
    // Changes happen in original array 
    // only applied for square matrix
    for (int i = 0; i < r; i++) {
          for (int j = i+1; j < c; j++) {
              int temp = arr[i][j];
              arr[i][j]=arr[j][i];
              arr[j][i]=temp;
          }
      }
      return arr;
  }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter rows and coloums");
      int r=sc.nextInt();
      int c = sc.nextInt(); 
      if (r!=c){
        System.out.println(" to rotate matrix by 90 deg need no. of row = no. of coloums ");
        return;
      }
      int arr[][] =new int[r][c];
      input2darray(arr);
      System.out.println("Original array  :");
      print2darray(arr);
      System.out.println("90 deg rotated aarray :");
    transpose(arr, r, c);
    reverserow(arr);
    print2darray(arr);

    }
}