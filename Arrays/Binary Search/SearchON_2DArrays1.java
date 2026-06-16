// // given 2d array 
// 1. integers are sorted in asending order from left to right in each row
// 2. integers are sorted in asending order in each coloum top to bottom

public class SearchON_2DArrays1 {

static boolean search(int arr[][],int target){
    int n= arr.length;//// rows
    int m =arr[0].length ;// last coloum 
    int i=0;
    int j =m-1;
    while(i<n && j>=0){
        if (arr[i][j]== target) return true;
        if (target < arr[i][j]) j--;
        else{
            i++;
        }

    }
    return false ;

}
    public static void main(String[] args) {
        int arr[][]= {{1,4,7,11},
        {2,5,8,12,19},
        {7,11,13,25},
        {12,14,17,30}};

        System.out.println(search(arr, 100));
    }
}