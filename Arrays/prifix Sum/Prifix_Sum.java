// question
// input arr 1 2 3 4 5 6 7 8 9 10
// ans  -->     1 2+1 1+2+3 1+2+3+4 1+2+3+4+5 ....... in output array 

public class Prifix_Sum {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
  public static void main(String[] args) {
      int[] arr ={1,2,3,4,5,6,7,8,9,10};
      int[] ans =new int[arr.length];

    // 1st method 
    //   int x=0;
    //   for (int i = 0; i < arr.length ; i++) {
    //       for (int j = 0 ; j <= i ; j++) {
    //           ans[x]+=arr[j];
      
    //       }
    //       x++;
    //   }
    //2nd method
    ans[0]=arr[0];
    for (int i = 1; i < arr.length; i++) {
        ans[i] = ans[i-1]+arr[i];
    }
      print(ans);
  }
}