
import java.util.HashMap;
import java.util.Map;

//  given an array , find most frequesnt element in it , if there are multiple elements hat apper maximum number of time  print one of it 



public class MaxNumberFrequency {
    public static int frequency(int arr[]){
        Map<Integer,Integer> hm = new HashMap<>();
        int max= Integer.MIN_VALUE;
        int maxvalue= -1;

        for(int a : arr){
            if(hm.containsKey(a)){
                hm.put(a, hm.get(a)+1);
            }
            else{
                hm.put(a,1);
            }
          
        }
        //  System.out.println(hm.entrySet());
        for(var e : hm.entrySet()){
            if(e.getValue()> maxvalue){
                max= e.getKey();
                maxvalue = e.getValue();
            }
        }
        return max;


        
    }
    public static void main(String[] args) {
        int arr[]= {1,4,2,5,1,4,4,6,4,4,4};  // expected output 1;
       System.out.println(frequency(arr));
    }
}