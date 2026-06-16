
import java.util.Scanner;

public class gratestOfThree{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("eneter 1st number ");
        int num1 = sc.nextInt();
        System.out.println("eneter 2nd  number ");
        int num2 = sc.nextInt();
        System.out.println("eneter 3rd number ");
        int num3 = sc.nextInt();
        if (num1>num2 ){ 
            if (num1>num3) System.out.println("the greatest number is "+num1);
            else System.out.println(num3+" is greatest"); 
        }
        else {
            if (num2>num3) System.out.println("the greatest number is "+num2);
           else System.out.println("the greatest number is "+num3);
        }
    }
}