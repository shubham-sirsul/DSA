// input =0,5,0,30,3
// output =  5,30,3,0,0
// order of elements should not be change 



public class ZeroAtEnd 
{
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


    public static void zeroend(int arr[]){
        for (int i = 0; i < arr.length; i++) {
               int flag =0;
            for (int j = 0; j < arr.length-i-1; j++) {
             
                if(arr[j]==0 && arr[j+1]!=0){
                    swap(arr,j,j+1);
                    flag =1;
                }
                
            }
            if (flag==0) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 5};
        zeroend(arr);
        print(arr);
    }
}