
import java.util.ArrayList;
import java.util.Collections;

public class Bucket_Sort {
    

public static void print(double[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
   }  


    static void bucketsort(double  arr[]){
       // create buckets 
       int n =arr.length;
       int a[]= new int[n];
       ArrayList<Double>[] buckets = new ArrayList[n];
       // creating a empty buckests 
       for (int i = 0; i < n; i++) {
           buckets[i]=new ArrayList<Double>();

       }

       // add elements to our buckets 
       for (int i = 0; i < n; i++) {
        int bucket_idx=(int)arr[i]*n;
        buckets[bucket_idx].add(arr[i]);
           
       }

       // sort each bucket  induvidually 
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);

        } 

        // merge all buckets to get final array 
        int idx =0;
        for (int i = 0; i < buckets.length; i++) {
             ArrayList<Double> currbucket = buckets[i];
             for (int j = 0; j < currbucket.size(); j++) {
                arr[idx ]= currbucket.get(j);
                idx ++;

                  
                 
             }
        }


    }
    public static void main(String[] args) {
        double a[]={0.59,0.12,0.33,0.99,0.25,0.35};

        bucketsort(a);
        print(a);

    }
}