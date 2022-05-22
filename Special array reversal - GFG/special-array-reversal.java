// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.reverse(s));                        
        }
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String reverse(String arr)
    {
        
         char str[]=arr.toCharArray();
        //complete the function here
        int r = str.length - 1, l = 0;
        
 
        // Traverse string from both ends until 'l' and 'r'
        while (l < r) {
            // Ignore special characters
            if (!Character.isAlphabetic(str[l])) //if it is not alphabatic character
                l++;
            else if (!Character.isAlphabetic(str[r]))
                r--;
 
            // Both str[l] and str[r] are not spacial
            else {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
        String ans=String.valueOf(str);    
   return ans;
    }
}