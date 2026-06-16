
import java.util.HashSet;

//You are given n distinct pairs. Each pair is numbered from 1 to n. All these pairs are initially put in a bag. You need to pair up each number. You take numbers one by one from the bag and for each number you look whether the pair of this number has already been taken out of the bag, or not. If not (that means the pair of this number is still in the bag), you put the current number on the table in front of him. Otherwise, you put both numbers from the pair aside. Print the maximum number of numbers that were on the table at the same time.


public class bag_pair {
    public static int find(int[] arr, int i){
        for(int j =i;j<arr.length;j++){
           if(arr[j]==arr[i]) return j;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {2,1,1,3,2,3};
      HashSet<Integer> table  = new HashSet<>();
      int size=0;
      int max_size=0;

      for(int i =0;i<arr.length;i++){
        if(!table.contains(arr[i])){ // the number is not in table meqans it is in bag so put it on table
            table.add(arr[i]);
        }
        else { // if number is already on table find its pair if found remove that number from table 
           table.remove(arr[i]);
        }
        
        max_size= Math.max(table.size(),max_size);
      }    
      System.out.println(max_size);    
    }
}