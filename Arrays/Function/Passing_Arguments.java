public class Passing_Arguments {

    public static void greet(String name){
         System.out.println("hii,"+name+" welcome to apna editing ");
    }
    public static void sum(double a, double b){
        System.out.println(a+b);
    }
  public static void main(String[] args) {
      greet("shubhs");
      sum(2.14,1.23);
  }
}