// absolute value means mod |-3| = 3 like this 
import java.util.Scanner;
public class absoluteValue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number :");
        int a = sc.nextInt();
        if (a<0){
             a=a*(-1);
        }
         System.out.println("its absolute value is : "+a);
    }
}