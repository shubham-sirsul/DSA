// input 10
// output 1-2+3-4+5-6+7-8+9-10 = -5


public class SumOf_n_alternatesigns {
        public static int  sum(int n){
        if (n==0) {
            return 0;
        }
        
       return n+sum(n-1);
       
    }
    static int ALternate_Sum(int n){
         if (n==0) {
            return 0;
        }
        if(n%2!=0){
            
            return  ALternate_Sum(n-1)+n;
        }
        else return ALternate_Sum(n-1)-n;
        }


    public static void main(String[] args) {
        System.out.println(ALternate_Sum(10));
    }
}