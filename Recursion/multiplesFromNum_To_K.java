
// input num =12 k=5
// output 12 24 36 48 60 


public class multiplesFromNum_To_K {
    static void multiples(int num,int k){
        if( k==0) return ;
       multiples(num, k-1);
       System.out.print(num*k+" ");
    }
    
    
    public static void main(String[] args) {
        multiples(12,5);
    }
}