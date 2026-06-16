public class PrintArrays {
     static void print(int []arr, int idx){
       if (idx ==arr.length ) return ;
        
        System.out.print(arr[idx]+" ");
        print(arr, idx+1);
     }
    public static void main(String[] args) {
       int arr[]={1,1,2,3,4,6,2,8,2,4,82,5,9,6};
     print(arr, 0);
    }
}