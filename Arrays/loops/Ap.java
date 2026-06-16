// 1,3,5,7,9...... print this AP
import java.util.Scanner;

public class Ap {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter number of terms :");
      int n =sc.nextInt();

      // better for if  we dontcknow maths 
    //   int x =1;
    //   for (int i= 1;x<=n;i+=2,x++){
    //     System.out.print(i+" ");
    //   }
    for (int i=1;i<=2*n-1;i+=2){
        System.out.print(i+" ");
      }
  }
}


// // MAth Consept 
// last term of ap (an) = a+(n-1)*d
// d--> common difference 
// d=a2-a1
// n --> number of terms 
// a--> first term
// an= 1+(n-1)*2
//   = 1+2n -2
//   = 2n-1