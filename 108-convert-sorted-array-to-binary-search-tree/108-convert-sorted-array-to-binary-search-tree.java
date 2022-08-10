/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
           return construct(nums, 0, nums.length - 1);
    }
    
    public TreeNode construct(int[] nums, int left, int right) {
        if (left == right) return new TreeNode(nums[left]);
        
        if (right < left) return null;
        
        int middleIndex = left + ((right - left) / 2);
        TreeNode root = new TreeNode(nums[middleIndex]);
        root.left = construct(nums, left, middleIndex - 1);
        root.right = construct(nums, middleIndex + 1, right);
        return root;
    
    }
}