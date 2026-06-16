public class Reverse_Arrayone {
  public static void main(String[] args) {
      int[] arr ={1,2,3,4,5,6,7,8,9};
      int [] brr =new int[(arr.length)];
       int k=arr.length -1;
       int j =0;
       while(k>=0){
        brr[j]=arr[k];
        k--;
        j++;
       }
      for (int i = 0; i < arr.length; i++) {
       System.out.print(brr[i]+" ");
          
      }
  }
}