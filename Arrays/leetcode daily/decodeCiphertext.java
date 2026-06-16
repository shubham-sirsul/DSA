public class decodeCiphertext {

    // these uses o(n2) which is not expected , gives TLE with string concatination  so we use stringbuilder
    public static String  ans(String encodedText, int rows){
        if(rows==1) return encodedText;
        int n = encodedText.length() / rows;
        char matrix[][] = new char[rows][n];
        int k=0;
        // fill the characters rowwise in array 
        for(int i=0;i<rows;i++){
            for(int j=0;j<n;j++){
                if(k<encodedText.length()){
                matrix[i][j] = encodedText.charAt(k);
                 k++;
                }
                else {
                    break;
                }
            }
        }
        // travel diginally to get expected answer 
        StringBuilder sb = new StringBuilder();
        int start = 0;
        
        while(start<n){
        int i=0;
        int j=start;
        while(i<rows && j<n){
            sb.append(matrix[i][j]);
            i++;
            j++;
        }
        start++;
    }
    return sb.toString().stripTrailing();
}


    public static void main(String args[]){
        // Example 1
        String encoded1 = "ch   ie   pr";
        int rows1 = 3;
        System.out.println(ans1(encoded1, rows1)); // Output: cipher

        // Example 2
        String encoded2 = "iveo    eed   l te   olc";
        int rows2 = 4;
        System.out.println(ans1(encoded2, rows2)); // Output: i love leetcode

        // Example 3
        String encoded3 = "coding";
        int rows3 = 1;
        System.out.println(ans1(encoded3, rows3)); // Output: coding
    }
     

    //  //without matrix with simple logic  in o(N)
    //  logic is for encoded = "ch   ie   pr" and rows =3
    //                          01234567891011// indices 
    //  our answer is at 0,5,10,1,6,11 indices
    //  see col = encoded.length() / rows; // 12/3 = 4
    //  // we cracked patten 
    //  0,0+5,5+5 --> 0,5,10
    //  1,1+6,6+5 --> 1,6,11

    public  static String ans1(String encoded, int rows) {
        if(rows==1) return encoded;
        int n = encoded.length() / rows;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){

            sb.append(encoded.charAt(i));
            int c=i;
            int col =n+1;
            while(col+c<encoded.length()){
             c=col+c;
             sb.append(encoded.charAt(c));
            }
        }
        return sb.toString().stripTrailing();
    
    }
}

// Why String concatenation gives TLE
// In Java, String is immutable. Every time you do ans += encoded.charAt(i), Java creates a new String object:

// It copies all characters from the old ans.

// Then adds the new character.

// So if you append 
// 𝑛
//  characters, the total work is about:

// 1+2+3+4+.....+o(n2)
// For small inputs, this is fine. But for large test cases (like LeetCode’s hidden ones), this quadratic blow-up causes Time Limit Exceeded (TLE).

// why StringBuilder passes
// StringBuilder maintains a mutable character array buffer.

// Appending (sb.append(...)) just places the new character at the next index — amortized O(1).

// No repeated copying of the entire string.

// o(n)

// Quick Demo

// String ans = "";
// for (int i = 0; i < 100000; i++) {
//     ans += "a"; // O(n^2) copies
// }

// StringBuilder sb = new StringBuilder();
// for (int i = 0; i < 100000; i++) {
//     sb.append("a"); // O(n)
// }
// The first loop will crawl or even timeout, while the second loop runs instantly.