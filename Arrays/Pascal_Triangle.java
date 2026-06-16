public class Pascal_Triangle {
    public static  int ncr(int n,int r){ //takes o(r) time    
        int res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i); //10-0=10
            res=res/(i+1); //0+1=1;
            //10/1
        }
        return res;

    }


    public static void main(String[] args) {
        //print pascle traingle
        //Brute Force o(n2)
        // for(int i=0;i<5;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(ncr(i,j)+" ");
        //     }
        //     System.out.println();
        // }      

        // optimized paskle triangle printing 
        for(int r=1;r<=5;r++){
            int ans=1;
            System.out.print(ans+" ");
            for(int c=1;c<r;c++){
                ans=ans*(r-c);
                ans=ans/c;
                System.out.print(ans+" ");
            }
            System.out.println();
        }       
        

        //print xth row of pascal triangle

    //     //1. optimizwe way --> print xth row of pascal triangle in o(n) time   
    //     int ans = 1;
    //     int r=3; // one based indexing     
    //     System.err.print(ans+" "); 
    //    for(int i=1;i<r;i++){
    //     ans=ans*(r - i ) ; 
    //     ans=ans/i; 
    //     System.out.print(ans+" ");
    //    }

        // // 2. print xth row --> TAKES O(X*R) time   x time loops * r times loop 
        // int x=4;    
        // for(int i=0;i<=x;i++){
        //     System.out.print(ncr(x,i)+" "); //prints 1 4 6 4 1
        // }   
    }
}