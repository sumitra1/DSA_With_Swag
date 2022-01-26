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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
      //binary search tree's left child use to be lesser than right child
      //binary tree's inorder traversal gives elements in ascending order
      //first keep both the trees's inorder in two list, then sort both the list in one list
        
      List<Integer> list1=new ArrayList<>();
      List<Integer> list2=new ArrayList<>();
       inorder(root1,list1);
        inorder(root2,list2);
        List<Integer> answer=new ArrayList<>();
        int n1=list1.size();
        int n2=list2.size();
        int i=0,j=0;
        while( i<n1 && j<n2){
            if(list1.get(i)<list2.get(j)){
                answer.add(list1.get(i));
                i++;
            }else{
                answer.add(list2.get(j));
                j++;
            }
        }
        while(i<n1){
            answer.add(list1.get(i));
            i++;
        }while(j<n2){
            answer.add(list2.get(j));
            j++;
        }
        return answer;
    }
    
    private void inorder(TreeNode root,List<Integer> answer){
       
        if(root==null){
            return;
        }
        inorder(root.left,answer);
        answer.add(root.val);
        inorder(root.right,answer);
       
        
    }
}