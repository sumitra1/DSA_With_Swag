class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false; //Base Case
        int mp1[]=new int[26]; //Array of 26 alphabets 
        int mp2[]=new int[26]; //Array of 26 alphabets 
        for(int i=0;i<s1.length();i++){
            mp1[s1.charAt(i)-'a']++;
            mp2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(mp1,mp2)) return true;
        int i=0,j=s1.length();
        while(j<s2.length()){
           mp2[s2.charAt(j)-'a']++;
           mp2[s2.charAt(i)-'a']--;
           if(Arrays.equals(mp1,mp2)) return true;
           i++;
           j++;
        }
      return false;
    
    }
}