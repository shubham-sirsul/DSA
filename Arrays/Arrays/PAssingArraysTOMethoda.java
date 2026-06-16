

public class PAssingArraysTOMethoda {
    public static void change(int[] arr){
        arr[3]=54;
    }
  public static void main(String[] args) {
    //   Scanner sc = new Scanner(System.in);
      int[] arr ={1,2,3,4,5,6,7,8,9};
      System.out.println(arr[3]);
      change(arr);// pura array pass kiya tho pass by refrence hota hee matlab original array me bhii change hota hee 
      // function mee array bhejne ke baad wo function me jo array hee  wo naya create nhii hua wo bhii apne original wale array ko hee point kar rahahee 
      System.out.println(arr[3]);

  }
}