/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var nextPermutation = function(nums) {
     const len = nums.length;
    
    // find longest non-increasing suffix - O(n)
    let i = len - 1;
    for(; i>=0, nums[i] <= nums[i - 1]; i--){}
    
    // [5,4,3,2,1]
    // [3,3,3]
    if(i === 0){
        nums.reverse();
        return;
    }
    
    // now i contains the index of the first item,
    // that after it there is a non-increasing suffix
    const pivot = nums[i - 1];
    
    // the pivot is necessarily less than the head of the suffix --->
    // so some element in the suffix is greater than the pivot
    
    // swap the pivot with the smallest element in the suffix 
    // that is greater than the pivot
    // [0, 1, 2, 5, 3, 3, 0] ---> [0, 1, 3, 5, 3, 2, 0] (swap 2 and the latest 3)
    let min=i;
    for(let j=i+1; j<len; j++){
        if(nums[j] <= nums[min] && nums[j] > pivot) min=j;
    }
   
    // perform the swap:
    [nums[i - 1], nums[min]] = [nums[min], nums[i - 1]];
    
    // now the prefix is minimally increased
    // the prefix is everything in the sequence except the suffix
    // prefix: (0, 1, 3), suffix: (5, 3, 2, 0)
    
    // sort the suffix in non-decreasing order by reversing it
    for(let k=i, l=len-1; k < l; k++, l--){
        [nums[k], nums[l]] = [nums[l], nums[k]];
    }
};