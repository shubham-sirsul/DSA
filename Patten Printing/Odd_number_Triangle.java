
import java.util.Scanner;

public class Odd_number_Triangle {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       int n =sc.nextInt();
    //   for(int i =1;i<=n;i=i+2){
    //     for(int j=1;j<=i;j=j+2){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    //   }

    // // math
    //    for(int i =1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print((2*j-1)+" ");
    //     }
    //     System.out.println();
    //   }
     
       for(int i =1;i<=n;i++){
        int a =1;
        for(int j=1;j<=i;j++){
            System.out.print(a+" ");
            a+=2;
        }
        System.out.println();
      }

  }
}


// LOGIC EXPALNATION 
// n=5 aya tho 5 lines ka triangle print hoga prr pichle wale me sirf  5 number anne tak hii print hoga 
// i | 1  2  3  4  5 coloums(j)
// 1 | 1
// 2 | 1  3
// 3 | 1  3  5
// 4 | 1  3  5  7
// 5 | 1  3  5  7  9


// humne ye notic kiya ki jo bhi number print hoo raha hee usa i j me kuvh relation heetho hume ye formula mila 
//  2*j-1
//  eg. (4,2) = 3 --> 2*2-1  