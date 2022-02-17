class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      
        List<List<Integer>> Answer=new ArrayList<>();
        totalWays(candidates,0,target,new ArrayList<>(),Answer);
        return Answer;
        
    }
    
    private void totalWays(int []nums,int ci,int target,List<Integer> cs,List<List<Integer>> answer){
        if(target==0){
            answer.add(new ArrayList<>(cs));
            return;
        }
        if(ci>=nums.length){
            return;
        }
        int cval=nums[ci];
        if(target>=cval){
            cs.add(cval);
            totalWays(nums,ci,target-cval,cs,answer);
            cs.remove(cs.size()-1);
        }
        totalWays(nums,ci+1,target,cs,answer);
        return;
    }
}   
  