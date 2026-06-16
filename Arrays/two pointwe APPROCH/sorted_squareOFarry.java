// in question arrys is always increasingor or non decresaing




public class sorted_squareOFarry {
    static int[]  sortsquare(int[] arr){
    int[] res =new int[arr.length];
    int x=0;
    int i=0;
    int j=arr.length-1;
    while(i<=j){
        if(Math.abs(arr[i])>Math.abs(arr[j])){
            res[x]=arr[i]*arr[i];
            x++;
            i++;
        }
        else{
            res[x]=arr[j]*arr[j];
            x++;
            j--;
        }
       
    }
        return res;
    }

    public static void swap(int[] arr,int i,int j){
    int  temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
  } 
  public static void print(int[] arr){
     for (int i = 0; i < arr.length; i++) {
       System.out.print(arr[i]+" ");
          
      }
      
  }
  public static void reverse(int[]arr,int i,int j){
         while(i<j){
         swap(arr,i,j);
               i++;
               j--;
       }
      }
  public static void main(String[] args) {
    int[] arr={-10,-5,-3,2,4,7,8};
   int[] res =sortsquare(arr);
   reverse(res,0, arr.length-1); // agar reverse nhi use karna tho jo hum res ke array me fill kar kahe the values wo last see kare thooo k arr.length-1 to 0 tak chale tho hume direct sorted milega
   print(res);
    

  }
}