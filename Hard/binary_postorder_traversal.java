/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>(); 
        if (root == null) return ans;  

        Stack<TreeNode> stack = new Stack<>(); 
        stack.push(root); 
        while(!stack.isEmpty()){
            TreeNode runner = stack.pop(); 
            ans.add(0, runner.val); 
            if(runner.left != null) stack.push(runner.left);
            if(runner.right != null) stack.push(runner.right); 
            
        }
        return ans; 

    }
}