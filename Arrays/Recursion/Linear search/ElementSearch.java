public class ElementSearch {
  
    static void searchAll_indices(int arr[],int n,int idx){
        if (idx >= arr.length) return ;
       
        if(arr[idx] == n){
            System.out.print(idx+" ");
        }
         searchAll_indices(arr, n, idx+1);

    }
   
   
   
    static boolean search(int arr[],int n,int idx){
       // returns  true if element exists  else returns false 
       
       if (idx >= arr.length-1) return false;
       
        if(arr[idx] == n){
            return true;
        }
        return search(arr, n, idx+1);



    }
     static int search_idx(int arr[],int n,int idx){
        // return idx of element if exists in array else -1 
       if (idx >= arr.length-1) return -1;
       
        if(arr[idx] == n){
            return idx;
        }
        return search_idx(arr, n, idx+1);
    }
    public static void main(String[] args) {
        int arr[]= {1,2,2,6,4,12,4,5,2,4,5,2,3,5,55,2,6,42,43,4,46,4,646,46,46,4};
        // System.out.println(search(arr,12,0));
        // System.out.println(search_idx(arr, 12,0));
        searchAll_indices(arr, 2, 0);
    }
}