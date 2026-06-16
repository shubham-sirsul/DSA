public class bubble_sort {
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
    public static void main(String[] args) {
        int arr[]= {2,1,3,4,5,3,6,7};
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[i]>arr[j]){
        //             swap(arr, i, j);
        //         }
        //     }

        // }

     for (int j = 0; j <arr.length; j++) {
         int flag=0;
           for (int i = 0; i < arr.length - j-1; i++) {
           
         if (arr[i] > arr[i + 1]) {
        swap(arr, i, i + 1);
        i=1;
    }
    
     }
         if (flag ==0) break;
     }
        print(arr);
    }
}