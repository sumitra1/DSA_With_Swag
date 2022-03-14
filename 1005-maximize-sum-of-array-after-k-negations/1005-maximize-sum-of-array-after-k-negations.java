class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length&&k>0;i++){
            if(nums[i]<0){
                nums[i]=-nums[i];
                k--;
            }
            else 
            {
                break;
            }
        }
     
        Arrays.sort(nums);
        int sum=0;
        for(int i=1;i<nums.length;i++){
             sum+=nums[i];
        }
        if(k%2==0){
            sum+=nums[0];
        }else{
            sum-=nums[0];
        }
       
        return sum;
    }
}