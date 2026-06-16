// Problems on Binary Search
// A new racing track for kids is being built in New York with 'n' starting spots. The spots are located along a straight line at positions x1, x2... xn(xi <=10^9). For each 'i', xi+1 > xi.
// At a time only 'm' children are allowed to enter the race. Since the race track is for kids, they may run into each other while running. To prevent this,
// we want to choose the starting spots such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?
// The first line of input will contain the value of n, the number of starting spots.
// The second line of input will contain the n numbers denoting the location of each spot.
// The third line will contain the value of m, number of children.
// Input
// points 5
// 1 2 4 8 9 
//  students 3
// Output
// 3





public class Race_track {
    static boolean  isPossible(int a[],int k,int min_dist){
       int kidsPlaced =1;
       int lastkid =a[0];


       for (int i = 1; i < a.length; i++) {
           if(a[i]-lastkid>=min_dist){
            lastkid=a[i];
            kidsPlaced++;
           }
       }
        return kidsPlaced>=k;// if kidsplaced>=k retrun true otherwise false 
    }
    static  int racetrack(int arr[],int k){
        int ans =0;
        int s =1, e = (int)1e9 /* or arr[arr.length-1]*/ ;
        while(s<=e){
          int mid  = s+(e-s)/2;
          if(isPossible(arr,k,mid)){// can k kids placed such no twom kids have distance lesser than mid 
             ans =mid;
             s = mid+1;
          }
          else {
           e= mid-1;
          }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={1,2,4,8,9};
        int k=3;//  no of students to place on race track
        System.out.println(racetrack(a,k));
    }
}