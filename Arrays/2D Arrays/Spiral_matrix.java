
import java.util.Scanner;

public class Spiral_matrix {
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
     for (int i = 0; i < arr.length ;i++)  {
          for (int j = 0; j < arr[i].length; j++) {
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
      }
  }
  static void spiral(int arr[][], int r,int c){
       int toprow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
       int n=r*c;
       int x=1; // variable count how many elements print 
while (x<=n) { 
    // toprow --> left col to rigth coloum
    for (int i = leftCol; i <= rightCol  && x<=r*c ; i++) {
        System.out.print(arr[toprow][i]+" ");
        x++;
    }
    toprow++;
    // rightCol -->toprow to bottom row
    for (int i = toprow; i <=bottomRow  && x<=r*c ; i++) {
        System.out.print(arr[i][rightCol]+" ");
        x++;
    }
    rightCol--;
    // bottom row --> right col to left coloum 
    for (int i = rightCol; i >=leftCol  && x<=r*c ; i--) {
        System.out.print(arr[bottomRow][i]+" ");
        x++;
    }
    bottomRow--;
    // left col bottoRow to TopRow
    for (int i = bottomRow; i >= toprow  && x<=r*c ; i--) {
        System.out.print(arr[i][leftCol]+" ");
        x++;
    }
     leftCol++;  
}
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter rows and coloums");
      int r =sc.nextInt();
      int c = sc.nextInt(); 
      int arr[][] =new int[r][c];
      input2darray(arr);
      spiral(arr, r, c);
    }
}


// 3*4 matrix me last me ek elemrnt extra aya so har bar cheak karna ki    && x<=r*c  x<=r*c agar hee tho hii loop ke ander ghusoo