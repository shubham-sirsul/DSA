
import java.util.Scanner;



// here we write optimized code
// it is bad thing to traverse on array using loop in each time
public class Range_prefix_Sum_Queries {

  static int[] prifixsum(int[] arr){
    int[] ans =new int[arr.length];
     ans[0]=arr[0];
    for (int i = 1; i < arr.length; i++) {
        ans[i] = ans[i-1]+arr[i];
    }
    // print(ans);

   return ans;
  }

  static void takeinput(int[] arr,int size){
        // taking input from first index 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array element ");
        for (int i = 1; i < size; i++) {
            arr[i]=sc.nextInt();

        }
    }


public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of array :");
      int n=sc.nextInt()+1;
      int [] arr= new int[n];
      takeinput(arr,n);
      int[] ans=prifixsum(arr);
      print(ans);
  System.out.println("Enter Queries :");
  int q = sc.nextInt();
  for(int i =1;i<=q;i++){
      System.out.println("Enter range");
      int l=sc.nextInt();
      int r=sc.nextInt();
      System.out.println("sum is : "+(ans[r]-ans[l-1]));
  }
  }
}