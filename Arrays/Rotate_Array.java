public class Rotate_Array {
  public static void swap(int[] arr,int i,int j){
    int  temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
  } 
  public static void print(int[] arr){
     for (int i = 0; i < arr.length; i++) {
       System.out.print(arr[i]+" ");
          
      }
      
  }
  public static void reverse(int[]arr,int i,int j){
         while(i<j){
         swap(arr,i,j);
               i++;
               j--;
       }
      }
  public static void main(String[] args) {
      int[] arr= {2,3,5,7,11};
      int n =arr.length-1;
       int k=102;
       k=k%(n+1);
    
      //  // rotate by left 
      // reverse(arr,0,n); // reverse full array 
      // reverse(arr,0,n-k); // reverse first part 
      // reverse(arr,n-k+1,n); // reverser second part 
     
     
     
      // // rotate by right   
      reverse(arr,0,n); // reverse full array 
      reverse(arr,0,k-1);
      reverse(arr,k,n);
      print(arr);
  }
}