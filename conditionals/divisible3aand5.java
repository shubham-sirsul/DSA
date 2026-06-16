
import java.util.Scanner;

public class divisible3aand5{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("eneter a number ");
        int num = sc.nextInt();
        if (num%3==0 &&num%5==0) System.out.println("it is divisible by 5 and 3 ");
        else if (num%3!=0 &&num%5==0) System.out.println("it is divisible by 5 but not 3  "); 
        else if (num%3==0 &&num%5!=0) System.out.println("it is divisible by 3 but not 5  "); 
        else System.out.println("it is not divisible by 5 and 3 ");
    }
}