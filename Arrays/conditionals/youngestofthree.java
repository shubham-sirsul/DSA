// without using && and || 
import java.util.Scanner;

public class youngestofthree{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("eneter age of ram  : ");
        int num1 = sc.nextInt();
        System.out.println("eneter age of shyam  : ");
        int num2 = sc.nextInt();
        System.out.println("eneter age of krish  : ");
        int num3 = sc.nextInt();
        if (num1<num2 ){ 
            if (num1<num3) System.out.println(num1+"is youngest");
            else System.out.println(num3+" is youngest"); 
        }
        else {
            if (num2<num3) System.out.println(num2+"is youngwt");
           else System.out.println(num3+" is youngest");
        }
    }
}