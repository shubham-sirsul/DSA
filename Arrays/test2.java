
public class test2 {
        public static int arraysum(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;   // add each element
            }
            return sum;
        }


    public static boolean isprime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0 && i!=n){
                return false;
            }
        }
        return true;
    }
     public static int reverse(int n){
        String s = ""+n;
        String ans = "";
        for(int i=0;i<s.length();i++){
            ans+= s.charAt(i);
        }
        int result = Integer.valueOf(ans) -'0';
        return result;
     }

    public static int  sumprime(int n){
                int a=0;
                int b=0;
            for(int i =2; i<=n;i++){
                if(isprime(i)){
                    a=a+i;
                    if( a<n && isprime(a)){
                        b=a;
                    }
                }
            }
            return b;
    }
    public static void main(String[] args) {
        // // char a ='9';
        // // System.out.println((int)a    -'0');
        // System.out.println(sumprime(20));



     int hp =11;
     int temp= hp;
     int   damage[]= {3,6,7};
     int req[]={4,2,5} ;
     int n =damage.length;
     int score[]= new int[n];


     for(int i=0;i<n;i++){
        hp =temp;
        for(int j=i;j<n;j++){
           hp = hp-damage[j];
           if(hp>=req[j]){
            score[i]++;
           }
        }
     }
     System.out.println(arraysum(score));

 System.out.println(reverse(123));      

    }
}