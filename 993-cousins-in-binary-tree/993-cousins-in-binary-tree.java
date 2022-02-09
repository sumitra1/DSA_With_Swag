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
    public boolean isCousins(TreeNode root, int x, int y) {
        
        int level[]={-1,-1};
        int parents[]={-1,-1};
        findNodes(root,x,y,level,parents,0,new TreeNode(-1));
        if(level[0]==level[1] && parents[0]!=parents[1]){
            return true;
        }
        return false;
    }
    
    private void findNodes(TreeNode root, int x,int y, int level[],int parent[], int currLevel,TreeNode currParent){
        if(root==null){
            return;
        }
        if(root.val==x){
            level[0]=currLevel;
            parent[0]=currParent.val;
        }
        if(root.val==y){
            level[1]=currLevel;
            parent[1]=currParent.val;
        }
        findNodes(root.left,x,y,level,parent,currLevel+1,root);
        findNodes(root.right,x,y,level,parent,currLevel+1,root);
    }
} 