
public class test {
    
      public static String decimaltobinary(int n){
        String ans = "";
        
        int reminder  = 0;
        int quitient = 0;
        while(n>0){

            reminder = n%2;
            quitient = n/2;
            ans = reminder+ans;
            n =n/2;

        }
        
        return ans;
      }
      public static String reverse(String s){
        String rev="";
        for(int i =s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return rev;
      }
    
        public static String binarytodecimal(String s){
             
              int ans=0;
              for (int i = 0; i < s.length(); i++) {
                    ans+=(Integer.valueOf(s.charAt(i)) -'0' )* Math.pow(2, s.length()-i-1);
                  
              }
              return ans+"";
        }
        public static void print(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    public static void main(String[] args) {
      // int []nums= {4,5,4};
      //     int n =nums.length;
      //   int[] ans = new int[n];
      //   for(int i = 0;i<nums.length;i++){
      //       String a  = decimaltobinary(nums[i]);
      //       String x = reverse(a);
      //       String y = binarytodecimal(x);
      //       ans[i]= (Integer.valueOf(y)) ;
      //   }


      //   print(ans);

    //   PriorityQueue<Integer> pq = new PriorityQueue<>(); 
    //   pq.add(23);
    //    HashMap<Integer,Integer> hm  = new HashMap<>();
    //    int x ;   
    //    System.out.println(1^0);

                
    // String s = "shubhs";
    // s.charAt(2)="a";
    // System.out.println('c'<'b');
    System.out.println(4&3);
        
    }
}