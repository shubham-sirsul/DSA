
import java.lang.*;
import java.util.*;

//Find the k closest points to the origin (0,0) from a given list of points
// the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
 


public class k_closest_points_to_origin {
   static class student implements Comparable<student> {
    int a, b, c;

    student(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int compareTo(student s){
        return this.a - s.c;
    }
    }
    
    public static int[][] k_closest(int arr[][],int k){
     PriorityQueue<student> pq = new PriorityQueue<>(Comparator.reverseOrder()); 
    for(int i = 0;i<arr.length;i++){
        int length =(int)(Math.sqrt( (arr[i][0]*arr[i][0]) + (arr[i][1]*arr[i][1])));
        student temp = new student(length, arr[i][0], arr[i][1]);
        pq.add(temp);
        if(pq.size()>k) pq.remove();
    }
    int Final_result[][]= new int[k][2]; 
    int x =k-1;
   while(pq.size()>0){
     student result =  pq.remove();
   
    Final_result[x][0] = result.b;
    Final_result[x][1] = result.c;
    x--;
    
   }
   
   for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
   }
    return Final_result;
    }
    
    
    public static void main(String[] args) {
        // student s1 = new student(10, 20, 80);
        // student s2 = new student(20,30,40);
        // student s3 = new student(30,40,50);
    
        // // student arr[] = {s1,s2,s3};
        // // Arrays.sort(arr);
        // // for(student i: arr){
        // //    System.out.println(i.a);
        // // }
        
        // PriorityQueue<student> pq  = new PriorityQueue<>(); 
        int[][] arr = {
    {1, 3},
    {-2, 2},
    {5, 8},
    {0, 1}
};
int k = 2;
       k_closest(arr, k);       
    }
}