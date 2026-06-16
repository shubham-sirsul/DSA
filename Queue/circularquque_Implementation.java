public class circularquque_Implementation {
      public static class queue{
     private int arr[] = new int[5];
     private int f =-1;
     private  int r =-1;
     private  int size=0;
     public void add(int val) throws Exception{
       
        if(size== 0){ // if size==0 and element at 1st index
         f=r=0;
         arr[0] =val;
         
        }
        else if(size == arr.length){ // ifarray is fulll through error
         throw new Exception("queue is full ");
        }
        else if(r<arr.length-1){ //normal case 
         arr[r+1] =val;
         r++;
        }
        else if(r==arr.length-1){ //if rare reaches at end  then r =0
         r=0;
         arr[0] =val;
        }
        size++;
     }
     public int remove() throws Exception{
        if(size==0) {
            throw new Exception("queue is empty");
            
        }
        else {
         int t =arr[f];
         if(f==arr.length-1 && r>0) f=0;
         else f++;
         size--;
         return t;  
     }
       
     }
     public int peek() throws Exception{
         if(size==0) {
            throw new Exception("queue is empty");
            
        }
        return arr[f];
     }
     public boolean isempty(){
        if(size==0)return true;
        return false;
     }
     public void display(){
        if(f==-1) return;
       if(f<r){
          for (int i = f; i <=r ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       } else{
         for(int i =f;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
         for(int i =0;i<=r;i++){
            System.out.print(arr[i]+" ");
         }
         System.out.println();
       }
     }
     public  int size(){
        return size;
     }
    }
    public static void main(String[] args) throws Exception {
       queue x = new queue();
        x.display();
        x.add(5);
        x.add(9);
        x.add(10);
        x.add(5);
        x.add(3);
        x.remove();
        x.add(111);
        x.display();
        
    }
}