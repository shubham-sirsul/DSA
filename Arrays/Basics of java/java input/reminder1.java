
import java.util.Scanner;

public class reminder1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a big number :");
        int divident= sc.nextInt();
        System.out.print("Enter a number less than previous :");
        int divisor = sc.nextInt();
        int  quitent = divident/divisor;
        int reminder  = divident - (quitent*divisor);
        System.out.println("the Reminder when "+divident+" is divided by "+divisor+" is :"+reminder);

}
}