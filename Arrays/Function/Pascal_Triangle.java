
import java.util.Scanner;

public class Pascal_Triangle {
    public static int fact(int n){
        int x=1;
      for (int i = 1;  i <= n; i++) {
         x=x*i; 
      }
       return x;
    }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x =sc.nextInt();
      for(int i =0; i<=x ; i++){
         for (int k = 1; k <=x-i; k++) {
            System.out.print(" ");
        }
        
         for (int j = 0; j <=i; j++) {
            int icj =fact(i) /(fact(j) *fact((i-j)));
             System.out.print(icj+" ");
         } 
         System.out.println();
      }
  }
}

// LOGIC EXPALNATION 
//  n =3;    linrs =2n-1
// i|1  2  3  4  5 coloums(j)
// 1       1
// 2    1  2  1
// 3   1  3  3  1
// 4  1  4  6  4  1  
      
 