public class FrogProblem {
    static int frog_jump(int arr[],int idx){
      if(idx == arr.length-1) return 0;
      
      
      int op1= Math.abs( arr[idx]-arr[idx+1])+frog_jump(arr, idx+1);
      if(idx == arr.length-2 ) return op1;
      int op2 = Math.abs(arr[idx]-arr[idx+2])+frog_jump(arr, idx+2);
      
      
       return Math.min(op1, op2);
       
    }    
    
    
    public static void main(String[] args) {
        int h[]= {10,30,40,20};
        System.out.println(frog_jump(h, 0));

    }

}