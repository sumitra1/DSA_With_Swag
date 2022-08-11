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
    public boolean isValidBST(TreeNode root) {
         return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    
    public boolean isValidBST(TreeNode root, long min, long max) {
        if(root==null) return true;
        
        if(!isInRange(root,min,max)) return false;
        
        return isValidBST(root.left,min,root.val) && isValidBST(root.right,root.val,max);
        
    }
    
    
    public boolean isInRange(TreeNode node, long min, long max){
        return min < node.val && node.val < max;
    
    }
}