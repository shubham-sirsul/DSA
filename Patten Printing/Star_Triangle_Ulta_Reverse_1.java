
import java.util.Scanner;

public class Star_Triangle_Ulta_Reverse_1 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int spaces =0;
      int stars = n;
      for(int i =1;i<=n;i++){
        for (int k = 1; k <=spaces; k++) {
            System.out.print("   ");
        }
        
        for(int j=stars;j>0;j--){
            System.out.print(" * ");
            // System.out.print(" "+(char)(j+64)+" "); // for Alphabate pyramid 
            // System.out.print(" "+j+" "); // for number pyramid 
        }
        spaces++;
        stars--;
        System.out.println();
      }

  }
}

