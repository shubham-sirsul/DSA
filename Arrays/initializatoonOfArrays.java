

public class initializatoonOfArrays {
  public static void main(String[] args) {
    //   Scanner sc = new Scanner(System.in);
    //   int n =sc.nextint();
   
   // 1st method
    int [] x={10,20,30,40,50}; // indexing start from zero
   // System.out.println(x[2]);// Accesseing perticular elements with help of indexes
    x[1]=12; // uopdation of element 
    //System.out.println(x[1]);
    System.out.println(x.length); // return number of elements of ARRAY
  for (int i = 0; i < x.length; i++) {
    System.out.print(x[i]+" ");
  }

//  //2nd method 
//  int [] arr= new int[7]; // 7 size ka ek array create ho gaya pr usme koi values nhi hee abhi ke liye 
//  System.out.println(arr[1]); // default values print hogi --> 0
// arr[0]=10; // filling elements in array
  }

}