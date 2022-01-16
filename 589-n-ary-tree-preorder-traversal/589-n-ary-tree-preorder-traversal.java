/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> answer=new ArrayList<>();
        Stack<Node> st=new Stack<>();
        if(root==null){
            return answer;
        }
        st.push(root);
        
        
        
        while(!st.empty()){
         Node currentNode=st.pop();
            answer.add(currentNode.val);
            List<Node> childrens=currentNode.children;
            int n=childrens.size();
            
            for(int i=n-1;i>=0;i--){
                st.push(childrens.get(i));
            }
            
//             if(currentNode.right!=null){
//                 st.push(currentNode.right);
//             }
//             if(currentNode.left!=null){
//                 st.push(currentNode.left);
//             }
            
        }
        return answer;
    }
}