public class Sum_Of_Array {
    static int Arraysum(int arr[],int idx){
        if (idx >= arr.length) return 0;
        if (idx == arr.length-1){
            return arr[idx];
        }
        return Arraysum(arr, idx+1)+arr[idx];
    }
    
    
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arraysum(arr,0 ));
    }
}