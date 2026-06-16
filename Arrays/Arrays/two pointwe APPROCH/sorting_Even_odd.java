public class sorting_Even_odd {
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
    int [] arr={6,2,3,4,5,7,4,3,5,8};
      int i=0,j=arr.length-1;
  while(i<j){
    if((arr[i]%2!=0 && arr[j]%2==0)){  swap(arr,i,j);
    i++;
    j--;
    }
    if(arr[i]%2==0) i++;
    if(arr[j]%2!=0) j--;
  }
  print(arr);
    }
  }
