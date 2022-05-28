// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        
        // if (s.length()==0 || k==0){ //edge case
        // return -1;
        // }
        // //we will take  two pointers
        
        //     int slow=0;
        //     int fast=0;
            
        //     int result=-1;
        //     // hashmap to store unique characters 
        //     HashMap<Character,Integer> hm=new HashMap<>();
            
        //     while(fast<s.length()){
        //         char c=s.charAt(fast);
        //         hm.put(c, hm.getOrDefault(c,0)+1);//putting characters in hashmap with count of occuring
        //         while(hm.size()>k){ // will check whether size of hashmap went greater than k
        //             char d=s.charAt(slow);
        //             if(hm.get(d)==1){
        //                 hm.remove(d);// removing the char which leads to make the size of hashmap greater
        //             }
        //             else{/// if it is already present, do the -1 in character and 
        //                 hm.put(d,hm.get(d)-1);
        //             }
        //             slow++;
        //         }
        //         result=Math.max(result,fast-slow+1);
        //         fast++;
        //     }
            
            
        //     return result;
            
        int n = s.length();

        int maxLen = -1; // Stores the length of the longest substring with k unique characters found so far.
        Map<Character, Integer> windowCharCount = new HashMap<>(); // Stores the character count for each character in the current window
        int windowStart = 0;
        int windowEnd=0;

        while(windowEnd<n) {
            // Add the next character to the sliding window
            char c = s.charAt(windowEnd);
            windowCharCount.put(c, windowCharCount.getOrDefault(c, 0) + 1);

            // Shrink the sliding window, until we have exactly 'k' distinct characters in the window
            while(windowCharCount.size() > k) {
                char leftChar = s.charAt(windowStart);

                // Discard the character at windowStart since we're gonna move it out of the window now.
                windowCharCount.put(leftChar, windowCharCount.get(leftChar) - 1);
                if(windowCharCount.get(leftChar) == 0) {
                    windowCharCount.remove(leftChar);
                }

                windowStart++; // Shrink the window                
            }

            if(windowCharCount.size() == k) {
                // Update maximum length found so far
                maxLen = Math.max(maxLen, windowEnd-windowStart+1);
                
            }
            windowEnd++;
        }

        return maxLen;
        
    }
}