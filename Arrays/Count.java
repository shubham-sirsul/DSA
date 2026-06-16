public class Count {
    static int count(int[] arr,int j){
        int c=0;
     for (int i = 0; i < arr.length; i++) {
         if (arr[i]==j) c++;
     }
     return c;
    }
    
  public static void main(String[] args) {
      int[] arr={1,2,3,1,2,4,2,5,7,3,6};
    //   unique(arr);
      
     System.out.println("count of 2  is  "+count(arr, 2));
  }
}