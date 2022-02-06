class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int currentElement:nums){
            if(i==0||i==1||nums[i-2]!=currentElement){
                nums[i]=currentElement;
                i+=1;
            }
        }
        return i;
        
    }
}