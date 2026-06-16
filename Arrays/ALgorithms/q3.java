public class q3 {

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
    
    static void Sort012s(int a[]){
        
int low=0,mid=0;
int high = a.length-1;
while(mid<=high){
    if(a[mid]==0){
        swap(a,mid,low);
        mid++;
        low++;   
    }

    else if (a[mid]==1) mid ++;
    else if(a[mid]==2){
    swap(a,mid,high);
    high--;}
}
    }
    public static void main(String[] args) {
        int arr[]= {1,1,0,0,2,1,2,1,0,0};
        Sort012s(arr);
        print(arr);
        

    }
}