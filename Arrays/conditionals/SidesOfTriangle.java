
import java.util.Scanner;





public class SidesOfTriangle{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter side 1 :");
     int s1 = sc.nextInt();
     System.out.print("Enter side 2 :");
     int s2 =sc.nextInt();
     System.out.print("Enter side 3 :");
     int s3 =sc.nextInt();
     if (s1+s2>s3 && s1+s3>s2 && s2+s3>s1) {
         System.out.println("it forms a triangle");
     }
     else{
        System.out.println("it can't form a triangle");
     }
    }
}
