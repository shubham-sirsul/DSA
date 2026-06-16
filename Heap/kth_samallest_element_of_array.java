import  java.util.*;

public class kth_samallest_element_of_array {
    public static int findKthLargest(int[] nums, int k) {    
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for( int i: nums){
            pq.add(i);
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.peek();
    }
    public static int findKthSmallest(int[] nums, int k) {    
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for( int i: nums){
            pq.add(i);
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int arr[]= {1,2,45,8,4,3,6,7};
        int k =2;
        System.out.println(findKthLargest(arr, k));
        System.out.println(findKthSmallest(arr, k));
    }
}