
import java.util.Scanner;



public class divisibleBY5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number :");
        int a = sc.nextInt();
        if (a%5==0){
            System.out.println(a+" is  divisible is 5  ");
        }
        else{
            System.out.println(a+" is not divisible is 5  ");
        }
    }
}