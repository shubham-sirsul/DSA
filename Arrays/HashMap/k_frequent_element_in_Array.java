import java.util.*;
// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
// Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2

// Output: [1,2]


public class k_frequent_element_in_Array {
      public static class obj implements Comparable<obj>{
        int ele;
        int freq ; 
        obj(int ele,int freq){
            this.ele =ele;
            this.freq = freq;

        }
        public int compareTo(obj s){
            if(this.freq==s.freq){
                return this.ele - s.ele;
            }
            return this.freq - s.freq;
        }
    }
     public static void print(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
     }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm =  new HashMap<>();
        PriorityQueue<obj> pq = new PriorityQueue<>(); 
        for(int i : nums){
            if(hm.containsKey(i)){
                int t  = hm.get(i);
                hm.put(i,t+1);
            } else{
                hm.put(i,1);
            }
        }
        for(int key : hm.keySet()){
           pq.add(new obj(key,hm.get(key)));
           if(pq.size()>k){
            pq.remove();
           }
        }
        int[] ans =new int[k];
        while(pq.size()>0){
            ans[pq.size()-1] = pq.remove().ele; 
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={ 111,2,3,2,1,1,1,1,1,2,3,2,1};
        int k =2;
        print(topKFrequent(arr, k));

    }
}