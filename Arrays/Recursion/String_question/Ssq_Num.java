public class Ssq_Num {
   static void  subsetSSQ(int arr[],int idx, int sum){
   if (idx>=arr.length){
    System.out.println(sum);
    return;
   }
     
     subsetSSQ(arr, idx+1, sum+arr[idx]);
     subsetSSQ(arr, idx+1, sum);
    

    }

    public static void main(String[] args) {
        int arr[]= {2,4,5};
        subsetSSQ(arr, 0, 0);
    }
}