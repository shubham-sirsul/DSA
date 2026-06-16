
import java.util.ArrayList;

public class SearchElement {
    static ArrayList<Integer> findAll_indices(int arr[],int n,int idx){
        ArrayList<Integer> ans = new ArrayList<>();
        if (idx>=arr.length) return ans;
        if(arr[idx] == n){
            ans.add(idx);
        }
        ArrayList<Integer> smallans = findAll_indices(arr, n, idx+1);
        ans.addAll(smallans);        
       return ans;
        
    }
    public static void main(String[] args) {
        int arr[]= {1,2,2,6,4,12,4,5,2,4,5,2,3,5,55,2,6,42,43,4,46,4,646,46,46,4};
        System.out.println(findAll_indices(arr, 2,0));
    }
}