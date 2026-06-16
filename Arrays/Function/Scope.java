public class Scope {
  static int i=1; // decclaration of global variable 
  public static void fun(){
    System.out.println(i);
    // System.out.println(s); // error

  }
  public static void main(String[] args){
       int s=1999; // local variable --> only acessable in  main 
      i=10;
      fun();
      int i=35; // ye i different hee global wale see ye sirf main me acessesable hee
    //   iske niche joo bhi changes i ke sath honge wo sirf local wle i ke sath honge 
      System.out.println(i);
      fun1();
      System.out.println(i);


  }
  public static void fun1(){
    System.out.println(i);
  }
}