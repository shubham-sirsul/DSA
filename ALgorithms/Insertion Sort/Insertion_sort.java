public class Insertion_sort {


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
   static void  insertionsort(int arr[]){
        // for (int i = 1; i <arr.length; i++) {
        //     for (int j = i; j > 0; j--) {
              
        //      if ( arr[j]<arr[j-1]){
        //         swap(arr,j,j-1);
        //       }
        //        else break;
        //     }
        // }



            for (int i = 0; i < arr.length; i++) {
                int j =i;
                // insert a[i] into sorted left part 
                while(j>0 && arr[j]<arr[j-1]){
                swap(arr, j, j-1);
                j--;

                }
            }
    }
    public static void main(String[] args) {
        int arr[] ={2,5,8,6,3,68,9};
        insertionsort(arr);
        print(arr);
    }
}