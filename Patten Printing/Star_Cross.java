
import java.util.Scanner;

public class Star_Cross {
  public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      for(int i =1;i<=n;i++){
        for(int j=1;j<=n;j++){
          if(i==j || i+j == n+1)  System.out.print(" * ");
          else System.out.print("  ");
        }
        System.out.println();
      }

  }
  }


// LOGIC EXPALNATION 

// i| 1  2  3  4  5 coloums(j)
// 1  *           *
// 2     *     *
// 3        *
// 4    *      *  
// 5  *           *

// yaha ke observation see do batte pata chali agar i==j he tb star print hoga and agar i+j== n+6 tho bhi star print hoga 