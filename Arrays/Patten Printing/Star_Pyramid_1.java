
import java.util.Scanner;

public class Star_Pyramid_1 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int spaces  =n-1;
      int stars = 1;
      // agar stars = n kiya and stars+=2  commentout kiya tho Rhombus  print hoga 
      // agar stars = 1 and  and stars+=1 kiya tho star triangle reverses print hoga 
      for(int i =1;i<=n;i++){
        for (int k = spaces-1; k>=0; k--) {
            System.out.print("   ");
        }
        spaces--;
        for(int j=1;j<=stars;j++){
            System.out.print(" * ");
            // System.out.print(" "+(char)(j+64)+" "); // for Alphabate pyramid 
            // System.out.print(" "+j+" "); // for number pyramid 
        }
        stars+=1;
        System.out.println();
      }
  }
}