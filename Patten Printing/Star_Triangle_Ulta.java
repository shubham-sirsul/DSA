
import java.util.Scanner;

public class Star_Triangle_Ulta {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
    //   for(int i =n;i>0;i--){
    //     for (int j=i;j>0;j--){
    //         System.out.print(" * ");
    //     }
    //           System.out.println();

    //   } 

    for(int i =1;i<=n;i++){
        for (int j=1;j<=n +1-i;j++){
            System.out.print("* ");
        }
              System.out.println();

      }
  }
}

// LOGIC EXPALNATION 

// i|1  2  3  4  5 coloums(j)
// 1 *  *  *  *  *
// 2 *  *  *  *
// 3 *  *  *
// 4 *  *
// 5 *


//  notice karo ki every singlr row mw kitne start ptiny  horee hee (j) and jis row me print horehee (i) unka add = n+1
//  eg. see 4th row 4+2 = 5+1
//  formula i+j =n+1
//  tho i 1 to n jayaga and 
//  j = 1 to n+1-i tak jayaga 