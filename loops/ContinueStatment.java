
// Continue  statment is ud=se to skip the itration 




public class ContinueStatment {
  public static void main(String[] args) {
      for (int i = 0; i < 100; i++) {
        if (i ==18){
            continue;
        }
        if (i%2==0 || i%3==0){
            System.out.println(i);
        }
          
      }
      
  }
}