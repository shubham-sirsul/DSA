public class practice {
    static void swap(int arr[],int i,int j){
    int temp = arr[i];
    arr[i]= arr[j];
    arr[j]=temp;
    
    }
    
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void Merge_Sort(int arr[],int i,int j){
        if(i>=j) return;
        int mid =(i+j)/2;
        Merge_Sort(arr, i, mid);
        Merge_Sort(arr, mid+1, j);  
        merge(arr,i,mid,j);
    }
    public static void  merge(int arr[],int l,int mid , int m ){
        int n1= mid -l+1;
        int n2 =m-mid;
        int left[]= new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];

        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+1+i];
        }

        int i=0;
        int j=0;
        int k=l;

        while (i<n1 && j<n2) { 
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }
            else if(left[i]>right[j]){
                arr[k]=right[j];
                j++;
                k++;
            }
        }
        if(k<=arr.length-1){
            if(i<n1){
                arr[k]=left[i];
                i++;
                k++;
            }else if(j<n2){
                while(j<n2){
                    arr[k]=right[j];
                    k++;
                    j++;
                }
            }
        }



    }

     public static void main(String[] args) {
        int arr[]=  {4,1,3,5,2};
        System.out.println("Array before sorting");
        print(arr);
        System.out.println();
        Merge_Sort(arr, 0, arr.length-1);
        System.out.println("Array  after sorting ");
        print(arr);
    }
}