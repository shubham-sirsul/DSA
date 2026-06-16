import java.util.Scanner;
public class elseif{
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
       System.out.println("Enter your percentage :");
       int a= sc.nextInt();
       if (a>90) System.out.println("Excllent");
       else if (a>80) System.out.println("Very Good");
       else if (a>70) System.out.println("Good");
       else if (a>60) System.out.println("can do bettter");
       else if (a>50) System.out.println("AVRAGE");
       else if (a>40) System.out.println("below Avrage");
       else  System.out.println("FAil");
    }
}