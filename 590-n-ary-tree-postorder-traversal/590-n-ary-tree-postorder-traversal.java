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
    public List<Integer> postorder(Node root) {
       
         List<Integer> answer=new ArrayList<>();
        postOrderTra(root,answer);
        return answer;
    }
    
    private void postOrderTra(Node root,List<Integer> answer){
        if(root==null){
            return;
        }
       
        for(Node children:root.children){
            postOrderTra(children,answer);
            
        }
         answer.add(root.val);
        
        
        return ;
    }
}