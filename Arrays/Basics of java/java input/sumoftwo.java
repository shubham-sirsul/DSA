import java.util.Scanner;

public class sumoftwo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        double a = sc.nextDouble();
        System.out.print("Enter Second number :");
        double b = sc.nextDouble();
        double sum = a+b;
        System.out.println("the sum of two numbers is :"+sum);
    }
}