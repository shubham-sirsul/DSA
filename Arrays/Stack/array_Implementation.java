public class array_Implementation {
    public static class stack{
        private  int arr[] =new int[50];
        private int idx =0;
        void push(int x){
            if(isfull()){
                System.out.println("stack is full");
                return ;
            }
          arr[idx] = x;
          idx++;

        }
        int peek(){
            
            if(idx == 0){ 
            System.out.println("stack is empty ");
            return -1;
            }
           else  return arr[idx-1];
        }
        int pop(){
            if(idx == 0) return -1;
            int a = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return a;
            
        }
        void display(){
          for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0) break;
            System.out.print(arr[i]+" ");
          }
          System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;

             return false;
        }
        boolean isfull(){
            if(idx>=arr.length){
              return true;
            }
            return false;
        }
        int capacity(){
            return arr.length;
        }

    }
    public static void main(String[] args) { 
        stack st  = new stack();
        st.push(5);
        st.display();
        st.push(4);
        st.display();
        st.push(3);
        st.display();
        st.push(2);
        st.display();
        st.push(10);
        st.push(66);
        System.out.println(st.isfull());
        st.pop();
        st.display();
        System.out.println(st.size());
        
    }
}