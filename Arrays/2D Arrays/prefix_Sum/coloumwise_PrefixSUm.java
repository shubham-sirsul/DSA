
import java.util.Scanner;

public class coloumwise_PrefixSUm {
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
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
      System.out.println("Enter rows and coloums");
      int r =sc.nextInt();
      int c = sc.nextInt(); 
       int arr[][] =new int[r][c];
       input2darray(arr);
        int pc[][]= new int [r][c];
    for (int i = 0; i < r; i++) {
       for (int j = 1; j < c; j++) {
            if (j>=1)
            pc[j][i]=arr[j][i]+pc[j-1][i];
            else
            pc[j][i]=arr[j][i];
        }
        
    }
    print2darray(pc);
    }
}