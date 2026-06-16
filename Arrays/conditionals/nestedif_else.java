
import java.util.Scanner;

public class nestedif_else{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("eneter a number :");
        int num = sc.nextInt();
        // if (num%3==0 || num%5==0) {
        //     System.out.print("it is divisible by 5 or 3 ");
        //     if(num%15!=0){
        //         System.out.println(" But not  divisible by 15 ");
        //     }
        // }
        // else{
        //     System.out.println("it is not divisible by 5 and 3 ");
        // }
         if( (num%3==0 || num%5==0) && (num%15!=0)) {
            System.out.print("it is divisible by 5 or 3 but no by not 15 ");
        }
        else{
            System.out.println("not matches with given condition ");
        }
   
}
}