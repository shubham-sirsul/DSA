
import java.util.Scanner;


public class compAreaAnd_perimeter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Recrangle :");
        int len = sc.nextInt();
        System.out.print("Enter Breadth of Recrangle :");
        int b= sc.nextInt();
        int area = len*b;
        int peri = 2*len+2*b;
        if (area>peri) System.out.println("area is greater than perimeter ");
        else if(area==peri){
            System.out.println("your area and perimeter area equal");
        }    
         else{
        System.out.println("Area is less than perimeter");
        }

        if (len==b) System.out.println("It is square");
    }
   
}