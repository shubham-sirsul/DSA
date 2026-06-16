public class Sorting_zero_one_Array {
   public static void print(int[] arr){
     for (int i = 0; i < arr.length; i++) {
       System.out.print(arr[i]+" ");
          
      }
      
  }
   public static void swap(int[] arr,int i,int j){
    int  temp = arr[i];
               arr[i]=arr[j];
               arr[j] = temp;
  }
  public static void main(String[] args) {
    
   // int count =0;
    int[] arr = {1,0,1,1,0,0,1,0,1,0,0,0,0,0,1};
   
  //  // 1st method
   
  //   for (int i = 0; i < arr.length; i++) {
  //       if (arr[i]==0) count++;
  //   }
  //   for (int i = 0; i < count; i++) {
  //     arr[i]=0;
  //   }
  //   for (int i = count; i < arr.length; i++) {
  //     arr[i]=1;
  //   }

  // print(arr);


  int i=0,j=arr.length-1;
  while(i<j){
    if((arr[i]==1 && arr[j]==0)){  swap(arr,i,j);
    i++;
    j--;
    }
    if(arr[i]==0) i++;
    if(arr[j]==1) j--;
  }
  print(arr);
    }

}
