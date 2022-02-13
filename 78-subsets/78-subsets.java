class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> powerSet=new ArrayList<>();
        generateAllSubsets(nums,0,new ArrayList<>(),powerSet);
        return powerSet;
    }
    private void generateAllSubsets(int nums[],int ci,List<Integer> cs,List<List<Integer>> powerSet){
        if(ci>=nums.length){
            powerSet.add(new ArrayList<>(cs));
            return;
        }
        int currentVal=nums[ci];
        
        cs.add(currentVal);
        generateAllSubsets(nums,ci+1,cs,powerSet);
        cs.remove(cs.size()-1);
        generateAllSubsets(nums,ci+1,cs,powerSet);
        return;
    }
}