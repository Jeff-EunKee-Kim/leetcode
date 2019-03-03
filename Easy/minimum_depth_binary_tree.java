/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// BFS
class Solution {
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return 0; 

        q.add(root); 
        int count = 1; 
        while(!q.isEmpty()){
            int level = q.size(); 
            
            for(int i = 0; i< level; i++){
                TreeNode runner = q.remove();             
                if(runner.left == null && runner.right == null) return count; 
                if(runner.left != null) q.add(runner.left);
                if(runner.right != null) q.add(runner.right);
            }
            count++;
        }
        return count; 
    }
}

// DFS
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null) return minDepth(root.right) + 1; 
        if(root.right == null) return minDepth(root.left) + 1; 
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}