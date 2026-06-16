

    public class Selection_sort {

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
            for (int i = 0; i < arr.length-1; i++) {
                int minidx =i;
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[minidx]>arr[j]){
                        minidx =j;  
                    }
                }
               if(minidx!=i){
                 swap(arr, i, minidx);

               }
            }
            print(arr);
        }
    }