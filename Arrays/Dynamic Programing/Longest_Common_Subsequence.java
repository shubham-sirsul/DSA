import java.util.*;


public class Longest_Common_Subsequence {
    static void print2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }

    // recursion + memoization 
     public static int lcs(String s1, String s2, int i,int j,int dp[][]){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]= 1+lcs(s1,s2,i-1,j-1,dp);
        } else{
            return dp[i][j] = Math.max(lcs(s1,s2,i,j-1,dp),lcs(s1,s2,i-1,j,dp));
        }
    }
    
    public static  int longestCommonSubsequence1(String s1, String s2) {
        
        int m = s1.length();
        int n  = s2.length();
        int dp[][] = new int[m+1][n+1];
        for(int arr[]: dp){
            Arrays.fill(arr,-1);
        }
        int x =  lcs(s1,s2,m-1,n-1,dp);

        // filling values that equals -1
        for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                dp[i][j] = 1 + dp[i - 1][j - 1];
            } else {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
    }

        // backtracking  
        StringBuilder sb = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                sb.append(s1.charAt(i - 1));
                i--; j--;
            } else if (dp[i - 1][j] >= dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        System.out.println("Answer is :"+sb.reverse().toString());

        // print2D(dp);
        return x;
     }

    // full recursive code worst complixity     
    public static  int longestCommonSubsequence(String s1, String s2 ,ArrayList<Character> list) {
        
        int m = s1.length();
        int n  = s2.length();
        if(m==0 || n==0) return 0;
        // m-1 & n-1 not included
         String aless = s1.substring(0,m-1);
         String bless = s2.substring(0,n-1);
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            list.add(s1.charAt(m-1));
           return 1+ longestCommonSubsequence(aless,bless,list);
        }else{
             return Math.max(longestCommonSubsequence(s1,bless,list),longestCommonSubsequence(aless,s2,list));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1;
        while (true) {
            System.out.print("Enter a string (letters only): ");
            text1 = sc.nextLine();

            // Check if input contains only letters
            if (text1.matches("[a-zA-Z]+")) {
                System.out.println("Valid input: " + text1);
                break; // exit loop once valid
            } else {
                System.out.println("Invalid input! Please try again.");
            }
        }
        String text2 = "abc";
        while (true) {
            System.out.print("Enter a string (letters only): ");
            text2 = sc.nextLine();

            // Check if input contains only letters
            if (text2.matches("[a-zA-Z]+")) {
                System.out.println("Valid input: " + text2);
                break; // exit loop once valid
            } else {
                System.out.println("Invalid input! Please try again.");
            }
        }
        
        ArrayList<Character> list  = new ArrayList<>();
        // int result = longestCommonSubsequence(text1, text2, list);
        int result = longestCommonSubsequence1(text1, text2);
        // System.out.println(list);
        System.out.println("LCS length = " + result); 
        
    }   
}