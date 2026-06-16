

public class MAX_element  {
  static int max(int arr[],int max,int idx){
  if (idx==arr.length) return max;
   if(max<arr[idx]){
     max =arr[idx];
     return max(arr, max, idx+1);
   }
   else return max(arr, max, idx+1);
  }

  static int  maxInArray(int arr[],int idx){
    // better because no need extra variable in fuinction 
    if (idx == arr.length-1){
      return arr[idx];
    }
    int smallans =maxInArray(arr, idx+1);
    return Math.max(smallans, arr[idx]);
  }
    public static void main(String[] args) {
      int arr[]={1,1,2,3,4,6,2,8,2,4,82,5,9,6};
        // int max = Integer.MIN_VALUE;

        // System.out.println(max(arr,max,0));
        System.out.println(maxInArray(arr, 0));
    }

}