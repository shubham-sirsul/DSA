
// input 25       input 24
// output 5       output 4
// return neraest interger root of 24 is 4. somthing so output 4 

public class squareroot {

    static int squareroot( int n){
        int s=1;
        int e=n;
        int mid  = (s+e)/2;
        int ans =0;
        while(s<=e){
            mid  = (s+e)/2;
            int val = mid*mid;
            if ((mid*mid)==n){
                return mid;
            }
            if((mid*mid)>n){
                e=mid-1;
            }
            else {
                s=mid+1;
                ans=mid;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(squareroot(26));
    }
}