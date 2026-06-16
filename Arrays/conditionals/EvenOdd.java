
import java.util.Scanner;



public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number :");
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println(a+" is a even number ");
        }
        else{
            System.out.println(a+" is a Odd number ");
        }
    }
}