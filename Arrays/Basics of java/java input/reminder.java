// using modulo oprator 
import java.util.Scanner;

public class reminder{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a big number :");
        int x = sc.nextInt();
        System.out.print("Enter a number less than previous :");
        int y = sc.nextInt();
        int  z = x%y;
        System.out.println(z);
    }
}

// if  b%a where b<a so answer is b%a = b
// if a%-b = a%b
