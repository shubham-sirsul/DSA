public class q1 {
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



    static void sortArr(int arr[]){
        int x=-1,y=-1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]>arr[i]){
                if(x==-1){
                    x=i-1;  
                }
                 y=i;
            }
        }
        swap(arr,x,y);
    }
    public static void main(String[] args) {
        int arr[]={3,2};
        sortArr(arr);
        print(arr);
    }
}