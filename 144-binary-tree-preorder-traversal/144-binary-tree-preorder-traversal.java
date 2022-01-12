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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer=new ArrayList<>();
        preorder(root,answer);
        return answer;
    }
    
    private void preorder(TreeNode root,List<Integer> answer){
        if(root==null){
            return;
        }
        answer.add(root.val);
        preorder(root.left,answer);
        preorder(root.right,answer);
        return ;
    }
}