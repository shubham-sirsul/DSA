public class print_one_to_n {

    public static void printdecreasing(int n) {
        if (n==0){
            return; 
        }
      System.out.println(n);
      printdecreasing(n-1);
      return ;
    }
    public static void main(String[] args) {
        printdecreasing(5);
        
    }
}