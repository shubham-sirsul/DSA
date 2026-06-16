public class passBY_Value_Refrence_Arrays {
     public static void print(int[] arr){
     for (int i = 0; i < arr.length; i++) {
       System.out.print(arr[i]+" ");
          
      }
      System.out.println();
      
  }
  public static void main(String[] args) {
      int [] arr = {1,2,3,4,5,6,7};
      int[] arr_2 = arr;
      //int[] arr_2 = arr.clone();
      System.out.print("1st array before change :");
      print(arr);
      System.out.print("Copied array before change :");
      print(arr_2);
      arr_2[0]=0;
      arr_2[1]=0;
      System.out.print(" Original array after  change :");
      print(arr);
      System.out.print(" Copied array after change :");
      print(arr_2);

 // we can see clearny it updation of values we do in copied array but it also changes the original array 
 // because  arr_2 is not allocated seprate memory it point original array to avoid this use arry.clone --> these creates seprate memory for 2nd array and when we do changes in arr_2 it dosent affect original array 

  }
}