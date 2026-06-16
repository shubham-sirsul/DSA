

public class firsOccurence {
    static int last_occurence(int arr[],int target){
         int s=0,e=arr.length-1;
         int mid;
         int fo=-1;
         while(s<=e){
          mid =s+((e-s)/2);
         if(arr[mid]==target) {
         s=mid+1;
         fo=mid;
         
         }
         else if(target<arr[mid]){
            e =mid-1;
         }
         else {
            s = mid+1;
         } 
        
         }
          return fo ;
    }
    static int findfirst(int arr[],int target){
         int s=0,e=arr.length-1;
         int mid;
         int fo=-1;
         while(s<=e){
          mid =s+((e-s)/2);
         if(arr[mid]==target) {
         e=mid-1;
         fo=mid;
         }
         else if(target<arr[mid]){
            e =mid-1;
         }
         else {
            s = mid+1;
         } 
        
         }
          return fo ;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,2,3,3,3,4,4};
        // Array.sort(arr);
        // System.out.println(findfirst(arr, 1));
        System.out.println(last_occurence(arr, 4));
    }
}