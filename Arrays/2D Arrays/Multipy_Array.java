
import java.util.Scanner;



public class Multipy_Array {
     public static void input2darray(int arr[][]){
    System.out.println("Enter Array element");
    Scanner sc = new Scanner(System.in);
     for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length; j++) {
            arr[i][j]=sc.nextInt();
          }
          
      }
  }
  public static int[][] mul(int arr[][],int arr1[][]){
   int mul[][] = new int[arr.length][arr1[0].length];

    for (int i = 0; i < arr.length; i++) {// roe of 1st array --> arr.length
        for (int j = 0; j < arr1[0].length; j++) { // coloum of 2nd array -->arr1[i].length
           for (int k = 0; k < arr1.length; k++) { // roe of 2nd array --> arr1.length

              //  mul[i][j] = ith row of arr * jth coloum of arr1
              
               mul[i][j] += arr[i][k]*arr1[k][j];
           }
        }
    }
    return mul;
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

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       System.out.println("Enter rows and coloums");
      int r=sc.nextInt();
      int c = sc.nextInt(); 
      int arr[][] =new int[r][c];
      input2darray(arr);
      System.out.println("Enter rows and coloums");
      int r1=sc.nextInt();
      int c1 = sc.nextInt();
      int arr1[][] =new int[r1][c1];
      if(c!=r1) return;
      input2darray(arr1);
      System.out.println("Multiplied MATRIX IS ");
      print2darray(mul(arr, arr1));

    }
}