
import java.util.Scanner;

public class Star_Pyramid {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      for(int i =1;i<=n;i++){
        for (int k = 1; k <=n-i; k++) {
            System.out.print("   ");
        }
        
        for(int j=1;j<=2*i-1;j++){
            System.out.print(" * ");
            //System.out.print(" "+(char)(j+64)+" "); // for Alphabate pyramid 
            //System.out.print(" "+j+" "); // for number pyramid 
        }
        System.out.println();
      }

    }
}

//// LOGIC EXPALNATION 
// n=5
// i| 1  2  3  4  5 coloums(j)
// 1        *
// 2     *  *  *
// 3  *  *  *  *  *
 
 // har line me 2i-1 stars print ho reee so  seconf loop limit as 2i-1
 // we noticied in 1st row there is 2 spaces that is n-1,then n-2 and sooooooooooo so we set limit as n-i