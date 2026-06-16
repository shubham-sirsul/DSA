


public class sub_Array {
     static int[] prifixsum(int[] arr){
    int[] ans =new int[arr.length];
     ans[0]=arr[0];
    for (int i = 1; i < arr.length; i++) {
        ans[i] = ans[i-1]+arr[i];
    }
    // print(ans);

   return ans;
  }
  static int[] suffixsum(int[] arr){
    int[] ans =new int[arr.length];
     ans[arr.length-1]=arr[arr.length-1];
    for (int i = arr.length-2; i >=0; i--) { //we started from 2nd last element of array
        ans[i] = ans[i+1]+arr[i];
    }
    // print(ans);

   return ans;
  }
  public static void print(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
  }
    public static void main(String[] args) {
        int [] arr = {5,3,1,6,3,1};
       int[] pref =prifixsum(arr);
       int[] suff =suffixsum(arr);
       int flag =0;
       for (int i = 0; i+1 < arr.length; i++) {
      if ( pref[i]==suff[i+1]) {
        flag=1;
      }
           
       }
       if(flag == 1) System.out.println(" it  has sub array ");
       else System.out.println("dosent have sub array ");
        
    }
}