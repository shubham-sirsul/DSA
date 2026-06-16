
import java.util.Scanner;

public class Permutation_Combination1 {
    public static int fact(int n){
        int x=1;
      for (int i = 1;  i <= n; i++) {
         x=x*i; 
      }
       return x;
    }
//   public  static  int math(int n, int r ){
//        int n_fact,r_fact,n_r_fact;
//        n_fact=fact(n);
//        r_fact=fact(r);
//        n_r_fact=fact((n-r));
//        int ncr= n_fact /(r_fact *n_r_fact);
//        int npr = n_fact /n_r_fact;
//        return ncr;
//     }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter n :");
    int n= sc.nextInt();
    System.out.print(" Enter r :");
    int r =sc.nextInt();
    
       int ncr= fact(n) /(fact(r) *fact((n-r)));
       int npr = fact(n) /fact((n-r));
       System.out.println(" ncr :"+ncr);
       System.out.println(" npr :"+npr);
     
  }
}

//CONSEPTS 
// ncr = n! / r!(n-r)!
// npr = n! / (n-r)!
// NOTE == in this n>=r
// SHORT CUTS 
// 5c2= 5 x 4 / 2 x 1    5 ko 2 bar kam karo and divide mee 2 ko mitiply karke kam karte karte 1 tak le jao
// 5p2 = 5 x 4           5 ko 2 bar kam karo