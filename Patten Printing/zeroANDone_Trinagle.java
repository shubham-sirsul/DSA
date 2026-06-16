
import java.util.Scanner;

public class zeroANDone_Trinagle {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
    // 1st method self 
    //   int a;
    //   for(int i =1;i<=n;i++){
    //     if( i%2==0) a=0;
    //         else a=1;
    //     for(int j=1;j<=i;j++){
    //         System.out.print(a+" ");
    //         if( a==1) a=0;
    //         else a=1;
    //     }
    //     System.out.println();
    //   }



    // by teacher 
    //  for(int i =1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         // if( i%2!=0){
    //         //     if(j%2!=0){
    //         //         System.out.print(1);
    //         //     }
    //         //     else System.out.print(0);
    //         // }
    //         // else{ //i is even
    //         //      if(j%2==0) System.out.print(1);
    //         //      else System.out.print(0);
    //         // }
    //         // piche wale ko hii chote code me kiya 
    //         if((i%2!=0 && j%2!=0) || (i%2==0 && j%2==0) )
    //         System.out.print(1+" ");
    //         else System.out.print(0+" ");
    //         // i and j dono agar  dono even or odd hee tho 1 print ho rahabhee nhi tho 0 
    //     }
    //     System.out.println();
    //   }


    // even+even = even & even+odd =odd & odd+odd =even   ye samja tho agar i and j dono even hoo tho unka sum bhi even hoga tb print 1 nhi tho 0 
      for(int i =1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if((i+j)%2==0)
            System.out.print(1+" ");
            else System.out.print(0+" ");
        }
        System.out.println();
      }
  }
}