
import java.util.HashMap;
import java.util.HashSet;


// n=6;
// Input : [ 100,4,200,1,3,2]
//output : 4 -->(1,2,3,4)


public class longest_length_consicative_sequence {
    public static void main(String[] args) {

        int [] nums = {0,3,7,2,5,8,4,6,0,1};
        HashSet<Integer> hs  =  new HashSet<>(); 
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            hs.add(nums[i]);
            hm.put(nums[i],0);
        }
        int length =0;
        int maxlength = 0;
        for(int i = 0;i<nums.length;i++){
            length =0;
          int a= nums[i];
          while(hs.contains(a+1) && hm.get(a+1)==0){
              length++;
              
              hm.put(a+1,1);
              a++;
          }
          a= nums[i];
          while(hs.contains(a-1) &&  hm.get(a-1)==0){
              length++;
             
              hm.put(a-1,1);
               a--;
          }

          if(length>maxlength){
            maxlength =length;
          }
          

        }
        System.out.println(maxlength+1);
        // time and space complixity will be O(n)
    }
}