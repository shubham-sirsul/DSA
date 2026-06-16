 public class Min_Heap{
    private   int idx= 1 ;
     private  int arr[];
      Min_Heap(int capacity){
        arr = new int[capacity+1];
      }
      int peak(){
        if(idx==1) {
            System.out.println("Heap  is Empty");
            return 0;
        }
        return arr[1];
      }
     void add(int x){

        if(idx>=arr.length){ System.out.println("heap is full"); return;}
        arr[idx++] = x;// add element at idx and then increase idx 
        // rearrangment
        int root =idx-1;
        while(root!=1){
           int parent= root/2;
           if(arr[root]<arr[parent]){
            int temp = arr[root];
            arr[root]= arr[parent];
            arr[parent] =temp;
            root = parent;
           }
           else{
            break;
           }
        }
     }
     void Display(){
        for(int i=1;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
     }

     int remove(){
        if(idx==1) {
            System.out.println("Heap  is Empty");
            return 0;
        }
        int ans = arr[1];
        arr[1] = arr[idx-1];
        idx--;
         // rearrangment
         int root = 1;
        while(root<idx){
            int child1 =  2*root ;
            int child2 =  2*root+1;

            int val1 = (child1<idx) ? arr[child1]  : Integer.MAX_VALUE;
            int val2 =  (child2<idx) ? arr[child2]  : Integer.MAX_VALUE;
            if(arr[root]<val1 && arr[root]<val2){
                break;
            }  else{
                if(val1<val2){
                    int t = arr[root];
                 arr[root]= arr[child1];
                  arr[child1] =t;
                  root = child1;
                }
                  else{
                    int q = arr[root];
                    arr[root]= arr[child2];
                    arr[child2] =q;
                     root = child2;
                  }
            }
        }
        return ans;

     }
      
}