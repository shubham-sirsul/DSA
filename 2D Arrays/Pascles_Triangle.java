
import java.util.Scanner;

public class Pascles_Triangle {
    public static int[][] pascles(int n){
       int ans[][]=new int [n][];

       for (int i = 0; i < n; i++) {
        ans[i][0]=ans[i][i]=1;
           ans[i]= new int[i+1]  ; // in ith row i +1 coloums 
           for (int j = 1; j < i; j++) {
         ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
           }
          
       }
 return ans;
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
         System.out.println("Enter rows");
      int r=sc.nextInt();
      int ans[][]= pascles(r);
    print2darray(ans);
    }
}