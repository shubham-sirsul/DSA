// Problems on Binary Search
// You have 'n'(n <= 10^5) boxes of chocolate. Each box contains a[i] (a[i] <= 10000) chocolates. You need to distribute these boxes among 'm' students such that the maximum number of chocolates allocated to a student is minimum.
// a) One box will be allocated to exactly one student.
// b) All the boxes should be allocated.
// c) Each student has to be allocated at least one box.
// d) Allotment should be in contiguous order, for instance, a student cannot be allocated box 1 and box 3, skipping box 2.
// Calculate and return that minimum possible number.
// Assume that it is always possible to distribute the chocolates.
// The first line of input will contain the value of n, the number of boxes.
// The second line of input will contain the n numbers denoting the number of chocolates in each box.
// The third line will contain the m, number of students.
// Input
// 4
// 12 34 67 90
// 2
// Output
// 113


public class Distribute_Chocolates {

    static Boolean isDivision_possible(int a[],int m,int maxChocolatesAllowed){
    int numOfStudents =1;
    int choc =0;// chco represent number choc current student has 
    for(int i=0;i<a.length;i++){
          if(a[i]> maxChocolatesAllowed) return false;
          if(choc+a[i]<=maxChocolatesAllowed){
            choc+=a[i];
          }
          else {
            numOfStudents++;
            choc=a[i];
          }
    }
    if(numOfStudents>m) return false;
       return true;
    }

    static int Distribute_Chocolates(int a[], int n){
     if(a.length< n) return -1;
     int ans=0, s=1,e=(int)1e9; // 1 * 10^9

    while(s<=e){
        int mid = s+(e-s)/2;
        if(isDivision_possible(a,n,mid)){ // cheak
           ans =mid;
           e=mid-1;
        }
        else s= mid+1;
    }
     return ans;
    }
    public static void main(String[] args) {
        int a[]= {5,3,1,4,2}; // choklates in each box 
        int n =3; // no. of students
        System.out.println(Distribute_Chocolates(a, n));
    }
}