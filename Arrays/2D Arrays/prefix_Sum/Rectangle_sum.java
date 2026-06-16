
import java.util.Scanner;

public class Rectangle_sum {
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
    public static void sum(int arr[][],int l1,int r1, int l2,int r2){
        // Brutforce method  to calculate rectangle sum 
        int sum=0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println("rectangle sum is "+ sum);
    }
    public static void input2darray(int arr[][]){
    System.out.println("Enter Array element");
    Scanner sc = new Scanner(System.in);
     for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length; j++) {
            arr[i][j]=sc.nextInt();
          }
          
      }
  }
  public static void rectangle_Sum_Queries(int arr[][]){
   Scanner sc = new Scanner(System.in);
   
    int p[][]= new int [arr.length][];
    for (int i = 0; i < arr.length; i++) {
        
        p[i]=new int[arr[i].length];
        p[i][0]=arr[i][0];
        for (int j = 1; j < arr[i].length; j++) {
            p[i][j]=arr[i][j]+p[i][j-1];
        }
    }
    System.out.println("prefix sum array :");
    print2darray(p);

     System.out.println("enter number of queries ");
    int q=sc.nextInt();

    for (int i = 1; i <= q; i++) {
    int sum=0;
    System.out.println("enter boundries : l1 l2 r1 r2 ");
    int l1 = sc.nextInt();
    int r1 = sc.nextInt();
    int l2 = sc.nextInt();
    int r2 = sc.nextInt();
     for (int j = l1;  j <=l2;  j++) {
        if (r1>=1)
         sum+=p[j][r2]-p[j][r1-1];
        else
        sum+=p[j][r2];
     }
    System.out.println("the rectangle sum is :"+sum);
    }
  }

  public static void rectangle_Sum_Queries1(int arr[][],int r,int c ){
    Scanner sc = new Scanner(System.in);
         // row wise prefix sum matrix 
         int p[][]= new int [r][c];
    for (int i = 0; i < arr.length; i++) {
        p[i][0]=arr[i][0];
        for (int j = 1; j < c; j++) {
            p[i][j]=arr[i][j]+p[i][j-1];
        }
    }
    // coloum wise prefix sum of row wise prifix sum matrix 
    for (int i = 0; i < r; i++) {
        
        for (int j = 1; j < c; j++) {
            if (j>=1)
            p[j][i]=p[j][i]+p[j-1][i];
            
        }
        
    }
    // System.out.println("coloum prifix sum ");
    // print2darray(p);
    System.out.println("enter boundries : l1  r1 l2 r2 ");
    int l1 = sc.nextInt();
    int r1 = sc.nextInt();
    int l2 = sc.nextInt();
    int r2 = sc.nextInt();
    int answer = p[l2][r2]-p[l1-1][r2]-p[l2][r1-1]+p[l1-1][r1-1];
    System.out.println(answer);
  }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rows and coloums");
    int r = sc.nextInt();
    int c = sc.nextInt();
    int arr[][] = new int[r][c];

    // Add this line to populate the array
    input2darray(arr);
    // rectangle_Sum_Queries(arr);// 2nd method 
    rectangle_Sum_Queries1(arr,r,c);// 3rd method 

    // System.out.println("enter boundries : l1  r1 l2 r2 ");
    // int l1 = sc.nextInt();
    // int r1 = sc.nextInt();
    // int l2 = sc.nextInt();
    // int r2 = sc.nextInt();

    // sum(arr, l1, r1, l2, r2); // 1st method 

    

    }
}