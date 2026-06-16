
import java.util.Scanner;

public class Range_prefixSum {
    
    static void takeinput(int[] arr,int size){
        // taking input from first index 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array element ");
        for (int i = 1; i < size; i++) {
            arr[i]=sc.nextInt();

        }
    }
    static int prifixsum(int[] arr,int l ,int r){
        int sum=0;
       for(int i = l; i <= r ; i++) {
           sum+=arr[i];
       }
       return sum;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of array :");
      int n=sc.nextInt();
      int [] arr= new int[n+1];
      takeinput(arr,n+1);
System.out.println("Enter range");
int l=sc.nextInt();
int r=sc.nextInt();

    System.out.println( "sum is "+prifixsum(arr, l, r));
     
      

  }
}