// input  {19,-20,7,-4,-13,11,-5,3}
// output  -20 -4 -13 -5 7 11 19 3 


public class q2 {
    static int[] swap(int arr[],int i,int j){
    int temp = arr[i];
    arr[i]= arr[j];
    arr[j]=temp;
     return arr;
    }
     public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
static void partition(int arr[],int s,int e){
    int pivot =0;
    
     while(s<e){
        if(arr[s]<pivot) s++;
        else if(arr[e]>pivot) e--;
        else{
            swap(arr,s,e);
            s++;
            e--;
        }

     }
}
    public static void main(String[] args) {
        int arr[] ={19,-20,7,-4,-13,11,-5,3};
        partition(arr, 0, arr.length-1);
        print(arr);
    }
}