public class Count_Sort {
    public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
   }

    static void basic_countsort(int arr[]){

        
        // find the largest element present in array 
        int max =arr[0];
        for (int i = 1; i < arr.length; i++) {
             if(arr[i]>max) max=arr[i];
        }

        int count[]=new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            // count me arr[i] wale index pe jake +1 kardo default 0 rahaga  
            count[arr[i]]=count[arr[i]]+1;  
        }


        int k=0;
        for (int i = 0; i < count.length; i++) {
            for(int j=0;j<count[i];j++){
                arr[k]=i;
                k++;
            }
        }

    }

    static void Stable_Countsort(int arr[]){
         // find the largest element present in array 
        int max =arr[0];
        for (int i = 1; i < arr.length; i++) {
             if(arr[i]>max) max=arr[i];
        }

        int count[]=new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            // count me arr[i] wale index pe jake +1 kardo default 0 rahaga  
            count[arr[i]]=count[arr[i]]+1;  
        }
        // converting count to prifix sum of it 
        for (int i = 1; i < count.length; i++) {
          count[i]=count[i]+count[i-1];
        }
       int out[]= new int[arr.length];
       for (int i = arr.length-1; i >=0 ; i--) {
           out[count[arr[i]]-1]= arr[i]; // cheak note book if not understand this line 
           count[arr[i]]=count[arr[i]]-1;
       }
       
      for(int i = 0; i < arr.length; i++) {
          arr[i]=out[i];
      }

    }
    public static void main(String[] args) {
        int arr[]={1,4,5,2,2,5};
        Stable_Countsort(arr);
        print(arr);

        
    }
}