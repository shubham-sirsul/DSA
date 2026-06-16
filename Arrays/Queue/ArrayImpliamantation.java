

public class ArrayImpliamantation {
    public static class queue{
     private int arr[] = new int[100];
     private int f =-1;
     private  int r =-1;
     private static int size=0;
     public void add(int val){
        if(r==arr.length-1){
            System.out.println("queue is full");
            return;
        }
        if(f==-1){
             f=r=0;
             arr[0] =val;
        }
        else{
        arr[r+1] = val;
        r++;
        }
        size++;
     }
     public int remove(){
        if(size==0) {
            System.out.println("queue is empty");
            return -1;
        }
        int temp =arr[f];
        f++;
        size--;
        return temp;
     }
     public int peek(){
         if(size==0) {
            System.out.println("queue is empty");
            return -1;
        }
        return arr[f];
     }
     public boolean isempty(){
        if(size==0)return true;
        return false;
     }
     public void display(){
        if(f==-1) return;
        for (int i = f; i <=r ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
     }
     public static int size(){
        return size;
     }
    }
    public static void main(String[] args) {
        queue x = new queue();
        x.display();
        x.add(5);
        x.add(9);
        x.add(10);
        x.display();
        x.remove();
        x.display();

    }
}