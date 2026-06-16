

public class PAssbyValue_Refrence {
    public static void swap(int a,int b){ // formal Parameters 
     a =a+b;
    b=a-b ;
    a=a-b;
    // but change bin original a & b  because pass by value 
    }
    public static void change(int[] a, int[] b){
     int  temp = a[0];
      a[0]=b[0];
      b[0] = temp;
    }

  public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
    // System.out.print(" Enter a :");
    // int a= sc.nextInt();
    // System.out.print(" Enter b :");
    // int b =sc.nextInt();
    // System.out.println("a ="+a+" b ="+b);
    // swap(a,b); // actual parameters
    // // ye original  and b nhi jate inkii value  dusre variavles me save hoii isliye original wale me no change 
    // //a,b --> pass by value 
    // System.out.println("a ="+a+" b ="+b);

   int[] a={10};
   int[] b ={20};
   System.out.println("a ="+a[0]+" b ="+b[0]);
   change(a,b); // change in original values 
   System.out.println("a ="+a[0]+" b ="+b[0]);
   


  }
}