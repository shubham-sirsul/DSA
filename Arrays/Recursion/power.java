

public class power {
    static int power(int p,int q){
        if( q==0){ //power of any number raise to 0 is equals to 1
            return 1;
        }
        return p*power(p, q-1);
       // p^q * p^(q-1)* p^(q-2)........
    }

    static int power1(int p,int q){
        if( q==0){ //power of any number raise to 0 is equals to 1
            return 1;
        }
        int pow = power1(p,q/2);
        if (q%2==0)
        return pow*pow;
        else 
        return  pow*pow*p;
    }
    public static void main(String[] args) {
        // System.out.println(power(2, 3));
        System.out.println(power1(2,8));
    }
}