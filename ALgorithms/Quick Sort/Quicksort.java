public class Quicksort {

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
  }

    static int[] swap(int arr[],int i,int j){
    int temp = arr[i];
    arr[i]= arr[j];
    arr[j]=temp;
     return arr;
    }

       static int partition(int[] arr, int low, int high) {
        int p = arr[low];
        int count  = 0;
        for(int i=low+1 ;i<=high;i++){
            if(arr[i]<=p) count++;
        }
        
        int pi = low + count;
        swap(arr,low,pi);
        int i=low ;
        int j =high;
        
        while(i<pi && j>pi){
            while(arr[i]<=p && i<pi){
                i++;
            }
            while(arr[j]>p && j>pi){
                j--;
            }
            
            if(i<pi && j>pi){
                 swap(arr,i,j);
                 i++;
                 j--;
            }
         
        }
        
        return pi;
    }
    static void Quick_sort(int arr[],int s, int e){
        if (s>=e) return;
        int pi = partition(arr,s,e);
        Quick_sort(arr,s, pi-1);
        Quick_sort(arr, pi+1, e);
    }

    public static void main(String[] args) {    
        int arr[] = {3,4,9,6,12,23,45,6,7};
       Quick_sort(arr,0, arr.length-1);
       print(arr);
        
    }
}