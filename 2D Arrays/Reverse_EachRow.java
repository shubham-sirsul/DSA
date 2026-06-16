
import java.util.Scanner;

public class Reverse_EachRow {
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
    for(int i = 0; i < arr.length; i++) {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter rows and coloums");
      int r=sc.nextInt();
      int c = sc.nextInt(); 
      int arr[][] =new int[r][c];
      input2darray(arr);
    reverserow(arr);
    print2darray(arr);
}
}