
import java.util.Scanner;

public class GCD {

    public static int GCD(int x,int y,int min){
        // brutforce apporoch 
        if (min ==0){
            return 0;
        }
        else if(x%min==0 && y%min == 0){
            return min;
        }
        else{ return GCD(x,y,min-1);
        }

    }
     public static int igcd(int x,int y){
        

        while(x%y != 0){
            int reminder =x%y;
            x=y;
            y=reminder;
        }
        return y;

     }
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int y =  sc.nextInt();
      
       System.out.println(igcd(x, y ));
       
       
        int min =0;
        if(x<y) min =x;
        else  min =y;
        //  System.out.println(GCD(x,y,min));
        //  int GCD=0;
        // for(int i=min;i>=0;i--){
        //     if(x%i==0 && y%i==0 ){
        //        GCD =i;
              
        //        break;
        //     }
          
        // }
        
        
      
    }

    
}