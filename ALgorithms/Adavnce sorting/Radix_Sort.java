public class Radix_Sort {
    public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
    static int max(int arr[]){
         int max =arr[0];
        for (int i = 1; i < arr.length; i++) {
             if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    static void Stable_Countsort(int arr[],int place ){
    // find the largest element present in array 
        int max =max(arr);

        int count[]=new int[10];
        for (int i = 0; i < arr.length; i++) {
            
            count[(arr[i]/place)%10]++; 
        }
       
        for (int i = 1; i < count.length; i++) {
          count[i]=count[i]+count[i-1];
        }
       int out[]= new int[arr.length];
       for (int i = arr.length-1; i >=0 ; i--) {
        int idx =count[(arr[i]/place)%10]-1;
        out[idx]=arr[i];
          count[(arr[i]/place)%10]--;
       }
       
      for(int i = 0; i < arr.length; i++) {
          arr[i]=out[i];
      }

    }
 static void Redix_Sort(int arr[]){
    int max = max(arr);
    // apply counting sort to sort elements on basis of palce value 
    for(int palce = 1; max / palce > 0; palce*=10) {
        Stable_Countsort(arr, palce);
    }
 }   
    public static void main(String[] args) {
        int arr[]={ 34,2324,47,8,678,6786,86,78,68,565};
        Redix_Sort(arr);
        print(arr);

    }
}