
import java.util.*;

class MedianFinder {
    
    PriorityQueue<Integer> maxh = new PriorityQueue<>(Comparator.reverseOrder());
    PriorityQueue<Integer> minh = new PriorityQueue<>();
    public MedianFinder() {
     
    }
    
    public void addNum(int num) {
     
       if(maxh.size()==0 || num<maxh.peek()) maxh.add(num);
       else minh.add(num);

       if(maxh.size()==minh.size()+2){
        minh.add(maxh.poll());
       }
       if(minh.size()==maxh.size()+2){
        maxh.add(minh.poll());
       }
        
    }
    
    public double findMedian() {
        if(maxh.size()==minh.size()+1) return maxh.peek();
        else if(maxh.size()+1==minh.size()) return minh.peek();
        else return( maxh.peek()+minh.peek())/2.0;
    }
}


public class Median_in_dataStream {
    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();

        int[] nums = {-1, -2, -3, -4, -5};
        for (int num : nums) {
            mf.addNum(num);
            System.out.println("Added: " + num + ", Current Median: " + mf.findMedian());
        }
                                
    }
}