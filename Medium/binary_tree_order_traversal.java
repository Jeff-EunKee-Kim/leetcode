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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int level_nodes = q.size();
            List<Integer> level = new ArrayList<>();
            
            for(int i = 0; i<level_nodes; i++){
                TreeNode runner = q.remove();
                level.add(runner.val);
                if(runner.left != null) q.add(runner.left);
                if(runner.right != null) q.add(runner.right); 
            }
            ans.add(level); 
        }
        return ans; 
    }
}