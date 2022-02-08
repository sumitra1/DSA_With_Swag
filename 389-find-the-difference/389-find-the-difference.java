class Solution {
    public char findTheDifference(String s, String t) {
        
        
        return   (char) (findSum(t)-findSum(s));
    }
    
    private int findSum(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum=sum+((int)s.charAt(i));
        }
        return sum;
    }
}