public class Merge_Sort {

     public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
  }

    static void merge(int arr[],int l,int mid, int r){
        int n1= mid-l+1;
        int n2 = r-mid;

        int left[]= new int [n1];
        int right[] =new int[n2];
        
        int i,j,k;
        for (i = 0; i < n1; i++) {
            left[i]= arr[l+i];
        }
        for (j = 0; j < n2; j++) {
            right[j]= arr[mid+1+j];
        }
     i=0;
     j=0;
     k=l;
      while(i<n1 && j<n2){
         if(left[i]<right[j]){
            arr[k]= left[i];
            i++;
            k++;

         }
         else{
            arr[k]=right[j];
            j++;
            k++;
         }
 
      } 
          while(i <n1 ){
            arr[k++] = left[i++];
         }
         while(j <n2 ){
            arr[k++] =right[j++];
         }
    }   
    
    static void Merge_Sort(int arr[],int l,int r){
        if (l>=r) return;
        int mid  = (l+r)/2;
       Merge_Sort(arr, l, mid);
       Merge_Sort(arr, mid+1, r);
       merge(arr,l,mid,r);
    }
    public static void main(String[] args)  {
        int arr[]=  {4,1,3,5,2};
        System.out.println("Array before sorting");
        print(arr);
        System.out.println();
        Merge_Sort(arr, 0, arr.length-1);
        System.out.println("Array  after sorting ");
        print(arr);
    }
}