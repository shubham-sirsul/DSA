
import java.util.Scanner;

public class Star_Triangle_Ulta_Reverse {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int x=n;
      for(int i =1;i<=n;i++){
        for (int k = 1; k <=i-1; k++) {
            System.out.print("   ");
        }
        
        for(int j=x;j>0;j--){
            System.out.print(" * ");
            // System.out.print(" "+(char)(j+64)+" "); // for Alphabate pyramid 
            // System.out.print(" "+j+" "); // for number pyramid 
        }
        x--;
        System.out.println();
      }

  }
}

