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
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> traversal =new ArrayList();
        inorder(root,traversal);
        int n=traversal.size()-1;
        int sum=0;
        for(int i=0;i<=n;i++){
            if(traversal.get(i)>=low && traversal.get(i)<=high){
                sum+=traversal.get(i);
            }
        }
        return sum;
    }
    
    public void inorder(TreeNode root,List<Integer> answer){
        if(root==null){
            return;
        }
        
        inorder(root.left,answer);
        answer.add(root.val);
        inorder(root.right,answer);    
    }
}

