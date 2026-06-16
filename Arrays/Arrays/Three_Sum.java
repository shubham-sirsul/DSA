public class Three_Sum {
  public static void main(String[] args) {
    int[] arr={1,4,5,6,3};
    int x =12;
    boolean f= true;
      for (int i = 0; i < arr.length-2; i++) {
          for (int j = i+1; j < arr.length-1; j++) {
             for (int k = j+1; k <  arr.length;k++) {
                if(arr[i]+arr[j]+arr[k]==x){
                System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"="+x);
                 f =false;
              }
             }
          }
      }
      if(f==true) System.out.println("Triplate not found ");
  }
}