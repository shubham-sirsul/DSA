public class minimumElemennt {
    // finding minimmum on rotated array 
    static int find_min(int arr[]){
        int s=0;
        int e =arr.length-1;
        int ans =0;
        int mid = s+((e-s)/2); //= (s+e)/2
        while (s<=e){
            mid = s+((e-s)/2);
            if(arr[mid]<=arr[arr.length-1]){
                e=mid-1;
                ans =mid;
            }
            else if (arr[mid]>arr[arr.length-1]){
                s=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,6,1,2};
        System.out.println(find_min(arr));

    }
}