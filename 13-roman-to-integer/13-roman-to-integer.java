class Solution {
    public int romanToInt(String s) {
        int pre = 0;
        int ans = 0;
        for(int i= s.length()-1 ;i>=0;i--){
            int cur = 0;
            switch(s.charAt(i)){
                case ('I') :cur = 1;  break;
                case ('V') :cur = 5;  break;
                case ('X') :cur = 10;  break;
                case ('L') :cur = 50;  break;
                case ('C') :cur = 100; break;
                case ('D') :cur = 500; break;
                case ('M') :cur = 1000; break;

            }
            if(cur >= pre){
                 ans += cur;

            } else {
                pre = pre - cur;
                ans -= cur;
               
            }
            pre = cur;
            
        }
        return ans;

    }
}