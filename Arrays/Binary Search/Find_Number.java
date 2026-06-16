    public class Find_Number {

        // static int find(int arr[],int target){
        //     int s =0;
        //     int e = arr.length-1;
        //     int mid =(s+e)/2;
        //     int ans=(-1);
        //     while(s<=e){
        //         mid =(s+e)/2;
        //         if (target == arr[mid]) return mid;
        //         else if(target>arr[arr.length-1]){
        //             e =mid -1;
        //         }
        //         else  s=mid+1;
        //     }
        //     return -1;
        // }
        static int find_num_rotatedSorted_array(int arr[],int target ){
           int s =0;
           int e= arr.length-1;
            int mid = s+((e-s)/2); //= (s+e)/2
            while(s<=e){
                mid = s+((e-s)/2);
                if(arr[mid]==target) return mid ;

            else if(arr[mid]<arr[e]){
                if(target<=arr[e] && target >arr[mid]) s=mid+1;
                else e= mid-1;

            }
            else {/// s to mid is sorted 
                if(target<=arr[mid] && target>arr[s]) e= mid-1;
                else s= mid+1;
  
            }
            }
            return -1;
        }
        // duplicate elements 
        static int find_num_rotatedSorted_duplicate_array(int arr[],int target ){
           int s =0;
           int e= arr.length-1;
            int mid = s+((e-s)/2); //= (s+e)/2
            while(s<=e){
                mid = s+((e-s)/2);
                if(arr[mid]==target) return mid ;
            else if (arr[s]==arr[mid] && arr[e]==arr[mid]){
                s++;
                e--;
            }
            else if(arr[mid]<=arr[e]){
                if(target<=arr[e] && target >arr[mid]) s=mid+1;
                else e= mid-1;

            }
            else {/// s to mid is sorted 
                if(target<=arr[mid] && target>arr[s]) e= mid-1;
                else s= mid+1;
  
            }
            }
            return -1;
        }
        public static void main(String[] args) {
            int arr[]={3,4,5,1,2};
            int arr1[]= {0,0,0,0,0,0,0,0,1,1,1,2,0,0,0,0,0};
            System.out.println(find_num_rotatedSorted_duplicate_array(arr1, 2));
            // System.out.println(find(arr1,2));
        }
    }