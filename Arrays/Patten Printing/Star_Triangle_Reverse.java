
import java.util.Scanner;

public class Star_Triangle_Reverse {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
    //   method 1
    //   for(int i =1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //         if(i+j>n){ 
    //             System.out.print("* ");
    //         } 
    //         else System.out.print("  ");
    //     }
    //     System.out.println();
    //   }
    
    //METHOD 2 
      for(int i =1;i<=n;i++){
        int j;
        for( j=1;j<=n-i;j++){
           System.out.print("  ");
        }
        for (int k = 1; k <=i; k++) {
           System.out.print("* ");
            
        }
        System.out.println();
      }
  }
}

//// LOGIC EXPALNATION 
// n=5
// i| 1  2  3  4  5 coloums(j)
// 1              *
// 2           *  *
// 3        *  *  *
// 4     *  *  *  *
// 5  *  *  *  *  *         

// yaha humne ye notic kiya jb bhii i+j ki value n se bbadi (i+j>n) tb star print karna 
// in secon method we also use that expression i+j =n tho star print hua tho j=n-1 ; we got condition  jb j<=n-i tb space next loop i se n tak chalayastar