
import java.util.Scanner;

public class Star_Dimond {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int x=n;
    //   upper triangle
      for(int i =1;i<=n;i++){
       
        for (int k = x; k > 0; k--) {
            System.out.print("   ");
        }
        
        for(int  j=1;j<=2*i-1;j++){
            System.out.print(" * ");
            // System.out.print(" "+(char)(j+64)+" "); // for Alphabate pyramid 
            // System.out.print(" "+j+" "); // for number pyramid 
        }
        x--;
        System.out.println();
      }

      // lower triangle
    x=2*n-1;
    for (int i = 1; i < n; i++) {
        for (int j = 1; j <= i+1; j++) {
            System.out.print("   ");
        }
        for (int k = x-2; k > 0 ; k--) {
            System.out.print(" * ");
        }
        x-=2;
        System.out.println();
    }
  }
}

// LOGIC EXPALNATION 
//  n =3;    linrs =2n-1
// i|1  2  3  4  5 coloums(j)
// 1       *
// 2    *  *  *
// 3 *  *  *  *  *
// 4    *  *  *
// 5       *

