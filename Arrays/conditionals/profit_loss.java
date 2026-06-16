
import java.util.Scanner;



public class profit_loss{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter cost price :");
     int cost = sc.nextInt();
     System.out.print("Enter Selling Price ");
     int sell =sc.nextInt();
     int result =sell -cost;
     if (result<0) {
         System.out.println("you are in loss of rs."+result*-1);
     }
     else{
        System.out.println("you got a prifit of rs."+result);
     }
    }
}