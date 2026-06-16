public class binarysearch {


    static  Boolean Rec_B_S(int arr[],int s,int e,int target ){
        if(s>e) return false;
        int mid =s+((e-s)/2);
        if(arr[mid]==target) return true;
         else if(target<arr[mid]){
           return Rec_B_S(arr, s, mid-1, target);
         }
         else {
           return Rec_B_S(arr, mid+1, e, target);
         } 
        
    }
    static Boolean binarysort(int arr[],int target){
         int s=0,e=arr.length-1;
         int mid;
         while(s<=e){
          mid =s+((e-s)/2);
         if(arr[mid]==target) return true;
         else if(target<arr[mid]){
            e =mid-1;
         }
         else {
            s = mid+1;
         } 
         }
         return false;
    }
    public static void main(String[] args) {
        int arr[]= { 1,2,3,4,5,6,7};
        // int target = 0;
        // while(target<=8){
        // System.out.printf("the %d is avaliable in string : %b \n",target,binarysort(arr,target));
        // target++;
        // }

        System.out.println(Rec_B_S(arr, 0, arr.length-1, 8));
    }
}