// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        // Code here
        
        int res = Integer.MAX_VALUE;
 
        // To check 0, 1 and 2
        boolean zero = false, one = false, two = false;
 
        // To store indexes of 0, 1 and 2
        int zeroindex = 0, oneindex = 0, twoindex = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                zero = true;
                zeroindex = i;
            }
            else if (S.charAt(i) == '1') {
                one = true;
                oneindex = i;
            }
            else if (S.charAt(i) == '2') {
                two = true;
                twoindex = i;
            }
 
            // Calculating length
             if (zero && one && two)
                res = Math.min( res,
                    Math.max(zeroindex,Math.max(oneindex, twoindex))
                  - Math.min( zeroindex,Math.min(oneindex, twoindex)));
        }
 
        // In case if their is no substring that contains 0,1 and 2
        if (res == Integer.MAX_VALUE)
            return -1;
        return res + 1;
    }
};
