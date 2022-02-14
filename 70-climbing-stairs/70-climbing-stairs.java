class Solution {
    public int climbStairs(int n) {
        
        return totalWays(0,n,new HashMap<Integer,Integer>());
        
    }
    
    public int totalWays(int currentStair,int target,HashMap<Integer,Integer> memo){
        
        if(currentStair==target){
            return 1;
        }
        if(currentStair>target){
            return 0;
        }
        
        if(memo.containsKey(currentStair)){
            return memo.get(currentStair);
        }
        int oneStep=totalWays(currentStair+1,target,memo);
        int twoStep=totalWays(currentStair+2,target,memo);
        
        memo.put(currentStair,oneStep+twoStep);
        
        return oneStep+twoStep;
        
    }
}