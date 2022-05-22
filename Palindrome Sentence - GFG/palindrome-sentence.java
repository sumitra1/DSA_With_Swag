// { Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
       public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t > 0){
            String str = sc.nextLine();
            Solution ob = new Solution();
            if(ob.sentencePalindrome(str))
                System.out.println(1);
            else
                System.out.println(0);
            t--;
        }
    } 
} // } Driver Code Ends


class Solution { 

    static boolean sentencePalindrome(String s) { 
        // code here
      String str="";
       for(int i=0;i<s.length();i++)
       {
           if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z'))
           {
               str += s.charAt(i);
           }
       }
       
       return palindrome(str);
}

static boolean palindrome(String str)
   {
       String rev="";
       for(int i=str.length()-1;i>=0;i--)
       {
           rev += str.charAt(i);
       }
       
       if(str.equals(rev))
       {
           return true;
       }
       else
       {
           return false;
       }
   }
}