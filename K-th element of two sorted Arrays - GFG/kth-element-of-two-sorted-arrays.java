//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public long kthElement(int a[], int b[], int n, int m, int k) {
         PriorityQueue<Integer> pq =
                        new PriorityQueue<>();
 
        // Pushing elements for
        // array a to min-heap
        for (int i = 0; i < n; i++) {
            pq.offer(a[i]);
        }
 
        // Pushing elements for
        // array b to min-heap
        for (int i = 0; i < m; i++) {
            pq.offer(b[i]);
        }
 
        // Popping-out K-1 elements
        while (k-- > 1) {
            pq.remove();
        }
        return pq.peek();
        
    }
}