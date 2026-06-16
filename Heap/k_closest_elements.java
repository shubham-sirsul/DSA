import java.util.*;

public class k_closest_elements {
     public static class obj implements     <obj>{
        int ele;
        int dis ; 
        obj(int ele,int dis){
            this.ele =ele;
            this.dis = dis;

        }
        public int compareTo(obj s){
            if(this.dis==s.dis){
                return this.ele - s.ele;
            }
            return this.dis - s.dis;
        }
    }
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer>  ans= new ArrayList<>();
         PriorityQueue<obj> pq = new PriorityQueue<>(Comparator.reverseOrder()); 
         for(int i : arr){
            int dis = Math.abs(i - x);

            pq.add(new obj(i,dis));
            if(pq.size()>k){
                pq.remove();
            }
         }
         while(pq.size()>0){
            obj t  = pq.remove();
            ans.add(t.ele);
         }
          Collections.sort(ans);
          return ans;
    }
    public static void main(String[] args) {
          int[] arr1 = {1, 2, 3, 4, 5};
        int k1 = 4, x1 = 3;
        System.out.println("Test 1: " + findClosestElements(arr1, k1, x1));
        // Expected: [1, 2, 3, 4]

        // Test case 2
        int[] arr2 = {1, 1, 2, 3, 4, 5};
        int k2 = 4, x2 = -1;
        System.out.println("Test 2: " + findClosestElements(arr2, k2, x2));
        // Expected: [1, 1, 2, 3]

        // Test case 3
        int[] arr3 = {10, 15, 20, 25, 30};
        int k3 = 2, x3 = 22;
        System.out.println("Test 3: " + findClosestElements(arr3, k3, x3));
        // Expected: [20, 25]

        // Test case 4
        int[] arr4 = {1, 2, 3, 4, 5, 6};
        int k4 = 3, x4 = 10;
        System.out.println("Test 4: " + findClosestElements(arr4, k4, x4));
        // Expected: [4, 5, 6]

    }
}