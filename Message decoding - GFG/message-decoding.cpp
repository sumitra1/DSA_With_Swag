// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

bool decode (string s);
int main()
{
    int t; cin >> t;
    while (t--)
    {
        string s; cin >> s;

        cout << decode (s) << endl;
    }
}
// Contributed By: Pranay Bansal
// } Driver Code Ends


bool decode (string str)
{
    // your code here
    string temp="hello";
   int n=str.length();
   int j=0;
   for(int i=0;i<n;i++)
   {
     if(str[i]==temp[j])
     {
         j++;
     }
   }
   return j==5;
}