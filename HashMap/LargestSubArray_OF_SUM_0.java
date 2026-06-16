
import java.util.HashMap;

// find length of largest subarray of sum zero

public class LargestSubArray_OF_SUM_0 {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,7,1,10,-25};
        int prifix = 0;
        int length =0;
        int max_length=0;
        HashMap<Integer,Integer> hm  = new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<arr.length;i++){
            prifix+=arr[i];
            if(hm.containsKey(prifix)){
                // here we are not updating the index of older prifix in element in map because we want maximum length 
                length = i-hm.get(prifix);
                if(length>max_length){
                    max_length =length;
                }
            }
            else{
                hm.put(prifix,i);
            }
        }
        System.out.println(max_length);
    }
}