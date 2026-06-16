// given an 2d array
// 1. integer in each row are sorted from left to right 
// 2. the 1st element in each row < last element of previous row

public class SearchON_2DArrays {
    static boolean search(int a[][],int target ){
       int ans=-1;
        int i= a.length-1; // total rows 
        int j =a[0].length-1;
        while(i>=0){
        if(a[i][j]>=target ){
        ans =i;
        i--;
        }
        else break;
        }
     if (ans==-1) return false;
        int s = 0;
        int e=a[ans].length -1;
        int mid = (s+e)/2;
        while(s<=e){
             mid = (s+e)/2;
            if(a[ans][mid] == target) return true;
            else if(a[ans][mid]>target) e=mid-1;
            else   s=mid+1;
        }
      
        return false;
    }
    static boolean search_2d(int a[][],int target){
      int n= a.length; // rows
      int m =a[0].length;


      int s = 0, e=n*m-1;// n*m-1 is last index 
      while(s<=e){
        int mid = s+(e-s)/2;
        int mid_ele=a[mid/m][mid%m]; // converting   index to actual address of array 
        if(mid_ele == target) return true;
        if(target<mid_ele){
            e =mid-1;
        }
        else 
        s= mid+1;

      }

      
      
      
        return false;
    }
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        // System.out.println(a.length);// rows 
        // System.out.println(a[0].length);//coloums
        // System.out.println(search(a, 3));
        System.out.println(search_2d(a, 3));
       
    }
}