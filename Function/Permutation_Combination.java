
import java.util.Scanner;

public class Permutation_Combination {
    public static int fact(int n){
        int x=1;
      for (int i = 1;  i <= n; i++) {
         x=x*i; 
      }
       return x;
    }
    public  static  int math(int n, int r ){
        int ncr,npr;
        if (n==r){
           ncr=1;
           npr=fact(n); 
        System.out.println(" ncr :"+ncr);
        System.out.println(" npr :"+npr);
        return 1; 
        }
        int p=1,c=1;
        for (int i=1;i<=r;i++){
            p=p*n;
            n--;
        }
        for (int i= 1;i<=r;i++){
            c=c*r;
            r--;
        }
        // int[] arr ={c,c/p};
        // return arr;
         return c; //for combination
        // return p/c; //for permutation
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter n :");
    int n= sc.nextInt();
    System.out.print(" Enter r :");
    int r =sc.nextInt();
    
      System.out.println(math(n,r));
  }
}

//CONSEPTS 
// ncr = n! / r!(n-r)!
// npr = n! / (n-r)!
// NOTE == in this n>=r
// SHORT CUTS 
// 5c2= 5 x 4 / 2 x 1    5 ko 2 bar kam karo and divide mee 2 ko mitiply karke kam karte karte 1 tak le jao
// 5p2 = 5 x 4           5 ko 2 bar kam karo