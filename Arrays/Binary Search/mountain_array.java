public class mountain_array {
    static int peak_index(int arr[]){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]<arr[mid+1]) {
            ans =mid+1;
             s= mid+1;
        }   else e=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,2,1};
        System.out.println(peak_index(arr));
    }
}