
import java.util.Scanner;


public class input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radious :");
        int radious= sc.nextInt();
        double pi = 3.14,Area = pi*radious*radious;
        System.out.println("Area of Circle is :"+Area);
    }
}