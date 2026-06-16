
import java.util.*;
public class fibonachi {

    // Using DP
    
    public   int  DPfib(int n){
      int arr[]= new int [n+1];
      return helper(n,arr);
     
    }
    public  int helper(int n,int arr[]){
         if(n<=1) return n;
      if(arr[n]!=0) return arr[n];
      arr[n] = helper(n-1,arr)  + helper(n-2,arr);
      return arr[n];
      
    }

    // ITRATIVELLY // time n SPACE 1
    public int fib(int n) {
       if(n==0 || n==1) return n;
       int a =0;int b =1;
       int ans=0;
       for(int i=2;i<n+1;i++){
        ans = a+b;
        a=b;
        b=ans;  
       }
       return ans;
    }
    //itratively
    public int fibI(int n) {
        int dp[] = new int [n+1];
        if(n==0) return 0;
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];

        }
        return dp[n];
    }
    // recursively  // TIME 2^N space n
     public int fibo(int n) {
        if(n==1 || n==0) return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter n :");
     int n;
      while(true){
        if (sc.hasNextInt()) {
                   n = sc.nextInt();
                    break; 
                } else {
                    System.out.print("Invalid ,Please enter an integer : ");
                    sc.next(); 
                }
        }
     fibonachi x = new fibonachi();
     System.out.println(x.DPfib(n));// time n space n

    }
}